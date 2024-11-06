package Java_Concept.arrays;

public class Two_Dimensional {
    public static void main(String[] args) {
        // Approach 1
        int a[][] = new int[3][2]; // declare 2D array with length - rows - 3, columns: 2
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 1;
        a[1][1] = 3;
        a[2][0] = 1;
        a[2][1] = 4;

        // lenght of the array
//        int lengthRow = a.length;
//        int lengthCol = a[1].length; // with columns we can print a[0 or 1 or 2]
//        System.out.println(lengthRow);
//        System.out.println(lengthCol);

        for(int b[] : a) {
            for(int c : b) {
                System.out.print(c);
            }
          System.out.println();
        }

        // Approach 2
        int b[][] = {
                {1,2,3},
                {1,2},
                {1,2,3}
        };
        int lengthRow1 = b.length;
        int lenghtCol1 = b[0].length;
        System.out.println(lengthRow1);
        System.out.println(lenghtCol1);
        // Retrive the values for 2D array
        // normal for loop
        for(int i = 0; i < b.length; i++) { // row array
           for (int j = 0; j < b[i].length; j++) { // col array
              System.out.print(b[i][j] + " ");
           }
           System.out.println();
        }

        // enhanched for each loop
        for(int x[] : b) { // rows of the arrays
            for(int y : x) { // column of the arrays
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
