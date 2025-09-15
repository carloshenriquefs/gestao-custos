package br.com.javadevweek.gestao_custos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "despesa")
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String descricao;
    private LocalDate data;
    private BigDecimal valor;

    @Column(length = 100, nullable = false)
    private String categoria;

    @Column(nullable = false)
    private String email;

    @CreationTimestamp
    private LocalDate data_criacao;

    public UUID getId() {
        return id;
    }

    public Despesa setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Despesa setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public LocalDate getData() {
        return data;
    }

    public Despesa setData(LocalDate data) {
        this.data = data;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Despesa setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    public String getCategoria() {
        return categoria;
    }

    public Despesa setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Despesa setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public Despesa setData_criacao(LocalDate data_criacao) {
        this.data_criacao = data_criacao;
        return this;
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                ", categoria='" + categoria + '\'' +
                ", email='" + email + '\'' +
                ", data_criacao=" + data_criacao +
                '}';
    }
}
