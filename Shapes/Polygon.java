package Shapes;

public class Polygon extends Shape{
	int nPoints;
	Point[] p;
	
	public Polygon(){
		super();
		type="POLYGON";
	}
	public Polygon(String name, int nPoints, Point[] p){
		super(name);
		type="POLYGON";
		this.nPoints=nPoints;
		this.p=p;
		center = new Point();	//center��ü ��������
		computeCenter();
	}
	public int getNPoints(){	//draw���� ���
		return nPoints;
	}
	public String toString(){
		String points = "";	//point���� ��ǥ�� ��Ÿ���� string
		for(int i=0;i<nPoints;i++){
			points += p[i].toString();
		}
		return super.toString()+" nPoints: "+nPoints+points;
	}
	@Override
	public void computeCenter() {
		center.x=0;	//0���� �ʱⰪ ����
		center.y=0;
		for(int i=0;i<nPoints;i++){
			center.x += p[i].x;	//x��  y�� point�迭 �� ������
			center.y += p[i].y;
		}
		center.x /= nPoints;
		center.y /= nPoints;
	}
	@Override
	public void draw(IKDraw2DList draw2DList) {
		draw2DList.drawPolygon(this);		
	}
	public void move(double x, double y){
		//��� ������ ������ �ش�.
		for(int i=0;i<nPoints;i++){
			p[i].x += x;
			p[i].y += y;			
		}
		//center ����
		computeCenter();
	}
}
