package exception_handling;

class Sample {
	
	
    public void show() throws Exception {
        String s = null;
        throw new NullPointerException("Null Value");
    }
}

public class Throws {
	
    public static void main(String[] args) throws Exception {
        Sample s = new Sample();
        s.show();
    }
}