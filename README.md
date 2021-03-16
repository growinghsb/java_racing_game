# 자동차 경주 게임
설계 순서    
1. 요구사항 정의   
2. 요구사항에서 기능 추출    
3. 기능 단위 분리    
4. 객체 or 메서드에 기능 분배    
5. 설계    
***
### 1. 요구사항 정의  
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.     

* 각 자동차에 이름을 부여할 수 있다.      
  전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.       
 
* 자동차 이름은 쉼표(,)를 기준으로 구분해 입력하며, 5자 이하만 가능하다.      
   
* 사용자는 몇 번의 이동을 할 것인지 입력할 수 있다.      
     
* 전진하는 조건은 0 ~ 9 사이에서 random 값을 구하고,       
  random 값이 4 이상일 경우 전진, 3 이하일 경우 멈춘다.     
  
* 자동차 경주 게임을 완료한 후, 우승자를 알려준다.      
  우승자는 1명 이상일 수 있다.      
***
### 2. 요구사항에서 구현 기능 추출(해당 기능 순서대로 commit 하면서 진행)   
1. 각 자동차의 이름을 입력받는 기능 구현 
2. 몇 번 이동 할 것인지 입력 받는 기능 구현    
3. 입력 받은 이름을 기반으로 car 객체 생성 구현      
4. 구분자(,)와 5자 이하에 대한 유효성 검사 기능 구현      
5. 유효성 부적합 시 예외 구문 출력 후 재입력 기능 구현     
***
### 1. 프로그래밍 요구사항 정의      
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.    
  - 기본적으로 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)을 원칙으로 한다.   
  - 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.      
 
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.    
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.     
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.      
 
- 3항 연산자를 쓰지 않는다.           

- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.         

- 프로그래밍 요구사항에서 별도로 변경 불가 안내가 없는 경우            
  파일 수정과 패키지 이동을 자유롭게 할 수 있다.       
 
- 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 `[ERROR]` 로 시작해야 한다.         
   
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.     

- 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.     
   
- else 예약어를 쓰지 않는다.            
  - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.          
  - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.          
- 구현할 기능 목록을 작성하고, 기능 단위로 테스트 및 commit을 진행한다.       
  - 이 때 [AngularJS Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 참고해 commit log를 남긴다.    
***
## ✍🏻 입출력 요구사항
### ⌨️ 입력
- 경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)
```
pobi,woni,jun
```
- 시도할 회수
```
5
```

### 🖥 출력
- 각 차수별 실행 결과
```
pobi : --
woni : ----
jun : ---
```
- 단독 우승자 안내 문구
```
최종 우승자: pobi
```
- 공동 우승자 안내 문구
```
최종 우승자: pobi, jun
```
- 예외 상황 시 에러 문구를 출력해야 한다. 단, 에러 문구는 [ERROR] 로 시작해야 한다.
```
[ERROR] 시도 횟수는 숫자여야 한다.
```

### 💻 프로그래밍 실행 결과 예시
```
경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)
pobi,woni,jun
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
woni : 
jun : -

pobi : --
woni : -
jun : --

pobi : ---
woni : --
jun : ---

pobi : ----
woni : ---
jun : ----

pobi : -----
woni : ----
jun : -----

최종 우승자: pobi, jun
```
### 프로그래밍 요구사항 - Car 객체
- 다음 Car 객체를 활용해 구현해야 한다.
- Car 기본 생성자를 추가할 수 없다.
- name, position 변수의 접근 제어자인 private을 변경할 수 없다.
- 가능하면 setPosition(int position) 메소드를 추가하지 않고 구현한다.

```java
public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
}
```
