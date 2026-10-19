package clone_methode;

// Cloneable: penanda bahwa objek class ini boleh disalin dengan clone()
class Geeks implements Cloneable {

    // Override clone() dari class Object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // super mengacu ke parent class (Object)
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args) {
        Geeks o1 = new Geeks();

        try {
            // clone() menghasilkan salinan objek o1, hasilnya perlu di-cast ke Geeks
            Geeks o2 = (Geeks) o1.clone();
            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            // Terjadi jika class tidak implements Cloneable
            e.printStackTrace();
        }
    }
}
