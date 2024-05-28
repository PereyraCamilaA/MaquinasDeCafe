package ar.unlam.edu.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.unlam.edu.src.Empresa;
import ar.unlam.edu.src.MaquinaDeCafeDefectuosa;
import ar.unlam.edu.src.MaquinaDeCafeEconomica;
import ar.unlam.edu.src.MaquinaDeCafePremium;

public class TestMaquinasDeCafe {

		@Test
		public void queLaMaquinaDeCafePremiumSirvaCafe() throws Exception {
	       
			MaquinaDeCafePremium maquina = new MaquinaDeCafePremium(1000.0, 0.0);
			
	        Double valorObtenido = maquina.servirCafe();
	        
	        Double valorEsperadoDeCafeEnGramos = 1000.0 - 10.0;
	        
	        assertEquals(valorObtenido, valorEsperadoDeCafeEnGramos, 0.01);
	        
	        Double valorObtenido2 = maquina.obtenerDineroRecaudado();
	        
	        Double valorEsperado2 = 120.0;
	        
	        assertEquals(valorObtenido2, valorEsperado2, 0.01);
	    }
	
	   @Test
	    public void queLaMaquinaDeCafeEconomicaSeUseSoloDosVeces() throws Exception {
	     
		   MaquinaDeCafeEconomica maquina = new MaquinaDeCafeEconomica(1000.0, 0.0, 2);
	        
	       	Double valorObtenido = maquina.servirCafe();
	       
	       	Double valorEsperadoDeCafeEnGramos = 1000.0;

	        assertEquals(valorObtenido, valorEsperadoDeCafeEnGramos, 0.01);
	        
	        maquina.servirCafe();
	        
	        Double valorObtenido2 = maquina.obtenerDineroRecaudado();
	        
	        Double valorEsperado2 = 240.0;
	        
	        assertEquals(valorObtenido2, valorEsperado2, 0.01);
	    }

	   @Test
	    public void pruebaMaquinaDeCafeDefectuosaVasosAlternados() throws Exception {
	        
		   MaquinaDeCafeDefectuosa maquina = new MaquinaDeCafeDefectuosa(1000.0, 0.0);
		   
		   Double valorEsperado = maquina.servirCafe();
		   
		   Double valorObtenido = 990.0;
		   
		   assertEquals(valorEsperado, valorObtenido, 0.01);

		   maquina.servirCafe();
		   maquina.servirCafe();
		   maquina.servirCafe();

		   Double valorObtenido2 = maquina.obtenerDineroRecaudado();
		   Double valorEsperado2 = 480.0;
		   
		   assertEquals(valorObtenido2, valorEsperado2, 0.01);
		   
		   Double valorEsperado3 = 980.0;
		   
		   assertEquals(valorEsperado3, maquina.getCafeEnGramos()); // Verifica que solo se hayan consumido 20.0 gr de café correspondientes a servir 4 cafés, 2 vacíos y 2 llenos.
	    }
	   
	   	@Test (expected = Exception.class)
	    public void pruebaMaquinaDeCafeDefectuosaExcepcion() throws Exception {
	    	
			   MaquinaDeCafeDefectuosa maquina = new MaquinaDeCafeDefectuosa(1000.0, 0.0);

			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();
			   maquina.servirCafe();	
			   maquina.servirCafe();			   
			   maquina.servirCafe();			   

	   	}
	   	
	   	@Test
	   	public void queSePuedanAgregarLasMaquinasDeCafeAlaEmpresa() {
	   		
	   		Empresa empresaCafe = new Empresa("Cafecito");
	   		
			MaquinaDeCafeDefectuosa maquina = new MaquinaDeCafeDefectuosa(1000.0, 0.0);
			
			MaquinaDeCafeEconomica maquina2 = new MaquinaDeCafeEconomica(1000.0, 0.0, 2);
			
			MaquinaDeCafePremium maquina3 = new MaquinaDeCafePremium(1000.0, 0.0);

	   		
	   		empresaCafe.agregarMaquinaDeCafe(maquina);
	   		empresaCafe.agregarMaquinaDeCafe(maquina2);
	   		empresaCafe.agregarMaquinaDeCafe(maquina3);
	   		
	   		Integer valorObtenido = empresaCafe.getMaquinasDeCafe().size();
	   		
	   		Integer valorEsperado = 3;
	   		
	   		assertEquals(valorObtenido, valorEsperado);	   		
	   		
	   	}
	    		    	
	   @Test
	   public void queSeMuestreLaRecaudacionTotal() throws Exception {
		   
		   	Empresa empresaCafe = new Empresa("Cafecito");
	   		
			MaquinaDeCafeDefectuosa maquina = new MaquinaDeCafeDefectuosa(1000.0, 0.0);
			
			maquina.servirCafe();
			
			empresaCafe.agregarMaquinaDeCafe(maquina);
			
			MaquinaDeCafeEconomica maquina2 = new MaquinaDeCafeEconomica(1000.0, 0.0, 2);
			
			maquina.servirCafe();

			empresaCafe.agregarMaquinaDeCafe(maquina2);
			
			maquina2.servirCafe();

			MaquinaDeCafePremium maquina3 = new MaquinaDeCafePremium(1000.0, 0.0);
	
			maquina2.servirCafe();

			empresaCafe.agregarMaquinaDeCafe(maquina3);
			
			maquina3.servirCafe();
			
			Double valorObtenido = empresaCafe.obtenerRecaudacionTotal();
			 
			Double valorEsperado = 600.0;
			
			assertEquals(valorObtenido, valorEsperado);
	   }
}
