package com.ufpel.edu.br.gadostalker.service;

import com.ufpel.edu.br.gadostalker.dto.ProdutoDTO;
import com.ufpel.edu.br.gadostalker.model.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProdutoServiceImpl implements ProdutoService{
    @Override
    public ProdutoDTO addProduto(ProdutoDTO produtoDTO) {
        return null;
    }

    @Override
    public Map<Produto.TipoProdutoEnum, String> findAllProdutosByFazendaSncr(String sncr) {
        return null;
    }

    @Override
    public List<ProdutoDTO> findAllProdutosByTypeAndSncr(Produto.TipoProdutoEnum tipo, String sncr) {
        return null;
    }

    @Override
    public ProdutoDTO findProdutoById(Long id) {
        return null;
    }

    @Override
    public ProdutoDTO editProduto(ProdutoDTO produtoDTO, Long id) {
        return null;
    }

    @Override
    public Boolean deleteProduto(Long id) {
        return null;
    }

    @Override
    public Map<Produto.TipoProdutoEnum, String> findAllTiposProdutos() {
        return Arrays.stream(Produto.TipoProdutoEnum.values())
                .collect(Collectors.toMap(Function.identity(), Produto.TipoProdutoEnum::getTipo));
    }

    @Override
    public List<ProdutoDTO> findAllProdutosByProprietarioCpf(String cpf) {
        return null;
    }
}
