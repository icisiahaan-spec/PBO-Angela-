package getter_setter2;

class GetSet {
    private int num;

    // Setter dengan validasi: nilai harus 1 sampai 10
    public void setNumber(int number) {
        if (number < 1 || number > 10) {
            // Melempar exception jika nilai di luar batas
            throw new IllegalArgumentException();
        }
        num = number;
    }

    // Getter
    public int getNumber() {
        return num;
    }
}

public class GFG {
    public static void main(String[] args) {
        GetSet obj = new GetSet();
        obj.setNumber(5);
        System.out.println(obj.getNumber());
    }
}
