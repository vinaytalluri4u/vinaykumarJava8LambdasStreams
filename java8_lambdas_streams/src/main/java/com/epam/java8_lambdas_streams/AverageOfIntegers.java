package com.epam.java8_lambdas_streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageOfIntegers
{
	 public static void main(String[] args) 
	    {
		 	int array[]= {1,2,3,4,5,6,7,8,9,10};
	        IntStream stream = IntStream.of(array); 
	        OptionalDouble object = stream.average(); 
	        if (object.isPresent())
	        { 
	            System.out.println(object.getAsDouble()); 
	        } 
	        else
	        { 
	            System.out.println("-1"); 
	        } 
	    } 

}
