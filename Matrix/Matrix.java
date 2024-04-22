package Matrix;
public class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    
    public void fillMatrix(int[][] values) {
        if (values.length != rows || values[0].length != cols) {
            System.out.println("Input values dimensions do not match matrix dimensions.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = values[i][j];
            }
        }
    }

    
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Matrix matrix = new Matrix(3, 3);

        
        int[][] values = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        matrix.fillMatrix(values);

        
        matrix.printMatrix();
    }
}
