package programmers;

import java.util.*;

///소수 만들기
public class MakingPrimeNumber {

	public static void main(String[] args) {
		//test cases
		int[] nums1= {1,2,3,4};
		int[] nums2= {1,2,7,6,4};
		System.out.println("1="+solution(nums1));
		System.out.println("4="+solution(nums2));

	}
/*
	문제 설명
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
*/

	
	public static int solution(int[] nums) {
		int answer = 0;
		Arrays.sort(nums);
		//3개 숫자의 조합을 통해 가질 수 있는 숫자를 ArrayList로 저장한다
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i < nums.length-2; i++) {
			for (int j = i+1; j < nums.length-1; j++) {
				for (int k = j+1; k < nums.length; k++) {
					al.add(nums[i]+nums[j]+nums[k]);
				}
			}
		}
		
		for (int i = 0; i < al.size(); i++) {
        	if(al.get(i)%2==0) continue; //짝수는 skip
			for (int j = 2; j < Math.sqrt(al.get(i)); j++) {
				if(al.get(i)%j==0) break;
				else if(al.get(i)%j!=0&&j==Math.floor(Math.sqrt(al.get(i)))) {//소수라면
				answer++;
				}
			}
		}
		
		return answer;
	}
}




