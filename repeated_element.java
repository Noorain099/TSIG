class MyClass
{
    public static void main(String args[])
    {  
    
    int[] arr = {12,3,4,5,6,5,12,2,5,8,7,5,3,5,5};    
      System.out.println("Program to find repeating elements in array");
    
      int element = 0;
      int max = 0; 
      for(int i = 0; i < arr.length; i++){
        int count = 0;
        for(int j = 0; j < arr.length; j++){
          if(arr[i] == arr[j]){
            count++;
          }
        }
        if(count > max){
          max = count;
          element = arr[i];
        }

      }
      System.out.println("the maximum repeating element : "+element+", no of times : "+max);
       
       
    }
}
