package chapter3.labs.lab5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 학생 성적 관리 프로그램 (종합 프로젝트)
 */
public class StudentManagementSystem {
    // TODO: 학생 성적 등급을 나타내는 Grade Enum을 정의하세요.
    // A(90-100), B(80-89), C(70-79), D(60-69), F(0-59) 등급이 있어야 합니다.
    Grade a = Grade.A;
    Grade b = Grade.B;
    Grade c = Grade.C;
    Grade d = Grade.D;
    Grade f = Grade.F;

    // 최대 학생 수
    private static final int MAX_STUDENTS = 100;

    // 학생 정보 배열
    private static String[] names = new String[MAX_STUDENTS]; // 이름 배열
    private static int[] scores = new int[MAX_STUDENTS]; // 성적 배열
    private static int studentCount = 0; // 현재 저장된 학생 수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("===== 학생 성적 관리 프로그램 =====");

        while (running) {
            printMenu();
            int choice = getMenuChoice(scanner);

            switch (choice) {
                case 1:
                    // TODO: 성적 입력 기능을 구현하세요.
                    // 학생 이름과 성적을 입력받아 배열에 저장합니다.
                    System.out.print("학생 이름 입력: ");
                    names[studentCount] = scanner.nextLine();

                    System.out.print("학생 성적 입력: ");
                    scores[studentCount] = scanner.nextInt();

                    break;
                case 2:
                    // TODO: 성적 수정 기능을 구현하세요.
                    // 학생 이름을 입력받아 해당 학생의 성적을 수정합니다.

                    System.out.print("조회할 학생의 이름 입력: ");
                    String inputStudentName = scanner.nextLine();

                    int maybeStudentCount = 101;

                    for (int i = 0; i < names.length; i++) {
                        if(inputStudentName.equals(names[i])) {
                            studentCount = i;
                        }
                    }

                    if (studentCount == 101) {
                        System.out.println();
                        System.out.println("해당 학생이 없습니다.");
                        break;
                    }

                    System.out.println();
                    System.out.print("변경할 성적을 입력: ");
                    int inputScore = scanner.nextInt();

                    scores[studentCount] = inputScore;
                    System.out.println();
                    System.out.print("변경 완료");

                    break;
                case 3:
                    // TODO: 성적 조회 기능을 구현하세요.
                    // 모든 학생의 이름, 성적, 등급을 출력합니다.
                    // 전체 성적의 합계, 평균, 최고 성적, 최저 성적도 출력합니다.
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println("학생 이름: " + names[i] + " 성적: " + scores[i] + ", 학생 등급: " + getGradeFromInputScore(scores[i]));
                    }
                    System.out.println("전체 성적 합계: " + sumAllScores() + ", 전체 성적 평균: " + avgAllScores() + ", 최고 성적:" + findMaxScore() + ", 최저 성적" + findMinScore());

                    break;
                case 4:
                    // TODO: 검색 기능을 구현하세요.
                    // 학생 이름을 입력받아 해당 학생의 성적과 등급을 조회합니다.
                    System.out.println("검색 할 학생의 이름을 입력: ");
                    String nowInputStudentName = scanner.nextLine();
                    System.out.println("해당 학생의 성적: " + scores[findIndexFromStudentName(nowInputStudentName)] + "해당 학생의 성적: " + getGradeFromInputScore(scores[findIndexFromStudentName(nowInputStudentName)]));

                    break;
                case 5:
                    // TODO: 통계 기능을 구현하세요.
                    // 등급별 학생 수와 비율을 출력합니다.
                    int howManyA = 0;
                    int howManyB = 0;
                    int howManyC = 0;
                    int howManyD = 0;
                    int howManyF = 0;

                    for (int i = 0; i < studentCount; i++) {
                        Grade nowGrade = getGradeFromInputScore(scores[i]);
                        if (nowGrade.name().equals("A")) {
                            howManyA++;
                        } else if (nowGrade.name().equals("B")) {
                            howManyB++;
                        } else if (nowGrade.name().equals("C")) {
                            howManyC++;
                        } else if (nowGrade.name().equals("D")) {
                            howManyD++;
                        } else {
                            howManyF++;
                        }
                    }

                    System.out.println("A 등급의 학생 수: " + howManyA + ", 비율" + howManyA/studentCount);
                    System.out.println("B 등급의 학생 수: " + howManyB + ", 비율" + howManyB/studentCount);
                    System.out.println("C 등급의 학생 수: " + howManyC + ", 비율" + howManyC/studentCount);
                    System.out.println("D 등급의 학생 수: " + howManyD + ", 비율" + howManyD/studentCount);
                    System.out.println("F 등급의 학생 수: " + howManyF + ", 비율" + howManyF/studentCount);

                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택해주세요.");
                    break;
            }
        }

        scanner.close();
    }

    // 메뉴 출력 메소드
    private static void printMenu() {
        System.out.println("\n===== 메뉴 =====");
        System.out.println("1. 성적 입력");
        System.out.println("2. 성적 수정");
        System.out.println("3. 성적 조회");
        System.out.println("4. 학생 검색");
        System.out.println("5. 통계 보기");
        System.out.println("6. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }

    // 메뉴 선택 입력 메소드
    private static int getMenuChoice(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // 버퍼 비우기
            return -1; // 잘못된 입력
        } finally {
            scanner.nextLine(); // 버퍼 비우기
        }
    }

    // TODO: 성적으로부터 등급을 계산하는 메소드를 구현하세요.
    // 입력받은 성적에 따라 Grade Enum 상수를 반환합니다.
    private static Grade getGradeFromInputScore(int inputScore) {

        return Grade.getGradeFromScore(inputScore);
    };

    // TODO: 전체 성적의 합계를 계산하는 메소드를 구현하세요.
    private static int sumAllScores() {
        int sum = 0;

        for(int score : scores) {
            sum += score;
        }

        return sum;
    }

    // TODO: 전체 성적의 평균을 계산하는 메소드를 구현하세요.
    private static int avgAllScores() {
        int sum = sumAllScores();
        int nowStudentCount = studentCount;

        return sum / nowStudentCount;
    }

    // TODO: 최고 성적을 찾는 메소드를 구현하세요.
    private static int findMaxScore() {
        int[] copyScoreList = scores.clone();

        Arrays.sort(copyScoreList);

        return copyScoreList[copyScoreList.length - 1];
    }

    // TODO: 최저 성적을 찾는 메소드를 구현하세요.
    private static int findMinScore() {
        int[] copyScoreList = scores.clone();

        Arrays.sort(copyScoreList);

        return copyScoreList[0];
    }


    // TODO: 학생 이름으로 배열에서 위치(인덱스)를 찾는 메소드를 구현하세요.
    private static int findIndexFromStudentName(String studentName) {
        int studentIndex = 101;

        for (int i = 0; i < studentCount; i++) {
            if(studentName.equals(names[i])) {
                studentIndex = i;
            }
        }

        return studentIndex;
    }

}