interface MyInterface {
void printMessage();
}
public class MyClass implements MyInterface {
@Override
public void printMessage() {
System.out.println("Hello, World!");
}
public static void main(String[] args) {
MyClass obj = new MyClass();
obj.printMessage();
}
}
