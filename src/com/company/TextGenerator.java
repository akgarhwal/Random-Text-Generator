package com.company;

public class TextGenerator {

    public static void main(String[] args) {

        MarkovModel model = new MarkovModel(7);
        // provide full path of input file
        model.loadFile("/home/akgarhwal/IdeaProjects/Markov Model/src/com/company/input.txt");
        System.out.print(model.generateRandomText("Welcome",500));
    }
}
