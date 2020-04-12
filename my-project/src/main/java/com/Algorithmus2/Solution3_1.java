package com.Algorithmus2;

import java.util.Arrays;
import java.util.function.BiConsumer;

// 체육복

// 문제 설명
// 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
// 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
// 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
// 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
// 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온
// 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
//
// 제한사항
// 전체 학생의 수는 2명 이상 30명 이하입니다.
// 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
// 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
// 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
// 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
// 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
//
//
// 2020 04 12 알고리즘 문제

public class Solution3_1 {

  public static void main(String[] args) {

  }

  // 5 lost=[2, 4] reserve=[1, 3, 5]
  public static int solution(int n, int[] lost, int[] reserve) {
    BiConsumer<int[], Integer> fRent = (int[] stateFRent, Integer nFRent) -> {
      for (int i = 0; i < nFRent - 1; i++) {
        if (stateFRent[i] == 2 && stateFRent[i + 1] == 0) {
          stateFRent[i]--;
          stateFRent[i + 1]++;
        }
      }
    };
    BiConsumer<int[], Integer> bRent = (int[] stateBRent, Integer nBRent) -> {
      for (int i = 1; i < nBRent; i++) {
        if (stateBRent[i] == 2 && stateBRent[i - 1] == 0) {
          stateBRent[i]--;
          stateBRent[i - 1]++;
        }
      }
    };

    int[] state1 = new int[n];
    int[] state2 = new int[n];
    init(state1, lost, reserve); // [2, 0, 2, 0, 2]
    init(state2, lost, reserve); // [2, 0, 2, 0, 2]

    return Math.max(runOrder(state1, n, fRent, bRent), runOrder(state2, n, bRent, fRent));
  }

  public static void init(int[] state, int[] lost, int[] reserve) {
    // 5 lost=[2, 4] reserve=[1, 3, 5]
    Arrays.fill(state, 1); // [1, 1, 1, 1, 1]
    for (int idx : lost)
      state[idx - 1]--; // [1, 0, 1, 0 , 1]
    for (int idx : reserve)
      state[idx - 1]++; // [2, 0, 2, 0, 2]
  }

  public static int runOrder(int[] state, int n, BiConsumer<int[], Integer> run1,
      BiConsumer<int[], Integer> run2) {
    run1.accept(state, n);
    run2.accept(state, n);
    return (int) Arrays.stream(state).filter(i -> i > 0).count();
  }
}
