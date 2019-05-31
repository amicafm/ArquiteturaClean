package com.crud.produtos.usercases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.crud.produtos.entities.Produto;
import com.crud.produtos.viewmodels.ProdutoRepository;
import com.crud.produtos.viewmodels.ProdutoService;



@Service
public class ProdutoServiceImpl implements ProdutoService{
	@Autowired
    private ProdutoRepository repository;
	
	 	@Override
	    public Produto createProduto(Produto produto)
	    {
	        return repository.saveAndFlush(produto);
	    }

	    @Override
	    public Produto findProdutoById(Integer id)
	    {
	        return repository.getOne(id);
	    }

	    @Override
	    public List<Produto> findAllProdutos()
	    {
	        return repository.findAll();
	    }

	    @Override
	    public Produto updateProduto(Produto produto)
	    {
	        repository.save(produto);
	        
	        return repository.findById(produto.getId()).get();
	    }

	    @Override
	    public List<Produto> deleteProdutoById(Integer id)
	    {
	        repository.deleteById(id);
	        
	        return repository.findAll();
	    }

	    @Override
	    public List<Produto> deleteProduto(Produto produto)
	    {
	        repository.delete(produto);
	        
	        return repository.findAll();
	    }
}
