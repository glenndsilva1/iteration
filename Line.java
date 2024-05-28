 package iteration;

public class Line {
	private int v;
	private Multiply mul;
	
	public Line(int m) {
		this(new Multiply(m));
	}
	
	public Line(Multiply mul) {
		this.mul = mul;
	}
	
	boolean next(){
	    boolean n = true;
	    if(v < 10){
	      ++v;
	    }else{
	      n = false;
	    }
	    return n;
	  }
	
	public int value(){
		return this.mul.value(this.v);
	}
	
	public static void main(String args[]) {
		Line line = new Line(8);
		while(line.next()){
			System.out.println(line.value());
		}
	}
}
