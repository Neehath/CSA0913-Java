public class MatrixMultiplication 
{
public static void main(String[] args) 
{ 
int[][] matrixA = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
int[][] matrixB = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
int rowsA = matrixA.length;
int columnsA = matrixA[0].length;
int rowsB = matrixB.length;
int columnsB = matrixB[0].length;
if (columnsA != rowsB) {
System.out.println("Matrix multiplication is not possible");
return;
}
int[][] resultMatrix = new int[rowsA][columnsB];
for (int i = 0; i < rowsA; i++) {
for (int j = 0; j < columnsB; j++) {
for (int k = 0; k < columnsA; k++) {
resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
}
}
}
System.out.println("Resultant Matrix after Multiplication:");
for (int i = 0; i < rowsA; i++) {
for (int j = 0; j < columnsB; j++) {
System.out.print(resultMatrix[i][j] + " ");
}
System.out.println();
}
}
}
