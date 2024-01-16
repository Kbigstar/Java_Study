package ch10_extends_interface.account;

public class Account {
	// 계좌번호, 이름, 잔액
	private String bankNumber;
	private String name;
	private int money;
	/**
	 * 
	 */
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param bankNumber
	 * @param name
	 * @param money
	 */
	public Account(String bankNumber, String name, int money) {
		super();
		this.bankNumber = bankNumber;
		this.name = name;
		this.money = money;
		System.out.println("결과 : 계좌가 생성 되었습니다!");
	}
	public String getBankNumber() {
		return bankNumber;
	}
	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return (bankNumber + "\t" + name + "\t" + money);
	}
	
	public void afterMoney(int money) {
		setMoney(this.money -= money); 
	}
	
	public void insertMoney(int money) {
		setMoney(this.money+= money); 
	}
	

}
