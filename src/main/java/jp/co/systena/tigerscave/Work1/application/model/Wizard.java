package jp.co.systena.tigerscave.Work1.application.model;

public class Wizard extends Work{
	private String attack;
	private String cure;
	@Override
	public void fight() {
		attack=super.getName()+"はまほうで攻撃した！";

	}
	public void recovery() {
		cure=super.getName()+"はまほうで回復した！";

	}
	public String getCure() {
		return cure;
	}
	public void setCure(String cure) {
		this.cure = cure;
	}

	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}
}
