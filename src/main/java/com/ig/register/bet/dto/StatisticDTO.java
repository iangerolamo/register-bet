package com.ig.register.bet.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StatisticDTO {
    private BigDecimal lucro;
    private Integer quantidadeDeApostasRealizadas;
    private BigDecimal valorTotalApostado;
    private Integer quantidadeDeApostasGanhas;
    private Integer quantidadeDeApostasPerdidas;
    private BigDecimal valorGanhoApostado;
    private BigDecimal valorPerdidoApostado;
    private BigDecimal roi;

}
