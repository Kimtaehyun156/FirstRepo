package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz {

   /*
    *  1. 두 컬렉션을 매개변수로 전달받으면 두집합의 합집합을 Set타입으로 반환하는 메서드 
    *  2. 두 컬렉션을 매개변수로 전달받으면 두집합의 교집합을 Set타입으로 반환하는 메서드
    *  3. 두 컬렉션을 매개변수로 전달받으면 두집합의 차집합을 Set타입으로 반환하는 메서드  
    */
   
   public static void main(String[] args) {
     List<String> animals1 = new ArrayList<>();
      animals1.add("monkey");
      animals1.add("tiger");
      
      Set<String> animals2 = new HashSet<>();
      animals2.add("tiger");
      animals2.add("dog");
      animals2.add("cat");
      
      //합집합
      System.out.println(union(animals1,animals2));
      
      //교집합
      System.out.println(intersection(animals1,animals2));
      
      //차집합
      System.out.println(difference(animals1,animals2));
   }
   
   // 합집합 
   public static Set<Object>  union(Object A , Object B ){
      Set<Object> set1 = new HashSet<>();
      set1.addAll((Collection<?>) A);
      set1.addAll((Collection<?>) B);
      return set1;
   }
   
   // 교집합 
   public static Set<Object>  intersection(Object A , Object B ){
      Set<Object> set1 = new HashSet<>();
      set1.addAll((Collection<?>) A);
      set1.retainAll((Collection<?>) B);
      return set1;
   }
   
   // 차집합
   public static Set<Object>  difference(Object A , Object B ){
         Set<Object> set1 = new HashSet<>();
         set1.addAll((Collection<?>) A);
         set1.removeAll((Collection<?>) B);
         return set1;
      }
}