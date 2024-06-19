package br.com.classes;

public class atendimento {
	
	private int horas;
	
	//Criando metodo acessor Set, nesse metodo posso passar as minhas regras de negocio
	public void setHoras(int horas) {
		
		if(horas < 1 || horas > 12) {
			
			System.out.println("A quantidade de horas de um atendimento não pode ser menor que 1 e nem maior que 12 horas");
		}
		else {
			this.horas= horas; 
		}
	}
	
	// O metodo get não usa void pois uso somente para "pegar" uma informação;
	public int getHoras() {
		return horas; 
	}
}
