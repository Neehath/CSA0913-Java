interface Printable {
    int a = 10;
    void print();
}
interface Showable extends Printable {
    String name = "Neehath";
    void show();
}
public class B_Extends implements Showable {
    @Override
    public void print() {
        System.out.println(a);
    }
    @Override
    public void show() {
        System.out.println(name);
    }
    public static void main(String[] args) {
        B_Extends obj = new B_Extends();
        obj.print();
        obj.show();
    }
}
