# 55_1 - JavaEE 의 Servlet 기술 도입하기

## 학습목표

- JavaEE/JavaSE/JaveME 기술의 특징을 이해한다.
- JavaEE 기술의 용도와 버전에 대해 이해한다.
- JavaEE Implements(WAS; Web Application Server)의 상용버전과 무료 버전을 안다.
- JavaEE 버전과 WAS 버전의 관계를 이해한다.
- Tomcat 서블릿 컨테이너를 설치하고 설정할 수 있다.
- Servlet 기술에 따라 클라이언트 요청을 처리할 클래스를 만들 수 있다.
- 웹 애플리케이션을 서블릿 컨터에니어 배치할 수 있다.
- 웹 애플리케이션을 실행할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/servlet/BoardXxxServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/MemberXxxServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/LessonXxxServlet.java 변경
- src/main/java/com/eomcs/lms/servlet/PhotoBoardXxxServlet.java 변경
- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습

### 훈련1: 서블릿 컨테이너를 설치 및 설정한다.

- tomcat.apaache.org 사이트에서 서블릿 컨테이너를 다운로드 받는다.
- 특정 폴더에 압축을 풀고, 설정한다.
  - 관리자 ID/PWD를 등록한다.
  - $톰캣홈/conf/tomcat-users.xml
  - 관리자 로그인을 활성화 시킨다.
  - $톰캣홈/conf/Catalina/localhost/manager.xml
- 톰캣 서버를 실행하고 웹브라우저를 통해 접속 확인한다.

### 훈련2: 기존의 서블릿 클래스를 JavaEE의 Servlet 규칙에 따라 변경한다.

- com.eomcs.lms.servlet.Xxx.Servlet.java 변경
