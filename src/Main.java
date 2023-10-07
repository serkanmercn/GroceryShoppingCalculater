import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67,domates=1.11, muz=0.95, patlican=5.00;
        double marmut, melma, mdomates, mmuz, mpatlican;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        marmut = input.nextDouble();

        System.out.print("Elma kaç kilo: ");
        melma = input.nextDouble();

        System.out.print("Domates kaç kilo: ");
        mdomates = input.nextDouble();

        System.out.print("Muz kaç kilo: ");
        mmuz = input.nextDouble();

        System.out.print("Patlican kaç kilo: ");
        mpatlican = input.nextDouble();

        double sonuc = (armut*marmut) + (elma*melma) + (domates*mdomates) + (muz*mmuz) + (patlican*mpatlican);
        System.out.print("Toplam tutar: " + sonuc + " TL");

    }
}