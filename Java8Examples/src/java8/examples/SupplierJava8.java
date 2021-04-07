package java8.examples;

import java.util.function.Supplier;

public class SupplierJava8 {

	public static void main(String[] args) {
		Supplier str=() ->"Saket";
		System.out.println(str.get());

	}

}
