
public class Main {
    
    public void Findmin(int arr[]){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        
        Main mn = new Main();
        int arr[] = {1,2,3,4,0};

        mn.Findmin(arr);
    }
}
