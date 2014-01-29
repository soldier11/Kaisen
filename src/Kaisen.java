public class Kaisen{
	static String name = "山本五十六"; //名前
	static String ship = "大和";       //艦の名前
	static int lv = 1;                 //艦のレベル
	
	public static void main(String[] args) throws java.io.IOException {
		
		put(name + " 提督。" + ship + "にご命令を！！"); //最初のメッセージ
		status();            //艦のステータス 
		putCommand();        //選択肢の表示
		
		 //勝敗の表示
		if(lv > 6){
			put("勝利");
		}else{
			put("負け");
		}
	}
	
	public static void status(){
		put("---------------------------");
		put(" " + name + " " + ship + " LV" + lv + " "); //艦のステータス
		put("---------------------------");
	}
				
	 public static void putCommand() throws java.io.IOException{
		int c;
		do {
	        System.out.println("大和への指令を決定してください。");
	        System.out.println("1：出撃");
	        System.out.println("2：演習");
	        c = inCommand();
	        if (c == '1') {
	            System.out.println("敵戦艦が現れた。大和の主砲で攻撃します。");
	        } else if (c == '2') {
	        	lv += 1;
	            System.out.println("演習により" + ship + "のレベルが" + lv + "になった。");
	        }
        } while (c == '2');
	}
	
	public static int inCommand() throws java.io.IOException{
		int c;
		do {
			c = System.in.read(); 		
		}while(c == 10 || c == 13);	
		return(c);
	}
	
	public static void put(String str){
		System.out.println(str);
	}
	
}
