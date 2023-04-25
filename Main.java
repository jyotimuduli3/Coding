// // print decreasing

// //import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn=new Scanner(System.in);
//         int n=scn.nextInt();
//         printDecreasing(n);
//         scn.close();
//     }

//     public static void printDecreasing(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         printDecreasing(n - 1);

//     }

// }

//print Increasing

//import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn=new Scanner(System.in);
//         int n=scn.nextInt();
//         printIncreasing(n);
//     }

//     public static void printIncreasing(int n){
//         if(n==0){
//             return;
//         }
//         printIncreasing(n-1);
//         System.out.println(n);
//     }

// }


// Print Decreasing Increasing 

// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         pdi(n);
//     }

//     public static void pdi(int n) {
//         if (n == 0)
//             return;
//         System.out.println(n);
//         pdi(n - 1);
//         System.out.println(n);
//     }

// }

//factorial

// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         System.out.println(factorial(n));
//         scn.close();
//     }

//     public static int factorial(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }

// }


//power x^n

// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn = new Scanner(System.in);
//         int x = scn.nextInt();
//         int n = scn.nextInt();
//         System.out.println(power(x, n));
//         scn.close();
//     }

//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         // return x * power(x, n - 1);
//         //optimizing
//         int res=power(x, n / 2);
//         res = res * res;
//         if(n%2!=0)
//             res *= x;
//         return res;
//     }

// }


//tower of Hanoi


// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int t1d = scn.nextInt();
//         int t2d = scn.nextInt();
//         int t3d = scn.nextInt();
//         toh(n, t1d, t2d, t3d);
//         scn.close();
//     }

//     public static void toh(int n, int t1d, int t2d, int t3d) {
//         if (n == 0)
//             return;
//         toh(n - 1, t1d, t3d, t2d);
//         System.out.println(n + "[" + t1d + "->" + t2d + "]");
//         toh(n - 1, t3d, t2d, t1d);

//     }

// }

// display an array using recursion
import java.io.*;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println();
        displayArr(arr, 0);
        System.out.println();
        displayArrReverse(arr, 0);
        System.out.println();
        System.out.println(maxOfArray(arr, 0)); 
    }

    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }
// display in reverse
public static void displayArrReverse(int[] arr, int idx) {
    if (idx == arr.length)
        return;
    displayArrReverse(arr, idx + 1);
    System.out.println(arr[idx]);
}
// maximum using recursion
//initially 0 is passed
public static int maxOfArray(int[] arr, int idx) {
    if(idx==arr.length-1)
        return arr[idx];
    int maxsub = maxOfArray(arr, idx + 1);
    if (maxsub > arr[idx]) {
        return maxsub;
    } else {
        return arr[idx];
    }
}

}