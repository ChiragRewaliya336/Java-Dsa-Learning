public class SpiralMatrix {
    public static void print(int matrix[][]){
        int stRow=0;
        int stcol =0;
        int edRow =matrix.length-1;
        int edcol= matrix[0].length-1;
        while (stRow<=edRow && stcol<=edcol) {
            //tp
                 for(int j=stcol; j<=edcol; j++){
                    System.out.print(matrix[stRow][j]+" ");
                }
                //right
                for(int i=stRow+1; i<=edRow;i++){
                     System.out.print(matrix[i][edcol]+" ");
                }
                //bottom
                for(int j=edcol-1; j>=stcol;j--){
                    if (stRow==edRow) {
                        break;
                    }
                    System.out.print(matrix[edRow][j]+" ");
                }
                //left
                for(int i=edRow-1; i>=stRow+1; i--){
                    if (stcol==edcol) {
                        break;
                    }
                    System.out.print(matrix[i][stcol]+" ");
                }
                stRow++;
                stcol++;
                edRow--;
                edcol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
                print(matrix);
    }
}
