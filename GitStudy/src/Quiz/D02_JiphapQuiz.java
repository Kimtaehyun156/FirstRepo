package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz {

   /*
    *  1. �� �÷����� �Ű������� ���޹����� �������� �������� SetŸ������ ��ȯ�ϴ� �޼��� 
    *  2. �� �÷����� �Ű������� ���޹����� �������� �������� SetŸ������ ��ȯ�ϴ� �޼���
    *  3. �� �÷����� �Ű������� ���޹����� �������� �������� SetŸ������ ��ȯ�ϴ� �޼���  
    */
   
   public static void main(String[] args) {
     List<String> animals1 = new ArrayList<>();
      animals1.add("monkey");
      animals1.add("tiger");
      
      Set<String> animals2 = new HashSet<>();
      animals2.add("tiger");
      animals2.add("dog");
      animals2.add("cat");
      
      //������
      System.out.println(union(animals1,animals2));
      
      //������
      System.out.println(intersection(animals1,animals2));
      
      //������
      System.out.println(difference(animals1,animals2));
   }
   
   // ������ 
   public static Set<Object>  union(Object A , Object B ){
      Set<Object> set1 = new HashSet<>();
      set1.addAll((Collection<?>) A);
      set1.addAll((Collection<?>) B);
      return set1;
   }
   
   // ������ 
   public static Set<Object>  intersection(Object A , Object B ){
      Set<Object> set1 = new HashSet<>();
      set1.addAll((Collection<?>) A);
      set1.retainAll((Collection<?>) B);
      return set1;
   }
   
   // ������
   public static Set<Object>  difference(Object A , Object B ){
         Set<Object> set1 = new HashSet<>();
         set1.addAll((Collection<?>) A);
         set1.removeAll((Collection<?>) B);
         return set1;
      }
}