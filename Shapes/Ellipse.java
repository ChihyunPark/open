package Shapes;

public class Ellipse extends Circle{

	//inclass9
	//변수
	   //type, name, center(x,y), radius
	   protected double radius2;
	//생성자
	   public Ellipse(){
	      super();
	      this.type = "ELLIPSE";
	   }
	   public Ellipse(String name, double x, double y, double radius, double radius2){
	      super(name, x, y, radius);
	      this.type = "ELLIPSE";
	      this.radius2 = radius2;
	   }   
	//메서드
	   public String toString(){	//are추가
	      return super.toString() + " radius2:" + this.radius2;
	   }
	   
	   public double area(){	//override
		   return Math.PI*radius*radius2;
	   }
	   public void draw(IKDraw2DList draw2DList){	//override
		   draw2DList.drawEllipse(this);
	   }
}
