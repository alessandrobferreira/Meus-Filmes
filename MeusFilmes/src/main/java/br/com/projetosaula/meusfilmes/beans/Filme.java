package br.com.projetosaula.meusfilmes.beans;

import java.io.Serializable;

public class Filme implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int id;
	private String titulo;
	private String genero;
	private int restricao;
	private boolean favorito;

	public Filme() {
	}

	public Filme(int id, String titulo, String genero, int restricao, boolean favorito) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.restricao = restricao;
		this.favorito = favorito;
	}
    
	public void setId(int id) {
		this.id = id;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getRestricao() {
		return restricao;
	}

	public void setRestricao(int restricao) {
		this.restricao = restricao;
	}

	public boolean isFavorito() {
		return favorito;
	}

	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}

	public int getId() {
		return id;
	}
	
	
}
