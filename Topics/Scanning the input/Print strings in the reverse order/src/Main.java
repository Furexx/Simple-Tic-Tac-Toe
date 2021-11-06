//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] names = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
        for (int i = names.length - 1;  i >= 0; i--) {
            System.out.println(names[i]);
        }

    }
}