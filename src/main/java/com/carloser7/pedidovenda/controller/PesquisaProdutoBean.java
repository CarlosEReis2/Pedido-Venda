package com.carloser7.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaProdutoBean {

	private List<Integer> produtosFiltrados;
	
	public PesquisaProdutoBean() {
		produtosFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			this.produtosFiltrados.add(i);
		}
	}	
	
	public List<Integer> getProdutosFiltrados() {
		return produtosFiltrados;
	}
}
