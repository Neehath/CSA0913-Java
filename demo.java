import java.io.*;
class Demo implements Cloneable {
int a;
double b;
public static void main(String args[]) throws CloneNotSupportedException {
Demo obj = new Demo();
obj.a = 10;
obj.b = 10.2;
System.out.println("Original object: " + obj.a + " " + obj.b);
Demo d1 = (Demo) obj.clone();
System.out.println("Cloned object: " + d1.a + " " + d1.b);
}
}
