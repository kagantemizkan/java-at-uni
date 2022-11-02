package kaganinjava;
import java.util.*;


public class besinciproje {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Luften 1. Sayiyi giriniz.");
		
		int sayi1 = sc.nextInt();
		
		System.out.println("Luften 2. Sayiyi giriniz.");
		
		int sayi2 = sc.nextInt();
		
		System.out.println("Luften 3. Sayiyi giriniz.");
		
		int sayi3 = sc.nextInt();
		
		int dongu = 0;
			
		if(sayi1 > sayi2) {
			System.out.println("Sayi 1 en buyuk");
		}
		else {
			if(sayi2>sayi3) {
				System.out.println("Sayi 2 en buyuk");
			}
			else {
				System.out.println("Sayi 3 en buyuk");
			}
		}
			
		
	}

}
