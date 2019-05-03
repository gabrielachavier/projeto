package view;

import Model.pessoaFisica;
import Model.pessoaJuridica;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pessoaFisica pf =  new pessoaFisica();
		
		pf.setNome("Mauricéia");
		pf.setCep(15822487);
		pf.setCpf(25425568);
		pf.setEndereco("Rua santo amaro");
		pf.setTelefone(98556892);
		
		System.out.println(pf.getNome());
		System.out.println(pf.getCep());
		System.out.println(pf.getCpf());
		System.out.println(pf.getEndereco());
		System.out.println(pf.getTelefone());
	
		System.out.println("------------------------");
		pessoaJuridica pf2 =  new pessoaJuridica();
		
		pf2.setCnpj(87845465);
		pf2.setCep(15822487);
		pf2.setEndereco("Rua chubaca");
		pf2.setTelefone(95878462);
		
		System.out.println(pf2.getCnpj());
		System.out.println(pf2.getCep());
		System.out.println(pf2.getEndereco());
		System.out.println(pf2.getTelefone());
		
	}
	
}
	
	
	
	
	
	
	
