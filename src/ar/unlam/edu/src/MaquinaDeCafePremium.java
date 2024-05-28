package ar.unlam.edu.src;

public class MaquinaDeCafePremium extends MaquinaDeCafe{

	public MaquinaDeCafePremium(Double cafeEnGramos, Double dinero) {
		super(cafeEnGramos, dinero);
	}
    
	@Override
    	public Double servirCafe() throws Exception{
    		if(this.cafeEnGramos>=10) {
    			this.cafeEnGramos -= 10.0;
    			this.dinero += 120.0;
    	}
			return cafeEnGramos;
    	}


}

