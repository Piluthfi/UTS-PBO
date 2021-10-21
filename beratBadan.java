import java.util.Scanner;
public class beratBadan {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int jk;
        float berat, tinggi, bmi, meter;

        System.out.println("PROGRAM UNTUK MENENTUKAN BERAT BADAN IDEAL MELALUI FORMULA BMI");
        System.out.println("...................");
        System.out.print("Masukan Berat: ");
        berat = masuk.nextFloat();
        System.out.print("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        meter = tinggi / 100;

        bmi = (berat / (meter * meter));

        System.out.println("...................");
        System.out.print("BMI : " + bmi + " ");

        if (bmi < 18.5) {
            System.out.println("(Underweight)");
        } else if (bmi <= 22.9) {
            System.out.println("(Ideal)");
        } else if (bmi >= 22.9) {
            System.out.println("(Overweight)");
        }
    }
}