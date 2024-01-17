package result06;

import java.util.ArrayList;
import java.util.Scanner;





public class Cafe {
	
	private String name;
	private ArrayList<Coffee> menuList = new ArrayList<Coffee>();
	/**
	 * 
	 */
	public Cafe() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param menuList
	 */
	public Cafe(String name) {
		super();
		this.name = name;
		
	}
	public Cafe(String name, ArrayList<Coffee> menuList) {
		super();
		this.name = name;
		this.menuList = menuList;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Coffee> getMenuList() {
		return menuList;
	}
	public void setMenuList(ArrayList<Coffee> menuList) {
		this.menuList = menuList;
	}
	@Override
	public String toString() {
		return "Cafe [name=" + name + ", menuList=" + menuList + "]";
	}
	
	public void showMenu() {
		for(int i = 0; i < menuList.size(); i++) {
			if (menuList.get(i) != null) {
				System.out.println((i+1)+". " + menuList.get(i));	
			}
			
		}
	}
	
	public void addCoffee(Coffee cf) {

		menuList.add(cf);
	
		
	}
	
	public void buyCoffee(Scanner scan) {
		int select = Integer.parseInt(scan.nextLine());
		
		if(select == 1) {
			System.out.println(menuList.get(select-1).getName() + "를 "
					+ menuList.get(select-1).getPrice() + "원에 구매했습니다." ); 
		}
		else if(select == 2) {
			System.out.println(menuList.get(select-1).getName() + "를 "
					+ menuList.get(select-1).getPrice() + "원에 구매했습니다." ); 
		}
		else if(select == 3) {
			System.out.println(menuList.get(select-1).getName() + "를 "
					+ menuList.get(select-1).getPrice() + "원에 구매했습니다." ); 
		}
		
	}
		
}
