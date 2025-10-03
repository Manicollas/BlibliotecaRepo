package br.com.etec.biblioteca.cadastro;

public class ClassePrincipal {

	public static void main(String[] args) {
	
		Infomacoes Info_obj = new Infomacoes();
		Infomacoes Info_obj2 = new Infomacoes
				("Dom Casmurro", "Machado de Assis");
				
		Info_obj.mostrarDados();
		
		Info_obj2.mostrarDados();
				
}
}