public class MyMatrix implements Sumabil {
    int[][] matrix = new int[4][4];

    void set(int[][] values) {
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                this.matrix[i][j] += values[i][j];
            }
        }
    }

    public void addValue(Sumabil other) {
        if(other instanceof MyMatrix) {
            MyMatrix _other = (MyMatrix) other;
            for(int i = 0; i < 4; i++) {
                for(int j = 0; j < 4; j++) {
                    this.matrix[i][j] += _other.matrix[i][j];
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i <  4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

}
