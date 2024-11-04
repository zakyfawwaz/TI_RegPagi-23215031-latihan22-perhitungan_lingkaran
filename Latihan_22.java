import java.util.Scanner;

public class Latihan_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diameter = 0;
        boolean validInput = false;

        System.out.println("======Perhitungan Lingkaran======");
        
        // Meminta input diameter dan melakukan validasi
        while (!validInput) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            String inputDiameter = input.nextLine();

            try {
                diameter = Double.parseDouble(inputDiameter);
                
                if (diameter > 0) {
                    validInput = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }

        // Perhitungan lingkaran
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        // Menampilkan hasil
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran = %.0f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
    }
}
