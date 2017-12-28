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
		center = new Point();	//center객체 생성해줌
		computeCenter();
	}
	public int getNPoints(){	//draw에서 사용
		return nPoints;
	}
	public String toString(){
		String points = "";	//point들의 좌표를 나타내는 string
		for(int i=0;i<nPoints;i++){
			points += p[i].toString();
		}
		return super.toString()+" nPoints: "+nPoints+points;
	}
	@Override
	public void computeCenter() {
		center.x=0;	//0으로 초기값 설정
		center.y=0;
		for(int i=0;i<nPoints;i++){
			center.x += p[i].x;	//x와  y에 point배열 합 더해줌
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
		//모든 점들을 움직여 준다.
		for(int i=0;i<nPoints;i++){
			p[i].x += x;
			p[i].y += y;			
		}
		//center 재계산
		computeCenter();
	}
}
