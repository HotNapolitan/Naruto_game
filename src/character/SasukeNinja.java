package character;

import main.Ninja;

public class SasukeNinja extends Ninja {

	private String RukawaSkill;
	// コンストラクタ
	public SasukeNinja(String name, String village, String awakening, int chakra) {
		super(name, village, awakening, chakra);


		this.RukawaSkill = "スキル発動✨ダブルクラッチ✨";

		}
	public void Skill(){
		System.out.println(this.RukawaSkill);
	}



}
