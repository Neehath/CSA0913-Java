interface Printable {
    int a = 10;
    void print();
}
interface Showable extends Printable {
    String name = "Neehath";
    void show();
}
public class Base implements Showable {
    @Override
    public void print() {
        System.out.println(a);
    }
    @Override
    public void show() {
        System.out.println(name);
    }
    public static void main(String[] args) {
        Base obj = new Base();
        obj.print();
        obj.show();
    }
}
