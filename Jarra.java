public class Jarra {
	//variables de instancia 
	private int cantidad; 
	private int capacidad; 
	public Jarra(int capacidadInicial){ 
		if(capacidadInicial<=0){ 
			throw new RuntimeException("ERROR: no se pueden crear jarras � + "con capacidad menor o igual que cero.");

		}
		this.capacidad=capacidadInicial;
	}
//  Aqu� vendr�n despu�s los m�todos creados en la siguiente fase 
	public void metodoComunitario(){ 
		// Comentario incluido para pruebas 
		System.out.println("Aqui escribimos todos"); 
	}
<<<<<<< HEAD
}

public void llenaDesde(Jarra j){
	while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
		this.cantidad++;
		j.cantidad--;
	}
}
public String toString(){
	return ("("+this.capacidad+","+this.cantidad+")");
=======
	public bool llena(){ return this.cantidad=this.capacidad; } 
	public bool vacia(){ return this.cantidad=0; }
>>>>>>> a4172629791fa97316664e6437e6ef214e86ab51
}