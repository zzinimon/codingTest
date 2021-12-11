package others;
//1부터 99까지의 i^4의 합
public class TL01 {

	public static void main(String[] args) {
		int answer=0;
		for (int i = 1; i <= 99; i++) {
			answer+=Math.pow(i, 4);
		}
		System.out.println(answer);
	}

}
