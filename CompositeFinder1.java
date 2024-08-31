public class CompositeFinder1 
{
public static boolean isComposite(int num) 
{
if (num <= 1) return false; 
for (int i = 2; i < num; i++) {
if (num % i == 0) return true;
}
return false;
}
public static void main(String[] args) {
int[] array = {10, 15, 3, 7, 8, 19, 21};         
System.out.print("Composite numbers in the array: ");
for (int num : array) {
if (isComposite(num)) {
System.out.print(num + " ");
}
}
}
}
