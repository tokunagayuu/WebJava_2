package jp.co.systena.tigerscave.Work1.application.model;

public class Wizard extends Work{
	private String attack;
	@Override
	public void fight() {
		// TODO 自動生成されたメソッド・スタブ
		attack=super.getName()+"はまほうで攻撃した！";

	}
	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}
}
