package others;
//면적5000 이하의 피타고라스의 수
public class TL05 {
 public static void main(String[] args) {
    int cnt=0;
    for (int a = 1; a*a < 10000; a++) {
       for (int b = a; a*b <= 10000; b++) {
          double c=Math.pow(a*a+b*b, 0.5);
          if (c%1==0) {
             System.out.println("(a,b,c)="+a+","+b+","+(int)c);
             cnt++;
          }
       }
    }
    System.out.println(cnt);
 }
 
}