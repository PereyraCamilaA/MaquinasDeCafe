package ar.unlam.edu.src;

public class MaquinaDeCafeEconomica extends MaquinaDeCafe{

	private Integer usoDeGramosDeCafe; 

    public MaquinaDeCafeEconomica(Double cafeEnGramos, Double dinero, Integer usoDeGramosDeCafe) {
		super(cafeEnGramos, dinero);
		this.usoDeGramosDeCafe = 0;
	}

    @Override
	public Double servirCafe() {
	  if(this.cafeEnGramos >= 10.0 && this.usoDeGramosDeCafe < 3) {
		  this.usoDeGramosDeCafe++;
	      this.dinero += 120.0;
	  } else if(this.usoDeGramosDeCafe == 3){
        this.cafeEnGramos -= 10.0;
        this.usoDeGramosDeCafe = 0;
        this.dinero += 120.0;
	  }
	return cafeEnGramos;
    }
    
}
