import java.util.HashMap;

public class Frequency {
    public static void main(String[] args){
        int [] arr={2,5,7,4,7,2,5,6,6,4,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }
    
}
// 