
public class Main {

    public void palindrome(String word){
        
        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length-1;
        int count = 0;
        while(start < end){
            if(arr[start] == arr[end]){
                start++;
                end--;
            }
            else{
                count = 1;
                break;
            }
        }

        if(count ==0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args) {
        Main mn = new Main();
        String word = "malayalam";
        mn.palindrome(word);
    }
    
}
