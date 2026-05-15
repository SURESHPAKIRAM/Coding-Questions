class Min{
    public int minValue(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;

    }
    public static void main(String[] args){
        int [] arr={28,3,5,5,8,23,45,2};
        Min m=new Min();
        System.out.println(m.minValue(arr));
    }
}