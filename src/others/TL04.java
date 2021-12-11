package others;

//풀어진 숫자의 곱(1000000 이하의 수) cnt가 4인 숫자의 개수
public class TL04 {
 public static void main(String[] args) {
    int cnt=0;
    int answer=0;
    for (Integer i = 10; i < 1000000; i++) {   //int i를 1000000까지 돌림
       cnt=0;
       int len=i.toString().length();   //len에 자릿 수 저장
       Integer tmp=i;
       int mul=1;                  //mul 초기화
       do {
          mul=1;                  //mul 초기화
          for (int j = 0; j < len ; j++) { //각 자릿수의 숫자 확인 후 곱
             int digit=tmp%10;
             mul*=digit;
             tmp/=10;
          }
          tmp=mul;
          len=tmp.toString().length();
          cnt++;
       }while(mul/10!=0/*mul이 두자릿수 이상*/);
       //System.out.println(i+"=>"+cnt);
       if(cnt==4) {answer++;}
    }
    System.out.println(answer);
 }
}