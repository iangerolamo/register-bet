package com.ig.register.bet.service;

import com.ig.register.bet.dto.StatisticDTO;
import com.ig.register.bet.model.Bet;
import com.ig.register.bet.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@Service
public class BetService {

    @Autowired
    private BetRepository betRepository;

    public List<Bet> getAll() {
        return betRepository.findAll();
    }

    public Bet createBet(Bet newBet) {
        return betRepository.save(newBet);
    }


    public void deleteBet(Integer id) {
        betRepository.deleteById(id);
    }

    public Optional<Bet> editBet(Bet newBet, Integer id) {
        return betRepository.findById(id)
                .map(bet -> {
                    bet.setEvento(newBet.getEvento());
                    bet.setData(newBet.getData());
                    bet.setEsporte(newBet.getEsporte());
                    bet.setCompeticao(newBet.getCompeticao());
                    bet.setMercado(newBet.getMercado());
                    bet.setAposta(newBet.getAposta());
                    bet.setLucro(newBet.getLucro());
                    bet.setOdd(newBet.getOdd());

                    return betRepository.save(bet);
                });
    }

    public StatisticDTO getStatistic() {

        List<Bet> bets = betRepository.findAll();

        StatisticDTO statisticDTO = new StatisticDTO();

        Integer quantidadeDeApostasRealizadas = bets.size();

        BigDecimal lucro = new BigDecimal(0);
        BigDecimal valorTotalApostado = new BigDecimal(0);
        BigDecimal valorGanhoApostado = new BigDecimal(0);
        BigDecimal valorPerdidoApostado = new BigDecimal(0);
        int quantidadeDeApostasGanhas = 0;
        int quantidadeDeApostasPerdidas = 0;

        for (Bet bet : bets) {

            if (bet.getLucro().compareTo(new BigDecimal(0)) > 0) {
                quantidadeDeApostasGanhas +=  1;
                valorGanhoApostado = valorGanhoApostado.add(bet.getAposta().multiply(bet.getOdd()))
                        .subtract(bet.getAposta());
                System.out.println(valorGanhoApostado);
            } else {
                quantidadeDeApostasPerdidas += 1;
                valorPerdidoApostado = valorPerdidoApostado.add(bet.getAposta());
            }

            lucro = lucro.add(bet.getLucro());
            valorTotalApostado = valorTotalApostado.add(bet.getAposta());
        }


        BigDecimal roi = ((valorGanhoApostado.subtract(valorPerdidoApostado)).divide(valorTotalApostado,
                        2, RoundingMode.HALF_UP)
                .multiply(new BigDecimal(100)));

        statisticDTO.setQuantidadeDeApostasRealizadas(quantidadeDeApostasRealizadas);
        statisticDTO.setLucro(lucro);
        statisticDTO.setValorTotalApostado(valorTotalApostado);
        statisticDTO.setValorGanhoApostado(valorGanhoApostado);
        statisticDTO.setQuantidadeDeApostasGanhas(quantidadeDeApostasGanhas);
        statisticDTO.setQuantidadeDeApostasPerdidas(quantidadeDeApostasPerdidas);
        statisticDTO.setValorPerdidoApostado(valorPerdidoApostado);
        statisticDTO.setRoi(roi);

        return statisticDTO;
    }



}
