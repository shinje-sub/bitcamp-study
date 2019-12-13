import java.util.Random;
import java.util.Scanner;
//과제 1 : 가위,바위,보 게임 애플리케이션을 작성하라.
//- 실행1
//가위,바위,보? 보
//컴퓨터: 가위  (랜덤 값이 출력된다. 힌트: Math.random())
//=> 졌습니다.
//
//- 실행2
//가위,바위,보? 바위
//컴퓨터: 가위
//=> 이겼습니다.
//
public class Test02 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String comStr="",userStr="";
      int win=0,lose=0,draw=0,fail=0;
      System.out.println("코인을 집어 넣으세요(최대 7)");
      int coin = scan.nextInt();

      if(coin > 7) {
        System.out.println("7회 이상 사용할 수 없습니다.");
        return;
      }

      System.out.println("GAME START");
      System.out.println("어떤걸 내시겠습니까? 가위[1] 바위[2] 보[3]");
      for(int i = 0; i < coin;i++) {
        
        int computer =(int)(Math.random()*3)+1;
        int user = scan.nextInt();
        if(computer == 1) {
      comStr="가위";
      }else if(computer == 2) {
       comStr="바위";
   }else if(computer == 3) {
      comStr="보";
     }else {
       comStr="시스템 오류";
      }
     if(user == 1) {
      userStr="가위";
     }else if(user == 2) {
      userStr="바위";
     }else if(user == 3) {
     userStr="보";
   }else {
     userStr="손가락 오류";
    }
    System.out.println("[유저] "+userStr+"  =VS= "+comStr+" [컴퓨터]");
   if(user >= 1 && user <= 3) {
    if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1))
     {
       win++;
        System.out.println("[승리]");
       }else if(computer == user) {
        lose++;
        System.out.println("[무승부]");
      }else {
        draw++;
        System.out.println("[패배]");
      }
    }else {
      fail++;
       System.out.println("값을 잘못 입력 하였습니다.");    
      }
      System.out.println("=========================================");
      }
    }
}