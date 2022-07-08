import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reservenumber = 0, lastnumber;
        while (temp != 0) {
            lastnumber = temp % 10;
            reservenumber = (reservenumber * 10) + lastnumber;
            temp /= 10;
        }
        if (number == reservenumber) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi = input.nextInt();
        System.out.println(isPalindrom(sayi));
    }
}
