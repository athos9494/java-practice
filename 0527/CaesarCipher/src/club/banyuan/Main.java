package club.banyuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("plz enter encode");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Encode.enCode(string,3);

        System.out.println("plz enter decode");
        String string1= scanner.nextLine();
        Decode.decode(string1,3);
    }
}


