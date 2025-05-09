package chapter8.labs.lab1;

import java.util.Objects;

/**
 * Lab 1: 제네릭 클래스 구현하기
 *
 * 제네릭 타입 매개변수를 사용한 Pair 클래스를 구현하세요.
 * 두 가지 값을 저장할 수 있는 클래스입니다.
 */
public class Pair<K, V> {
    // TODO: K와 V 타입의 필드를 선언하세요.
    K k;
    V v;
    
    // TODO: 기본 생성자를 구현하세요.
    public Pair() {
    }

    // TODO: 두 매개변수를 받는 생성자를 구현하세요.
    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }
    
    // TODO: getter와 setter 메소드를 구현하세요.
    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }


    // TODO: toString 메소드를 오버라이드하세요.
    @Override
    public String toString() {
        return "Pair{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }


    // TODO: equals 메소드를 오버라이드하세요.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(k, pair.k) && Objects.equals(v, pair.v);
    }




    // TODO: hashCode 메소드를 오버라이드하세요.
    @Override
    public int hashCode() {
        return Objects.hash(k, v);
    }
} 