package swap_even_odd;

import java.util.*;
public class Swap_even_odd_bits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //181
		
		//Swapping even and odd bits 
		//(0xAAAAAAAA => 14316555765)  //All odd position are 1 and even are 1.
		//(0X55555555 => -1431655766)  //All even position are 1 and odd are 0.

		System.out.println((n & 0xAAAAAAAA)>>>1 | (n & 0x55555555)<<1);  
		
		//122				
		
		
		scan.close();
	}

}
