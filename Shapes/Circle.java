package Shapes;

public class Circle extends Shape implements AreaComputable{
	//inclass9
	//변수
	   //type, name, center(x,y)
	   protected double radius;
	   
	//생성자
	   public Circle(){
	      super();
	      this.type = "CIRCLE";
	   }
	   public Circle(String name, double x, double y, double radius){
	      super(name, x, y);
	      this.type = "CIRCLE";
	      this.radius = radius;
	   }
	//메서드
	   public String toString(){	//area추가
	      return super.toString() + " radius:" + this.radius+" area:"+area();
	   }
	//inclass
	@Override
	public void computeCenter() {	//사용안함
		// TODO Auto-generated method stub
		
	}
	@Override
	public void draw(IKDraw2DList draw2DList) {
		draw2DList.drawCircle(this);
		
	}
	@Override
	public double area() {
		return Math.PI*radius*radius;
	}
	public void move(double x, double y){	//override
		//center만 재계산
		center.x += x;
		center.y += y;
	}   
	  
}
