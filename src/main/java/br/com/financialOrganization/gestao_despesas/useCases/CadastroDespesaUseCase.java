package br.com.financialOrganization.gestao_despesas.useCases;

import br.com.financialOrganization.gestao_despesas.entity.Despesa;
import org.springframework.stereotype.Service;

@Service
public class CadastroDespesaUseCase {

    public void execute(Despesa despesa){
        System.out.println(despesa);
    }

}
