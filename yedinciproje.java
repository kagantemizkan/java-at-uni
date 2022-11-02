package kaganinjava;
import java.util.*;
import java.lang.Math;


public class yedinciproje {

	public static void main(String[] args) {
	
		int[] dizi1000 = new int[1000]; 
		
		
		int[] basamak1 = new int[1000];
		
		int[] basamak2 = new int[1000];
		
		int[] basamak3 = new int[1000];
		
		
		for(int a= 0; a<1000; a++) {		
			dizi1000[a] = a + 1;
		}
		
		for(int a = 0; a<1000; a++) {
			
			basamak1[a] = dizi1000[a]%10;
			dizi1000[a] = dizi1000[a]/10;
			
			basamak2[a] = dizi1000[a]%10;
			dizi1000[a] = dizi1000[a]/10;
			
			basamak3[a] = dizi1000[a]%10;
			dizi1000[a] = dizi1000[a]/10;		
		}
		
		for(int a= 0; a<1000; a++) {		
			dizi1000[a] = a + 1;
		}
		
		for(int a = 0; a<1000; a++) {
			
			double b1 = Math.pow(basamak1[a], 3);
			double b2 = Math.pow(basamak2[a], 3);
			double b3 = Math.pow(basamak3[a], 3);
			
			
			double basamakkuptop = b1 + b2 + b3;
			
			if(basamakkuptop == dizi1000[a]) {
				System.out.println("Bu sayi belirtilen sartlara uyar: " + dizi1000[a]);
			}
			
		}
	}
}
