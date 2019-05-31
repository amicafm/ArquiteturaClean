package com.crud.produtos.usercases;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.produtos.entities.Produto;
import com.crud.produtos.viewmodels.ProdutoService;



@RestController
public class ProdutoController {
	@Autowired
	private ProdutoService service;
		
		//create
	 	@PostMapping("/adicionaProduto")
	    public List<Produto> createProduto(Produto produto)
	    {	        
		 	service.createProduto(produto);

	        return service.findAllProdutos();
	    }
	    
	 	//read
	    @GetMapping("/")
	    public List<Produto> findAllProdutos()
	    {	        
	        return service.findAllProdutos();
	    }
	    
	    //update
	    @PostMapping("/atualizaPessoa")
	    public List<Produto> update(@Valid Produto produto)
	    {       
	        service.updateProduto(produto);
	        
	        return service.findAllProdutos();
	    }
		
	    //delete
	    @GetMapping("/deleta/{id}")
	    public List<Produto> deleteProduto(@PathVariable("id") Integer id)
	    {
	        service.deleteProdutoById(id);
	        
	        return service.findAllProdutos();
	    }
	
}
