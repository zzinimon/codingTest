package programmers;

import java.util.*;

///�Ҽ� �����
public class MakingPrimeNumber {

	public static void main(String[] args) {
		//test cases
		int[] nums1= {1,2,3,4};
		int[] nums2= {1,2,7,6,4};
		System.out.println("1="+solution(nums1));
		System.out.println("4="+solution(nums2));

	}
/*
	���� ����
�־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
nums�� ����ִ� ������ ������ 3�� �̻� 50�� �����Դϴ�.
nums�� �� ���Ҵ� 1 �̻� 1,000 ������ �ڿ����̸�, �ߺ��� ���ڰ� ������� �ʽ��ϴ�.
*/

	
	public static int solution(int[] nums) {
		int answer = 0;
		Arrays.sort(nums);
		//3�� ������ ������ ���� ���� �� �ִ� ���ڸ� ArrayList�� �����Ѵ�
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					al.add(nums[i]+nums[j]+nums[k]);
				}
			}
		}
		
		for (int i = 0; i < al.size(); i++) {
        	if(al.get(i)%2==0) continue; //¦���� skip
			for (int j = 2; j < Math.sqrt(al.get(i)); j++) {
				if(al.get(i)%j==0) break;
				else if(al.get(i)%j!=0&&j==Math.floor(Math.sqrt(al.get(i)))) {//�Ҽ����
				answer++;
				}
			}
		}
		
		return answer;
	}
}




