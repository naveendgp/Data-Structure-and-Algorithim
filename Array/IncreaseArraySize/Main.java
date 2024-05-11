
public class Main {

    public void IncreaseSize(int arr[],int size){
        
        int newarr[] =  new int[size];

        for(int i=0;i<arr.length;i++){
            newarr[i] = arr[i];
        }

        System.out.println("Array size has been increased to: "+ newarr.length);
    }
    
    public static void main(String[] args) {
        
        Main mn = new Main();
        int arr[] = {1,2,3,4,5};

        mn.IncreaseSize(arr, 10);
    }
}
