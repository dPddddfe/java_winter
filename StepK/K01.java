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
        System.out.println("================================================");
        System.out.println("num     name     origin     price");
        System.out.printf("  %d     %s     %s     %d\n", num, name, origin, price);
    }
}

public class K01 {
    public static void main(String[] args) {
        MenuPan menu = new MenuPan();  // MenuPan 객체 생성
        menu.inputMenu();  // 메뉴 입력
        menu.printMenu();  // 메뉴 출력
    }
}
