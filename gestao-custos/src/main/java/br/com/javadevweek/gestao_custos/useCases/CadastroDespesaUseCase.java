package br.com.javadevweek.gestao_custos.useCases;

import br.com.javadevweek.gestao_custos.entity.Despesa;
import br.com.javadevweek.gestao_custos.repository.DespesaRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastroDespesaUseCase {

    private final DespesaRepository despesaRepository;

    public CadastroDespesaUseCase(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    public Despesa execute(Despesa despesa) {

        if (despesa.getCategoria() == null || despesa.getData() == null || despesa.getDescricao() == null
                || despesa.getEmail() == null) {

            throw new IllegalArgumentException("Preencher todos os campos");
        }

        despesa = despesaRepository.save(despesa);

        return despesa;
    }
}
