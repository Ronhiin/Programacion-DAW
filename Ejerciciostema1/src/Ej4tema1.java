
public class Ej4tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean X,Y,Z;
		X=true;
		Y=true;
		Z=false;
		System.out.println((X && Y) || (X && Z));
		System.out.println((X || !Y)&& (!X || Z));
		System.out.println(X || Y && Z);
		System.out.println( !(X || Y) && Z );
		System.out.println( X || Y || X && !Z && !Y);
		System.out.println( !X || !Y || Z && X && !Y);
	}

}
