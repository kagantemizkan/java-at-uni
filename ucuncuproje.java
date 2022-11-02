package kaganinjava;
import java.util.*;

public class ucuncuproje {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lutfen matrisin boyutunu giriniz.");
		
		int boyut = sc.nextInt();
		
		
	    int[][] dizi= new int[boyut][boyut]; 
        
	    int satir, sutun;
        
	    for (satir = 0; satir < boyut; satir++) 
        {
            for (sutun = 0; sutun < boyut; sutun++) 
            {
                dizi[satir][sutun] = 0;
               
                if (satir == sutun) 
                {
                    dizi[satir][sutun] = 1;
                }

            }
        }

	    
        for (satir = 0; satir < boyut; satir++) {
        	for (sutun = 0; sutun < boyut; sutun++) {
                System.out.print(dizi[satir][sutun] + "\t");
            }

            System.out.println("");
        }
	}
}
