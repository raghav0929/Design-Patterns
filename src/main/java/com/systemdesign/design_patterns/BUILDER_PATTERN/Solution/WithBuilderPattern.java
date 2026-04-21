package com.systemdesign.design_patterns.BUILDER_PATTERN.Solution;

public class WithBuilderPattern {

	public static void main(String[] args) {
		House house=new House.HouseBuilder("Concrete","Wood","Tile")
						.setGarden(true).build();
		System.out.println(house);

	}

}
/*
 * Solution:
 *
 * The Builder Pattern is used to construct complex objects
 * step by step in a readable and flexible way.
 *
 * Instead of passing multiple parameters to constructors,
 * we use a builder to set only the required and optional fields.
 *
 * This improves readability and avoids confusion
 * caused by multiple constructor arguments.
 */