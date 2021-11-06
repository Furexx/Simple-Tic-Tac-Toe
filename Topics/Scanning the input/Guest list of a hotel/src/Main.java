//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] guest = new String[8];
        for (int i = 0; i <= 7; i++) {
            guest[i] = scanner.next();

        }
        for (int i = 7;i >=0 ;i--){
            System.out.println(guest[i]);
        }





    }
}