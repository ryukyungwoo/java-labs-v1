package chapter1.labs.lab3;

/**
 * Lab 3: 자바 타입 변환(Type Casting) 실습
 * 
 * 이 실습은 자바의 타입 변환에 대해 이해하고 실습하는 것을 목표로 합니다.
 */
public class TypeCastingLab {
    public static void main(String[] args) {
        // TODO: 1. 자동 형변환(Implicit Casting) 예제
        // byte -> int, int -> long, long -> float, float -> double 순으로 
        // 변수를 선언하고 자동 형변환을 수행한 뒤 결과 출력하기
        byte b1 = 127;
        int i1 = b1;
        long l1 = i1;
        float f1 = l1;
        double d1 = f1;

        System.out.println("b1 = " + b1);
        System.out.println("i1 = " + i1);
        System.out.println("l1 = " + l1);
        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);
        
        // TODO: 2. 명시적 형변환(Explicit Casting) 예제
        // double -> float -> long -> int -> char -> short -> byte 순으로
        // 변수를 선언하고 명시적 형변환을 수행한 뒤 결과 출력하기

        double d2 = 127.0;
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        char c2 = (char) i2;
        short s2 = (short) c2;
        byte b2 = (byte) s2;

        System.out.println("d2 = " + d2);
        System.out.println("f2 = " + f2);
        System.out.println("l2 = " + l2);
        System.out.println("i2 = " + i2);
        System.out.println("c2 = " + c2);
        System.out.println("s2 = " + s2);
        System.out.println("b2 = " + b2);
        
        // TODO: 3. 데이터 손실 확인하기
        // int 값을 byte로 변환하여 데이터 손실이 발생하는 예제 작성하기

        int i3 = 129;
        byte b3 = (byte) i3;

        System.out.println("i3 = " + i3);
        System.out.println("b3 = " + b3);
        
        // TODO: 4. 문자열과 숫자 간 변환하기
        // 문자열 "123"을 정수로, "3.14"를 실수로 변환하기

        String s4 = "123";
        System.out.println("s4 = " + Integer.parseInt(s4));

        String s5 = "3.14";
        System.out.println("s5 = " + Double.parseDouble(s5));
        
        // TODO: 5. 숫자를 문자열로 변환하기
        // 정수 456과 실수 7.89를 문자열로 변환하기

        int i5 = 456;
        double d5 = 7.89;

        System.out.println("i5 = " + Integer.toString(i5));
        System.out.println("d5 = " + Double.toString(d5));
        
    }
} 