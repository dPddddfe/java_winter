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

public class K04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 좌표의 개수를 입력받음
        System.out.print("Enter a number of coordinate > ");
        int numCoordinates = scanner.nextInt();

        // 좌표에 대한 정보를 저장할 배열
        int[] quadrantCount = new int[5]; // 0번은 축을 의미
        String[] quadrantMessages = new String[numCoordinates]; // 각 좌표의 사분면 정보 저장

        // 여러 좌표 입력받고, 각 좌표의 사분면을 판별
        for (int i = 1; i <= numCoordinates; i++) {
            System.out.printf("Enter %dth coordinate (X, Y) > ", i);
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            // Point 객체 생성하고 좌표 설정
            Point point = new Point();
            point.setCoordinate(x, y);

            // 사분면 판별
            int area = point.getArea(x, y);
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

            // 각 좌표의 사분면 정보를 배열에 저장
            quadrantMessages[i - 1] = areaMessage;

            // 사분면별 좌표 개수 증가
            quadrantCount[area]++;
        }

        // 출력 구분선
        System.out.println("================================================");

        // 좌표들의 사분면 위치 출력
        for (int i = 1; i <= numCoordinates; i++) {
            System.out.printf("%dth coordinate is located on %s\n", i, quadrantMessages[i - 1]);
        }

        // 사분면별 좌표 개수 출력
        for (int i = 1; i <= 4; i++) {
            System.out.printf("Number of coordinates on %dth quadrants is %d\n", i, quadrantCount[i]);
        }
    }
}
