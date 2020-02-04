# 32_4 - 클라이언트의 게시물 관리와 관련하여 클라이언트 요청을 처리하기

## 학습목표

- 클라이언트의 요청을 받을 수 있다.
- 클라이언트의 요청에 대해 데이터를 보낼 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ServerApp.java 변경



## 실습

### 훈련 1: 서비스를 시작할 때 클라이언트의 연결을 기다리는 코드를 추가하라.

- com.eomcs.lms.domain 패키지를 생성한다.
- com.eomcs.lms.domain.* 클래스를 가져온다.
- com.eomcs.lms.context 패키지를 생성한다.
- com.eomcs.lms.context.ApplicationContextListener 를 가져온다.
- com.eomcs.lms.DataLoaderListener 를 가져온다.
- ServerApp.java 변경
  - 옵저버를 등록하고, 호출하는 코드를 적용한다.

