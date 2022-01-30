package Naruto;

public class KakashiNinja extends Ninja {

	private String MituiSkill;
	// コンストラクタ
	KakashiNinja(String name, String village, String awakening, int chakra) {
		super(name, village, awakening, chakra);


		this.MituiSkill = "スキル発動✨バックステップスリー✨";

		}
	public void Skill(){
		System.out.println(this.MituiSkill);
	}

	}