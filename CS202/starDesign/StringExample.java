package starDesign;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String zipcode = "10 Gurnet Drive; Brunswick ME 04011; (207) 725- 9055";
		String[] z = zipcode.split("\\d{5}");
		
		for(int i = 0 ; i< z.length;i++){
			System.out.println(z[i]);

		}
		String regex = "([0-9]*[-]*[0-9]*)*"; //this regex is taken from http://stackoverflow.com/questions/22133506/how-to-extract-the-zip-code-from-a-line-of-address
		Pattern p = Pattern.compile(regex);
		String output = null;
		Matcher m = p.matcher(zipcode);
		while (m.find()) {
		    output = m.group();
		    if(output.length()==5)
		    	break;
		}
		System.out.println("---------"+output);

	}

}
