package swap_even_odd;

import java.util.*;
public class Swap_even_odd_bits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //181
		
		//Swapping even and odd bits 
		
		System.out.println((n & 0xAAAAAAAA)>>>1 | (n & 0x55555555)<<1);  
		
		//122				
		
		
		scan.close();
	}

}
