# Random-Text-Generator

// A model of order 7 (Default is 1)
MarkovModel model = new MarkovModel(7);
// provide full path of input file for train your model
model.loadFile("/home/akgarhwal/IdeaProjects/Markov Model/src/com/company/input.txt");

int LENGTH = 500;
String starterWord = "welcome";
String text = model.generateRandomText(starterWord,LENGTH);

// now print text
System.out.print(text);
