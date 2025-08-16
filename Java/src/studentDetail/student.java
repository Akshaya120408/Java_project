package studentDetail;

public class student {
	private String name;
	private float Mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return Mark;
	}
	public void setMark(float mark) {
		Mark = mark;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", Mark=" + Mark + "]";
	}
	
}
