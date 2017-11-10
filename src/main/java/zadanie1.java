import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        System.out.println("Witaj świecie!");
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Aby zamknąć aplikację, wpisz exit i naciśnij klawisz ENTER");
        } while(!"exit".equals(in.nextLine()));
        System.exit(0);
    }
}
