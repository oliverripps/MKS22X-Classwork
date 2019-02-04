import java.util.*;
public class Classwork{

  public static List<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> words = new ArrayList<String>(0);
    maw(k,"",maxLetter,words);
    return words;
  }
  public static void maw(int k, String word, int maxLetter,ArrayList<String> data){
    ArrayList<String> alpha = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
    if(k!=0){
      for(int i=0;i<maxLetter;i++){
        maw(k-1,word+alpha.get(i),maxLetter,data);
      }
      //maw(k-1,word+alpha.get(1),maxLetter,data);
      //maw(k-1,word+alpha.get(2),maxLetter,data);
    }
    else{
      data.add(word);
    }

  }
  public static void main(String[] args){
    System.out.println(makeAllWords(5,26));
  }








}
