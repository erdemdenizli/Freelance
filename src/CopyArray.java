import java.util.Arrays;
class CopyArray {
  public static int[] mergR(int[] a,int[] b) {

    int[] arr = Arrays.copyOf(a, a.length + b.length);
    
    for(int i=a.length, j=0; i<arr.length; i++, j++) {
      arr[i]=b[j];
    }
    
    return arr;
    
  }//end mergR
  
  public static void main(String[] args) 
  {
   
  }
}