import java.io.*;
import java.lang.*;
class a implements Cloneable
{
int a;
double b;
public static void main(String args[])throws CloneNotSupportedException
{
a obj=new a();
obj.a=10;
obj.b=10.2;
System.out.println(obj.a+" "+obj.b);
a d1=(a)obj.clone();
System.out.println(d1.a+" "+d1.b);
}
}



