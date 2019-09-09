//Привет командир
//Привет от генерала Стефана
package src;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        Random random = new Random();        
        int []arr = new int [20];
        for(int i = 0; i < 20; i++) {
        	int genN = -1;
        	do {
        		genN = random.nextInt(21);
        	}while(contains(arr, genN));
        	arr[i] = genN;
        }
        for (int i = 0; i < arr.length; i++)
        	System.out.println(arr[i]);
    }   
    public static boolean contains(int arr[], int value) {
    	boolean exists = false;
    		for (int i = 0; i < arr.length; i++) {
    			if (arr[i] == value) {
    			//	System.out.println(arr[i] + ":" + value);
    				exists = true;
    				break;
    			}
    			
    		}
    	
    	return exists;
    }
}