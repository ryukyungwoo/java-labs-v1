package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Car, Engine, Driver 클래스 간의 관계를 테스트하는 메인 클래스
 */
public class CarTest {
    public static void main(String[] args) {
        System.out.println("객체 간 관계 테스트를 시작합니다.");
        
        // TODO: Car 객체를 생성하세요. (내부적으로 Engine 객체 포함)
        // 예: new Car("Sonata", "Black", "Gasoline", 180)
        Engine engine1 = new Engine("가솔린", 100);
        Car car1 = new Car("소나타", "검은색", engine1);
        
        
        // TODO: Driver 객체를 생성하세요.
        // 예: new Driver("John", 5)
        Driver driver1 = new Driver("홍길동", 10);
        
        
        // TODO: Car 객체의 정보를 출력하세요.
        car1.carInfo();
        
        
        // TODO: Car 객체의 메소드를 호출하세요. (시동, 가속 등)
        car1.getEngine().engineStart();
        car1.getEngine().engineStop();
        
        
        // TODO: Driver 객체가 Car 객체를 사용하도록 메소드를 호출하세요.
        driver1.driveCar(car1);
        driver1.checkCar(car1);
        
        
        // TODO: 추가적인 Car 객체를 생성하고 Driver 객체가 다른 차를 운전하도록 하세요.
        // 예: new Car("Tesla", "White", "Electric", 330)
        Engine engine2 = new Engine("전기 모터", 100);
        Car car2 = new Car("테슬라", "하얀색", engine2);

        driver1.driveCar(car2);
        driver1.checkCar(car2);
        
    }
} 