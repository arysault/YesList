package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Double> bottles = new ArrayList<Double>();
		double result = 0;
		
		System.out.print("Quantos litros possui o galão? ");
		double gallon = sc.nextDouble();
		System.out.print("Quantas garrafas serão utilizadas? ");
		double quantity = sc.nextDouble();
		
		for(int i = 1; i<=quantity; i++) {
			System.out.print(i + "° garrafa: ");
			double count = sc.nextDouble();
			bottles.add(count);
		}
		
		Collections.sort(bottles, Collections.reverseOrder());
		
		for(Double bottle : bottles) {
			if(bottle > gallon) {
				continue;
			} else {
				result = gallon - bottle;
				if(result >= 0) {
					gallon = result;
					System.out.println(String.format("Usamos a garrafa de %.2f", bottle) + "L");
				}
			}
		}
		
		System.out.println(String.format("Sobrou %.2f", gallon) + "L");
		sc.close();
	}
	
}

