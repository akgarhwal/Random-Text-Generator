package com.company;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by akgarhwal on 28/6/17.
 */
public class Bag {
    private HashMap<Character,Integer> data;

    public Bag(){
        data = new HashMap<>();
    }

    public void add(Character letter){
        if(data.containsKey(letter) ){
            int oldValue = data.get(letter);
            data.put(letter,++oldValue);
        }
        else{
            data.put(letter,1);
        }
    }

    public Character getNextLetter(){
        Random random = new Random();
        int rand = random.nextInt(data.keySet().size());
        int sum=0;
        Character result = 'l';
        for (Character ch : data.keySet() ){
            sum += data.get(ch);
            if(sum > rand){
                result = ch;
                break;
            }
        }
        return result;
    }
}
