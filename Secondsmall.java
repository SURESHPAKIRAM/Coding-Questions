import java.util.*;
class Secondsmall{
    public void secondSmall(int [] arr){
        Arrays.sort(arr);
        System.out.println(arr[1]);
        System.out.println(arr[arr.length-2]);    }
    public static void main(String [] args){
        int [] arr ={28,484,39,38,2,3};
        Secondsmall s=new Secondsmall();
        s.secondSmall(arr);
        }
}