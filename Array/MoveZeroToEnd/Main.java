
class Main{

    public int[] Movezero(int arr[]){

        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0)j++;
        }

        return arr;
    }

    public static void main(String[] args) {

        Main mn = new Main();
        int arr[] = {1,0,20,0,5,0};

        int[] result = mn.Movezero(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
}