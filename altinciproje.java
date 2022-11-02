package kaganinjava;
import java.util.*;

public class altinciproje {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Lutfen Carpma İslemi İcin 1. Sayiyi Giriniz.");
		int sayi1 = sc.nextInt();
		
		System.out.println("Lutfen Carpma İslemi İcin 2. Sayiyi Giriniz.");
		int sayi2 = sc.nextInt();
		
		int toplam = 0;
		
		for(int a = 0; sayi2>a; a++) {
			toplam = sayi1 + toplam;
		}
		
		System.out.println(toplam);
		
	}

}
