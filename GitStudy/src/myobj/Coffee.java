package myobj;

public class Coffee {
	
	private static class CoffeeCode{
		int code;
		String name;
		
		private CoffeeCode(int code , String name) {
			this.code = code;
			this.name = name;
		}
		
		public int getCode() {
			return code;
		}
		
		public String getName() {
			return name;
		}
	}
	
	
	private static class OrignCode{
		int code;
		String name;
		
		private OrignCode(int code , String name) {
			this.code = code;
			this.name = name;
		}
	}
	
//	private static String[] origin_names = {"�ݷҺ��","�����","��Ƽ���Ǿ�","�ɳ�","�ε�"};
//	private static String[] coffee_names = {"�Ƹ޸�ī��","ī���","ī���ī","ī��Ḷ���߶�"};

	public final static CoffeeCode AMERICANO = new CoffeeCode(0,"�Ƹ޸�ī��");
	public final static CoffeeCode CAFE_LATTE = new CoffeeCode(1,"ī���");
	public final static CoffeeCode CAFE_MOCHA = new CoffeeCode(2,"ī���ī");
	
	public final static OrignCode COLUMBIA = new OrignCode(0,"�ݷҺ��");
	public final static OrignCode BRAZIL =    new OrignCode(1,"�����");
	public final static OrignCode ETHIOPIA = new OrignCode(2,"��Ƽ���Ǿ�");
	

	CoffeeCode coffee;
	int price;
	int caffeine;
	OrignCode orign;
	
	boolean hot;
	
	public Coffee(CoffeeCode coffee , int price, int caffeine , OrignCode origin) {
		this.coffee = coffee ;
		this.price = price;
		this.caffeine = caffeine;
		this.orign = origin;
		this.hot = true;
	}
	
	// CoffeeCode
	public String getCoffeeName( ) {
		return coffee.name;
	}
	
	//OrignCode
	public String getOriginName() {
		return orign.name;
	}
	
	public static void main(String[] args) {
		Coffee coffee1 = new Coffee(Coffee.AMERICANO,1500,10,Coffee.COLUMBIA);
		Coffee coffee2 = new Coffee(Coffee.CAFE_LATTE,1500,15,Coffee.BRAZIL);
		Coffee coffee3 = new Coffee(Coffee.CAFE_MOCHA,1500,22,Coffee.ETHIOPIA);
		Coffee coffee4 = new Coffee(Coffee.CAFE_MOCHA,1500,22,Coffee.BRAZIL);
		
		System.out.println(coffee1.getCoffeeName());
		System.out.println(coffee2.getCoffeeName());
		System.out.println(coffee2.getOriginName());
		System.out.println(coffee3.getOriginName());
		
		
		
	}
}

