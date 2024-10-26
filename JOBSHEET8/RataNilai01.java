import java.util.Scanner;

public class RataNilai01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        float nilai, totalNilai, rataNilai;
        int i = 1;
        
        
        while (i <= 5) {
            System.out.println("\nMahasiswa ke-" + i);
            
            
            totalNilai = 0;
            
            
            for (int j=1; j<=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                float nilaiMhs = sc.nextFloat();
                totalNilai += nilaiMhs;
            }
            
            
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " = " + rataNilai);
            
            i++;
        }
        
        sc.close();
    }
}