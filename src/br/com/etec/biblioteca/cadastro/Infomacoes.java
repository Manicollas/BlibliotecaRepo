package br.com.etec.biblioteca.cadastro;

public class Infomacoes {
	String titulosAt;
	String subtitulosAt;
	int numerosPaginasAt;
	String autoresAt;
	String generosAt;



	public Infomacoes(){
}

public Infomacoes(String autor, String titulo){
	this.autoresAt = autor;
	this.titulosAt = titulo;
}

}
