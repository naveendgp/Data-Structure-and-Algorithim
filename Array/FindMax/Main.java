
public class Main {
    
    public void Findmax(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String args[]){

        Main mn = new Main();
        int arr[] = {1,4,5,2,10,0};

        mn.Findmax(arr);

    }
}
