package kaganinjava;
import java.util.*;


public class ilkproje {

	public static void main(String[] args) {
		
		System.out.println("Lütfen Bir Sayı Giriniz");
		
		//Scanner nesnesini oluşturduk.
		Scanner sc = new Scanner(System.in);
		
		// Toplam while içinde dönerken artıcak
		int toplam = 0;
		
		int girilenSayi = sc.nextInt();
		
		while(girilenSayi > 0) {			
			
			//Sayının 10 ile modundan kalanı toplama ekledik.
			toplam = toplam + girilenSayi%10;
			
			//Girilen sayının birler basamağındaki sayıyı 10 ile bölerek eledik.
			girilenSayi = girilenSayi/10;
		}
		
        System.out.println("Girdiğiniz sayının rakamları toplamı: " + toplam);
		
		
	}

}	

