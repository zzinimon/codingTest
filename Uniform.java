package programmers;

import java.util.Arrays;

//ü����
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
���� ����
���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�. �л����� ��ȣ�� ü�� ������ �Ű��� �־�, �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. ���� ���, 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. ü������ ������ ������ ���� �� ���� ������ ü������ ������ ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.

��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� �Ű������� �־��� ��, ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
��ü �л��� ���� 2�� �̻� 30�� �����Դϴ�.
ü������ �������� �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
������ ü������ ������ �л��� ���� 1�� �̻� n�� �����̰� �ߺ��Ǵ� ��ȣ�� �����ϴ�.
���� ü������ �ִ� �л��� �ٸ� �л����� ü������ ������ �� �ֽ��ϴ�.
���� ü������ ������ �л��� ü������ ���������� �� �ֽ��ϴ�. �̶� �� �л��� ü������ �ϳ��� �������ߴٰ� �����ϸ�, ���� ü������ �ϳ��̱⿡ �ٸ� �л����Դ� ü������ ������ �� �����ϴ�.
*/
	
	static int solution(int n, int[] lost, int[] reserve) {
		Arrays.sort(lost);
		Arrays.sort(reserve);
		//��ü�л� ������ �������� �л� ���� ����
        int answer = n-lost.length;
        //�������� �л��� ������ �����ִ��� Ȯ��
        for (int i = 0; i < lost.length; i++) {
        	if(Arrays.binarySearch(reserve, lost[i])>=0){
        		reserve[Arrays.binarySearch(reserve, lost[i])]=-1;
        		lost[i]=-1;
        		answer++;
        		Arrays.sort(reserve);
        	}
		}
        
        for(int i=0;i<lost.length;i++) {
        	//�������� �л��� �� ��ȣ �л��� ������ �ִ��� Ȯ��
        	 if(Arrays.binarySearch(reserve, lost[i]-1)>=0){
        		System.out.println(lost[i]+"�� �л���"+reserve[Arrays.binarySearch(reserve, lost[i]-1)]+"���� ������");
        		reserve[Arrays.binarySearch(reserve, lost[i]-1)]=-1;
        		answer++;
       		//�������� �л��� �� ��ȣ �л��� ������ �ִ��� Ȯ��
        	}else if(Arrays.binarySearch(reserve, lost[i]+1)>=0) {
        		System.out.println(lost[i]+"�� �л���"+reserve[Arrays.binarySearch(reserve, lost[i]+1)]+"���� ������");
        		reserve[Arrays.binarySearch(reserve, lost[i]+1)]=-1;
        		answer++;
        	}
        }
        return answer;
    }
}
