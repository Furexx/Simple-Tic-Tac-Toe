//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int years = scanner.nextInt();
        String special = scanner.next();
        System.out.printf("The form for %s is completed." +
                        " We will contact you if we need a chef" +
                        " who cooks %s dishes and has %d years of experience.",
                name,
                special,
                years);
    }
}