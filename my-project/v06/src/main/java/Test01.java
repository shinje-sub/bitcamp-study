  import java.util.Scanner;
//과제 1 : 계산기 애플리케이션을 작성하라.
//- 실행
//값1? 10
//값2? 20
//연산자(+,-,*,/)? +
//=> 10 + 20 = 30 
//
public class Test01 {
  

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
    System.out.printf("첫번째 값");
    int num1 = scan.nextInt();
    System.out.printf("두번째 값");
    int num2 = scan.nextInt();
    System.out.printf("연산자 선택(+,-,*,/): ");
    
    String operator = scan.next();
    
    if(operator.equals("+"))
    System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
    else if (operator.equals("-"))
    System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
    else if(operator.equals("*"))
    System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
    else if(operator.equals("/"))
    System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
    else 
      System.out.println("잘못입력하셨습니다.");
    return;
    
  }
}


