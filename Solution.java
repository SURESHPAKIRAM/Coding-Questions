import java.util.*;
class Solution{
    public static void main(String[] args){
        int [] arr={45,34,23};
        Arrays.sort(arr);
        int [] res=new int[arr.length];
        int n=arr.length;
        int mid=(n+1)/2;
        int c=0;
        for(int i=0;i<mid;i++){
            res[c++]=arr[i];
        }
        for(int i=n-1;i>=mid;i--){
            res[c++]=arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}