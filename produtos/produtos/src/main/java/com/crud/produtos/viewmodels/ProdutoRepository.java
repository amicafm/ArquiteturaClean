package com.crud.produtos.viewmodels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.produtos.entities.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
