package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Driver 클래스 정의하기 (Car를 사용하는 관계)
 */
public class Driver {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (이름, 운전 경력 등)
    private String name;
    private int licenseYear;
    
    
    // TODO: 생성자를 정의하세요.

    public Driver(String name, int licenseYear) {
        this.name = name;
        this.licenseYear = licenseYear;
    }


    // TODO: 자동차를 운전하는 메소드를 정의하세요.
    // (Car 객체를 매개변수로 받아 사용 관계 구현)
    public void driveCar(Car car) {
        System.out.println();
        System.out.println("==========================자동차를 운전합니다==========================");
        System.out.println("시동을 겁니다");
        car.getEngine().engineStart();
        System.out.println("가속합니다");
        car.accelerateCar(10);
        System.out.println("자동차의 현재 속도: " + car.getSpeed());
        System.out.print("자동차의 현재 상태 : ");
        car.carInfo();
        System.out.println("감속합니다");
        car.deceleratesCar(10);
        System.out.println("자동차의 현재 속도: " + car.getSpeed());
        System.out.print("자동차의 현재 상태 : ");
        car.carInfo();
        while (car.getSpeed() > 0) {
            car.deceleratesCar(10);
        }
        System.out.println("시동을 끕니다");
        car.getEngine().engineStop();
        System.out.println("자동차의 현재 상태");
        car.carInfo();
        System.out.println("==========================운전을 끝마쳤습니다==========================");
        System.out.println();
    }
    
    
    // TODO: 자동차를 점검하는 메소드를 정의하세요.
    // (Car 객체를 매개변수로 받아 사용 관계 구현)
    public void checkCar(Car car) {
        System.out.println();
        System.out.println("==========================자동차를 점검합니다==========================");
        if(car.getEngine().equals("started")) {
            car.getEngine().engineStop();
        }
        car.carInfo();
        System.out.println("==========================점검을 끝마쳤습니다==========================");
        System.out.println();
    }
    
    
    // TODO: 운전자의 정보를 출력하는 메소드를 정의하세요.
    public void driverInfo() {
        System.out.println();
        System.out.println("==========================운전자 이름: " + name + ", 운전년수: " + licenseYear + " ==========================");
        System.out.println();
    }
    
} 