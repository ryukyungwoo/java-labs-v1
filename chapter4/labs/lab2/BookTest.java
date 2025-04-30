package chapter4.labs.lab2;

/**
 * Lab 2: 생성자 활용하기
 * 
 * Book 클래스를 테스트하는 메인 클래스
 */
public class BookTest {
    public static void main(String[] args) {
        System.out.println("Book 클래스 테스트를 시작합니다.");
        
        // TODO: 기본 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book bookBasic = new Book();
        
        
        // TODO: 제목만 인자로 받는 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book bookGivenTitle = new Book("제목만");
        
        
        // TODO: 제목과 저자를 인자로 받는 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book bookGivenTitleAndAuthor = new Book("제목과", "저자");
        
        
        // TODO: 제목, 저자, 가격을 인자로 받는 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book bookGivenTitleAndAuthorAndPrice = new Book("제목과", "저자와", 10000);
        
        
        // TODO: 모든 필드를 인자로 받는 생성자를 사용하여 Book 객체를 생성하고 정보를 출력하세요.
        Book perfectBook = new Book("모든", "필드 받기", 1000, 2025);
        
        
        // TODO: 객체를 생성한 후 필드 값을 변경하고 정보를 출력하세요.
        Book beforeModifyBook = new Book("변경 전 책", "변경 전 저자", 1000, 2025);
        System.out.println(beforeModifyBook.toString());

        beforeModifyBook.modifyBook("변경된 책", "변경된 저자", 9999, 9999);
        System.out.println(beforeModifyBook.toString());

    }
} 