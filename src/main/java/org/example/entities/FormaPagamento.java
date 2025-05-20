package org.example.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class FormaPagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FPG_ID")
    private Long fpgId;

    @NotBlank(message = "Descrição é obrigatório")
    @Size(message = "Descrição inválida")
    @Column(name = "FPG_DESCRICAO", nullable = false)
    private String fpgDescricao;

    @NotBlank(message = "obrigatório")
    @Size(message = "inválida")
    @Column(name = "FPG_ATIVO", nullable = false)
    private String fpgAtivo;

    @NotBlank(message = "Permite Parcelamento é obrigatório")
    @Size(message = "Inválido")
    @Column(name = "FPG_PERMITE_PARCELAMENTO", nullable = false)
    private Boolean fpgPermiteParcelamento;

    @NotBlank(message = "obrigatório")
    @Size(message = "inválida")
    @Column(name = "FPG_NUMERO_MAXIMO_PARCELAS", nullable = false)
    private Integer fpgNumeroMaximoParcelas;

    @NotBlank(message = "obrigatório")
    @Size(message = "inválida")
    @Column(name = "FPG_TAXA_ADICIONAL", precision = 5, scale = 2, nullable = false)
    private BigDecimal fpgTaxaAdicional;

    public FormaPagamento() {
    }

    public FormaPagamento(Long fpgId, String fpgDescricao, String fpgAtivo, Boolean fpgPermiteParcelamento, Integer fpgNumeroMaximoParcelas,BigDecimal fpgTaxaAdicional) {
        this.fpgId = fpgId;
        this.fpgDescricao = fpgDescricao;
        this.fpgAtivo = fpgAtivo;
        this.fpgPermiteParcelamento = fpgPermiteParcelamento;
        this.fpgNumeroMaximoParcelas = fpgNumeroMaximoParcelas;
        this.fpgTaxaAdicional = fpgTaxaAdicional;
    }

    public Long getFpgId() {
        return fpgId;
    }

    public void setFpgId(Long fpgId) {
        this.fpgId = fpgId;
    }

    public String getFpgDescricao() {
        return fpgDescricao;
    }

    public void setFpgDescricao(String fpgDescricao) {
        this.fpgDescricao = fpgDescricao;
    }

    public String getFpgAtivo() {
        return fpgAtivo;
    }

    public void setFpgAtivo(String fpgAtivo) {
        this.fpgAtivo = fpgAtivo;
    }

    public Boolean getFpgPermiteParcelamento() {
        return fpgPermiteParcelamento;
    }

    public void setFpgPermiteParcelamento(Boolean fpgPermiteParcelamento) {
        this.fpgPermiteParcelamento = fpgPermiteParcelamento;
    }

    public Integer getFpgNumeroMaximoParcelas() {
        return fpgNumeroMaximoParcelas;
    }

    public void setFpgNumeroMaximoParcelas(Integer fpgNumeroMaximoParcelas) {
        this.fpgNumeroMaximoParcelas = fpgNumeroMaximoParcelas;
    }

    public BigDecimal getFpgTaxaAdicional() {
        return fpgTaxaAdicional;
    }

    public void setFpgTaxaAdicional(BigDecimal fpgTaxaAdicional) {
        this.fpgTaxaAdicional = fpgTaxaAdicional;
    }
}
