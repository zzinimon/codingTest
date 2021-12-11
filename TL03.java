package others;

//1/i의 sum이 10될 때, 1부터 i까지의 sum 
public class TL03 {

	public static void main(String[] args) {
		float sum=0;
		float i;
		for (i = 1; sum<=10; i++) {
			sum+=(1/i);
			System.out.println("sum="+sum);
		}
		System.out.println((int)i-1);
	}
	

}
