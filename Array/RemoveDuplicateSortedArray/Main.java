class Main{

    public int removeDuplicate(int arr[]){
        int j =0;
        for(int i =1;i<arr.length;i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
    
        }
        return j+1;
    }

    public static void main(String[] args) {

        Main mn = new Main();
        int arr[] = {1,2,2,3,3,4,5};
        int lenght = mn.removeDuplicate(arr);
        
        for(int i=0;i<lenght;i++){
            System.out.println(arr[i]);
        }
    }
}