import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temp1N=0,n;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        n = klavye.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        temp1N=n;

        for(int x =1;x<n;x++){
            for (int y= 1; y<=x; y++) {
                System.out.print(" ");
            }
            for (int z= 1; z<=(2 *temp1N - 3); z++) {
                System.out.print("*");
            }
            temp1N--;
            System.out.println(" ");
        }

    }
}