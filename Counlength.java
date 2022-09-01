
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Counlength {
	
	
	public static void greaterThan3(List<String>list) {
		int c=0;
		for(String count:list) {
			if(count.length()>3) {
				c++;
			}
		}
		System.out.print("greater than 3 count is "+c);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		 List<String> names = Arrays.asList("Aditi", "Riya","Shubham","Sourav" , "Gaurav" );
		
		 greaterThan3(names);
		
	       
	
			 
		  }
		
		
}









