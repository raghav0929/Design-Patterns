package com.systemdesign.design_patterns.BUILDER_PATTERN.Solution;

public class House {

	private String foundation;
	private String structure;
	private String roof;
	private boolean hasGarage;
	private boolean hasPool;
	private boolean hasGarden;
	

	public House(HouseBuilder builder) {
		super();
		this.foundation = builder.foundation;
		this.structure = builder.structure;
		this.roof = builder.roof;
		this.hasGarage = builder.hasGarage;
		this.hasPool = builder.hasPool;
		this.hasGarden = builder.hasGarden;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", hasGarage="
				+ hasGarage + ", hasPool=" + hasPool + ", hasGarden=" + hasGarden + "]";
	}
	
	
	/*
	 * This class represents the final object being built.
	 *
	 * It uses a static inner Builder class to construct instances.
	 *
	 * The constructor is designed to accept a builder object,
	 * ensuring that object creation is controlled and structured.
	 *
	 * This avoids multiple constructors and keeps the class clean.
	 */

	public static class HouseBuilder{
		
		private String foundation;
		private String structure;
		private String roof;
		private boolean hasGarage;
		private boolean hasPool;
		private boolean hasGarden;
		public HouseBuilder(String foundation, String structure, String roof) {
			super();
			this.foundation = foundation;
			this.structure = structure;
			this.roof = roof;
		}
		
		public HouseBuilder setGarden(boolean hasGarden)
		{
			this.hasGarden=hasGarden;
			return this;
		}
		
		public HouseBuilder setGarage(boolean hasGarage)
		{
			this.hasGarage=hasGarage;
			return this;
		}
		
		public HouseBuilder setPool(boolean hasPool)
		{
			this.hasPool=hasPool;
			return this;
		}
		
		public House build()
		{
			return new House(this);
		}
	}
	/*
	 * This class implements the Builder Pattern.
	 *
	 * - Required fields are passed through the constructor
	 * - Optional fields are set using setter methods
	 *
	 * Each setter returns the builder itself,
	 * enabling method chaining (fluent API).
	 *
	 * The build() method constructs the final House object.
	 *
	 * This approach:
	 * - Improves readability
	 * - Prevents parameter confusion
	 * - Handles optional fields cleanly
	 * - Makes object creation scalable
	 */
}

