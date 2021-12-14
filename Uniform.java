package programmers;

import java.util.Arrays;

//체육복
public class Uniform {

	public static void main(String[] args) {
		int[] lost1={2, 4};
		int[] lost2={2, 4};
		int[] lost3={3};
		int[] lost4={1, 2};
		
		int[] reserve1={1, 3, 5};
		int[] reserve2={3};
		int[] reserve3={1};
		int[] reserve4={2, 3};
		
		System.out.println("test case 1:"+solution(5,lost1,reserve1));//5
		System.out.println("test case 2:"+solution(5,lost2,reserve2));//4
		System.out.println("test case 3:"+solution(3,lost3,reserve3));//2
		System.out.println("test case 4:"+solution(3,lost4,reserve4));//2
	}
/*
문제 설명
점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.

전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

제한사항
전체 학생의 수는 2명 이상 30명 이하입니다.
체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
*/
	
	static int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);
		//전체학생 수에서 도난당한 학생 수를 뺀다
        int answer = n-lost.length;
        //도난당한 학생이 여벌을 갖고있는지 확인
        for (int i = 0; i < lost.length; i++) {
        	if(Arrays.binarySearch(reserve, lost[i])>=0){
        		reserve[Arrays.binarySearch(reserve, lost[i])]=-1;
        		lost[i]=-1;
        		answer++;
        		Arrays.sort(reserve);
        	}
		}
        
        for(int i=0;i<lost.length;i++) {
        	//도난당한 학생의 앞 번호 학생이 여분이 있는지 확인
        	 if(Arrays.binarySearch(reserve, lost[i]-1)>=0){
        		System.out.println(lost[i]+"번 학생이"+reserve[Arrays.binarySearch(reserve, lost[i]-1)]+"번을 가져감");
        		reserve[Arrays.binarySearch(reserve, lost[i]-1)]=-1;
        		answer++;
       		//도난당한 학생의 뒷 번호 학생이 여분이 있는지 확인
        	}else if(Arrays.binarySearch(reserve, lost[i]+1)>=0) {
        		System.out.println(lost[i]+"번 학생이"+reserve[Arrays.binarySearch(reserve, lost[i]+1)]+"번을 가져감");
        		reserve[Arrays.binarySearch(reserve, lost[i]+1)]=-1;
        		answer++;
        	}
        }
        return answer;
    }
}
