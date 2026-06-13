import java.util.HashMap;

public class p1 {
  static void count(String str){
    int n = str.length();
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i = 0; i<n; i++){
      char ch = str.charAt(i);
      if(map.containsKey(ch)){
        int freq = map.get(ch);
        map.put(ch, freq+1);
      }
      else{
        map.put(ch, 1);
      }
    }

    for(char ele:map.keySet()){
      int freq = map.get(ele);
      System.out.println(ele + " "+ freq);
    }
  }

  public static void main(String[] args) {
    String str = "Satakshi";
    count(str);
  }
}


