package character;

import main.Ninja;

public class GaaraNinja extends Ninja {

		private String SendoSkill;
		// コンストラクタ
		public GaaraNinja(String name, String village, String awakening, int chakra) {
			super(name, village, awakening, chakra);


			this.SendoSkill = "スキル発動✨フェイダーウェイシュート✨";

			}
		public void Skill(){
			System.out.println(this.SendoSkill);
		}

		}


