
public class HelloWorld {

	public static void main(String[] args) {
		// Hello World! の出力
		System.out.println("Hello World!");
		System.out.println("こんにちは！！");
		System.out.println(123);
		System.out.println("例外が\r\n発生しました。");

		char char1='A';
		System.out.println(char1);

		int a=10/3;
		System.out.println(a);
		float b=(float)10/3;
		System.out.println(b);
		float c=10/3;
		System.out.println(c);


		int d= 10;
		System.out.println(++d);
		System.out.println(++d);
		System.out.println(++d);
		System.out.println(++d);
		System.out.println(d);
		System.out.println(d);
		System.out.println(d++);
		System.out.println(d++);


		int e=5;

		if(e<10 && 3<e){
			System.out.println("A");
		}
			else{
				System.out.println("B");
		}
		
		
		String f="赤";
		switch(f){
		case "赤":
			System.out.println("赤組です");
			break;
		case "白":
			System.out.println("白組です");
			break;
		default:
			System.out.println("その他");
		}
		
		char[] eigo={'x','y','z'};
				System.out.println(eigo[0]);
				
				
				
	String[][] country =
		{
				{"東京","埼玉"},
				{"大阪","京都"},
				{"福岡","熊本"}
		};
	
	System.out.println(country[2]);
	
	
	for (int g =1; g<=10; g++){
		System.out.println("★");
	}
	
	int h =3;
		String i = h%2==0?"偶数":"奇数";
		System.out.println(i);
	
	
	int j =1;
		while(j <=10){
			System.out.println(j);
			j+=3;
		}
	
	int k =10;
	do{
		System.out.println(k);
		k+=2;
	}while(k<=20);
	
	
	}
}

