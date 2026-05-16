import java.util.*;
class Reverse{
    public static void main(String[] args){
        int [] arr={3,2,5,6,7,1};
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            res[arr.length-i-1]=arr[i];
            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
}