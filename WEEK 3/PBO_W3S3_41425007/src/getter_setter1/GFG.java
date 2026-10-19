package getter_setter1;

class GetSet {
    // private: atribut hanya bisa diakses lewat getter dan setter (encapsulation)
    private String name;

    // Getter (accessor): mengambil nilai
    public String getName() {
        return name;
    }

    // Setter (mutator): mengubah nilai
    public void setName(String N) {
        this.name = N;
    }
}

public class GFG {
    public static void main(String[] args) {
        GetSet obj = new GetSet();

        obj.setName("Geeks for Geeks");
        System.out.println(obj.getName());
    }
}
