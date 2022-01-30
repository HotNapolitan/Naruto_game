package Naruto;

public class Ninja {

	// 名前 = キャラクター名
	private String name;

	// 種族 = 種里
	private String village;

	// 覚醒状態
	private String awakening;

	// チャクラの量 戦闘力
	private int chakra;

	// コンストラクタ
	Ninja(String name, String village, String awakening, int chakra) {

		this.name = name;
		this.village = village;
		this.awakening = awakening;
		this.chakra = (int) (Math.random() * 100);
	}

	// 忍びの里を決める
	public void dispVillage() {
		System.out.println(this.village + "の里の忍びだ！");

	}

	// キャラクター名を入力
	public void dispName() {
		System.out.println(this.name + "だ！");
	}

	public void dispAwakening() {
		System.out.println(this.awakening);
	}

	public String getAwakening() {
		return awakening;
	}

	public void setAwakening(String awakening) {
		this.awakening = awakening;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void chakra() {
		System.out.println("チャクラの量" + this.getChakra());
	}

	public int getChakra() {
		return chakra;
	}

	// まとめている
	public void Summary() {
		this.dispName();
		this.dispVillage();
		this.dispAwakening();
		this.chakra();
		
	}

}
