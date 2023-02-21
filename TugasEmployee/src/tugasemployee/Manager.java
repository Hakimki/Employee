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
public class Manager extends Employee {
    private int jumlahProyek;

    public Manager(int nip, String name, String status, int gaji, int bonus, int potongan, int jumlahProyek) {
        super(nip, name, status, gaji, bonus, potongan, 9);
        this.jumlahProyek = jumlahProyek;
    }

    public int getJumlahProyek() {
        return jumlahProyek;
    }

    public void setJumlahProyek(int jumlahProyek) {
        this.jumlahProyek = jumlahProyek;
    }

    public int calculateGaji() {
        int gajiBersih = super.calculateGaji();
        gajiBersih += (jumlahProyek * 1000000);
        if (getStatus().equals("menikah")) {
            gajiBersih += getBonus();
        }
        if (gajiBersih > 5000000) {
            gajiBersih -= (int) (0.05 * gajiBersih);
        }
        return gajiBersih;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(123, "John Doe", "menikah", 3000000, 10000000, 0, 9);
        Manager manager1 = new Manager(456, "Jane Smith", "menikah", 6000000, 20000000, 0, 3);
        CleaningService cleaningService1 = new CleaningService(789, "Adam Johnson", "bujang", 2500000, 0, 100000, 7);

        System.out.println("Gaji " + employee1.getName() + ": " + employee1.calculateGaji());
        System.out.println("Gaji " + manager1.getName() + ": " + manager1.calculateGaji());
        System.out.println("Gaji " + cleaningService1.getName() + ": " + cleaningService1.calculateGaji());
    }
}





