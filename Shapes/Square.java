package Shapes;

public class Square extends Shape implements AreaComputable{

	@Override
	public void computeCenter() {
		center.x=0;	//�ʱ�ȭ
		center.y=0;
		center.x = lowLeft.x + width/2;
		center.y = lowLeft.y + width/2;
	}

	@Override
	public void draw(IKDraw2DList draw2DList) {
		draw2DList.drawSquare(this);
	}
	Point lowLeft;	//lower left corner point
	public void setLowleft(double x, double y){
		lowLeft = new Point(x,y);
	}
//	inclass9
	double width;
	public Square(){
	   super();
	   type="SQUARE";
	}
	public Square(String name,double x,double y,double edgelength){
	super(name,x+edgelength/2,y+edgelength/2);	//center���ȴ�.
	this.type="SQUARE";
	this.width=edgelength;
	lowLeft = new Point(x,y);
//	conputeCenter();
	}
	public String toString(){
	    return super.toString()+" lowerleft:"+lowLeft.toString()+" width:"+width+" area:"+area(); 
	}

	@Override
	public double area() {
		double area=0;
		area=width*width;	//protected�̹Ƿ� get���� ��밡��
		return area;
	}
	public void move(double x, double y){	//override
//		lowLeft �ű��
		lowLeft.x+=x;
		lowLeft.y+=y;
//		center ����
		computeCenter();
	}	
	
}
