import java.util.Scanner;
public class dec {
public static void main(string[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter a decimal number:");
int decimal=scanner.nextInt();
string binary=Integer.toBinaryString(decimal);
System.out.println("binary:"+binary);
}
}