package chapter5.labs.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 3: 인터페이스 활용하기
 * 
 * ShoppingCart 클래스를 정의하세요.
 * 이 클래스는 Buyable 인터페이스를 구현한 다양한 상품을 담는 장바구니 역할을 합니다.
 */
public class ShoppingCart {
    // TODO: 상품 목록을 저장할 리스트 선언
    private static List<Buyable> buyables = new ArrayList<>();
    
    // TODO: 생성자 정의
    Buyable book = new Book("책 제목", 1000, "저자");
    Buyable electronics = new Electronics("가전 이름", 1000, "제조사");
    
    // TODO: 장바구니에 상품 추가하는 메소드 구현
    public void addMerchandise(Buyable buyable) {
        buyables.add(buyable);
    }
    
    // TODO: 장바구니에서 상품 제거하는 메소드 구현
    public void deleteMerchandise(Buyable buyable) {
        buyables.remove(buyable);
    }
    
    
    // TODO: 장바구니의 총 금액을 계산하는 메소드 구현
    public int allValueInCart() {
        int sum = 0;

        for (Buyable buyable : buyables) {
            sum += buyable.value();
        }

        return sum;
    }
    
    // TODO: 장바구니 상품 목록을 출력하는 메소드 구현
    public void allInfoInCart() {
        for(Buyable buyable : buyables) {
            buyable.info();
        }
    }
} 