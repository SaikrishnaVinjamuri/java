import java.util.Scanner;
public class Experiment_6 {
    public static void main(String[] args)
    {
        int[] a; // array reference

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        a = new int[n]; // dynamic memory allocation in java for array

        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        System.out.println("\nBefore sorting...");
        display(a);

        mergepass(a,0,n-1); // calling sorting function

        System.out.println("\nAfter sorting...");
        display(a);
    }

    public static void mergepass(int[] a, int low , int high ){
        int middle ;
        if(low != high ){
            middle = (low + high) / 2 ;
            mergepass(a , low , middle );
            mergepass(a , middle + 1 , high );
            mergesort(a , low , middle , high );
        }
    }

    public static void mergesort(int[] a, int low , int middle , int high ){
        int i ;
        int j ;
        int k ;
        int[] temp;
        temp = new int[20];

        i = low ;
        j = middle + 1;
        k = low ;

        while((i<=middle) && (j <= high)){
            if(a[i]<=a[j]){
                temp[k] = a[i] ;
                k++; i++;
            }
            else{
                temp[k] = a[j];
                k++ ; j++;
            }
        }

        while(i<=middle){
            temp[k] = a[i];
            k++; i++;
        }

        while(j<=high){
            temp[k] = a[j];
            k++;j++;
        }

        for(int in=low ; in<=high ; in++){
            a[in] = temp[in];
        }
    }


    public static void display(int[] a)
    {
        for(int i: a)
            System.out.print(i + " ");
    }
}