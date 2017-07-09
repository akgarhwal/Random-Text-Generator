# Random-Text-Generator<br>
<br>
// A model of order 7 (Default is 1)<br>
MarkovModel model = new MarkovModel(7);<br>
// provide full path of input file for train your model<br>
model.loadFile("/home/akgarhwal/IdeaProjects/Markov Model/src/com/company/input.txt");<br>
<br>
int LENGTH = 500;<br>
String starterWord = "welcome";<br>
String text = model.generateRandomText(starterWord,LENGTH);<br>
<br>
// now print text<br>
System.out.print(text);<br>
