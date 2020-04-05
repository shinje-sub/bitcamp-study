package com.bitcamp.myproject.Algorithmus;

public class Test {
  public static void main(String[] args) {
    System.out.println(solution("PpoyooY"));

  }

  public static boolean solution(String s) {
    s = s.toLowerCase();
    int pNum = 0;
    int yNum = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'p')
        pNum++;
      if (s.charAt(i) == 'y')
        yNum++;
    }

    if (pNum == yNum)
      return pNum == yNum;
    return false;
  }
}
