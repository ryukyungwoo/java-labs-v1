package chapter4.labs.lab4;

/**
 * Lab 4: 접근 제한자와 객체 간 관계 구현하기
 * 
 * Engine 클래스 정의하기
 */
public class Engine {
    // TODO: 적절한 접근 제한자를 사용하여 필드를 정의하세요.
    // (엔진 타입, 마력, 작동 상태 등)
    private String engineType;
    private int horsePower;
    private String status;
    
    
    // TODO: 생성자를 정의하세요.

    public Engine(String engineType, int horsePower) {
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.status = "stoped";
    }


    // TODO: 엔진을 시작하는 메소드를 정의하세요.
    public void engineStart() {
        status = "started";
    }
    
    
    // TODO: 엔진을 정지하는 메소드를 정의하세요.
    public void engineStop() {
        status = "stoped";
    }
    
    
    // TODO: 엔진의 상태를 확인하는 메소드를 정의하세요.
    public String checkEngineStatus() {
        return status;
    }
    
    
    // TODO: 엔진의 정보를 출력하는 메소드를 정의하세요.
    public void engineInfo() {
        System.out.println();
        System.out.println("엔진 타입: " + engineType + ", 마력: " + horsePower);
        System.out.println();
    }
    
    
    // TODO: 필요한 getter/setter 메소드를 정의하세요.


    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType='" + engineType + '\'' +
                ", horsePower=" + horsePower +
                ", status='" + status + '\'' +
                '}';
    }
}