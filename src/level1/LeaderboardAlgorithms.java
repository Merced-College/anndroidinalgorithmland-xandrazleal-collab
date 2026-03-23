//Chase Batchelor
//Xandra Leal
//Matthew Briones
//3/20/2026
//CPSC-39-12106


package level1;

import java.awt.List;
import java.util.ArrayList;

/**
 * STUDENT TODO FILE
 *
 * You will implement sorting and binary search for the Leaderboard Terminal.
 */
public class LeaderboardAlgorithms {

    /**
     * TODO: Sort the list by score DESCENDING (highest score first).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * - You may use Collections.sort + Comparator for the first version.
     * - Week 8 challenge/extra credit: replace with merge sort or quicksort.
     */
	
	
	
	/*
	 Selection Sort by Descending 
	 */
	
	public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
		
        int n = list.size();
        
        
        
        for(int i = 0; i < n - 1; i++) {
        	
        	int min = i;
        	
        	
        	for(int j = i + 1; j < n; j++) {
        		//checks if the letter code in the current index j is smaller than the letter code of the min index. 
        		if(list.get(j).getScore() > list.get(min).getScore()){
        			
        			
        		//sets j as the new smallest index.
        			min = j;
        			
        		//After all elements of j are checked it resets min to the next index i and repeats until list is sorted
        			
        		}			
        			
        		}
        	
        	//Swaps the first value to the value at i to finish sorting.
        	 ScoreEntry temp = list.get(i);
        	 list.set(i, list.get(min));
        	 list.set(min, temp);
		
		
		
		
	}
        
	}
   
	
	
	
	
	
	
	
	
	
	//Commented out code is a quicksort Algorithm written for extra credit, works fully
	/*
	//calls quicksort with the given ScoreEntry list
	public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
        // 
    	int large = list.size();
    	
    	quickSort(list, 0, large - 1);
    		
    		
  
    	  }
    
    	
    	//
    	
    		
    	
    
    //Creates the mid point in which the search pivots, starting with last entry of the array 
    public static int partition(ArrayList<ScoreEntry> list, int low, int high) {
    	
    	
    	//Last entry chosen as pivot because We know the array is not already sorted so worst case
    	//scenario is not possible
    	ScoreEntry pivot = list.get(high);
    	int i = low-1;
    	
    	
    	
    	for(int j = low; j < high; j++)
    	{
    		//If function for creating the partition, it looks for elements smaller
    		//than the pivot and moves them to the right of the pivot
    		if (list.get(j).getScore() >= pivot.getScore()) {
    			
    			i++;
    			
    			ScoreEntry temp = list.get(i);
    			
    		     list.set(i, list.get(j));
    	         list.set(j, temp);
    	
    			
    		}
    		
    		//swaps the pivot to the right of the smaller element partition.
    		
    		ScoreEntry temp = list.get(i + 1); 
    		
    	    list.set(i + 1, list.get(high));
    	    list.set(high, temp);
  
    		
	
    	
    		}
    	
    	//returns index i which is the amount of times the for loop ran and the location of the pivot
		return i+1;
    	
    }
    
    
    static void quickSort(ArrayList<ScoreEntry> list, int low, int high) {
    	
    	if(low < high) {
    		
    		//Calls the partition function above and stores the returned index i as pi
    		
    		int pi = partition(list, low, high);
    		
    		//Recursive call of the function that will call the partition function twice, one for the elements smaller than, and bigger than the pivot
    		//This will do it with all partitions created until the list is sorted. 
    		
    		quickSort(list, low, pi - 1);
    		quickSort(list, pi + 1, high);
    	}
    	
    	
    }
    
    
    
    	
    	
   
   
    

    /**
     * TODO: Sort the list by username ASCENDING (A -> Z).
     *
     * Requirements:
     * - Sort IN PLACE (modify the given list)
     * 
     */
    
    //Selection sort for the Usernames.
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
        int n = list.size();
        
        
     
        for(int i = 0; i < n - 1; i++) {
        	
        	int min = i;
        	
        	
        	for(int j = i + 1; j < n; j++) {
        		//checks if the letter code in the current index j is smaller than the letter code of the min index. 
        		if(list.get(j).getUsername().compareTo(list.get(min).getUsername()) < 0){
        			
        			
        		//sets j as the new smallest index.
        			min = j;
        			
        		//After all elements of j are checked it resets min to the next index i and repeats until list is sorted
        			
        		}			
        			
        		}
        	
        	//Swaps the first value to the value at i to finish sorting.
        	 ScoreEntry temp = list.get(i);
        	 list.set(i, list.get(min));
        	 list.set(min, temp);
        }
    }

    /**
     * TODO: Binary search for an EXACT username match.
     *
     * Precondition: list must already be sorted by username ascending!
     *
     * @return index of the matching entry, or -1 if not found
     */
    
    
  
    
    
    
    
    public static int binarySearchByUsername(ArrayList<ScoreEntry> list, String username) {
    	int low = 0;
    	int high = list.size() - 1;
    	
    	while(low <= high) {
    		
    		int mid = (low + high)/2;
    		
    		//gets the value of the middle of the list for comparison.
    		String midUsername = list.get(mid).getUsername();
    		
    		//Compares the username of the list to the key and returns 0 if true, a positive number if bigger, and negative if lower 
    		int comparison = username.compareTo(midUsername);
    		
    		//if comparison is returned as 0 return its index location and end
    		if (comparison == 0) {
    			return mid;
    			
    		//If the comparison is less than the mid value, set upper bounds to mids location -1, halving the search	
    		}else if (comparison < 0) {
    			high = mid - 1;
    		}else {
    		//If the comparison is more than the mid value, raise lower bounds to mid, halving the search 
    			low = mid+1;
    		}
    	
    	//Repeats until data set runs dry or finds the correct value, each iteration halving the list until found
    	}
    	
    	return -1;
    
    }
    
    
    //Same logic as above, except comparing an int instead of a string
    //To use type in score and press search Score on the far top right 
    public static ArrayList<ScoreEntry> binarySearchScore(ArrayList<ScoreEntry> list, int score) {
       	int low = 0;
    	int high = list.size() - 1;
    	 ArrayList<ScoreEntry> topScoreList = new ArrayList<>();
    	
    	while(low <= high) {
    		
    		int mid = (low + high)/2;
    		int midScore = list.get(mid).getScore();
    
    		
    		if(score == midScore) {
    			// return all scores with the same value, scores that match the key are added to a list, and then removed
    			//from the data set so it won't be counted twice
    			topScoreList.add(list.get(mid));
    			list.remove(mid);
    	
    			
    		}else if (score > midScore) {
    			high = mid - 1;
    		}else { 
    			low = mid+1;
    		}
    	
    	
    	}
    	
    	//checks if there is anything in the list that holds matching keys, if true returns list, else returns null;
    	if(topScoreList.size() > 0) {
    		return topScoreList;
    	}
    	
    	return null;
    	
    
    
    	
    }
}
