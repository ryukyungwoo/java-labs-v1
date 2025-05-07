package chapter4.labs.lab3;

/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * final 키워드 예제 클래스
 */
public class FinalExample {
    // TODO: final 변수를 선언하고 초기화하세요.
    private final String name = "초기화";

    // TODO: final 변수를 선언만 하고, 생성자에서 초기화하세요.
    private final StringBuilder builder1;

    // TODO: 생성자를 정의하세요.
    public FinalExample() {
        // final 변수 초기화
        builder1 = new StringBuilder("Hello world!");
    }
    
    // TODO: final 메소드를 정의하세요.
    final public void finalMethod() {
        System.out.println("fianl 메소드 입니다.");
    }
    
    // TODO: final 매개변수를 받는 메소드를 정의하세요.
    public void receivedFinalField(String builderChanger) {
        builder1.append(" ").append(builderChanger);
    }
    
    public static void main(String[] args) {
        System.out.println("Final 키워드 예제를 실행합니다.");
        
        // TODO: FinalExample 객체를 생성하세요.
        FinalExample finalExample1 = new FinalExample();
        
        // TODO: 객체의 메소드를 호출하세요.
        finalExample1.finalMethod();
        
        // TODO: final 클래스의 객체를 생성하고 메소드를 호출하세요.
        finalExample1.receivedFinalField("Hi!");
        
        // TODO: final 지역 변수를 선언하고 사용하세요.
        
        
    }
}

// TODO: final 클래스를 정의하세요.
final class FinalClass {
    public void display() {
        System.out.println("이 클래스는 상속할 수 없습니다.");
    }
}

// TODO: 일반 클래스와 하위 클래스를 정의하고, final 메소드 오버라이딩을 시도해보세요.
class lowFinalExample extends FinalExample{

//    @Override
//    public void finalMethod() {
//    }
}