package jp.co.systena.tigerscave.Work1.application.model;

public class Warrior extends Work{
	private String attack;
	private String cure;
	@Override
	public void fight() {
		attack=super.getName()+"は拳で攻撃した！";

	}
	public void recovery() {
		cure=super.getName()+"はやくそうで回復した！";

	}
	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}

	public String getCure() {
		return cure;
	}
	public void setCure(String cure) {
		this.cure = cure;
	}
}
