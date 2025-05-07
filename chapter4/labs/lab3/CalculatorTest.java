package chapter4.labs.lab3;

/**
 * Lab 3: static과 final 키워드 사용하기
 * 
 * Calculator 클래스를 테스트하는 메인 클래스
 */
public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Calculator 클래스 테스트를 시작합니다.");
        
        // TODO: 클래스 이름으로 static 상수에 접근하여 출력하세요.
        System.out.println("파이: " + Calculator.PI);
        
        // TODO: 객체 생성 없이 static 메소드를 호출하여 원의 면적과 둘레를 계산하세요.
        System.out.println("반지름이 5인 원의 둘레: " + Calculator.calCircleCircum(5) + ", 넓이: " + Calculator.calCircleArea(5));
        
        // TODO: 객체 생성 없이 static 메소드를 호출하여 사각형의 면적을 계산하세요.
        System.out.println("한변의 길이가 5인 사각형의 넓이: " + Calculator.calSquare(5, 5));
        
        // TODO: Calculator 객체를 생성하고 인스턴스 메소드를 호출하세요.
        Calculator cal1 = new Calculator("새 객체");
        cal1.callCal();
        
        // TODO: 생성된 Calculator 객체의 정보를 출력하세요.
        cal1.getCalInfo();
        
        // TODO: 추가로 Calculator 객체를 생성하고, 객체 생성 횟수를 확인하세요.
        Calculator cal2 = new Calculator("2번째 객체");
        System.out.println("계산기 생성 횟수: " + Calculator.getHowManyCal());
        
        // TODO: 각 객체의 인스턴스 변수 값과 static 변수 값을 비교하세요.
        cal1.getCalInfo();
        cal2.getCalInfo();
    }
} 