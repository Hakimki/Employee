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
public class Bos extends Employee {
    private int jumlahBawahan;

    public Bos(int nip, String name, String status, int gaji, int bonus, int potongan, int jumlahBawahan) {
        super(nip, name, status, gaji, bonus, potongan, 9);
        this.jumlahBawahan = jumlahBawahan;
    }

    public int getJumlahBawahan() {
        return jumlahBawahan;
    }

    public void setJumlahBawahan(int jumlahBawahan) {
        this.jumlahBawahan = jumlahBawahan;
    }

    public int calculateGaji() {
        int gajiBersih = super.calculateGaji();
        gajiBersih += (jumlahBawahan * 500000);
        if (getStatus().equals("menikah")) {
            gajiBersih += getBonus();
        }
        if (gajiBersih > 10000000) {
            gajiBersih -= (int) (0.1 * gajiBersih);
        }
        return gajiBersih;
    }
 public static void main(String[] args) {
        Employee employee1 = new Employee(123, "John Doe", "menikah", 3000000, 10000000, 0, 9);
        Bos bos1 = new Bos(456, "Jane Smith", "menikah", 5000000, 15000000, 0, 5);
        CleaningService cleaningService1 = new CleaningService(789, "Adam Johnson", "bujang", 2500000, 0, 100000, 7);

        System.out.println("Gaji " + employee1.getName() + ": " + employee1.calculateGaji());
        System.out.println("Gaji " + bos1.getName() + ": " + bos1.calculateGaji());
        System.out.println("Gaji " + cleaningService1.getName() + ": " + cleaningService1.calculateGaji());
    }
}


