package others;
//5000000보다 작은 1234567890의 약수의 합

public class TL02 {

	public static void main(String[] args) {
		int num=1234567890;
		int sum=0;
		int cnt=0;
		for (int i = 1; i <= 5000000; i++) {
			double pair=num*1.0/i;	//(i,pair)=약수 쌍
			if(pair%1==0.0) {
				sum+=i;
				cnt++;
			}
		}
		System.out.println(sum);
	}
	

}
