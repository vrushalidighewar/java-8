package com.app.methodref;

import java.util.function.Function;
import java.util.function.Supplier;

public class Method_Reference {

	public static void main(String[] args) {

		//method reference to instance method(ClassName :: MethodName)
		Function<String, String> lambdaFunction = s -> s.toUpperCase();
        System.out.println(lambdaFunction.apply("abc"));
        
        Function<String, String> referenceFunction = String::toLowerCase;
        System.out.println(referenceFunction.apply("PQR"));
        
        String str="xyz";
        System.out.println(str.toUpperCase());
  
        //method reference to static method
        Function<String, Integer> lambdaFunction1 = (String s) -> Integer.parseInt(s);
        System.out.println(lambdaFunction1.apply("55"));
        
        Function<String, Integer> referenceFunction1 = Integer::parseInt;
        System.out.println(referenceFunction1.apply("55"));
        
        
        //method reference to instance method(ReferenceVariable :: MethodName)
        Employee e=new Employee();
        e.setName("Vrushali");
        
        Supplier<String> lambdaSupplier = () -> e.getName();
        System.out.println(lambdaSupplier.get());
        
        Supplier<String> supplier1 = e::getName;
        System.out.println(supplier1.get());
        
        //constructor reference
        Supplier<Company> lambdaSupplier2 = () -> new Company();
        System.out.println(lambdaSupplier2.get());
        
        Supplier<Company> supplier2=Company :: new;
        System.out.println(supplier2.get());                  
	}

}
