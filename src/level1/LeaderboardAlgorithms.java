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
    public static void sortByScoreDescending(ArrayList<ScoreEntry> list) {
        // 
    	int large = list.size();
    	
    	quickSort(list, 0, large - 1);
    		
    		
  
    	  }
    
    	
    	//
    	
    		
    	
    
    
    public static int partition(ArrayList<ScoreEntry> list, int low, int high) {
    	
    	
    	ScoreEntry pivot = list.get(high);
    	int i = low-1;
    	
    	for(int j = low; j < high; j++)
    	{
    		if (list.get(j).getScore() >= pivot.getScore()) {
    			
    			i++;
    			
    			ScoreEntry temp = list.get(i);
    			
    		     list.set(i, list.get(j));
    	         list.set(j, temp);
    	
    			
    		}
    		
    		ScoreEntry temp = list.get(i + 1); 
    		
    	    list.set(i + 1, list.get(high));
    	    list.set(high, temp);
  
    		
	
    	
    		}
		return i+1;
    	
    }
    
    
    static void quickSort(ArrayList<ScoreEntry> list, int low, int high) {
    	
    	if(low < high) {
    		
    		int pi = partition(list, low, high);
    		
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
     * 
     * 
     * 
     */
    public static void sortByUsernameAscending(ArrayList<ScoreEntry> list) {
        int n = list.size();
        
        
        for(int i = 0; i < n - 1; i++) {
        	
        	int min = i;
        	
        	for(int j = i + 1; j < n; j++) {
        		if(list.get(j).getUsername().compareTo(list.get(min).getUsername()) < 0){
        			
        			min = j;
        			
        		}			
        			
        		}
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
    		String midUsername = list.get(mid).getUsername();
    		
    		int comparison = username.compareTo(midUsername);
    		
    		if (comparison == 0) {
    			return mid;
    			
    			
    		}else if (comparison < 0) {
    			high = mid - 1;
    		}else { 
    			low = mid+1;
    		}
    	
    	
    	}
    	
    	return -1;
    
    }
    
    
    public static ArrayList<ScoreEntry> binarySearchScore(ArrayList<ScoreEntry> list, int score) {
       	int low = 0;
    	int high = list.size() - 1;
    	 ArrayList<ScoreEntry> topScoreList = new ArrayList<>();
    	
    	while(low <= high) {
    		
    		int mid = (low + high)/2;
    		int midScore = list.get(mid).getScore();
    
    		
    		if(score == midScore) {
    			topScoreList.add(list.get(mid));
    			list.remove(mid);
    	
    			
    		}else if (score > midScore) {
    			high = mid - 1;
    		}else { 
    			low = mid+1;
    		}
    	
    	
    	}
    	
    	if(topScoreList.size() > 0) {
    		return topScoreList;
    	}
    	
    	return null;
    	
    
    
    	
    }
}
