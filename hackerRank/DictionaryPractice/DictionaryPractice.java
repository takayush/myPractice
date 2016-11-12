package DictionaryPractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {
	public static void main(String[] args) {
		// English to spanish dictionary
		Map<String, String> englSpanDictionary = new HashMap<String, String>();
		// putting things inside our dictionary
		englSpanDictionary.put("Monday", "Lunes");
		englSpanDictionary.put("Tuesday", "Martes");
		englSpanDictionary.put("Wednesday", "Mièrcoles");
		englSpanDictionary.put("Thursday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");
		// Retrieve things from dictionary
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thursday"));
		System.out.println(englSpanDictionary.get("Friday"));
		System.out.println(englSpanDictionary.keySet());
		// Print all values
		System.out.println(englSpanDictionary.values());
		// size of our dictionary
		System.out.println("The size of our dictionary: " + englSpanDictionary.size());
		// Shopping List
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", false);
		shoppingList.put("Sugar", Boolean.FALSE);
		//Retrieve Things
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Oreos "));
		//remove things
		shoppingList.remove("Eggs");
		//replace value for certain key
		shoppingList.replace("Bread", Boolean.FALSE);
		//key value print
		System.out.println(shoppingList.toString());
		//clear disctionary
		shoppingList.clear();
		System.out.println(shoppingList.toString());
	}
}