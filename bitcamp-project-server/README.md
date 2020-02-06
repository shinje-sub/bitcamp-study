h# 32_9 - 파일에 데이터를 저장할 때 JSON 형식을 사용하기

## 학습목표

- JSON(JavaScript Object Notation) 형식을 이해한다.
- Gson 라이브러리를 이용하여 JSON 형식의 데이터를 다룰 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/dao/json 패키지 추가
- src/main/java/com/eomcs/lms/dao/json/AbstractJsonFileDao 추가
- src/main/java/com/eomcs/lms/dao/json/BoardJsonFileDao.java 변경
- src/main/java/com/eomcs/lms/dao/json/LessonJsonFileDao.java 변경
- src/main/java/com/eomcs/lms/dao/json/MemberJsonFileDao.java 변경

## 실습

### 훈련 1: JSON 형식으로 데이터를 저장하고 로딩할 수퍼 클래스를 정의하라.

- com.eomcs.lms.dao.json 패키지를 생성한다.
- com.eomcs.lms.dao.jaso.AbstractObjectFileDao 클래스를 생성한다.

### 훈련 2: BoardObjectFileDao가 위에서 정의한 클래스를 상속 받도록 변경하라.

- src/main/java/com/eomcs/lms/dao/BoardObjectFileDao.java 변경
  - 상속 받은 필드와 메서드를 사용한다.
  - indexOf()를 오버라이딩한다.
  
### 훈련 3: LessonObjectFileDao가 위에서 정의한 클래스를 상속 받도록 변경하라.

- src/main/java/com/eomcs/lms/dao/LessonObjectFileDao.java 변경
  - 상속 받은 필드와 메서드를 사용한다.
  - indexOf()를 오버라이딩한다.
  
### 훈련 4: MemberObjectFileDao가 위에서 정의한 클래스를 상속 받도록 변경하라.

- src/main/java/com/eomcs/lms/dao/memberObjectFileDao.java 변경
  - 상속 받은 필드와 메서드를 사용한다.
  - indexOf()를 오버라이딩한다.