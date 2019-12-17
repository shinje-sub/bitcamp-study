

// int형 배열
 
public class Hello {
 
  // Swap
  public static void main(String[] args) {
  int [] arr = {1,2,3,4,5};
  int tmp;
  tmp = arr[1];
  arr[1] = arr[3];
  arr[3] = tmp;
   System.out.printf("순차적인 번호출력%d\n", arr);
  }
}
