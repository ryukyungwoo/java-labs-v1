package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * Discountable 인터페이스를 정의하세요.
 * 이 인터페이스는 할인 가능한 상품이 가져야 할 메소드를 선언합니다.
 */
public interface Discountable {
    // TODO: 할인율을 반환하는 메소드 선언
    int discountRate();
    
    // TODO: 할인된 가격을 계산하는 메소드 선언
    int calDiscountRate();
    
    // TODO: 할인 정보를 출력하는 default 메소드 구현
    default void discountInfo() {
        System.out.println("현재 할인률: " + discountRate() + ", 현재 할인된 가격: " + calDiscountRate());
        System.out.println();
    }

} 