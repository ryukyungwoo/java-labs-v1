package chapter2.labs.lab5;

import java.util.Scanner;

/**
 * 별표(*) 패턴 출력 실습
 */
public class StarPatternLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("패턴 출력을 위한 높이를 입력하세요: ");
        int height = scanner.nextInt();
        
        // 1. 직각삼각형 패턴 (왼쪽 정렬)
        System.out.println("\n1. 직각삼각형 패턴 (왼쪽 정렬)");
        // 예시 (높이 5):
        // *
        // **
        // ***
        // ****
        // *****
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < height; x++) {
                if(x <= y) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

        
        
        // 2. 직각삼각형 패턴 (오른쪽 정렬)
        System.out.println("\n2. 직각삼각형 패턴 (오른쪽 정렬)");
        // 예시 (높이 5):
        //     *
        //    **
        //   ***
        //  ****
        // *****
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for(int y = 0; y < height; y++) {
            for(int x = 0; x< height; x++) {
                if(height - y - 1 <= x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        // 3. 피라미드 패턴
        System.out.println("\n3. 피라미드 패턴");
        // 예시 (높이 5):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for(int y = 0; y < height; y++) {
            for(int x = 0; x< height; x++) {
                if(height - y - 1 <= x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int x = height; x < 2 * height; x++) {
                if(x <= height + y - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        // 4. 역삼각형 패턴
        System.out.println("\n4. 역삼각형 패턴");
        // 예시 (높이 5):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < height; x++) {
                if(x >= y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int x = height; x < 2 * height; x++) {
                if(x < 2 * height - y - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        
        // 5. 다이아몬드 패턴
        System.out.println("\n5. 다이아몬드 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for(int y = 0; y < height; y++) {
            for(int x = 0; x< height; x++) {
                if(height - y - 1 <= x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int x = height; x < 2 * height; x++) {
                if(x <= height + y - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int y = height; y < 2* height; y++) {
            for(int x = 0; x < height; x++) {
                if(x + height > y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int x = height; x < 2 * height; x++) {
                if (x < 2 * (height- 1) - (y - height)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // 6. 모래시계 패턴
        System.out.println("\n6. 모래시계 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < height; x++) {
                if(x >= y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int x = height; x < 2 * height; x++) {
                if(x < 2 * height - y - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int y = height; y < 2 * height - 1; y++) {
            for(int x = 0; x < height; x++) {
                if(x >= height - (y - height) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int x = height; x < 2 * height; x++) {
                if(x <= y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // 7. 숫자 피라미드 패턴
        System.out.println("\n7. 숫자 피라미드 패턴");
        // 예시 (높이 5):
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321
        
        // TODO: 위와 같은 패턴을 출력하세요.
        for (int y = 1; y < height + 1; y++) {
            int nowNum = 1;
            for (int x = 1; x < height + 1; x++) {
                if(height - y + 1<= x) {
                    System.out.print(nowNum);
                    nowNum++;
                } else {
                    System.out.print(" ");
                }
            }
            nowNum -= 1;
            for (int x = height + 1; x < 2 * height + 1; x++) {
                if(height + y > x) {
                    nowNum--;
                    System.out.print(nowNum);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
} 