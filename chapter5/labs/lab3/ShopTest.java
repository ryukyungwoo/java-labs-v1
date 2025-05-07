package chapter5.labs.lab3;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * 인터페이스 구현과 다형성을 테스트하는 클래스입니다.
 */
public class ShopTest {
    public static void main(String[] args) {
        System.out.println("Lab 3: 인터페이스 활용하기 실습");
        
        // TODO: Book 객체 생성
        Buyable book = new Book("책", 1000, "저자");
        
        // TODO: Electronics 객체 생성
        Buyable electronics = new Electronics("가전제품", 1000, "제조사");
        
        // TODO: DiscountedBook 객체 생성
        Discountable discountedBook = new DiscountedBook("할인된 책", 10000, "할인된 저자", 10);
        
        // TODO: ShoppingCart 객체 생성
        ShoppingCart cart = new ShoppingCart();
        
        // TODO: 장바구니에 상품 추가하기
        System.out.println("=== TODO: 장바구니에 상품 추가하기 ===\n");

        cart.addMerchandise(book);
        book.info();
        System.out.println("추가 되었습니다");

        cart.addMerchandise(electronics);
        electronics.info();
        System.out.println("추가 되었습니다");

        cart.addMerchandise((Buyable) discountedBook);
        ((Buyable) discountedBook).info();
        System.out.println("추가 되었습니다");


        // TODO: 장바구니 내용과 총액 출력하기
        System.out.println("=== TODO: 장바구니 내용과 총액 출력하기 ===\n");
        cart.allInfoInCart();
        System.out.println("장바구니의 총액: " + cart.allValueInCart());

        // TODO: 인터페이스를 활용한 다형성 테스트
        //       - Buyable 타입 배열에 다양한 상품 담기
        //       - 모든 상품의 정보 출력하기
        System.out.println("=== TODO: 인터페이스를 활용한 다형성 테스트 ===\n");
        Buyable[] buyables = new Buyable[3];
        buyables[0] = book;
        buyables[1] = electronics;
        buyables[2] = (Buyable) discountedBook;

        for(Buyable buyable : buyables) {
            buyable.info();
        }
        
        // TODO: Discountable 인터페이스를 구현한 객체만 별도로 처리하기
        System.out.println("=== TODO: Discountable 인터페이스를 구현한 객체만 별도로 처리하기 ===\n");
        discountedBook.discountInfo();
    }
} 