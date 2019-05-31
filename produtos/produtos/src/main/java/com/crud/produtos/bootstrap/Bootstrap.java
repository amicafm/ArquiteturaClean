package com.crud.produtos.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.crud.produtos.entities.Produto;
import com.crud.produtos.viewmodels.ProdutoRepository;

@Component
public class Bootstrap implements CommandLineRunner{
	
	@Autowired
	public ProdutoRepository repositorio;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Carregando produtos...");

        Produto p1 = new Produto();
        p1.setNome("Caderno");
        repositorio.save(p1);
        
        Produto p2 = new Produto();
        p2.setNome("Lápis");
        repositorio.save(p2);

       

        System.out.println("Produtos salvos:" + repositorio.count());
		
	}
	
}
