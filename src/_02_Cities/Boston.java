package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double totalTaxes = population*growthRate + (population*0.5);
		return totalTaxes;
	}

}
