package Shapes;

public class RightTriangle extends Triangle{

//	inclass9
    int rightAngleIndex;
    public RightTriangle() {
    super();
    type="R-TRIANGLE";
}   
 
    public RightTriangle(String name, double x1, double y1, double x2, double y2, double x3, double y3) {
    	super(name,x1,y1,x2,y2,x3,y3);
	    if ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)> (x1-x3)*(x1-x3) + (y1-y3)*(y1-y3)) {	//빗변을 이루지 않는 꼭지점이 index
	       if ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)> (x2-x3)*(x2-x3) + (y3-y2)*(y3-y2)) {
	          this.rightAngleIndex=2;
	       } else {
	          this.rightAngleIndex=0;
	       }
	    } else {
	       if ((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3)> (x2-x3)*(x2-x3) + (y3-y2)*(y3-y2)) {
	          this.rightAngleIndex=1;
	       } else {
	          this.rightAngleIndex=0;
	       }
	    }
	    
	    type = "R-TRIANGLE";
	    p[0] = new Point(x1, y1);
	    p[1] = new Point(x2, y2);
	    p[2] = new Point(x3, y3);
	}
    public String toString() {	//area추가
	    String result = super.toString()+" right angle index:"+ this.rightAngleIndex;
	    return result;
    }
	@Override
	public void draw(IKDraw2DList draw2DList) {
		draw2DList.drawRightTriangle(this);
		
	}
}
