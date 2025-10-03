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

	public String getTitulos(){
		return titulosAt;
	}
	public String getSubitulos(){
		return subtitulosAt;
	}
	public String getAutoress(){
		return autoresAt;
	}
	public String getGeneros(){
		return generosAt;
	}
	public int getNumerosPaginas(){
		return numerosPaginasAt;
	}
	public void setAutores(String name){
		this.autoresAt = name;
	}
	public void setTitulos(String title){
		this.titulosAt = title;
	}
	public void setSubtitulos(String subtitles){
		this.subtitulosAt = subtitles;
	}
	public void setgeneros(String gender){
		this.generosAt = gender;
	}
	public void setNumerosPaginas(int page){
		this.numerosPaginasAt = page;
	}
	public void mostrarDados(){
		System.out.println("Informações do Produto:");
		System.out.println(titulosAt);
		System.out.println(subtitulosAt);
		System.out.println(autoresAt);
		System.out.println(generosAt);
		System.out.println(numerosPaginasAt);
		
	}
	}
