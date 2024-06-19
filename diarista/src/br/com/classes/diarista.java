package br.com.classes;


//A palavra extends me permite herdar atributos e metodos de uma classe 
public class diarista extends Pessoa{
	private String pix;
	
	
public String getPix() {
		return pix;
	}


	public void setPix(String pix) {
		this.pix = pix;
	}


	public void servico(String nomeCliente) {
		
		System.out.println("Esta fazendo um serviço para: " + nomeCliente);

	}


		@Override
		public void sacar(double valor) {

			var saldoDisponivel = getSaldo();
			var novoSaldo = saldoDisponivel - valor;
			setSaldo(novoSaldo);
			
			
		}


		@Override
		public void depositar(double valor) {
			
			var saldoDisponivel = getSaldo();
			var novoSaldo = saldoDisponivel + valor;
			setSaldo(novoSaldo);
			
			
		}
}

