
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Uniquedata{
public static void main(String[] args) {
		
		 List<String> names = Arrays.asList("Aditi", "Aditi","Riya","Aakansha");
		 HashSet<String> hashNames = new HashSet<String>(names);
	    
	   
	    
	    
	    for(String newNames :hashNames)
	      System.out.println(newNames);
		
		
		
	}
}