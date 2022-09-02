package javaspecification.day2;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String args[]) {
		Predicate<Integer> greaterthanPredicate = (mark)->mark>50;
		System.out.println(greaterthanPredicate.test(100));
		
		Predicate<Integer> lessthanPredicate = (mark)->mark<50;
		System.out.println(lessthanPredicate.test(100));
		
		Predicate<Integer> equalToPredicate = (mark)->mark==50;
		System.out.println(equalToPredicate.test(100));
		
		System.out.println("and checking"+ greaterthanPredicate.and(equalToPredicate).test(100));
		System.out.println("or checking"+ greaterthanPredicate.and(equalToPredicate).test(100));
		
	}

}
