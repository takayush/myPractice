package DictionaryPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		    Scanner sc = new Scanner(System.in);
		    n = sc.nextInt();
		    String[] firstNames = new String[n];
		    int[] phoneNumbers = new int[n];
		    Map<String,Integer> phoneDirectory = new HashMap<String, Integer> ();
		    for(int i = 0 ; i < n ; i ++){
		        firstNames[i] = sc.next();
		        phoneNumbers[i] = sc.nextInt();
		        phoneDirectory.put(firstNames[i],phoneNumbers[i]);
		    }
		    ArrayList<String> tempName = new ArrayList<String>();
		    
		    while(sc.hasNext()){
		        tempName.add(sc.next());
		        
	}
		    for(int i = 0 ; i < tempName.size() ; i ++){
		    	if(phoneDirectory.get(tempName.get(i))!=null){
		            System.out.println(tempName.get(i)+"="+phoneDirectory.get(tempName.get(i)));
		        }   else{
		            System.out.println("Not found.");
		        } 
		    }
	}

}
