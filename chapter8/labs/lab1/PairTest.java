package chapter8.labs.lab1;

import chapter8.labs.lab2.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 1: 제네릭 클래스 구현 테스트
 *
 * Pair 클래스와 PairUtils 클래스의 기능을 테스트합니다.
 */
public class PairTest {
    public static void main(String[] args) {
        System.out.println("=== Pair 클래스 테스트 ===");
        
        // TODO: Pair 클래스의 다양한 타입 매개변수를 사용하여 객체를 생성하고 테스트하세요.
        // Integer와 String 타입의 Pair
        Pair<Integer, String> pairIntStr = new Pair<>();

        // Double과 Double 타입의 Pair
        Pair<Double, Double> pairDub = new Pair<>();

        // 사용자 정의 클래스를 사용한 Pair
        Pair<Book, Book> pairBook = new Pair<>();
        
        System.out.println("\n=== PairUtils 클래스 테스트 ===");
        
        // TODO: PairUtils 클래스의 메소드를 테스트하세요.
        // of 메소드 테스트
        List<Pair<Integer, String>> intStrPairList = new ArrayList<>();

        System.out.println(PairUtils.of(intStrPairList, pairIntStr));
        
        // swap 메소드 테스트
        System.out.println(PairUtils.swapPair(pairDub));
        
        // 숫자 타입의 sum 메소드 테스트
        System.out.println(PairUtils.sumPair(pairDub));
        
        // 타입 제한 테스트 (Number 하위 클래스만 가능)
        Pair<Integer, Integer> pairInt = new Pair<>();
        System.out.println(PairUtils.sumPair(pairInt));
        
        // 와일드카드 메소드 테스트
        PairUtils.allTypePair(pairBook);
    }
} 