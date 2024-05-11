
public class Main {
    
    public void Secondmax(int arr[]){
        int max = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                second = max;
                max = arr[i];
            }
            else if(arr[i] != max  && arr[i] > second){
                second = max;
            }
        }

        System.out.println(second);
    }

    public static void main(String[] args) {
        
        Main mn = new Main();
        int arr[] = {1,2,5,6,3};
        mn.Secondmax(arr);
    }
}
