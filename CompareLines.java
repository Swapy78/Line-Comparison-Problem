package demo;

public class CompareLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 2;
		int y1 = 2;
		
		int x2 = 7;
		int y2 = 7;
		
		double distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("Length of first line is "+distance1);
		
		int x3 = 3;
		int y3 = 3;
		
		int x4 = 5;
		int y4 = 5;
		
		double distance2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		
		System.out.println("Length of second line is "+distance2);
		
		if(distance1 > distance2) {
			System.out.println("First line is greater than second line");
		}
			else if(distance1 < distance2)
				System.out.println("First line is less than second line");
				else {
					System.out.println("Both lines are equal");
				}
			
		}
		
		
	}
