package rectangle;

public class rectangle {
	private float length;
	private float breath;
	private float area;
	public void setLength(float length) {
		this.length = length ;
	}
	public float getLength() {
		return length;
	}
	public void setBreath(float breath) {
		this.breath = breath ;
	}
	public float getBreath() {
		return breath;
	}
	public void setArea() {
		area = length * breath;
	}
	@Override
	public String toString() {
		return "Length : "+length +"\nBreath : "+breath+"\nArea : "+area;
	}
}
