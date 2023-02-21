/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasemployee;

/**
 *
 * @author Fahmi Hakim
 */
public class CleaningService extends Employee {
    private int jamKerja;

    public CleaningService(int nip, String name, String status, int gaji, int bonus, int potongan, int jamKerja) {
        super(nip, name, status, gaji, bonus, potongan, 9);
        this.jamKerja = jamKerja;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int calculateGaji() {
        int gajiBersih = super.calculateGaji();
        if (getStatus().equals("menikah")) {
            gajiBersih += getBonus();
        }
        if (jamKerja < 8) {
            gajiBersih -= getPotongan();
        }
        return gajiBersih;
    }


    public static void main(String[] args) {
        CleaningService cs1 = new CleaningService(111111, "Siti", "menikah", 3000000, 10000000, 100000, 6);
        CleaningService cs2 = new CleaningService(222222, "Joko", "bujang", 3000000, 0, 0, 8);

        System.out.println("Data Cleaning Service 1");
        System.out.println("NIP: " + cs1.getNip());
        System.out.println("Nama: " + cs1.getName());
        System.out.println("Status: " + cs1.getStatus());
        System.out.println("Gaji: " + cs1.calculateGaji());

        System.out.println("\nData Cleaning Service 2");
        System.out.println("NIP: " + cs2.getNip());
        System.out.println("Nama: " + cs2.getName());
        System.out.println("Status: " + cs2.getStatus());
        System.out.println("Gaji: " + cs2.calculateGaji());
    
}
}


