package demo;

public class Line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 2;
		int y1 = 2;
		
		int x2 = 7;
		int y2 = 7;
		
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("Length of line is "+distance);
	}

}
