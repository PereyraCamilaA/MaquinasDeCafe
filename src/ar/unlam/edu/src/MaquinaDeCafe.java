package ar.unlam.edu.src;

public abstract class MaquinaDeCafe {
	
	protected Double cafeEnGramos; 
    protected Double dinero;
    
	public MaquinaDeCafe(Double cafeEnGramos, Double dinero) {
		this.cafeEnGramos = 1000.0;
		this.dinero = 0.0;
	}
	
	public abstract Double servirCafe() throws Exception; 
	
	public Double obtenerDineroRecaudado() {
        return this.dinero;
	}

	public Double getCafeEnGramos() {
		return cafeEnGramos;
	}

	public void setCafeEnGramos(Double cafeEnGramos) {
		this.cafeEnGramos = cafeEnGramos;
	}

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}
	
}
