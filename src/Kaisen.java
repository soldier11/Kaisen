public class Kaisen{
	static String name = "山本五十六"; //名前
	static String ship = "大和";       //艦の名前
	static int lv = 1;                 //艦のレベル
	
	public static void main(String[] args) throws java.io.IOException {
		
		Greet();      //最初のメッセージ
		PutCommand(); //選択肢の表示
		InCommand();  //行動の選択
		
	}
	
	public static void Greet(){
		System.out.println(name + "提督" + ship + "にご命令を！！"); //挨拶	
		System.out.println(ship + "のLVは" + lv + "です。"); //艦のステータス
	}
	
	public static void PutCommand(){
		System.out.println("行動を決定してください");
		System.out.println("1：出撃");
		System.out.println("2：演習");
	}
	
	public static void InCommand() throws java.io.IOException {
		int c = System.in.read(); 
		System.out.println("入力されたキー番号は" + c + "です。");
		
		//改行外し
		if (c == 10 || c == 13){
			System.out.println("改行は入力できません");
			InCommand();
		}
		
		if(c == '1'){
			System.out.println("あなたの船は破壊されました");
		}if(c == '2'){
			System.out.println("あなたの船は被害を免れました");
		}else{
		}
	}	
}
