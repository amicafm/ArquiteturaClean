package com.crud.produtos.viewmodels;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.produtos.entities.Produto;

@Service
public interface ProdutoService {
	Produto createProduto(Produto produto);
    Produto findProdutoById(Integer id);
    List<Produto> findAllProdutos();
    Produto updateProduto(Produto produto);
    List<Produto> deleteProdutoById(Integer id);
    List<Produto> deleteProduto(Produto produto);
}
