package testPjt;

public class homework {
	public static void main(String[] args) {
		int sum=0;
		int n=5;
		int final_sum=0;
		
		for (int i=1;i<=n;i++) {
			sum=sum+i;
			System.out.println("sum=sum+i="+sum);
			final_sum=final_sum+sum;
			System.out.println("final_sum=final_sum+sum="+final_sum);
		}
	}
}
