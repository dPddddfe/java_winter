package StepK;

import java.util.Scanner;

class Point {
    // 좌표값을 저장
    private double x;
    private double y;

    // 좌표 값을 설정하는 메소드
    public void setCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 좌표가 어떤 사분면에 위치하는지 판별하는 메소드
    public int getArea(double x, double y) {
        if (x > 0 && y > 0) {
            return 1; // 제1사분면
        } else if (x < 0 && y > 0) {
            return 2; // 제2사분면
        } else if (x < 0 && y < 0) {
            return 3; // 제3사분면
        } else if (x > 0 && y < 0) {
            return 4; // 제4사분면
        } else {
            return 0; // x 또는 y가 0인 경우
        }
    }
}

public class K03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 좌표 입력
        System.out.print("Enter coordinate (X, Y) > ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // Point 객체 생성
        Point point = new Point();
        point.setCoordinate(x, y);

        // 좌표가 속한 사분면 찾기
        int area = point.getArea(x, y);

        // 사분면 출력
        String areaMessage = "";
        if (area == 1) {
            areaMessage = "first quadrants";
        } else if (area == 2) {
            areaMessage = "second quadrants";
        } else if (area == 3) {
            areaMessage = "third quadrants";
        } else if (area == 4) {
            areaMessage = "fourth quadrants";
        } else {
            areaMessage = "on axis";
        }

        System.out.println("================================================");
        System.out.println("Coordinate is located on " + areaMessage);
        
        // 사분면별 좌표 개수 출력
        int[] quadrantCount = new int[5]; // 사분면 개수를 저장할 배열 (0번은 축을 의미)
        quadrantCount[area]++;
        
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Number of coordinates on %dth quadrants is %d\n", i, quadrantCount[i]);
        }
    }
}
