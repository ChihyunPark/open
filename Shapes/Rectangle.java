package Shapes;

public class Rectangle extends Square{
	
//	inclass9
	double height;	   
	public Rectangle(){
		super();
		type="RECTANGLE";
	}
	public Rectangle(String name,double x, double y, double width, double height){
		super(name,x ,y,width);
		this.type="RECTANGLE";
		this.name=name;
		this.height=height;
//		this.center.y = y+height/2;
		lowLeft = new Point(x,y);	//set �Լ� ���� �ȸ����.
		computeCenter();	//Ȱ��
	}
	public void computeCenter(){
		center.x = lowLeft.x + width/2;
		center.y = lowLeft.y + height/2;
	}   
	public String toString(){
	    return super.toString()+" height:"+height;
	}
//inclass
	public double area(){
		return height*width;
	}
	@Override
	public void draw(IKDraw2DList draw2DList) {
		draw2DList.drawRectangle(this);		
	}
}
