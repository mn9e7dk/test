package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person taro =new Person();
		taro.name="山田太郎";
		taro.age=20;
	
		Person jiro =new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		
		Person hanako =new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		
		
		
		
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		
		
		Robot aibo =new Robot();
		aibo.name="アイボ";
		
		Robot asimo =new Robot();
		asimo.name="アシモ";
		
		Robot pepper =new Robot();
		pepper.name="ペッパー";
		
		
		aibo.talk();
		asimo.walk();
		pepper.run();
	}

}
