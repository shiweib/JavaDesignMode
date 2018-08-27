package com.gg.component.stage1;

public class TestView {
 
	public static void main(String[] args) {
		String name = "小菜";
		Person person = new Person(name);
		TShirts tShirts = new TShirts(name,person);
		BigTrouser bigTrouser = new BigTrouser(name,person);
		tShirts.show();
		bigTrouser.show();
		person.Show();
	}
}
