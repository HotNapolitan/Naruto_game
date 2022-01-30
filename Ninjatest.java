package Naruto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ninjatest {

	public static void main(String[] args) {
		System.out.println("忍びの戦いが今始まる");

		NarutoNinja Naruto = new NarutoNinja("うずまきナルト", "木の葉", "尾獣化!!",(int) (Math.random() * 100));

		SasukeNinja Sasuke = new SasukeNinja("うちはサスケ", "木の葉", "写輪眼!!",(int) (Math.random() * 100));

		GaaraNinja Gaara = new GaaraNinja("我愛羅", "砂隠れ", "尾獣化",(int) (Math.random() * 100));

		KakashiNinja Kakashi = new KakashiNinja("はたけカカシ", "木の葉","写輪眼", (int) (Math.random() * 100));

		Ninja Madara = new Ninja("うちはマダラ", "抜け忍", "六道仙人モード", (int) (Math.random() * 100));

		HashMap<Integer, Ninja> map = new HashMap<Integer, Ninja>();

		while (map.size() != 2) {

			System.out.println("1:うずまきナルト 2:うちはサスケ 3:我愛羅 4:はたけカカシ  5:うちはマダラ");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			int order = 0;
			if (CheckUtil.inputcheck(input, true)) {
				order = Integer.parseInt(input);
			}

			switch (order) {
			case 1:
				Naruto.Summary();
				Naruto.Skill();
				map.put(order, Naruto);
				break;
			case 2:
				Sasuke.Summary();
				Sasuke.Skill();
				map.put(order, Sasuke);
				break;
			case 3:
				Gaara.Summary();
				Gaara.Skill();
				map.put(order, Gaara);
				break;
			case 4:
				Kakashi.Summary();
				Kakashi.Skill();
				map.put(order, Kakashi);
				break;
			case 5:
				Madara.Summary();
				map.put(order, Madara);
				break;

			default:
				System.out.println("忍びから選んでください");

			}

		}
		System.out.println("勝負開始!!!");

		// 配列にScannerで選んだ数字が入っている
		Ninja[] ninjaArray = new Ninja[2];
		int i = 0;
		for (Map.Entry<Integer, Ninja> bb : map.entrySet()) {
			ninjaArray[i] = bb.getValue();
			i++;
		}
		
		
		

		if (ninjaArray[0].getChakra() < ninjaArray[1].getChakra()) {
			System.out.println(ninjaArray[1].getName() + "の勝ち");
			System.out.println(ninjaArray[0].getName() + "、また俺の勝ちだ");
		} else if (ninjaArray[1].getChakra() < ninjaArray[0].getChakra()) {
			System.out.println(ninjaArray[0].getName() + "の勝ち");
			System.out.println(ninjaArray[1].getName() + "、また俺の勝ちだ");
		} else {
			System.out.println("引き分けだ！またやろう");
		}

	}

}