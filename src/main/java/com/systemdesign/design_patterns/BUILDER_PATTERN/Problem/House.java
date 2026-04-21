package com.systemdesign.design_patterns.BUILDER_PATTERN.Problem;

public class House {

	private String foundation;
	private String structure;
	private String roof;
	private boolean hasGarage;
	private boolean hasPool;
	private boolean hasGarden;
	
	public House(String foundation) {
		super();
		this.foundation = foundation;
	}

	public House(String roof, boolean hasPool) {
		super();
		this.roof = roof;
		this.hasPool = hasPool;
	}

	public House(String foundation, String structure, String roof, boolean hasGarage, boolean hasPool,
			boolean hasGarden) {
		super();
		this.foundation = foundation;
		this.structure = structure;
		this.roof = roof;
		this.hasGarage = hasGarage;
		this.hasPool = hasPool;
		this.hasGarden = hasGarden;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", hasGarage="
				+ hasGarage + ", hasPool=" + hasPool + ", hasGarden=" + hasGarden + "]";
	}


	
}


/*
 * Problem:
 *
 * The House class has multiple attributes, some required and some optional.
 *
 * To create objects, we are using multiple constructors with different
 * combinations of parameters.
 *
 * This leads to several issues:
 *
 * - Constructor Overloading Explosion:
 *   As the number of fields increases, the number of constructors grows,
 *   making the class hard to maintain.
 *
 * - Poor Readability:
 *   When creating an object, it is not clear what each parameter represents,
 *   especially with multiple boolean values.
 *
 * - Error-Prone:
 *   It is easy to pass parameters in the wrong order,
 *   leading to subtle bugs.
 *
 * - Lack of Flexibility:
 *   Optional fields cannot be handled cleanly without creating
 *   more constructors.
 *
 * This makes object creation complex and messy.
 *
 * The Builder Pattern solves this by providing a step-by-step,
 * readable, and flexible way to construct objects.
 */