package com.company;

import java.io.*;
import java.util.*;

import java.util.HashMap;

/**
 * Created by akgarhwal on 28/6/17.
 */
public class MarkovModel {
    private HashMap<String,Bag> model;
    public static int ORDER;

    public MarkovModel(){
        model = new HashMap<>();
        ORDER = 1;
    }

    public MarkovModel(int order) {
        model = new HashMap<>();
        ORDER = order;
    }


    private void addText(String input){

        for (int i=0; i < ( input.length()-ORDER ) ; i++){
            String ngram = input.substring( i , i + ORDER);
            Character nextLetter = input.charAt( i + ORDER);

          //  System.out.println("Ngram : "+ngram + "  nextLetter : "+nextLetter);

            if(model.containsKey(ngram) ){
                Bag bag = model.get(ngram);
                bag.add(nextLetter);
                model.put(ngram,bag);
            }
            else{
                Bag bag = new Bag();
                bag.add(nextLetter);
                model.put(ngram,bag);
            }
        }
    }

    public String generateRandomText(String start,int len){

        String randomText = start;
        int length = start.length();
        if(length-ORDER < 0){
            return "Starting String should be greater then or less than ORDER";
        }
        String temp = start.substring(length-ORDER,length);
        for(int i=0;i<len-start.length();i++){

            if(model.containsKey(temp)){
                Character nextLetter = model.get(temp).getNextLetter();
                System.out.println("Temp : "+temp + " get next as "+nextLetter);
                temp = temp.substring(1,temp.length());
                temp += nextLetter;
                randomText += nextLetter;
            }
            else{
                //selecct random letter
                Random random = new Random();
                int ind = random.nextInt(26);
                char nextLetter = (char)('a'+ind);
                temp = temp.substring(1,temp.length());
                temp += nextLetter;
                randomText += nextLetter;
                System.out.println("Do not know what to do."+temp);
            }

        }
       // System.out.println(randomText);
        return randomText;
    }

    public void loadFile(String filename){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            StringBuilder inputtext = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                inputtext.append(line);
                System.out.println(line);
            }
            br.close();
            this.addText(inputtext.toString());

        } catch (IOException e) {
            System.out.println("ERROR: unable to read file " + filename);
            e.printStackTrace();
        }
    }
}
