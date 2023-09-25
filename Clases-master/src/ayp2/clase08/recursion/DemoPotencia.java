package ayp2.clase08.recursion;


public class DemoPotencia {
	public static void main(String[] args) {
		Potencia p = new Potencia();
		double resultado_v1, resultado_v2;
		Timer t = new Timer();
		double t1, t2;
		
		t.start();
		resultado_v1 = p.potencia_v1(1.0, 10000000);
		t.end();
		t1 = t.getTotalTime();
		
		t.start();
		resultado_v2 = p.potencia_v2(1.0, 10000000);
		t.end();
		t2 = t.getTotalTime();
		System.out.println("Resultado 1: "+ resultado_v1 + "\t"+t1);
		System.out.println("Resultado 2: "+ resultado_v2 + "\t"+t2);
		
		
	}

}
