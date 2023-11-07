# 로또

## 기능 목록
- [  ] 금액을 입력 받기 : 
  - [  ] 예외입력 시 에러 문구 후 다시 입력
- [  ] 입력 받은 금액으로 로또 N개 생성하기 
  - [  ] pickUniqueNumbersInRange 사용하여 로또 생성
  - [  ] 로또 지갑 클래스를 생성해서 담아둔다
- [  ] 당첨 번호와 보너스 번호를 입력받기
  - [  ] 당첨번호를 입력 받고 서로 다른 1~45수가 아니면 예외처리 후 재입력 
  - [  ] 보너스 번호를 입력 받고 1~45이고 당첨번호에 없는 수 아니면 예외처리 후 재입력
- [  ] 로또 지갑에서 당첨 번호와 비교하여 당첨현황을 저장
- [  ] 당첨현황을 출력하고 수익률을 계산(소수점 둘쨰 자리에서 반올림)

## 기능 요구 사항
기본적으로 금액, 당첨 로또 번호를 입력받아서 
구매한 로또의 당첨결과를 출력하는 기능을 구현해야 한다

먼저 금액을 입력받아 로또를 1000원짜리 로또를 몇개 구매할 수 있는지 확인한다
이때 예외처리를 통해 잘못된 값이 들어오면 다시 입력 받는다. 로또 N개 구입 시
1~45 중 서로 다른 6개의 수를 생성하고(구현된 메서드 이용) 출력한다.

당첨 번호와 보너스 번호를 입력받는다. 이때 범위가 1~45인지 서로다른 수인지 
확인하고 잘못된 값을 입력한 경우 그 단계부터 다시 입력 받는다.

각 로또별로 당첨번호와 몇개 일치하는지 확인한 후 형식에 맞게 출력하기

## 추가로 기억할 사항
(학습필요) Java Enum? / 도메인 로직?
- 0점 방지 : java -version / gradlew.bat clean test
- 이미 익숙한 것들 : JDK 17 환경/외부라이브러리X/Java 코드 컨벤션/기본테스트 통과/System exit()하지않기/ 3항 연산자X
- indent 1로 해보기(요구 사항은 2이하), 즉 함수를 최소 단위로 분리(15줄 이하)
- JUnit 5와 AssertJ를 이용하여 테스트
- else 금지
- Java Enum 적용
- 도메인 로직에 단위 테스트를 구현
- 사용가능 라이브러리 
  - camp.nextstep.edu.missionutils.Randoms의 pickUniqueNumbersInRange()를 활용
  - camp.nextstep.edu.missionutils.Console의 readLine()을 활용
- Lotto 클래스 그대로 활용하기
- 클래스(객체) 분리하기 -> 객체지향 프로그래밍하기

## 피드백 관련 인지할 사항
- readme 상세히 적고, 기능목록을 지속적으로 검토/수정한다
- 변수이름에 자료형 X
- 작은 단위 -> 큰 단위 순으로 테스트 작성
- 함수가 한가지 일만 담당하도록
- class 구현 순서(컨벤션) : 
  - 상수(final) 또는 클래스(static) 변수
  - 인스턴스 변수
  - 생성자
  - 메소드(함수)
- 1차 피드백도 다시 한번 읽고 상기후 시작할 것.
- Commit관련해서 기능단위로 + 메세지 의미있게 작성하기