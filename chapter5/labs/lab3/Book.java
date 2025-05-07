package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * Book 클래스를 정의하세요.
 * 이 클래스는 Buyable 인터페이스를 구현합니다.
 */
public class Book implements Buyable {
    // TODO: 책의 속성 정의 (예: 제목, 가격, 저자)
    private String title;
    private int value;
    private String writer;
    
    // TODO: 생성자 정의
    public Book(String title, int value, String writer) {
        this.title = title;
        this.value = value;
        this.writer = writer;
    }


    // TODO: Buyable 인터페이스의 메소드 구현

    @Override
    public int value() {
        return this.value;
    }

    @Override
    public String name() {
        return this.title;
    }


    // TODO: 책만의 고유한 메소드 추가
    public String getWriter() {
        return this.writer;
    }

} 