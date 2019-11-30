package jp.co.systena.tigerscave.Work1.application.model;

public abstract class Work {
	private String name;

	public abstract void fight();

	public abstract void recovery();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
