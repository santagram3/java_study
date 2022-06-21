#### 다음 코드 실행 결과는 4, 5, 6, 42 중 무엇?

```java
public class MeaningOfThis {

    public final int value = 4;

    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 42;
                System.out.println(this.value);
                // this 는  내 클래스에 필드에있는걸 가져온다 ; 
                // 루나블 오른쪽 중괄호 부터 이뮨클래스 이라서 
                // 필드를 가진다 . 
                
            }
        };
    }
    
    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}

```


---
정답: 5