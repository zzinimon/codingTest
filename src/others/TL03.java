package others;

//1/i�� sum�� 10�� ��, 1���� i������ sum 
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
