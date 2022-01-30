package Naruto;

public class NarutoNinja extends Ninja {

	private String NarutoNinjutsu;
	// コンストラクタ
	NarutoNinja(String name, String village, String awakening, int chakra) {
		super(name, village, awakening, chakra);

		this.NarutoNinjutsu = "◍◍◍螺旋丸◍◍◍";

		}
	public void Skill(){
		System.out.println(this.NarutoNinjutsu);
	}

	}




