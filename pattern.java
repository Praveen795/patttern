package pattern;

public class pattern {
	
// * * * * * 
// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// Print pattern
	public static void main(String[] args) {
		System.out.print("pattern 1");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		System.out.println("pattern 2");
		
// *		
// * *
// * * *
// * * * * print pattern
		
		for(int i=1; i<=4;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println();
		
// * * * *
// * * *
// * *
// *
//print pattern
		
		
		
		
		
		System.out.println("pattern 3");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
			
		}
		System.out.println("pattern  4");
		
//  *
//  * * 
//	* * *
//	* *
//	* 
//	pattern

	

		for(int i=1; i<=5;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
			
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
