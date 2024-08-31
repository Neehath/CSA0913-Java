public class Pascaltriangle {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
