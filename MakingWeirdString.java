package programmers;
//�̻��� ���� �����
public class MakingWeirdString {

	public static void main(String[] args) {
//		test cases
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("Z", 10));
		System.out.println(solution("a B z", 4));
		System.out.println(solution(" aBZ", 20));
		System.out.println(solution("y X Z", 4));
		System.out.println(solution(" . h z", 20));
	}
	/*���� ����
	���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. �� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�.
	�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.

	���� ����
	���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
	ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
	*/
	public static String solution(String s, int n) {
	       String answer = "";
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==' ')answer+=" ";
				else{
					if(s.charAt(i)<='z'&& s.charAt(i)>='a'){//�ҹ���?
						if((s.charAt(i)+n<='z'&&s.charAt(i)+n>='a'))answer+=(char)(s.charAt(i)+n);//���ڸ� ���ص� ������ �ȳѾ?
						else answer+=(char)(s.charAt(i)+n-26);
					}else if(s.charAt(i)<='Z'&& s.charAt(i)>='A'){ //�빮��?
						if((s.charAt(i)+n<='Z'&&s.charAt(i)+n>='A'))answer+=(char)(s.charAt(i)+n);//���ڸ� ���ϵ� ������ �ȳѾ�?
						else answer+=(char)(s.charAt(i)+n-26);
					}
				}
	        }
			return answer;
	    }
}
