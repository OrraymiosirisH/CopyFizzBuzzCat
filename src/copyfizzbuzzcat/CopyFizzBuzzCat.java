package copyfizzbuzzcat;

public class CopyFizzBuzzCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int x = 1; x <= 100; x++)

			if (((x % 3) == 0) && ((x % 5) == 0) && ((x % 2) != 0) && ((x % 10) != 0)) { 

				System.out.println("Fizzbuzz");

			} else if (((x % 3) == 0) && ((x % 5) == 0) && ((x % 2) == 0) && ((x % 10) != 0)) { 

				System.out.println("CopyFizzBuzz");
			} else if (((x % 3) != 0) && ((x % 5) == 0) && ((x % 2) != 0) && ((x % 10) != 0)) { 

				System.out.println("Buzz");			
			}
			else if (((x % 3) == 0) && ((x % 5) == 0) && ((x % 2) == 0) && ((x % 10) == 0)) {

				System.out.println("CopyFizzBuzzCat");			
			}
			else if (((x % 3) == 0) && ((x % 5) != 0) && ((x % 2) != 0) && ((x % 10) != 0)) {

				System.out.println("Fizz");
			}
			else if (((x % 3) != 0) && ((x % 5) == 0) && ((x % 2) == 0) && ((x % 10) == 0)) {

				System.out.println("CopyBuzzCat");
			}
			else if (((x % 3) != 0) && ((x % 5) != 0) && ((x % 2) == 0) && ((x % 10) != 0)) {

				System.out.println("Copy");
			}
			else if (((x % 3) == 0) && ((x % 5) != 0) && ((x % 2) == 0) && ((x % 10) != 0)) {

				System.out.println("FizzCopy");
			}	
		
			else
				
				System.out.println(x);
	}
	
	
	
	}

