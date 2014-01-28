import java.io.IOException;

public class Kaisen{
	static String name = "山本五十六";//名前
	
	public static void main(String[] args) throws IOException{
		System.out.println(name +"提督ご決断を！！");	
			}
	
	public static void Command() throws IOException{
		Command();
		System.out.println("停船場所を決定してください");
		System.out.println("1：港内");
		System.out.println("2：内湾（港外）");
		
		public static void InputCommand(){
			int a = System.in.read();
			System.out.printf("a=%dが押されています",a);
		
			switch(a){
				case '1' : System.out.println("あなたの船は破壊されました"); Command();
				case '2' : System.out.println("あなたの船は被害を免れた");   Command();
			}
		}
	}
}
