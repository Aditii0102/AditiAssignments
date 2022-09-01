
import java.util.Arrays;
import java.util.List;


 public class Uppercase{
	 public static void main(String args[]) {
		 List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam" , "Sam" , "Peter" , "Sam" , "Sam" , "Peter");
		    names.replaceAll(String:: toUpperCase);
				 System.out.println("UpperCase list " + names);
	 }
 }