package br.com.financialOrganization.gestao_despesas.controler;

import br.com.financialOrganization.gestao_despesas.entity.Despesa;
import br.com.financialOrganization.gestao_despesas.useCases.CadastroDespesaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/gestao")
@RestController
public class GestaoDespesaController {


    @Autowired
    CadastroDespesaUseCase cadastroDespesaUseCase;

    @PostMapping("/create")
    public void create(@RequestBody Despesa despesa){
        cadastroDespesaUseCase.execute(despesa);
    }
}
