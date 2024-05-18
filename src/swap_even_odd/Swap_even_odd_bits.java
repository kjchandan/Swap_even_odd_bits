package swap_even_odd;

import java.util.*;
public class Swap_even_odd_bits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //181
		
		//Swapping even and odd bits 
		//(0xAAAAAAAA => 14316555765)  //All odd position are 1 and even are 1.
									   //& opearation=> later after & operation all odd are preserved and even bits are 0
									   //<<1=>later all odd occupies even positions
		//(0X55555555 => -1431655766)  //All even position are 1 and odd are 0.
										//& operation => later after & operation all even bts are preserved same and odd bits will become xeros.
										//>>>1=>All even posotions occupies odd positions.


										//or(|)=>Add both the above. Will interchange even and odd positions.
		System.out.println((n & 0xAAAAAAAA)>>>1 | (n & 0x55555555)<<1);  
		
		//122				
		
		
		scan.close();
	}

}
