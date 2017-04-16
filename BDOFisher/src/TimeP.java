
public class TimeP {
	long time = 0;
	
TimeP(){
	time = System.nanoTime();
}

public long elapsed(){
	long e = (System.nanoTime()-time)/1000000000;
	return e;
}

public void reset(){
	time = System.nanoTime();
}
}
