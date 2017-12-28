package Shapes;

public class Triangle extends Shape implements AreaComputable{

//	inclass9
	   protected Point[] p = new Point[3];	   
	   public Triangle() {
	      super();
	      type = "TRIANGLE";
	   }   
	   public Triangle(String name, double x1, double y1, double x2, double y2, double x3, double y3) {
	      super(name, (x1+x2+x3)/3 , (y1+y2+y3)/3 );	//computeCenter필요 없음
	      type = "TRIANGLE";
	      p[0] = new Point(x1, y1);
	      p[1] = new Point(x2, y2);
	      p[2] = new Point(x3, y3);   
	   }
	   public String toString() {	//area 추가한다.
	      String result = super.toString() + " vertex coord.:" +p[0]+p[1]+ p[2]+" area:"+area();
	      return result;
	   }
//	inclass end
	   
	@Override
	public void computeCenter() {
		center.x=0;	//초기화
		center.y=0;
		center.x = (p[0].x+p[1].x+p[2].x)/3;
		center.y = (p[0].y+p[1].y+p[2].y)/3;
	}

	@Override
	public void draw(IKDraw2DList draw2DList) {
		draw2DList.drawTriangle(this);
	}
	@Override
	public double area() {
		// Heron's formula
		double a = Math.sqrt((p[0].x-p[1].x)*(p[0].x-p[1].x)+(p[0].y-p[1].y)*(p[0].y-p[1].y));	//edge length
		double b = Math.sqrt((p[1].x-p[2].x)*(p[1].x-p[2].x)+(p[1].y-p[2].y)*(p[1].y-p[2].y));
		double c = Math.sqrt((p[2].x-p[0].x)*(p[2].x-p[0].x)+(p[2].y-p[0].y)*(p[2].y-p[0].y));
		double s = (a+b+c)/2;
		double areasquare = s*(s-a)*(s-b)*(s-c);
		return Math.sqrt(areasquare);
	}
	public void move(double x, double y){	//override
		//점들 옮긴다
		for(int i=0;i<3;i++){
			p[i].x += x;
			p[i].y += y;
		}
		//center옮긴다
		computeCenter();		
	}
}
