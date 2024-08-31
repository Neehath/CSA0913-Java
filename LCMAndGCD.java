import java.util.Scanner;
public class LCMAndGCD 
{
public static int findGCD(int a, int b) 
{
while (b != 0) 
{
int temp = b;
b = a % b;
a = temp;
}
return a;
}
public static int findLCM(int a, int b, int gcd) {
return (a * b) / gcd;
}
public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter first number: ");
int num1 = scan.nextInt();
System.out.print("Enter second number: ");
int num2 = scan.nextInt();
int gcd = findGCD(num1, num2);
System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
int lcm = findLCM(num1, num2, gcd);
System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
}
}
