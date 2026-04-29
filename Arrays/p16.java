package Arrays;

public class p16 {
  public static void main(String[] args) {
    int [] a = {2, 5, 6, 9, 20};
    int [] b = {1, 3, 4, 5, 7, 8};

    int [] c = new int[a.length + b.length];
    int i = 0, j=0, k=0;
    while(i<a.length && j<b.length){
      if(a[i]<b[j]){
        c[k] = a[i];
        i++;
      }
      else{
        c[k] = b[j];
        j++;
      }
      k++;
    }
    while(i<a.length){
      c[k] = a[i];
      i++;
      k++;
    }
    while(j<b.length){
      c[k] = b[j];
      j++;
      k++;
    }

    for(int x=0; x<a.length+b.length; x++){
      System.out.print(c[x] + " ");
    }
  }
}
