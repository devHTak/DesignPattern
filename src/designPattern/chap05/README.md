#### 싱글톤 패턴

- 싱글톤 사용 이유
  - 고정된 메모리 영역을 얻으면서 한번의 new로 인스턴스를 사용하기 때문에 메모리 낭비 방지
  - 싱글톤으로 만들어진 클래스의 인스턴스는 전역이기 때문에 다른 클래스의 인스턴스들이 데이터를 공유하기 쉽다
  - 인스턴스가 절대적으로 한 개만 존재하는 것을 보증하고 싶을 경우 사용
  - 두 번째 이용시 부터는 객체 로딩 시간이 줄어 성능이 좋아지는 ㅏㅈㅇ점이 있다

- 고전적인 싱글톤 패턴 구현
  ```java
  public class Singleton {
      private static Singleton uniqueInstance;
  
      private Singleton(){}
      public static Singleton getInstance() {
          if(uniqueInstance == null) {
              usniqueInstance = new Singleton();
          }
          return uniqueInstance;
      }
  }
  ```
  
- 싱글톤 패턴 정의
  - 클래스 인스턴스를 하나만 만들고, 그 인스턴스로의 전역 접근을 제공
  - 싱글톤 패턴을 적용할 때에는 클래스에 하나뿐인 인스턴스를 관리하도록 만들면 된다
    - 다른 어떤 클래스에서도 자신의 인스턴스를 추가로 만들지 못하게 해야 한다
  - 해당 인스턴스에 접근할 수 있는 전역 접근 지점 제공
    - 해당 인스턴스를 가져와 사용할 수 있도록 한다

- 고전 싱글톤의 문제점
  - 멀티스레딩 문제
    - getInstance 를 가져오는 메서드가 멀티스레드 환경에서 취약하다
  - 방법 1. getInstance 동기화
    - getInstance 메서드를 synchronized 로 동기화할 수 있지만, 해당 메서드가 시작되는 때 뿐만 사용하기 때문에 성능 이슈가 생길 수 있다.(불필요한 오버헤드 증가)
  - 방법 2. 인스턴스 생성을 처음부터 만든다
    ```java
    private static Singleton instance = new Singleton();
    private Singleton(){};
    public static Singleton getInstance() {
        return instance;
    }
    ```
  - 방법 3. DCL 을 써서 getInstance() 를 동기화
    - Double Checked Locking 을 인스턴스가 있는지 확인한 후에 동기화 블록을 생성할 수 있다.
    - 1.5 버전 이후부터 사용할 수 있다.
  - 방법 4. enum 사용