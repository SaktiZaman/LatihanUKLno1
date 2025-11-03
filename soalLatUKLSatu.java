import java.util.Scanner;

public class soalLatUKLSatu {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double perKilo, total = 0, vol100 = 50000;
        boolean addFee = false;
        System.out.println("Masukkan jarak kirim dalam km");
        double jarak = x.nextDouble();
        System.out.println("Masukkan Berat paket dalam kg");
        double berat = x.nextDouble();
        System.out.println("Masukkan tinggi paket");
        double tinggi = x.nextDouble();
        System.out.println("Masukkan lebar paket");
        double lebar = x.nextDouble();
        System.out.println("Masukkan panjang paket");
        double panjang = x.nextDouble();
        double volume = panjang * lebar * tinggi;

        if (jarak <= 10) {
            perKilo = 4250;  
        } else{
            perKilo = 6000;
        }   
        
        if (volume > 100) {
            addFee = true;
            total += vol100;
        }
        total += berat * perKilo;
        System.out.println("Volume paket: " + volume);
        System.out.println("Jarak Pengiriman: " + jarak);
        System.out.println("Berat Paket: " + berat);
        System.out.println("Harga Per Kilo: " + perKilo);
        if (addFee) {
            System.out.println("Additional volume fee: " + vol100);
        }
        System.out.println("Total: " + total);





        System.out.println("Masukkan bilangan: ");
        int a = x.nextInt();
        if (a % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");

    }
}
