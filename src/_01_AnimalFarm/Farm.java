package _01_AnimalFarm;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
public static void main(String[] args) {
	//ArrayList <Animal> farm = new ArrayList <Animal>();
	ArrayList<Animal> farm = new ArrayList<Animal>(
		    Arrays.asList(new Pig(), new Cow(),new Duck(),new Chicken(), new Pig(),new Cow()));
	for (int i=0;i<farm.size();i++) {
		System.out.println(farm.get(i).makeNoise());
		farm.get(i).eat();
	}
}
}
