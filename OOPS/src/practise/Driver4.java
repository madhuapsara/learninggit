package practise;

public class Driver4 {
	public static void main(String[] args) {
	N c1=new N();
	M b1=new M();
	b1=c1;
	//System.out.println(b1.c); 
	N c2=(N)b1;
	System.out.println(c2.c);
	L a1=c1;
	//System.out.println(a1.c);
	N c3=(N)a1;
	System.out.println(c3.c);
	}

	
	
		
	}


