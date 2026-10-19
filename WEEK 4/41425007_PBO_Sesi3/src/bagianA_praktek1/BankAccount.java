/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianA_praktek1;

/**
 *
 * @author icisi
 */
public class BankAccount {

    // atribut dibikin private biar gak bisa diubah langsung dari luar class (ini encapsulation)
    private String accountNumber;
    private double balance;

    // constructor buat ngisi nomor rekening sama saldo awal
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        // saldo awal dicek dulu, kalo minus langsung diset 0
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // getter nomor rekening, satu2nya cara baca dari luar
    public String getAccountNumber() {
        return accountNumber;
    }

    // getter saldo, cuma bisa dibaca gak bisa diubah langsung
    public double getBalance() {
        return balance;
    }

    // setor tunai, jumlahnya harus lebih dari 0
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // tarik tunai, jumlahnya harus valid dan gak boleh lebih dari saldo
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid!");
        } else if (amount > this.balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");
        } else {
            this.balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", 500000);

        acc.deposit(-100000);   // ditolak, setoran gak boleh minus
        acc.withdraw(700000);   // gagal, lebih besar dari saldo (500000)
        acc.withdraw(200000);   // berhasil, saldo jadi 300000

        System.out.println("Saldo akhir akun " + acc.getAccountNumber() + ": Rp" + acc.getBalance());
    }
}