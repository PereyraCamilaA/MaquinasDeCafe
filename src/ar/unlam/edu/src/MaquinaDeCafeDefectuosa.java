package ar.unlam.edu.src;

public class MaquinaDeCafeDefectuosa extends MaquinaDeCafePremium {

	public MaquinaDeCafeDefectuosa(Double cafeEnGramos, Double dinero) {
		super(cafeEnGramos, dinero);
	}

	private Integer contadorVasos = 0;
    private Integer contadorVasosVacios = 0;

    @Override
    public Double servirCafe() throws Exception {
        if (contadorVasosVacios >= 10) {
            throw new Exception("Máquina defectuosa, debe ser reemplazada");
        }

        contadorVasos++;

        if (contadorVasos % 2 == 0) {
            return 0.0; 
        } else {
            contadorVasosVacios++;
            this.dinero += 120; 
            return super.servirCafe();
        }
    }
}
