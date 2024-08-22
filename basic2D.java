package Array2D;
import java.util.Scanner;
public class basic2D {


    // Qus:7. Pattern:Spiral Matrix : Given an nxm matrix 'a',return all elements of the matrix in spiral order!!

    static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] a,int r,int c){
        int toprow = 0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int totalelemets = 0;

        while (totalelemets < r * c){
            //toprow -> leftcol to rightcol
            for(int j = 0; j <= rightcol && totalelemets < r * c; j++){
                System.out.print(a[toprow][j]+" ");
                totalelemets++;
            }
            toprow++;


            //rightcol->toprow to bottomrow
            for(int j = toprow; j <= bottomrow && totalelemets < r * c; j++){
                System.out.print(a[j][rightcol]+" ");
                totalelemets++;
            }
            rightcol--;



            //bottomrow->rightcol to leftcol
            for(int i = rightcol; i >= leftcol && totalelemets < r * c; i--){
                System.out.print(a[bottomrow][leftcol]+" ");
                totalelemets++;
            }
            bottomrow--;


            //leftcol->bottomrow to toprow
            for(int i = bottomrow; i >= toprow && totalelemets < r * c; i++){
                System.out.print(a[i][leftcol]+" ");
                totalelemets++;
            }
            leftcol++;



        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number :");
//        int n = sc.nextInt();
        System.out.println("Enter Number of rows :");
        int r = sc.nextInt();
        System.out.println("Enter Number of columns :");
        int c = sc.nextInt();
        int[][] a = new int [r][c];
        int totalElements = r*c;
        System.out.println("Enter "+totalElements+" elements :");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix :");
        printArray(a);

        System.out.println("Spiral Order :");
        printSpiralOrder(a,r,c);
        //printArray(a);


    }
    }




//// Qus:6. Given a square Matrix,turn it by 90 degrees in a clockwise direction without using any extra space!!
//
//static void printArray(int[][] arr){
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr[i].length; j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }
//}
//
//static int[][] pascalTriangle(int n){
//    int[][] ans = new int [n][];
//    // ith row has i+1 columns
//    for(int i = 0; i < n; i++) {
//        ans[i] = new int[i + 1];
//        ans[i][0] = ans[i][i] = 1;
//
//        for (int j = 1; j < i; j++) {
//            ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
//        }
//    }
//
//    return ans;
//}
//
//
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Number :");
//    int n = sc.nextInt();
//    int[][] ans = pascalTriangle(n);
//    printArray(ans);
//
//
//}
//    }






//// Qus:6. Given a square Matrix,turn it by 90 degrees in a clockwise direction without using any extra space!!
//
//static void printArray(int[][] arr){
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr[i].length; j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }
//}
//
//static void findTransposeInplace(int[][]a,int r,int c){
//
//    for(int i = 0; i < c; i++){
//        for(int j = i; j < r; j++){
//            int temp = a[i][j];
//            a[i][j] = a[j][i];
//            a[j][i] = temp;
//        }
//    }
//
//}
//static void findReverseArray(int[] a){
//    int i = 0, j = a.length-1;
//    while(i<j){
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//        i++;
//        j--;
//    }
//}
//
//static void rotate(int[][] a,int n){
//    // Transpose the Array.
//    findTransposeInplace(a,n,n);
//
//    // Reverse each row of the transposed matrix.
//    for(int i = 0; i < n; i++){
//        findReverseArray(a[i]);
//    }
//
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Number of rows :");
//    int r = sc.nextInt();
//    System.out.println("Enter Number of columns :");
//    int c = sc.nextInt();
//    int[][] a = new int [r][c];
//    int totalElements = r*c;
//    System.out.println("Enter "+totalElements+" elements :");
//    for(int i = 0; i < r; i++){
//        for(int j = 0; j < c; j++){
//            a[i][j] = sc.nextInt();
//        }
//    }
//    System.out.println("The Input Matrix is :");
//    printArray(a);
//    rotate(a,r);
//    System.out.println("Rotation of Matrix :");
//    printArray(a);
//
//
//
//
//}
//}




// Qus:5. Write a program to display transpose of matrix in-place logic entered by user!!
//Note: The Array should have equal Number of rows and columns!!


//static void printArray(int[][] arr){
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr[i].length; j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }
//}
//
//static void findTransposeInplace(int[][]a,int r,int c){
//
//    for(int i = 0; i < c; i++){
//        for(int j = i; j < r; j++){
//            int temp = a[i][j];
//            a[i][j] = a[j][i];
//            a[j][i] = temp;
//        }
//    }
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Number of rows :");
//    int r = sc.nextInt();
//    System.out.println("Enter Number of columns :");
//    int c = sc.nextInt();
//    int[][] a = new int [r][c];
//    int totalElements = r*c;
//    System.out.println("Enter "+totalElements+" elements :");
//    for(int i = 0; i < r; i++){
//        for(int j = 0; j < c; j++){
//            a[i][j] = sc.nextInt();
//        }
//    }
//    System.out.println("The Transpose of Matrix is :");
//    findTransposeInplace(a,r,c);
//    printArray(a);
//
//
//
//}
//}


