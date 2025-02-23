package com.ufpel.edu.br.gadostalker.service;

import com.ufpel.edu.br.gadostalker.model.Fazenda;
import com.ufpel.edu.br.gadostalker.model.Proprietario;

import java.util.List;

public interface FazendaService {
    List<Fazenda> findFazendasByProprietarioCpf(String cpf);
    List<Fazenda> findFazendasByProprietario(Proprietario proprietario);
    Fazenda findFazendaBySncr(String sncr);
    Boolean validaFazenda(String sncr);
}
