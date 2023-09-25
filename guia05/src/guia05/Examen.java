package guia05;

public class Examen {
	private String fecha;
	private String nombreAlumno;
	private int numeroDeLegajo;
	private int nota;

	public Examen(String fecha, String nombreAlumno, int numeroDeLegajo) throws ErrorNumeroDeLegajo {
		this.numeroDeLegajo = this.setNumeroDeLegajo(numeroDeLegajo);
		this.fecha = fecha;
		this.nombreAlumno = nombreAlumno;

	}

	public int setNumeroDeLegajo(int numeroDeLegajo) throws ErrorNumeroDeLegajo {

		if (numeroDeLegajo >= 10000 && numeroDeLegajo <= 15000) {
			this.numeroDeLegajo = numeroDeLegajo;
		} else {
			throw new ErrorNumeroDeLegajo();
		}

		return numeroDeLegajo;

	}

	public int setNota(int nota) throws ErrorNotaInvalida {

		if (nota >= 1 && nota <= 10) {
			this.nota = nota;
		} else {
			throw new ErrorNotaInvalida();
		}
		return nota;

	}

	public String setFecha(String fecha) {
		this.fecha = fecha;
		return fecha;
	}

	public String setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
		return nombreAlumno;
	}
	
	@Override
	public String toString() {
		return "Examen [fecha=" + fecha + ", nombreAlumno=" + nombreAlumno + ", numeroDeLegajo=" + numeroDeLegajo
				+ ", nota=" + nota + "]";
	}
	
	

}
