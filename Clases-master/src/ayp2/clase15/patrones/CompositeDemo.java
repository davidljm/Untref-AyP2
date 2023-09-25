package ayp2.clase15.patrones;

public class CompositeDemo {
	

	public static void main(String[] args){
		Directory one = new Directory("dir111"),
		          two = new Directory("dir222"),
		          thr = new Directory("dir333");
		
		File a = new File("archivoA"), 
			 b = new File("archivoB"),
			 c = new File("archivoC"), 
			 d = new File("archivoD"), 
			 e = new File("archivoE");
		
		one.add(a);
		one.add(two);
		one.add(b);
		two.add(c);
		two.add(d);
		two.add(thr);
		thr.add(e);
		one.ls();
		}


}
