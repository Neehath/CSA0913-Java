public class MatrixAddition 
{
public static void main(String[] args) {
int[][] matrixA = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
int[][] matrixB = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
int rows = matrixA.length;
int columns = matrixA[0].length;
int[][] resultMatrix = new int[rows][columns];
for (int i = 0; i < rows; i++) 
{
for (int j = 0; j < columns; j++) 
{
resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
}
}
System.out.println("Resultant Matrix after Addition:");
for (int i = 0; i < rows; i++) 
{
for (int j = 0; j < columns; j++) 
{
System.out.print(resultMatrix[i][j] + " ");
}
System.out.println();
}
}
}
