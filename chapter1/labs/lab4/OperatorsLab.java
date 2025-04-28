package chapter1.labs.lab4;

/**
 * Lab 4: 자바 연산자 실습
 * 
 * 이 실습은 자바의 다양한 연산자를 이해하고 활용하는 것을 목표로 합니다.
 */
public class OperatorsLab {
    public static void main(String[] args) {
        // TODO: 1. 산술 연산자 사용하기
        // 두 개의 정수형 변수를 선언하고 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을 수행하세요.
        int a1 = 100;
        int b1 = 200;

        System.out.println("a + b = " + (a1 + b1));
        System.out.println("a - b = " + (a1 - b1));
        System.out.println("a * b = " + (a1 * b1));
        System.out.println("a / b = " + (a1 / b1));
        System.out.println("a % b = " + (a1 % b1));
        
        // TODO: 2. 증감 연산자 사용하기
        // 변수를 선언하고 전위 증가, 후위 증가, 전위 감소, 후위 감소 연산을 수행하세요.
        // 각 단계별로 변수의 값을 출력하여 변화를 확인하세요.
        int c1 = 5;

        System.out.println("c1++ = " + (c1++));
        System.out.println("++c1 = " + (++c1));
        System.out.println("c1-- = " + (c1--));
        System.out.println("--c1 = " + (--c1));
        
        
        // TODO: 3. 비교 연산자 사용하기
        // 두 변수를 비교하여 결과를 출력하세요 (==, !=, >, <, >=, <=).
        int d1 = 5;
        int e1 = 6;

        System.out.println("d1 == e1 = " + (d1 == e1));
        System.out.println("d1 != e1 = " + (d1 != e1));
        System.out.println("d1 > e1 = " + (d1 > e1));
        System.out.println("d1 < e1 = " + (d1 < e1));
        System.out.println("d1 <= e1 = " + (d1 <= e1));
        System.out.println("d1 >= e1 = " + (d1 >= e1));

        
        // TODO: 4. 논리 연산자 사용하기
        // boolean 변수를 사용하여 AND(&&), OR(||), NOT(!) 연산을 수행하세요.
        boolean f1 = true;
        boolean g2 = false;

        System.out.println("f1 && g2 = " + (f1 && g2));
        System.out.println("f1 || g2 = " + (f1 || g2));
        System.out.println("!f1 = " + !f1);
        
        // TODO: 5. 대입 연산자 사용하기
        // 변수를 선언하고 복합 대입 연산자(+=, -=, *=, /=, %=)를 사용하여 값을 변경하세요.
        int h1 = 50;
        int i1 = 10;

        h1 += i1;
        System.out.println("h1 += i1 = " + (h1));

        h1 -= i1;
        System.out.println("h1 -= i1 = " + (h1));

        h1 *= i1;
        System.out.println("h1 * i1 = " + (h1));

        h1 /= i1;
        System.out.println("h1 / i1 = " + (h1));

        h1 %= i1;
        System.out.println("h1 % i1 = " + (h1));
        
        // TODO: 6. 삼항 연산자 사용하기
        // 조건에 따라 다른 값을 할당하는 예제를 작성하세요.

        int j1 = 50;
        int k1 = 10;

        int l1 = (j1 > k1) ? j1 : k1;

        System.out.println("(j1 > k1) ? j1 : k1 = " + (l1));
    }
} 