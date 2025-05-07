package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * DiscountedBook 클래스를 정의하세요.
 * 이 클래스는 Book 클래스를 상속받고 Discountable 인터페이스를 구현합니다.
 */
public class DiscountedBook extends Book implements Discountable {
    // TODO: 할인 관련 속성 추가 (예: 할인율)
    private int discountRate;
    
    // TODO: 생성자 정의

    public DiscountedBook(String title, int value, String writer, int discountRate) {
        super(title, value, writer);
        this.discountRate = discountRate;
    }


    // TODO: Discountable 인터페이스의 메소드 구현
    @Override
    public int discountRate() {
        return this.discountRate;
    }

    @Override
    public int calDiscountRate() {
        return super.value() * discountRate;
    }


    // TODO: 필요한 경우 부모 클래스의 메소드 오버라이딩

    @Override
    public void discountInfo() {
        System.out.println("책의 저자: " + super.getWriter() + ", 책의 가격: " + super.value() + ", 책의 제목: " + super.name() + ", 현재 할인률: " + discountRate() + ", 현재 할인된 가격: " + calDiscountRate());
        System.out.println();
    }
}