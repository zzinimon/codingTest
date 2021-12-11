package programmers;
//이상한 문자 만들기
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
	/*문제 설명
	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

	제한 사항
	문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
	첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
	*/
	public static String solution(String s, int n) {
	       String answer = "";
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==' ')answer+=" ";
				else{
					if(s.charAt(i)<='z'&& s.charAt(i)>='a'){//소문자?
						if((s.charAt(i)+n<='z'&&s.charAt(i)+n>='a'))answer+=(char)(s.charAt(i)+n);//숫자를 더해도 범위가 안넘어가?
						else answer+=(char)(s.charAt(i)+n-26);
					}else if(s.charAt(i)<='Z'&& s.charAt(i)>='A'){ //대문자?
						if((s.charAt(i)+n<='Z'&&s.charAt(i)+n>='A'))answer+=(char)(s.charAt(i)+n);//숫자를 더하도 범위가 안넘어?
						else answer+=(char)(s.charAt(i)+n-26);
					}
				}
	        }
			return answer;
	    }
}
