import java.lang.Math;
class Main {

  public static int jumpSearch(int[] arr,int sv) {
     int sqrt=(int)Math.sqrt(arr.length),step=sqrt,prev=0;
     while(arr[Math.min(step, arr.length)-1] < sv) {
        prev=step;
        step+=sqrt;
        if(prev >= arr.length)
           return -1;
     }
     while(arr[prev] < sv) {
       prev++;
       if(Math.min(step,arr.length)==prev)
          return -1;
     }
     if(arr[prev] == sv)
        return prev;
     return -1;
  }

  public static void selectionSort(int arr[]) {
    int minInd=0;
    for(int i=0;i<arr.length-1;i++) {
      minInd=i;
      for(int j=i+1;j<arr.length;j++) 
        if(arr[j] < arr[minInd])
           minInd=j;
      arr[i]=swap(arr[minInd],arr[minInd]=arr[i]);
    }
  }

  public static void bubbleSort(int arr[]) {
    boolean sorted=true;
    for(int i=0;i<arr.length-1 && sorted;i++) {
      sorted = false; 
      for(int j=0;j<arr.length-i-1;j++) 
        if(arr[j] > arr[j+1]) {
            arr[j]=swap(arr[j+1],arr[j+1]=arr[j]);
            sorted=true;
        }
    }
  }

  public static void main(String[] args) {
      int a[]={9,4,10,1,2,13,6,18};
  }
  
  public static int swap(int secValue, int noUse) {
    return secValue;
  }
}