package chapter5.labs.lab2;

/**
 * Lab 2: 추상 클래스 활용하기
 * 
 * 여러 동물 객체를 생성하고, 각 동물의 정보와 소리를 출력하는 테스트 클래스입니다.
 */
public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("Lab 2: 추상 클래스 활용하기 실습");
        
        // TODO: Dog 객체 생성
        Animal dog = new Dog("강아지", 10, "골든 리트리버");
        
        // TODO: Cat 객체 생성
        Animal cat = new Cat("고양이", 10, "검은색");
        
        // TODO: Bird 객체 생성
        Animal bird = new Bird("새", 10, 100, "까마귀");
        
        // TODO: 각 동물의 정보와 소리 출력
        dog.info();
        dog.sound();

        cat.info();
        cat.sound();

        bird.info();
        bird.sound();
        
        // TODO: 배열을 사용하여 여러 Animal 객체 관리하기
        Animal[] animals = new Animal[3];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = bird;
        
        // TODO: 모든 동물에 대해 반복하여 정보와 소리 출력하기
        for(Animal animal : animals) {
            animal.info();
            animal.sound();
        }

    }
} 