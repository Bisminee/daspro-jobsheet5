import java.util.Scanner;
public class Tugas_Jobsheet5_b {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int umur = -1;
        String kategoriUsia = "anak";
        while(umur < 0){
            System.out.print("Masukkan Umur Anda: ");
            umur = sc.nextInt();
            
        }
        if(umur < 0){
            System.out.println("Umur Tidak Boleh Bernilai Negatif!!!");
        }
        if(umur >= 0 && umur <= 12){
            kategoriUsia = "Anak";
        }else if(umur > 12 && umur <= 19){
            kategoriUsia = "Remaja";
        }else if(umur > 19 && umur <= 64){
            kategoriUsia = "Dewasa";
        }else if(umur > 64){
            kategoriUsia = "Lansia";
        }
        
        System.out.println("Usia anda " + umur + " dan masuk dalam kategori " + kategoriUsia);
}
}