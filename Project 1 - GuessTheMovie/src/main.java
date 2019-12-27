import java.util.Scanner;
import java.io.File;
public class main {
    public static void main(String[] args) throws Exception {
        int wrongCount = 0;
        File file = new File("movies.txt");
        Scanner fileScanner1 = new Scanner(file);

        //**PART 1: GET A RANDOM MOVIE IN THE FILE
        //get numOfMovies so I can know the upper extent to which I can call nextLine on file without going out of bounds aka. no more lines
        int numOfMovies = 0;
        while (fileScanner1.hasNextLine()) {
            numOfMovies++;
            fileScanner1.nextLine();
        }

//        System.out.println(numOfMovies);

        //get random number that can get as high as # of movie titles. <- want to use this when creating loop to decide which movie title to pick
        int randomNumberWithinRangeOfNumberOfMovieTitles = (int) (Math.random() * numOfMovies) + 1; //could be anywhere between 1 through whatever last value is i.e. 10th value 1, 2, 3.... 10...
//        System.out.println(randomNumberWithinRangeOfNumberOfMovieTitles);

//        Randomly select movie by doing nextLine random amount of times
        Scanner fileScanner2 = new Scanner(file);
        String chosenMovie = "";
        for (int i = 1; i <= randomNumberWithinRangeOfNumberOfMovieTitles; i++) {
            if (i == randomNumberWithinRangeOfNumberOfMovieTitles) {//at the movie you want to copy
                chosenMovie = fileScanner2.nextLine();
            }
            else{
                fileScanner2.nextLine(); //reads the next line so that when next line is called again goes to the next one }
            }
        }

        System.out.println(chosenMovie);
        //Now you know chosenMovie has what you want it to have a random movie


        //**PART 2: START GAME
        //when user runs program this method is going to run. What do I want to happen......
        // 1. See a message that starts the game
        System.out.println("Hey Welcome to the movie guessing game!");
        System.out.println("Guess a letter inside the movie name right and we'll fill the blank spaces up. If wrong we'll add 1 to your wrong tally. 10 in the wrong tally and you lose! Good Luck!");


        //strategy is to reset the string all the time and then have temp variable remember what's been learned so far.....?
        String [] learnedSoFar = new String [chosenMovie.length()];

        boolean isFirstPrompt = true;
        //************Part that should repeat aka. be in a loop
        while (wrongCount < 10) {
            String responseString = "";
            //1. Part where each time user is going to guess new letter you want to show them the prompt
            System.out.println("What letter do you think is in this movie name?: ");

            //**if it's the first time they're prompted want to show "____" BUT all successive times want to show the filledOutString i.e. "o___p _t__"


            //first time
            //Create string w/as many _ as chosenMovie
            if (isFirstPrompt) {
                for (int i = 0; i < chosenMovie.length(); i++) {
                    responseString += "_";
                }
                System.out.println(responseString);
                responseString = "";
                isFirstPrompt = false;
            }




            //**PART 3: GET USER INPUT AND CHECK IF IT MATCHES TO ANYTHING IN CHOSENMOVIE
            // 2. prompt them to guess
            Scanner scanner = new Scanner(System.in); // <- start listening to if user types anything
            String userInput = scanner.nextLine(); //give whatever they typed in response to prompt
//        System.out.println(userInput);


            //check if user not inputting single letter
            while (userInput.length() != 1) {
                //            repromptThemToGuess
                System.out.println("we want a letter from you not a bunch of them. Guess again:");
                userInput = scanner.nextLine();
            }


        //know userInput is valid 1 character by now
//        System.out.println(userInput);




        //So... just have to check userInput against the chosenMovie's letters
        boolean gotRightLetter = false;
        for (int i = 0; i < chosenMovie.length(); i++) {
            if (userInput.equals(chosenMovie.substring(i,i+1))) {
//                System.out.println("got correct");
                //replace dashString with the letter ooooooo but then strings are immutable
                responseString += userInput;
                gotRightLetter = true;
                learnedSoFar[i] = chosenMovie.substring(i,i+1);
            } else {//no match so just add dash
                responseString += "_";
            }

        }

        if (gotRightLetter){
            System.out.println("Good job. Here's what you figured out " + responseString);
        } else {//past guess was wrong
            wrongCount++;
            System.out.println("you've got " + wrongCount + " wrong so far");
        }

//            wrongCount++;
        }

        System.out.println("You've gotten this wrong 10 times. Game Over.");





    }
}
