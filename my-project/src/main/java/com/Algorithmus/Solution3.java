package com.Algorithmus;

class Solution3 {
  public String solution(String[] seoul) {
    // {"Jane", "Kim"}
    // String s = "ABCDE";
    // s.length();
    int x = 0;
    for (int i = 0; i < seoul.length; i++) {
      if (seoul[i].equals("Kim"))
        x = i;
    }
    return "김서방은 " + x + "에 있다";
  }

}
