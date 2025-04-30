package chapter4.labs.lab1;

/**
 * Lab 1: 클래스와 객체 만들기
 * 
 * Person 클래스를 테스트하는 메인 클래스
 */
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("Person 클래스 테스트를 시작합니다.");
        
        // TODO: 이름이 John, 나이가 20, 성별이 Male인 Person 객체를 생성하세요.
        Person john = new Person("John", 20, "Male");
        
        // TODO: 생성한 객체의 정보를 출력하세요.
        System.out.println(john.toString());
        
        // TODO: 생일이 지나 나이가
        john.passedBirthday();
        System.out.println(john.toString());
        
        // TODO: 이름이 Emily, 나이가 25, 성별이 Female인 두 번째 Person 객체를 생성하세요.
        Person emily = new Person("Emily", 25, "Female");
        
        // TODO: 두 번째 객체의 정보를 출력하세요.
        System.out.println(emily.toString());
        
        // TODO: 두 번째 객체의 나이를 증가시키고 정보를 다시 출력하세요.
        emily.passedBirthday();
        System.out.println(emily.toString());
        
        // TODO: 추가로 여러 Person 객체를 생성하여 배열로 관리하고 모든 객체의 정보를 출력하세요.
        Person[] people = new Person[2];

        people[0] = john;
        people[1] = emily;

        for(Person person : people) {
            System.out.println(person.toString());
        }

    }
} 