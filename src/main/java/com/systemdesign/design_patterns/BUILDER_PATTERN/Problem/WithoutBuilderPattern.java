package com.systemdesign.design_patterns.BUILDER_PATTERN.Problem;

public class WithoutBuilderPattern {

	public static void main(String[]args)
	{
		House house=new House("Concrete", "Wood", "Shingles", true, false, false);
		System.out.println(house);
	}
}
