package javaspecification.day2;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,Integer> functiondemo= name -> name.length();
System.out.println(functiondemo.apply("hello"));
	}

}