////4. Qus: Write a program to display transpose of matrix entered by user!!
//
//static void printArray(int[][] arr){
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr[i].length; j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }
//}
//
//static int[][] findTranspose(int[][]a,int r,int c){
//    int[][] ans = new int [c][r];
//    for(int i = 0; i < c; i++){
//        for(int j = 0; j < r; j++){
//            ans[i][j] = a[j][i];
//
//        }
//    }
//
//    return ans;
//
//}
//
//
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Number of rows :");
//    int r = sc.nextInt();
//    System.out.println("Enter Number of columns :");
//    int c = sc.nextInt();
//    int[][] a = new int [r][c];
//    int totalElements = r*c;
//    System.out.println("Enter "+totalElements+" elements :");
//    for(int i = 0; i < r; i++){
//        for(int j = 0; j < c; j++){
//            a[i][j] = sc.nextInt();
//        }
//    }
//    System.out.println("The Transpose of Matrix is :");
//    int[][] ans = findTranspose(a,r,c);
//    printArray(ans);
//
//
//
//}
//}



////3. Qus: Multiplication of two matrices!!
//static void printArray(int[][] arr){
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr[i].length; j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }
//}
//
//static void multiPlication(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
//    if(c1!=r2){
//        System.out.println("Wrong Input - Addition not possible :");
//        return;
//    }
//    int[][] mul = new int[r1][c2];
//    for(int i = 0; i < r1; i++) {
//        for (int j = 0; j < c2; j++) {
//            for(int k = 0; k < c1; k++){
//                mul[i][j]+=(a[i][k] * b[k][j]);
//            }
//        }
//
//    }
//    System.out.println("The Multiplication of matrix1 and matrix 2 :");
//    printArray(mul);
//
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Number of rows of first Matrix :");
//    int r1 = sc.nextInt();
//    System.out.println("Enter Number of columns of first Matrix :");
//    int c1 = sc.nextInt();
//    int[][] a = new int[r1][c1];
//    System.out.println("Enter Matrix values :");
//    for(int i = 0; i < r1; i ++){
//        for(int j = 0; j < c1; j ++){
//            a[i][j] = sc.nextInt();
//        }
//    }
//    System.out.println("Enter Number of rows and columns of second Matrix :");
//    int r2 = sc.nextInt();
//    int c2 = sc.nextInt();
//    int[][] b = new int[r2][c2];
//    System.out.println("Enter Matrix values :");
//    for(int i = 0; i < r2; i++){
//        for(int j = 0; j < c2; j++){
//            b[i][j] = sc.nextInt();
//        }
//    }
//
//    System.out.println("The first Matrix :");
//    printArray(a);
//    System.out.println("The second Matrix :");
//    printArray(b);
//    multiPlication(a,r1,c1,b,r2,c2);
//    // printArray(arr);
//}
//}


//// 2.Qus: Add two matrices!!
//static void printArray(int[][] arr){
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr[i].length; j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }
//}
//
//static void add(int[][] a,int r,int c,int[][] b,int r2,int c2){
//    if(r!=r2 || c!=c2){
//        System.out.println("Wrong Input - Addition not possible :");
//        return;
//    }
//    int[][] ans = new int[r][c];
//    for(int i = 0; i < r; i++) {
//        for (int j = 0; j < c; j++) {
//            ans[i][j] = a[i][j] + b[i][j];
//        }
//        System.out.println("The sum of matrix1 and matrix 2 :");
//        printArray(ans);
//    }
//
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Number of rows of first Matrix :");
//    int r = sc.nextInt();
//    System.out.println("Enter Number of columns of first Matrix :");
//    int c = sc.nextInt();
//    int[][] a = new int[r][c];
//    System.out.println("Enter Matrix values :");
//    for(int i = 0; i < r; i ++){
//        for(int j = 0; j < c; j ++){
//            a[i][j] = sc.nextInt();
//        }
//    }
//    System.out.println("Enter Number of rows and columns of second Matrix :");
//    int r2 = sc.nextInt();
//    int c2 = sc.nextInt();
//    int[][] b = new int[r2][c2];
//    System.out.println("Enter Matrix values :");
//    for(int i = 0; i < r2; i++){
//        for(int j = 0; j < c2; j++){
//            b[i][j] = sc.nextInt();
//        }
//    }
//
//    System.out.println("The first Matrix :");
//    printArray(a);
//    System.out.println("The second Matrix :");
//    printArray(b);
//    add(a,r,c,b,r2,c2);
//    // printArray(arr);
//}
//}



//1. Input of 2D Arrays!!

//static void printArray(int[][] arr){
//    for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr[i].length; j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }
//}
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Number of rows :");
//    int r = sc.nextInt();
//    System.out.println("Enter Number of columns :");
//    int c = sc.nextInt();
//    int[][] arr = new int[r][c];
//    System.out.println("Enter "+r*c+" Elements :");
//    for(int i = 0; i < r; i ++){
//        for(int j = 0; j < c; j ++){
//            arr[i][j] = sc.nextInt();
//        }
//    }
//    printArray(arr);
//}
//}
