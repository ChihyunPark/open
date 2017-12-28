package Shapes;

public class Point {
	
//	inclass9
	protected double x;
	protected double y;
	public Point(){}
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}
