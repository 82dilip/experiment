package com.epam.lamdas.type;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import javax.swing.JOptionPane;


public class TypeInference {

	public static void main(String[] args) {
	
		BinaryOperator<Long> binaryOp = (x,y) -> x*y;
		Predicate<Integer> atLeast5 = x -> x > 5;
		
		//checkInput(atLeast5);
		getBinaryOutput(binaryOp);
		
	}

	private static void getBinaryOutput(BinaryOperator<Long> binaryOp) {
		Long evaluatedVal = binaryOp.apply(Long.parseLong("0"), Long.parseLong("20"));
		System.out.println(evaluatedVal);
		
	}

	private static void checkInput(Predicate<Integer> atLeast5) {
		if(atLeast5.test(Integer.parseInt(JOptionPane.showInputDialog("Integer"))) == true) {
			System.out.println("greater");
		}else
			System.out.println("less");
		
	}
	
	
	
}
