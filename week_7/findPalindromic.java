import java.util.Arrays;

public class findPalindromic {
	
	public static void main(String[] args) {
		int[][] ray = new int[1][1];
		int rayIdx = 0;
		int idx = 0;
		for (int num = 1; num < 1000; num++) {
			int reverseNum = 0;
			int functionNum = num;
			int reverseLength = (int) (Math.log10(num) + 1);
			boolean primeFlag = false;
			boolean palindromicFlag = false;
			//test to see if the num is prime
			for (int i = 2; i <= num / 2; i++) {
				if (num % i != 0) {
					primeFlag = true;
				}
				
				int count = 0;
				//testing to see if its palindromic
				for (int n = 1; n <= reverseLength; ++n) {
					reverseNum = reverseNum * 10 + functionNum % 10;
					functionNum = functionNum / 10;
					count = count++;
				}
				
				if (reverseNum == num) {
					palindromicFlag = true;
				}
			}
			
			if (primeFlag && palindromicFlag)
				System.out.println(num + " is a prime palindromic integer.");
			// couldn't get this to work
//				if (idx>50) {idx = 0;}
//				System.out.println(num);
//				int[] a = Arrays.copyOf(ray[rayIdx], ray[rayIdx].length+1);
//				a[ray[rayIdx].length-1] = num;
//				System.out.println(ray[rayIdx][ray[rayIdx].length-1]);
//				rayIdx++;
//				idx++;
		}
	}
}
