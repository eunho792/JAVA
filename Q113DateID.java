

class Main {
  public static void main(String[] args) {
  DateId a = new DateId();
  DateId b = new DateId();
  DateId c = new DateId();

  System.out.println(a.getId());
  System.out.println(b.getId());
  System.out.println(c.getId());
  }
}



import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

	
public class DateId{
	private static int counter;
	private int id;
	
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y =today.get(YEAR);
		int m = today.get(MONTH)+1;
		int d = today.get(DATE);
		System.out.printf("오늘은 %d년%d월 %d일입니다\n",y,m,d);
		counter = y*1000000+m*10000
    +d*100;
	}
	
	
	public DateId() {
		id= ++counter;
	}
	
	public int getId() {
		return id;
	}
}

