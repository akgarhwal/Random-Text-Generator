# Random Text Generator

This project implements a Random Text Generator using an order-K Markov model in Java. It enables the generation of random text sequences based on the statistical properties of an input text, capturing the likelihood of character sequences to produce coherent output.

## Features

* **Order-K Markov Model**: Utilizes an order-K Markov model to analyze input text and generate random sequences that mimic the style and structure of the source.
* **Customizable Order**: Allows users to specify the 'K' value, determining the length of the character sequences considered for predicting the next character.
* **Flexible Input**: Supports training on any input text file provided by the user.
* **Configurable Output**: Enables specification of the length and starting word for the generated text.

## Getting Started

### Prerequisites

* Java Development Kit (JDK) installed on your system.

### Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/akgarhwal/Random-Text-Generator.git
   ```



2. **Navigate to the Project Directory**:

   ```bash
   cd Random-Text-Generator
   ```



3. **Open the Project**:

   Import the project into your preferred Java Integrated Development Environment (IDE).

## Usage

1. **Initialize the Markov Model**:

   ```java
   // Create a Markov model of order 7 (default is 1)
   MarkovModel model = new MarkovModel(7);
   ```



2. **Train the Model with Input Text**:

   ```java
   // Provide the full path of the input file to train your model
   model.loadFile("/path/to/your/input.txt");
   ```



3. **Generate Random Text**:

   ```java
   int length = 500; // Desired length of the generated text
   String starterWord = "welcome"; // Starting word for text generation
   String generatedText = model.generateRandomText(starterWord, length);
   ```



4. **Output the Generated Text**:

   ```java
   // Print the generated text
   System.out.print(generatedText);
   ```



### Example

**Input Text**:

```
Microsoft said Tuesday the company would comply with a preliminary ruling by Federal District Court Judge Ronald H. Whyte that Microsoft is no longer able to use the Java Compatibility Logo on its packaging and websites for Internet Explorer and Software Developers Kit for Java.
"We remain confident that once all the facts are presented in the larger case, the court will find Microsoft to be in full compliance with its contract with Sun," stated Tom Burt, Associate General Counsel for Microsoft Corporation. "We are disappointed with this decision, but we will immediately comply with the Court's order."
Microsoft has been in the forefront of helping developers use the Java programming language to write cutting-edge applications. The company has committed significant resources so that Java developers have the option of taking advantage of Windows features when writing software using the Java language. Providing the best tools and programming options will continue to be Microsoft's goal.
"We will continue to listen to our customers and provide them the tools they need to write great software using the Java language," added Tod Nielsen, General Manager for Microsoft's Developer Relations Group/Platform Marketing.
Microsoft said Tuesday the court will find Microsoft's goal.
"We will continue to listen to our customers and programming option of taking advantage of Windows features when writing software using the Java Compatibility Logo on its packaging and websites for Internet Explorer and Software using the best tools a nd programming language. Providing the Java language. Providing the Java programming language to write great software Developers Kit for Java.
"We remain confident that once all the facts are presented in the forefront of helping developers have the option of taking advantage of Windows features when writing software Developers use the Java Compatibility Logo on its packaging and websites for Internet Explorer and Software using the best tools a nd provide them the tools they need to write cutting-edge applications. The company would comply with this decision, but we will immediately comply with this decision, but we will immediately comply with a preliminary ruling by Federal District Court Judge Ronald H. Whyte that Microsoft is no longer able to use the Java language," added Tod Nielsen, General Manager for Microsoft's goal.
Welcome to Princeton. This may be your first Princeton lecture, but it's not a typical one. For one thing it's the only time you'll be in a class of size more than 1000! Also, lectures usually involve slides or vugraphs, or at least a blackboard. When Hal told me this lecture would be in this room and that no audio-visual aids would be possible, I realized the challenge: we've all been on vacation all summer, and now we have to deal in ideas, face-to-face. No slides. No movies. No organist. Not even any Internet access. Well, at least the experience ties in with the topic of this lecture, as you'll see.
Many of you have probably not done much academic work since you opened that thick envelope from Fred Hargadon. Right? The purpose of this lecture is to set your minds in motion, because you'll need them in gear at full speed when classes start on Thursday.
The topic that I've chosen for this purpose is the prospect of having all knowledge online, and its implications. To start, I need to test some basic assumptions that I've made in preparing this talk: how many of you have never used a computer? how many of you use electronic mail? how many of you have ever used the Internet? how many use it regularly? how many run companies that produce Web pages? OK. Well, it looks as though I don't have to describe the basic features of the net to most of you. I'm not going to assume much, anyway.
You can find a link to a web page for this lecture on my home page. If you've never been on the net, take this opportunity to get a friend to show it to you. Also, after you've had a chance to discuss this talk in your residential colleges tonight, if you'd like to send me e-mail with your reaction to it, please feel free to do so. I'll collect the mail that I get and put it on the web page.
SUMMARY OF BUSH ARTICLE
I'd like to begin with a brief summary of the article "As We May Think", which was written by Vannevar Bush in 1945. The article was written at the end of World War II. Science played a significant role in the outcome of the war, and Bush wonders where scientists will turn their attention next.
Welcome to life before you were born.
At a universities, where the Joneses were invented, actually think about effectively few people expected to revolution, that it might be like?
Before therefore replace some teachers instantly being invented, actually by John von Neumann, right help are on the lecture would need to think that of technical device called "associative instruction of interconnections in the audience somewhere! I was at Xerox PARC. I visited there were to postulate that the university, we try to absorb new ideas to others all around in millions of dollars on things were 10 years, a small amount of information, and he mentioned that both of these thing that a physical libraries and museums at Harvard, so I'm not much about 5 years, it's fair to save every keystroke typed in that comprise though the web, the information, after you've never been on that limb.
SUMMARY OF BUSH ARTICLE
No argument with it? I'd be far out on a limb if I said that enhance our understand the people expect to have a clear how much about IBM in the functionality of today, but the article "As We May Think", which are available at the enterprise upon which you agree with Noam. Again, let me begins by noting them to help solve scientists in the amount of information, the number of problems.
Still, Bush did hit the nail on the verge of breaking down. Why? First, he says, there are now found in T-shirts and sandals, drinking personal attention next.
I'd like to say that you missed the connection be linked together in different world different than access it by typing in a short time with exponential colleges tonight.
```



**Generated Output**:

```
Welcome to listen to our customers and provide them the topic that I get and put it on the lecture would comply with a preliminary ruling by Federal District Court Judge Ronald H. Whyte that thick envelope from Fred Hargadon. Right? The purpose is the prospect of having all knowledge online, and its implications. The company would be in this room and that no audio-visual aids would comply with a preliminary ruling by Federal District Court Judge Ronald H. Whyte that Microsoft to be Microsoft sai
```



*Note*: The generated text is a probabilistic outcome based on the input text's structure and may require multiple runs to achieve the desired coherence.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your enhancements.

---

For more information and to access the source code, visit the [GitHub Repository](https://github.com/akgarhwal/Random-Text-Generator).
