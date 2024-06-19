package br.com.app;

import br.com.classes.diarista;
import br.com.classes.Cliente;
import br.com.classes.atendimento;

import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in); {
	diarista diarista = new diarista();
	Cliente cliente = new Cliente ();
	atendimento atendimento = new atendimento();
	

//Cliente
	System.out.println("Digite o nome da Cliente: ");
	cliente.setNome(scanner.nextLine());
	System.out.println("Digite o telefone do Cliente: ");
	cliente.setTelefone(scanner.nextLine());
	System.out.println("Digite o endereco do Cliente: ");
	cliente.setEndereco(scanner.nextLine());
	//cliente.setSaldo(100.30);
	System.out.println("Digite o saldo do cliente: ");
	cliente.depositar(scanner.nextDouble());
	scanner.nextLine();
	
//Diarista
	System.out.println("Digite o nome da Diarista: ");
	diarista.setNome(scanner.nextLine());
	System.out.println("Digite o telefone da Diarista: ");
	diarista.setTelefone(scanner.nextLine());
	System.out.println("Digite o endereco da Diarista: ");
	diarista.setEndereco(scanner.nextLine());
	System.out.println("Digite o seu pix da Diarista: ");
	diarista.setPix(scanner.nextLine());
	System.out.println("Insira a quantidade de horas trabalhadas: ");
	atendimento.setHoras(scanner.nextInt());
	System.out.println("Digite o saldo da diarista: ");
	diarista.depositar(scanner.nextDouble());
	

	System.out.println("------------------------------\n");
	System.out.println("------------------------------\n");

//Cliente
	System.out.println("Nome do Cliente: "+cliente.getNome());
	System.out.println("Telefone do Cliente: "+cliente.getTelefone());
	System.out.println("Endereço do Cliente: "+cliente.getEndereco());
	System.out.println("Saldo atual: "+cliente.getSaldo());
	System.out.println("O saldo atual do cliente: "+cliente.getSaldo());
	
	System.out.println("------------------------------\n");
	System.out.println("------------------------------\n");
	
//Diarista
	System.out.println("Nome da Diarista: "+diarista.getNome());
	System.out.println("Telefone da Diarista: "+diarista.getTelefone());
	System.out.println("Endereço da Diarista: "+diarista.getEndereco());
	System.out.println("Pix da Diarista: "+diarista.getPix());
	System.out.println("Insira a quantidade de horas trabalhadas: "+ atendimento.getHoras());
	System.out.println("O saldo atual da diarista: "+diarista.getSaldo());
	diarista.servico("Roberto"); 
			}
		}
	}

	
