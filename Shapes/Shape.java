package Shapes;


public abstract class Shape implements Movable{
	public abstract void computeCenter();
	public abstract void draw(IKDraw2DList draw2DList);
	
	protected String type;
	protected String name;
	protected Point center;
	
	//inclass9
	public Shape(){}
	public Shape(String name){this.name=name;}
	public Shape(String name, double x, double y){
		this.name = name;
		center = new Point(x,y);
	}
	public String toString(){
		return type+" ("+name+") "+"center:"+center;
	}
	public void move(double x, double y){	//override
		center.x += x;
		center.y += y;
	}
}
