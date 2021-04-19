package Study;

public class A05_Print {

   public static void main(String[] args) {
      
      /*
          #콘솔에 출력하기 위한 여러가지 함수들
          
          1.print()
          - 줄을 자동으로 바꾸지 않는 가장 기본 출력 
          
          2.println()
          - 줄을 자동으로 바꿔주며 출력하는 함수 
          - ()에 전달한 데이터맨 뒤에 \n 한 효과를 준다 
          - ()에 아무것도 전달 하지 않으면 \n효과만 준다 
       */
      
      System.out.print("hello");
      System.out.print("hello");
      System.out.print("hello");
      System.out.println();
      
      System.out.println("hello");
      System.out.println("hello");
      System.out.println("hello");
      
      /*
          3.printf()
          - 서식 문자를 이용할 수 있는 출력 함수 
          - 출력의 형태를 미리 만들고 , 서식문자 자리에 값을 채워서 사용한다 
          - 문자열을 +로 이어붙이는것보다 서식을 사용하는 경우 편리할떄도 있다
          - 줄을 자동으로 바꿔주지 않는다
          
          
       */
      
      int year = 2021 , month =3 , day =17 , 
            hour =11 ,minute=9 ,second=38 , millisec=1234;
      
      System.out.println(year+"년" + month + "월" + day + " 일" +
                     hour + ":" + minute + ":" + second +"." + millisec );
      
      // %d자리에 숫자를 하나씩 채워서 사용한다 
      System.out.printf("%d년 %d월 %d일  /  %d:%d:%d.%d\n",
             year,month,day,hour,minute,second,millisec);
      
      
      
      
      /*
          # 서식 문자의 종류 
          
             %d    :  해당 자리에 전달한 정수를  10진수로 출력해준다  (decimal) 데시멀
             %x,%X :  해당 자리에 전달한 정수를  16진수로 출력해준다  (hexa decimal) 
             %o, :  해당 자리에 전달한 정수를    8진수로 출력해준다 (octal)
             %s  : 문자열 (string)
             %c  : 문자  (character)
             %f  : 실수  (float)
             
          # 10진수의 숫자들 
             0 1 2 3 4 5 6 7 8 9 -10
          
          # 8진수의 숫자들 
             0 1 2 3 4 5 6 7 - 10
          
          # 16진수의 숫자들 
             0 1 2 3 4 5 6 7 8 9 A(10) B(11) C(12) D(13) E(14) F(15) - 10
          
       */
      
      
      // 16진수는 알파벳을 쓰기떄문에 %대문자는 대문자로 출력이된다
      
      int testNum= 20;
      
      System.out.printf("8진수로   %d은(는) %o 입니다 \n ", testNum,testNum);
      System.out.printf("10진수로 %d은(는) %d 입니다 \n ", testNum,testNum);
      System.out.printf("16진수로 %d은(는) %x 입니다 \n ", testNum,testNum);
      System.out.printf("16진수로 %d은(는) %X 입니다 \n ", testNum,testNum);
      
      

       //      # 서식문자 옵션들
      //  서식문자 자리에는 %d만 넣어야하는것은 아님 타입에 맞게 대입할수 있다
      
      // %숫자d : 숫자만큼 칸을 확보한 뒤 오른쪽 정렬하여 출력한다 
      System.out.printf("사과 : %d 개 \n" , 10);
      System.out.printf("사과 : %10d 개 \n" , 10);
      System.out.printf("사과 : %20d 개 \n" , 10);
      
      System.out.println();
      
      System.out.printf("[[%s]]\n", "Hello world!");
      System.out.printf("[[%30s]]\n", "Hello world!");
      System.out.printf("[[%50s]]\n", "Hello world!");
      
      System.out.printf("%s\n", "*");
      
      //%-숫자d : 숫자만큼 칸을 확보한뒤  왼쪽 정렬하여 출력한다 
      System.out.printf("사과 : %d 개 \n" , 10);
      System.out.printf("사과 : %-10d 개 \n" , 10);
      System.out.printf("사과 : %-20d 개 \n" , 10);
      
      System.out.printf("%s : 10개\n" , "사과");
      System.out.printf("%-7s : 10개\n" , "귤");
      System.out.printf("%-10s 10개\n" , "바나나");
      
      // %0숫자d : 숫자만큼 칸을 확보한뒤 빈칸에 0을 채워서 출력한다 
      System.out.printf("%d개\n",5);
      System.out.printf("%02d개\n",5);
      System.out.printf("%03d개\n",5);
      System.out.printf("%020f개\n",3.14);
      
      // %+d : 양수  앞에도 부호를 붙여준다 
      System.out.printf("양수 : %d , 음수 ;%d \n",5,-5);
      System.out.printf("양수 : %+d , 음수 ;%+d \n",5,-5);
      
      // %.숫자f : 소수 자릿수를 설정한다
      double avg = 123.125555;
      System.out.printf("평균점수 : %f\n", avg);
      System.out.printf("평균점수 : %.2f\n", avg);
      
      
   }

}