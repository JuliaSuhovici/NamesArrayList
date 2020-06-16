import java.util.ArrayList;

public class NamesArrayList {

	public static void main(String[] args) {
		ArrayList<String> devs = new ArrayList<>(); 
		  // adding data to the list
		  devs.add("Johny");
		  devs.add("Valerya");
		  devs.add("Tatyana");
		  devs.add("Peter");
		  devs.add("Marry");
		  
		  // showing the initials, use "charAt(index)" from "String" class
		  int count = 1;
		  for( String str : devs ) {          
		      System.out.println(count+". " + str.charAt(0));
		      count++;
		  }

		  // the longest name, use "length()" from "String" class
		  int maxLength = 0;
		  for(String str : devs  ) {          
		      if(str.length() > maxLength)
		    	  maxLength = str.length();
		  }
		  System.out.println("maxLength = " + maxLength);

		  // swap values
		  String temp;
		  temp = devs.get(0);
		  devs.set(0, devs.get(4));
		  devs.set(4, temp);
		  System.out.println( devs );

	}

}
