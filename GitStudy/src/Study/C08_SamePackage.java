package Study;

public class C08_SamePackage {
	
	
	// 접근제어자가 메뉴얼 역활을해준다 
	// 원하는값만 바꿀수 있게끔 한다 
	public int   public_var = 1;
	int  default_var = 2;
	protected int protected_var = 3;
	private int   private_var = 4;
	
	public void public_method() {
		System.out.println(public_var);
		System.out.println(default_var);
		System.out.println(protected_var);
		System.out.println(private_var);
	}
	
	void default_method() {}
	protected  void protected_method() {}
	private void private_method() {}
}
