package StepK;

import java.util.Scanner;

class MenuPan {
    private int num;
    private String name;
    private String origin;
    private int price;

    // 메뉴 입력 메소드
    public void inputMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number, name, origin, price > ");
        this.num = scanner.nextInt();
        this.name = scanner.next();
        this.origin = scanner.next();
        this.price = scanner.nextInt();
    }

    // 메뉴 출력 메소드
    public void printMenu() {
        System.out.printf("  %d     %s     %s     %d\n", num, name, origin, price);
    }
}

public class K02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 메뉴 개수 입력
        System.out.print("Enter number of menu > ");
        int menuCount = scanner.nextInt();
        
        // MenuPan 객체 배열 생성
        MenuPan[] menus = new MenuPan[menuCount];
        
        // 메뉴 입력 받기
        for (int i = 0; i < menuCount; i++) {
            menus[i] = new MenuPan();  // 각 메뉴에 대해 MenuPan 객체 생성
            System.out.print((i + 1) + ": ");
            menus[i].inputMenu();  // 메뉴 입력
        }
        
        // 메뉴 출력
        System.out.println("================================================");
        System.out.println("num     name     origin     price");
        for (int i = 0; i < menuCount; i++) {
            menus[i].printMenu();  // 입력 받은 메뉴 출력
        }
    }
}
