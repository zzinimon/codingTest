package others;
//1���� 99������ i^4�� ��
public class TL01 {

	public static void main(String[] args) {
		int answer=0;
		for (int i = 1; i <= 99; i++) {
			answer+=Math.pow(i, 4);
		}
		System.out.println(answer);
	}

}
