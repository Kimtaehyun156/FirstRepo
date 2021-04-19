package Study;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C13_Exception {

	/*
	 *	 ���� ( Exception)
	 *	 - �츮�� �˰� �ִ� ���� �۾����� ��� ���ܶ�� �θ��� 
	 * 	 - ���α׷��Ӱ� ���ܿ� �߻������� ���ܸ� �̸� �����ϰ� ����صδ°��� 
	 * 	 - ����ó�� ��� �Ѵ� 
	 * 	 - �ڹ��� ������ Ʋ���� ���� ���ܰ� �ƴ϶� �����Ͽ������ �θ��� (��Ÿ ��) 
	 * 	 - ���α׷��Ӱ� ���ܿ� ���Ͽ� ������ ��ġ�� �����شٸ� 
	 *   - ���α׷��� ������������ �ʰ� ����ؼ� �����Ҽ� �ִ� 
	 *   - �޼��忡 ���콺�� �÷����� � ���ܰ� � ��Ȳ�� �߻��ϴ����� ���� 
	 *   - ������ Throws�� �����ִ� 
	 *   
	 *   # ����ó�� 
	 *   - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ帣 try�� ���ο� ���Խ�Ų�� 
	 *   - try�� ���ο� �ִ� �ڵ�� ���ܰ� �߻����������� ��� ���� ����ȴ� 
	 *   - try�� ���ο��� ���ܰ� �߻��ϴ� ��� ������ ��� �ߴܵǰ� 
	 *   - �ش� ���ܸ� ����ϴ� catch������ �̵��ϰ� �ȴ� 
	 *   - catch������ �߻��� ���ܿ� ���� ������ ��� �ִ� �ν��Ͻ��� �����ϰ� �ȴ�
	 *   - catch���� ������ ��ø�ؼ� ������ ����Ҽ� �ִ� 
	 *   - ���ܰ� �߻��ϵ� ���ϵ� �����ϰ� ���� �ڵ��  finally�� �ۼ��Ѵ� 
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("�ݵ�� ���ڸ� �Է����ּ���!");
		
		try {
			a = sc.nextInt();
		}catch(InputMismatchException e) { // ��ǲ�̽���Ī�� Ŭ������ ���� �Ű������� �����´� exception�� �ٿ��� ���� e����Ѵ� 
			e.printStackTrace(); // ������ ���� ������ ���
			//System.out.println(e.getMessage());
//			System.out.println("�̻��Ѱ��� �Է���");
			a = -1;
			System.out.println("�̻��Ѱ� ����ؼ� ����! ");
			return;
		}catch(IllegalStateException e) {
			System.out.println("��ĳ�ʰ� �����ִµ�..");
			a = - 1;
		}catch(NoSuchElementException e) {
			System.out.println("��ĳ�ʿ� ���� �����̾��µ�");
			a = -1;
		}finally {
			System.out.println(" /)/)");
			System.out.println("( ..)");
			System.out.println("(  >a");
		}
		
		System.out.println("�Է��Ͻ� ���ڴ� " + a + "�Դϴ�");
		System.out.println("���α׷� ���� ");
	}
	
}
