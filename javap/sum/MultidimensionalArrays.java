//multidimensional arrays are actually arrays of arrays.
//To declare a multidimensional array variable,specify each additional index
//using another set of square brackets. For example, the following declares a two-dimensional
//array variable called twoD.
//int twoD[][] = new int[4][5];
//This allocates a 4 by 5 array and assigns it to twoD. Internally this matrix is implemented as an
//array of arrays of int
public class MultidimensionalArrays {
    public static void main(String args[]) {
        int twoD[][]= new int[4][5];
        int i, j, k = 0;
        for(i=0; i<4; i++)
        for(j=0; j<5; j++)
        { 
        twoD[i][j] = k;
        k++;
        }
        for(i=0; i<4; i++) {
        for(j=0; j<5; j++)
        System.out.print(twoD[i][j] + ""); 
        System.out.println();
        }
        }
        }
    
