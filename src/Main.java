package test;

public class Test1 {

	public static void main(String[] args) {
		

	}
	
	
	//exc 1
		public static int sum(int n) {
			if (n==1) return 1;
			return n + sum(n-1);
		}
		//exc 2
		public static int fact(int n) {
			if (n==1) return 1;
			return n * fact(n-1);
		}
		//exc 3
		public static int oddfact(int n) {
			if (n % 2 == 0) {
				n-=1;
			}
				if (n==1) return 1;
				return n * oddfact(n-2);
		}
		//exc 4
			public static int numOfDigits(int n) {
				if (n < 10) {
					return 1;
				}
				else {
					return 1 + numOfDigits(n / 10);
				}
			}
			//exc 5
		public static int divide(int x, int y) {
			if (x < y) return 0;
			return 1 + divide(x-y,y);
		}
		
		
		
		public static int div(int x, int y) {
			
			
			
		}

}
