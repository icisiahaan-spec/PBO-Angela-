/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagianA_prak2;

/**
 *
 * @author icisi
 */
// INTERFACE: kontrak yg harus diikutin semua metode pembayaran
interface PaymentMethod {
    // konstanta biaya admin, di interface otomatis public static final
    double TRANSACTION_FEE = 2500.0;

    // method tanpa isi, wajib ditulis isinya sama class yg implements
    void pay(double amount);
    String getPaymentDetails();
}

// pembayaran lewat dompet digital
class EWalletPayment implements PaymentMethod {
    private String phoneNumber; // data private

    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        // e-wallet kena biaya admin, jadi total = jumlah + biaya admin
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}

// pembayaran lewat kartu kredit
class CreditCardPayment implements PaymentMethod {
    private String cardNumber; // data private

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        // kartu kredit di contoh ini gak kena biaya admin
        System.out.println("[Credit Card " + cardNumber + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}

public class PaymentSystem {

    public static void main(String[] args) {
        // variabelnya bertipe interface, objeknya beda2 (e-wallet & kartu kredit)
        PaymentMethod payment1 = new EWalletPayment("08123456789");
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");

        // perintahnya sama (pay), tapi yg jalan beda sesuai objeknya
        payment1.pay(50000);
        payment2.pay(150000);
    }
}
