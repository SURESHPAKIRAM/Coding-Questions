import java.util.*;
class Reverse{
    public static void reverse(int [] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }

    }
    public static void rotate(int [] arr,int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

    }
    public static void main(String[] args){
        int [] arr={3,2,5,6,7,1};
        System.out.println(Arrays.toString(arr));
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}