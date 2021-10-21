import java.util.Scanner;
public class inheritance{
    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        double phi = 3.14;
        double r, luas,keliling;

        System.out.print("Masukkan Panjang Jari-jari : ");
        r = input.nextDouble();

        luas = 0.5 * phi * r * r;
        keliling = 2 * phi * r;

        System.out.print("Luas Lingkaran = " + (int)luas + " \nKeliling lingkaran = "+ (int)keliling);
    }
}