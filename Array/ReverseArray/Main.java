class Main{

    public void revereString(int arr[],int n){
        int start =0;
        int end = n-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]){

        Main mn = new Main();
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        mn.revereString(arr,n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}