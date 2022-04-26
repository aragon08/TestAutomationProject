package tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang.builder.CompareToBuilder;

public class LambdaApp {
	
	public void ordernar() {
		List<String> lista = new ArrayList<>();
		lista.add("Juan");
		lista.add("Carlos");
		lista.add("Aragon");
		
		/*Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});*/
		
		//Lambda
		Collections.sort(lista, (String p1,  String p2) -> p1.compareTo(p2));
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}

	public void calcular() {
		/* operacion = new Operacion() {
			
			@Override
			public double calculaPromedio(double n1, double n2) {
				// TODO Auto-generated method stub
				return (n1 + n2) / 2;
			}
		};*/
		
		Operacion operacioin = (double x, double y) -> (x+y)/2;
		operacioin.calculaPromedio(2, 3);
	}
	
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		app.ordernar();

	}

}
