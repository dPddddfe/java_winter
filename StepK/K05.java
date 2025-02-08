package StepK;

import java.util.Scanner;

class UserInfo {
    private String id;
    private String password;

    // 사용자 정보 입력 받는 메소드
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id, password > ");
        this.id = scanner.next();
        this.password = scanner.next();
    }

    // 사용자 정보 출력하는 메소드
    public void print(int index) {
        System.out.printf("%d       %s       %s\n", index, this.id, this.password);
    }
}

public class K05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 수 입력
        System.out.print("Enter number of students > ");
        int numUsers = scanner.nextInt();

        // UserInfo 배열 생성
        UserInfo[] users = new UserInfo[numUsers];

        // 사용자 정보 입력
        for (int i = 0; i < numUsers; i++) {
            users[i] = new UserInfo(); // 새 객체 생성
            users[i].input(); // 사용자 정보 입력 받기
        }

        // 출력 구분선
        System.out.println("================================================");
        System.out.println("Registered students list are as follows");
        System.out.println("------------------------------------------------");
        System.out.println("num     name    password");

        // 등록된 사용자 정보 출력
        for (int i = 0; i < numUsers; i++) {
            users[i].print(i + 1); // 인덱스를 1부터 시작하여 출력
        }
    }
}
