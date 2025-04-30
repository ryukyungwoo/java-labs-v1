package chapter3.labs.lab4;

import java.util.Scanner;

/**
 * Enum(열거형) 활용하기 실습
 */
public class EnumLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 요일 Enum 활용하기
        System.out.println("===== 요일 Enum 활용하기 =====");
        System.out.println("요일을 입력하세요 (월, 화, 수, 목, 금, 토, 일): ");
        String input = scanner.nextLine();
        
        // TODO: 입력받은 요일에 해당하는 DayOfWeek Enum 상수를 찾아 switch 문에서 활용하세요.
        // 평일(월~금)인 경우 "평일입니다."를, 주말(토, 일)인 경우 "주말입니다."를 출력하세요.

        Day today = Day.valueOf(input);

        switch (today) {
            case 월, 화, 수, 목, 금 -> System.out.println("평일입니다.");
            case 토, 일 -> System.out.println("주말입니다.");
            default -> System.out.println("잘못입력하셨습니다");
        }
        
        // 2. 계절 Enum 활용하기
        System.out.println("\n===== 계절 Enum 활용하기 =====");
        System.out.println("월을 입력하세요 (1-12): ");
        int month = scanner.nextInt();
        
        // TODO: 입력받은 월에 해당하는 Season Enum 상수를 찾아 해당 계절의 특징을 출력하세요.
        // Season Enum에 평균 기온과 특징을 필드로 추가하고, 이를 활용하세요.

        Season season = null;

        switch (month) {
            case 3, 4, 5 -> season = Season.SPRING;
            case 6, 7, 8 -> season = Season.SUMMER;
            case 9, 10, 11 -> season = Season.FALL;
            case 12, 1, 2 -> season = Season.WINTER;
        }

        System.out.println(month + "월은" + season.getDescription() + "이고 " + season.getAvgTemperature() + "도 입니다.");
        
        // 3. 상태 전이 Enum 활용하기
        System.out.println("\n===== 상태 전이 Enum 활용하기 =====");
        scanner.nextLine();

        // TODO: TaskStatus Enum을 구현하고, 상태 전이 로직을 활용하여 작업 상태를 변경하세요.
        // TaskStatus는 PENDING, IN_PROGRESS, COMPLETED, ARCHIVED 상태를 가지며,
        // nextStatus() 메소드를 통해 다음 상태로 전이할 수 있어야 합니다.
        // 사용자가 "next"를 입력할 때마다 상태를 다음 단계로 변경하고, 현재 상태를 출력하세요.
        // 사용자가 "exit"를 입력하면 종료합니다.

        boolean keepInput = true;
        TaskStatus nowTask = TaskStatus.PENDING;

        while(keepInput) {
            String statusInput = scanner.nextLine();

            if(statusInput.equals("next")) {
                nowTask = nowTask.nextStatus();
                System.out.println("현재 진행 상태 : " + nowTask.name());
            } else {
                keepInput = false;
            }
        }
        
        // 4. 연산자 Enum 활용하기
        System.out.println("\n===== 연산자 Enum 활용하기 =====");
//        scanner.nextLine(); // 버퍼 비우기
        
        // TODO: Operator Enum을 구현하고, 두 수에 대한 사칙연산을 수행하세요.
        // Operator는 ADD(+), SUBTRACT(-), MULTIPLY(*), DIVIDE(/) 연산을 가지며,
        // calculate() 메소드를 통해 두 수에 대한 연산을 수행할 수 있어야 합니다.
        // 사용자로부터 두 수와 연산자를 입력받아 계산 결과를 출력하세요.

        System.out.print("첫 번째 수 입력: ");
        int inputNum1 = scanner.nextInt();

        System.out.print("두 번째 수 입력: ");
        int inputNum2= scanner.nextInt();

        scanner.nextLine();

        System.out.print("수행할 연산 입력: ");
        String inputOperator = scanner.nextLine();

        Operator add = Operator.ADD;
        Operator sub = Operator.SUBTRACT;
        Operator mtl = Operator.MULTIPLY;
        Operator div = Operator.DIVIDE;

        System.out.print("연산 결과: ");

        switch (inputOperator) {
            case "+" -> System.out.print(add.calculate(inputNum1, inputNum2));
            case "-" -> System.out.print(sub.calculate(inputNum1, inputNum2));
            case "*" -> System.out.print(mtl.calculate(inputNum1, inputNum2));
            case "/" -> System.out.print(div.calculate(inputNum1, inputNum2));
        }
        
        scanner.close();
    }
}
enum Day {
    월, 화, 수, 목, 금, 토, 일
}

enum Season {
    SPRING("꽃이 피는 계절", 15),
    SUMMER("더운 계절", 28),
    FALL("낙엽이 떨어지는 계절", 18),
    WINTER("추운 계절", 5);
    private String description;
    private int avgTemperature;

    Season(String description, int avgTemperature) {
        this.description = description;
        this.avgTemperature = avgTemperature;
    }

    public String getDescription(){return description;}
    public int getAvgTemperature(){return avgTemperature;}
}

enum TaskStatus {

    PENDING {
        @Override
        public TaskStatus nextStatus() {
            return IN_PROGRESS;
        }
    },
    IN_PROGRESS {
        @Override
        public TaskStatus nextStatus() {
            return COMPLETED;
        }
    },
    COMPLETED {
        @Override
        public TaskStatus nextStatus() {
            return ARCHIVED;
        }
    },
    ARCHIVED {
        @Override
        public TaskStatus nextStatus() {
            return PENDING; // 다시 처음으로
        }
    };

    public abstract TaskStatus nextStatus();
}

enum Operator {
    ADD("+") {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public int calculate(int a, int b) {
            return a / b;
        }
    };

    final private String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public abstract int calculate(int a, int b);
}