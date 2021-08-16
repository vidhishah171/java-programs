package Abstract;

public interface ParentInterface {
	int x=5;
	void a();
	void b();
	void draw();
	static void cube(int n)
	{
		System.out.println("Cube is: "+n*n*n);
	}
}

/* public interface Serializable{}  Marker or tagged interface  */
