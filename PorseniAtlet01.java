import java.util.Scanner;

public class PorseniAtlet01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah politeknik yang berpartisipasi: ");
        int jumlahPoliteknik = input.nextInt();

        
        String[][] atlet = new String[jumlahPoliteknik][20]; 

        
        String[] cabangOlahraga = {"Bulutangkis", "Tenis Meja", "Basket", "Voli"};

        
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("\nData Atlet Politeknik ke-" + (i+1));
            for (int j = 0; j < cabangOlahraga.length; j++) {
                System.out.println("Cabang Olahraga: " + cabangOlahraga[j]);
                for (int k = 0; k < 5; k++) {
                    System.out.print("Masukkan nama atlet ke-" + (k+1) + ": ");
                    atlet[i][j*5+k] = input.next();
                }
            }
        }

        
        System.out.println("\nData Seluruh Atlet:");
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + (i+1));
            for (int j = 0; j < cabangOlahraga.length; j++) {
                System.out.println("Cabang Olahraga: " + cabangOlahraga[j]);
                for (int k = 0; k < 5; k++) {
                    System.out.println("- " + atlet[i][j*5+k]);
                }
            }
        }

        input.close();
    }
}