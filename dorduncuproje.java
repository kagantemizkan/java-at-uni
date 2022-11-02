package kaganinjava;
import java.util.*;

public class dorduncuproje 
{

	public static void main(String[] args) 
	{

		Random rand = new Random();
		
	    int[][] matris= new int[5][5]; 	
	            
	    
	    int satir, sutun;
        
	    for (satir = 0; satir < 5; satir++) 
        {
            for (sutun = 0; sutun < 5; sutun++) 
            {
                matris[satir][sutun] = rand.nextInt(100); ;
               
                if (satir == sutun) 
                {
                    matris[satir][sutun] = rand.nextInt(100); ;
                }

            }
        }
	    
	    int[] dizi = new int[5];
	     
	    int dongu = 0;
	    
	    while(dongu<5)
	    {
	    	dizi[dongu] = matris[dongu][0];
	    	dongu = dongu +1;
	    }
	}
}
