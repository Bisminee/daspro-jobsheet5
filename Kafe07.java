import java.util.Scanner;
public class Kafe07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char cup;
        int jumlah = 0;
        boolean keanggotaan;
        double diskon, nominalBiaya, totalHarga, hargaMenu;

        System.out.print("Masukkan menu yang anda pilih: ");
        menu = sc.nextLine();
        System.out.print("Cup yang anda pilih(S/M/L): ");
        cup = sc.next().charAt(0);
        
        while (jumlah <= 0){
        System.out.print("Masukkan jumlah belanja anda: ");
        jumlah = sc.nextInt();
        if(jumlah <= 0){
            System.out.println("\nAnda harus memasukkan jumlah lebih dari 0!!!\n");
        }
        }

        System.out.print("Apakah anda termasuk anggota kafe(true/false)? ");
        keanggotaan = sc.nextBoolean();

        hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

       totalHarga = hargaMenu * jumlah;

        switch (Character.toUpperCase(cup)) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 *totalHarga;
                break;
            default:
            System.out.println("BUKAN MERUPAKAN UKURAN CUP / UKURAN CUP TIDAK TERSEDIA!!!");
        }

        diskon = keanggotaan ? 0.1 : 0;
        nominalBiaya = totalHarga - (totalHarga * diskon);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + cup );
        System.out.println("Total pembayaran: " + nominalBiaya);
    }
}