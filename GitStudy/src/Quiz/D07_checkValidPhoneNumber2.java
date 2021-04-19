package Quiz;

public class D07_checkValidPhoneNumber2 {

        /*
                 ����ڷκ��� �ڵ��� ��ȣ�� �Է¹�����
                 �ùٸ� ��ȭ��ȣ���� �����ϴ� ���α׷��� ��������  
         
                 ���� 3�ڸ��� ����
                 �ι�° ���ڴ� 3�ڸ� Ȥ�� 4�ڸ�
                 ����° ���ڴ� 4�ڸ� 
                 4��° �Ǵ� 8��° �Ǵ� 9��° ���ڴ� '-'                 
        */
        
        private static boolean checkNumeric(char ch) {
                return ch >= '0' && ch <= '9';
        }
        
        public static boolean checkValidPhoneNumber(String phoneNumber) {
                int len = phoneNumber.length();
                
                if (len != 12 && len != 13) {
                        System.out.println("[invalid] ���̰� �ùٸ��� ����");
                        return false;
                }
                
                for (int i = 0; i < len; ++i) {
                        // 012-4567-9101112 = 13
                		// 012-456-891011 = 12 
                        char ch = phoneNumber.charAt(i);
                        
                        if (i < 3 && !checkNumeric(ch)) {
                                System.out.println("[invalid] �Ǿ� 3�ڸ��� ���� �ƴѰ��� ����");
                                return false;
                        } else if ((i == 3 || (i == 7 && len == 12) || (i == 8 && len == 13)) && ch != '-') {
                                System.out.println("[invalid] ������ �ڸ��� �ùٸ��� ����");
                                return false;
                        } else if (i > 3 && ((len == 12 && i < 7) || (len == 13 && i < 8)) && !checkNumeric(ch)) {
                                System.out.println("[invalid] ��� �ڸ��� ���� �ƴѰ��� ����");
                                return false;
                        } else if (((len == 12 && i > 7) || (len == 13 && i > 8)) && !checkNumeric(ch)) {
                        		System.out.println("[invalid] ������ �ڸ��� ���� �ƴѰ��� ����");
                        		return false;
                        }                        
                }
                
                return true;
        }
        
        public static void main(String[] args) {
                
                if (checkValidPhoneNumber("123-1214-1234")) {                        
                        System.out.println("�ùٸ� �ڵ��� ��ȣ �Դϴ�!");
                }
        }
}











