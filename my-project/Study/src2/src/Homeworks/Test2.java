package Homeworks;

public class Test2 {
 public static void main(String[] args) {
 //최대값 최소값을 구할 int배열
   int array[] = {7,4,12,8,9};
            
   int max = array[0]; //최대값
   int min = array[0]; //최소값
           
   for(int i=0;i<array.length;i++) {
       if(max<array[i]) {
       //max의 값보다 array[i]이 크면 max = array[i]
       max = array[i];
       }
               
       if(min>array[i]) {
       //min의 값보다 array[i]이 작으면 min = array[i]
       min = array[i];
       }
   }
           
   System.out.println("최대값 : "+max);
   System.out.println("최소값 : "+min);
 }
}
