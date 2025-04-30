package chapter3.labs.lab2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열 활용하기 실습
 */
public class ArrayLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 정수형 배열 활용
        System.out.println("===== 정수형 배열 활용 =====");
        
        // TODO: 5개의 정수를 입력받아 배열에 저장하고, 합계와 평균을 계산하여 출력하세요.
        // 힌트: Scanner를 이용하여 사용자로부터 입력을 받으세요.
        int[] arr1 = {1, 2, 3, 4, 5};

        int sum = 0;
        int length = arr1.length;

        for(int a : arr1) {
            sum += a;
        }

        System.out.println("TODO 1 sum : " + sum);
        System.out.println("TODO 1 average : " + sum / length);
        
        // 2. 문자열 배열 활용
        System.out.println("\n===== 문자열 배열 활용 =====");
        
        // TODO: 5개의 이름을 입력받아 배열에 저장하고, 특정 문자(예: 'A')로 시작하는 이름을 검색하여 출력하세요.
        // 힌트: String 클래스의 startsWith() 또는 charAt() 메소드를 활용하세요.

        String[] arr2 = {"ABC", "BCD", "CDE", "DEF", "EFG"};

        String foundName = "";
        char targetAlpha = 'A';

        for(String name : arr2) {
            if(targetAlpha == name.charAt(0)){
                foundName = name;
            }
        }

        System.out.println("TODO 2 Found Name : " + foundName);

        
        // 3. 배열 정렬
        System.out.println("\n===== 배열 정렬 =====");
        
        // TODO: 사용자로부터 5개의 정수를 입력받아 배열에 저장한 후, 오름차순으로 정렬하여 출력하세요.
        // 힌트: 이중 반복문을 사용하여 버블 정렬 알고리즘을 구현하거나, Arrays.sort()를 활용하세요.

        int[] arr3 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr3[i] = scanner.nextInt();
        }

        System.out.println("TODO3 before sort "+ Arrays.toString(arr3));

        Arrays.sort(arr3);

        System.out.println("TODO3 after sort " + Arrays.toString(arr3));

        
        // 4. 2차원 배열을 이용한 행렬 덧셈
        System.out.println("\n===== 2차원 배열을 이용한 행렬 덧셈 =====");
        
        // TODO: 두 개의 2x3 행렬을 입력받아 행렬 덧셈을 수행하고 결과를 출력하세요.
        // 힌트: 중첩 반복문을 사용하세요.
        int[][] arr41 = new int[2][3];
        int[][] arr42 = new int[2][3];

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                arr41[x][y] = scanner.nextInt();
            }
        }
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                arr42[x][y] = scanner.nextInt();
            }
        }

        System.out.println("\n===== 첫번째 2차원 배열 =====");

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("[" + arr41[x][y] + "]");
            }
            System.out.println();
        }

        System.out.println("\n===== 두번째 2차원 배열 =====");

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("[" + arr42[x][y] + "]");
            }
            System.out.println();
        }

        int[][] sumArr4 = new int[2][3];

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                sumArr4[x][y] = arr41[x][y] + arr42[x][y];
            }
        }

        System.out.println("\n===== 두 2차원 배열의 합 =====");

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print("[" + sumArr4[x][y] + "]");
            }
            System.out.println();
        }


        
        // 5. 배열을 이용한 간단한 데이터 분석
        System.out.println("\n===== 배열을 이용한 데이터 분석 =====");
        
        // TODO: 10개의 정수를 입력받아 배열에 저장한 후, 최댓값, 최솟값, 중앙값(또는 평균)을 계산하여 출력하세요.
        // 힌트: 정렬을 활용하면 중앙값을 쉽게 찾을 수 있습니다.

        int[] arr5 = new int[10];
        int sum5 = 0;

        for (int i = 0; i < 10; i++) {
            int nowInput = scanner.nextInt();
            arr5[i] = nowInput;
            sum5 += nowInput;
        }

        Arrays.sort(arr5);

        int min = arr5[0];
        int max = arr5[9];
        int mid = arr5[4];
        int avg = sum5 / 10;

        System.out.println("TODO 5 최솟값 : " + min);
        System.out.println("TODO 5 최댓값 : " + max);
        System.out.println("TODO 5 중앙값 : " + mid);
        System.out.println("TODO 5 평균 : " + avg);

        scanner.close();
    }
} 