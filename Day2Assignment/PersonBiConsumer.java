package Day2;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class PersonBiConsumer {
	
	static List<Person> personList = PersonRepository.getAllPersons();
	static BiConsumer<Double,List<String> > detailsOfPerson = (salary,hobbies) ->
	System.out.println("  salary is "+ salary+" hobbies are: "+hobbies);
	
//	
	public static void main(String[] args) {
	
		fetchHobbies();
	}
	
	private static void fetchHobbies() {
		
		personList.forEach(per->{
			detailsOfPerson.accept(per.getSalary(),per.getHobbies().stream().map(name -> name.toUpperCase()).collect(Collectors.toList()));
		});
	}


}