package chapter3.labs.lab1;

/**
 * 메모리 구조와 참조 변수 이해하기 실습
 */
public class MemoryLab {
    // 클래스 변수
    public static int staticVar = 10;
    
    // 인스턴스 변수
    private int instanceVar = 20;
    
    public static void main(String[] args) {
        System.out.println("===== 메모리 구조와 참조 변수 실습 =====");
        
        // 1. 기본 타입과 참조 타입의 차이 실습
        System.out.println("\n1. 기본 타입(Primitive Type)과 참조 타입(Reference Type)의 차이");
        
        // TODO: 기본 타입 변수 두 개를 선언하고, 하나를 다른 하나에 할당한 후
        // 값을 변경했을 때 어떤 일이 발생하는지 관찰하세요.

        int a1 = 10;
        System.out.println("a1: " + a1);

        int b1 = 20;
        System.out.println("b1: " + b1);

        a1 = 20;
        System.out.println("a1: " + a1);


        // TODO: 참조 타입 변수 두 개를 선언하고, 하나를 다른 하나에 할당한 후
        // 참조된 객체의 값을 변경했을 때 어떤 일이 발생하는지 관찰하세요.

        String str1 = new String("abc");
        System.out.println("str1: " + str1);

        String str2 = str1;
        System.out.println("str2: " + str2);

        str1 = "dfg";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        
        
        // 2. 매개변수 전달 방식 실습
        System.out.println("\n2. 메소드 호출 시 매개변수 전달 방식");
        
        // TODO: 기본 타입 변수를 선언하고 메소드에 전달한 후
        // 메소드 내에서 값을 변경하고 메소드 호출 전후의 값을 비교하세요.
        int transInt = 10;
        System.out.println("Origin Integer: " + transInt);
        modifyValue(transInt);
        System.out.println("Origin Integer: " + transInt);

        // TODO: 참조 타입 변수를 선언하고 메소드에 전달한 후
        // 메소드 내에서 참조된 객체의 값을 변경하고 메소드 호출 전후의 값을 비교하세요.

        String name = "유경우";
        int age = 100;

        Person transPerson = new Person(name, age);
        System.out.println("Origin Person: " + transPerson.getName() +" age: " + transPerson.getAge());

        modifyObject(transPerson);

        System.out.println("Origin Person: " + transPerson.getName() +" age: " + transPerson.getAge());

    }
    
    // 기본 타입 매개변수 전달 메소드
    public static void modifyValue(int value) {
        // TODO: 매개변수 값을 변경하고 변경된 값을 출력하세요.
        value += 100;
        System.out.println("Modified value: " + value);
    }
    
    // 참조 타입 매개변수 전달 메소드
    public static void modifyObject(Person person) {
        // TODO: 매개변수로 전달된 객체의 속성을 변경하고 변경된 값을 출력하세요.

        person.setName("김갑수");
        person.setAge(300);
        System.out.println("Modified Person: " + person.getName() +" age: " + person.getAge());

    }
}

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter와 Setter 메소드
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
} 