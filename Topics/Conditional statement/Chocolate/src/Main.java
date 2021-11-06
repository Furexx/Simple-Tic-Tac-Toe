import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // length
        int m = scanner.nextInt(); //width
        int k = scanner.nextInt();

        if (k < n*m && (k % n == 0 || k % m == 0)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}