package chapter5.labs.lab2;

/**
 * Lab 2: 추상 클래스 활용하기
 * 
 * Dog 클래스를 정의하세요.
 * 이 클래스는 Animal 추상 클래스를 상속받아야 합니다.
 */
public class Dog extends Animal {
    // TODO: 강아지의 추가 속성 정의 (예: 품종)
    private String dogType;
    
    // TODO: 생성자 정의
    public Dog(String name, int age, String dogType) {
        super(name, age);
        this.dogType = dogType;
    }


    // TODO: 추상 메소드 sound() 구현

    @Override
    public void sound() {
        System.out.println("개소리");
    }


    // TODO: 필요한 경우 부모 클래스의 메소드 오버라이딩
    @Override
    public void info() {
        System.out.println("Dog{" +
                "dogType='" + dogType + '\'' +
                '}');
    }

    // TODO: 강아지만의 고유한 메소드 추가
    public void sitDown() {
        System.out.println("개 앉기");
    }
} 