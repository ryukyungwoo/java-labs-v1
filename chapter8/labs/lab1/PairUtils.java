package chapter8.labs.lab1;

import java.util.List;
import java.util.Objects;

/**
 * Lab 1: 제네릭 유틸리티 클래스
 *
 * 다양한 제네릭 메소드를 포함한 유틸리티 클래스를 구현하세요.
 */
public class PairUtils {
    
    /**
     * 두 객체로 구성된 Pair 객체를 생성하는 정적 메소드
     * 
     * TODO: 메소드를 구현하세요.
     */
    public static <K, V> Pair<K, V> makePair(K k, V v) {
        return new Pair<>(k, v);
    }

    
    /**
     * Pair 객체의 키와 값을 바꾼 새로운 Pair 객체를 반환하는 메소드
     * 
     * TODO: 메소드를 구현하세요.
     */
    public static <K, V> Pair<V, K> swapPair(Pair<K, V> pair) {
        return new Pair<>(pair.getV(), pair.getK());
    }

    
    /**
     * 숫자 타입의 Pair 객체에서 키와 값의 합을 계산하는 메소드
     * Number 또는 그 하위 클래스 타입만 허용
     * 
     * TODO: 메소드를 구현하세요.
     */
    public static double sumPair(Pair<? extends  Number, ? extends  Number> pair) {
        return pair.getK().doubleValue() + pair.getV().doubleValue();
    }

    
    /**
     * 두 Pair 객체를 비교하는 메소드
     * 
     * TODO: 메소드를 구현하세요.
     */
    public static <K, V> boolean equalsPair(Pair<K, V> thisPair, Pair<K, V> otherPair2) {
        return thisPair.getK().equals(otherPair2.getK()) && thisPair.getV().equals(otherPair2.getV());
    }

    
    /**
     * 리스트에서 조건에 맞는 요소로 구성된 Pair 객체를 찾는 메소드
     * 
     * TODO: 메소드를 구현하세요.
     */
    public static <K, V> Pair<K, V> of(List<Pair<K, V>> pairList, Pair<K, V> pair) {
        for(Pair<K, V> pairInList : pairList) {
            if(equalsPair(pairInList, pair)) {
                return pair;
            }
        }
        return null;
    }
    
    
    /**
     * 와일드카드를 사용하여 Pair 객체의 모든 가능한 타입을 처리하는 메소드
     * 
     * TODO: 메소드를 구현하세요.
     */

    public static void allTypePair(Pair<?, ?> pair) {
        System.out.println(pair.getK());
        System.out.println(pair.getV());
    }

    
} 