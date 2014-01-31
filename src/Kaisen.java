import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kaisen {
	static String name = "山本五十六"; // 名前
	static String ship = "大和"; // 艦の名前
	static int lv = 1; // 艦のレベル

	public static void main(String[] args) throws java.io.IOException {
		put(name + " 提督。" + ship + "にご命令を！！"); // 最初のメッセージ
		putCommand(); // 選択肢の表示

		// 勝敗の表示
		if (lv > 6) {
			put("勝利");
		} else {
			put("負け");
		}
	}

	public static void status() {
		put("---------------------------");
		put(" " + name + " " + ship + " LV" + lv + " "); // 艦のステータス
		put("---------------------------");
	}

	public static void putCommand() throws java.io.IOException {
		int c;
		do {
			status(); // 艦のステータス
			put("大和への指令を決定してください。");
			put("1：出撃");
			put("2：演習");
			put("3；提督名の変更");
			c = inCommand();
			if (c == '1') {
				System.out.println("敵戦艦が現れた。大和の主砲で攻撃します。");
			} else if (c == '2') {
				lv += 1;
				System.out.println("演習により" + ship + "のレベルが" + lv + "になった。");
			} else if (c == '3') {
				put("変更後の名前を入力してください。");
				String name = inCommand02(); // 再定義して戻った時のstatus等で繰り返し使いたい・・・
				put("名前を間違えてごめんなさい" + name + "提督。");
			} else {
				put("正しい値を入力してください");
			}
		} while (c != '1');
	}

	public static int inCommand() throws java.io.IOException {
		int c;
		do {
			c = System.in.read();
		} while (c == 10 || c == 13);
		return (c);
	}

	public static void put(String str) {
		System.out.println(str);
	}

	public static String inCommand02() throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ("".equals((line = in.readLine()))) {
			System.out.println("何かを入力してください");
		}
		System.out.println("入力文字列: " + line);
		return (line);
	}
}
