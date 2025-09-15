package br.com.javadevweek.gestao_custos.repository;

import br.com.javadevweek.gestao_custos.entity.Despesa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {

    List<Despesa> findByEmail(String email);

    List<Despesa> findByEmailAndData(String email, LocalDate data);

    Page<Despesa> findByEmail(String email, Pageable pageable);
}
