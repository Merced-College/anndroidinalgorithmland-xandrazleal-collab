//Chase Batchelor
//Xandra Leal
//Matthew Briones
//3/20/2026
//CPSC-39-12106


[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23068469)
# AnnDroidInAlgotihmLand
a sample project to practice sorting and searching

🎵 Download Required Audio File

This project uses an audio file that is too large to store directly in the GitHub repository.
Please download the file from Google Drive before running the program.

Download the audio file here:

➡️ Download the required audio file from Google Drive

Instructions

Open the Google Drive folder using the link above.

Download the ZIP file that contains the audio file.

Extract (unzip) the file on your computer.

Place the extracted audio file into the project folder named content.

Download all of the whole content folder, and put this in your project.


Completed Project setup

## Code Exploration

The Src folder contains all the code written for the project.

The content folder contains all the image and other assets for the project

The uml file contains an overview on how the code is set up

Software projects separate code and assets due to ease of navigation and organization.

the Main class contains the main() method

When the program first starts running it creates a Javax JFrame screen to display the project.

The Jframe objects are created and the approuter object are created in main.

#pt2
1.2. The mainMenuPanel and RabbitGamePanel are responsible for drawing the graphics for each screen respectively

2. The Assets class is responsible for loading the assets that are not in covered in the 2 panel classes.

3. The game updates in the RabbitGamePanel, in the StartRound function there is an if statement that stays true and calls user input until the round is over


#pt3
1. The codes are stored in the Leaderboard repository class which puts them in an arraylist for the Score Entries class called entries.

2.The class ScoreEntry is used to score codes, creating a new object of this class and adding it to an Arraylist

3.It would make sense to implement the sorting of scores in the LeaderboardAlgorithms class

##Sorting
#pt4

1.I added the sorting code to the LeaderboardAlgorithms.java

2. I chose this class because it already had a skeleton outline of what I needed to do

3. A csv list is being sorted, in a data type called ScoreEntry


#pt5
Note: We saw there was a comment mentioning extra credit, We wrote some commented out code for quicksort that fully works, the current code is set to Selection sort. Here we've described both algorithms.

2.	Selection sort works by iterating through the list, finding the lowest value compared to the value at index 0, and swaps the two. it repeats on the next index until list is sorted. At the end it swaps the search value I with the last value to put it in
the correct place and finish sorting
	
	 QuickSort works by selection one of the elements as a pivot. The pivot can be random but I used the last element. I wanted a descending list, so it iterates through finding any number larger then it and swapping it with
	 the element in index of i. It then swaps the pivot to i, creating an upper partition with numbers larger than the pivot and lower partition with numbers lower. In a separate function I called the pivot function, with bounds
	  so it would only sort the upper and lower partitions separately. This loops, creating more and more partitions until it is sorted.  
	  
3. We verified it by looking through the raw data to see if there was any score larger than the one my algorithm was giving me. Then checking the upper bounds to see if I found any values between the ones it was showing. There wasn't
so those two methods confirm that its sorted. 
	 

#pt6

1. Binary search works by comparing the key to the mid value, if its higher then it continues on the higher part of the list, vice versa for lower. It then finds the half of the halved list and repeats until the key is found.

2. Data has to be sorted because it starts at the half way point and compares if the key is larger or smaller then the half way point to choose which way to continue searching. This wouldn't work if its random because 
if it was it would be up to chance if it finds the key, before the end conditions are met

3. I used low high and mid for the low high and mid variables

4. When the score is not found it returns null, changed from -1 to support the comparison operators I was using, and prints an error message




 