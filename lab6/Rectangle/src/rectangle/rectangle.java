package rectangle;

public class rectangle {
	int width, length, startX, startY;
	public rectangle() {
		width = 0;
		length = 0;		
		startX = 0;
		startY = 0;
	}
	public rectangle(int a, int b, int x, int y) {
		width = a;
		length = b;
		startX = x;
		startY = y;
	}
	public int area() {
		return width*length;
	}
	public String toString(){
		StringBuilder S = new StringBuilder();

		S.append("width:" + width);

		S.append("length:" + length);

		S.append("X:" + startX);

		S.append("Y:" + startY);
		return S.toString();
	}
	public boolean isInside(int x, int y) {
		int x1 = startX , y1 = startY , x2 = x1 + width , y2 = y1 + length;
		if (x > x1 && x < x2 && y > y1 && y < y2)
			return true;
		    return false;
	}
	public void setSize(int a,int b){
		width = a;
	    length = b;
	}
	public void setPosition(int x, int y) {
		startX = x;
		startY = y;
	}
}
