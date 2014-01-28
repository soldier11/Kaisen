public class Kaisen{
	static String name = "山本五十六"; //名前
	static String ship = "大和";       //艦の名前
	static int lv = 1;                 //艦のレベル
	
	public static void main(String[] args) throws java.io.IOException {
		
		System.out.println(name + "提督" + ship + "にご命令を！！"); //挨拶
		Status();             //最初のメッセージ
		PutCommand();        //選択肢の表示
		Result();            //勝敗の表示
	}
	
	public static void Status(){
		System.out.println("---------------------------");
		System.out.println(" " + name + " " + ship + " LV" + lv + " "); //艦のステータス
		System.out.println("---------------------------");
	}
	
	public static void PutCommand() throws java.io.IOException{
		System.out.println("大和への指令を決定してください。");
		System.out.println("1：出撃");
		System.out.println("2：演習");
		int c = InCommand(); //行動の選択
		
		if(c == '1'){
			System.out.println("敵戦艦が現れた。大和の主砲で攻撃します。");
		}if(c == '2'){
			lv += 1;
			System.out.println("演習により"+ ship +"のレベルが"+ lv +"になった。");
			PutCommand();
		}
	}
	
	public static int InCommand() throws java.io.IOException{
		int c = System.in.read(); 
		if (c == 10 || c == 13){//改行外し
			return(InCommand());
		}else{
		return(c);
		}
	}
	
	public static void Result() throws java.io.IOException {
		if(lv > 20){
			System.out.println("勝利");
		}else{
			System.out.println("負け");			
		}
	}
}
