package com.ig.register.bet.service;

import com.ig.register.bet.model.Bet;
import com.ig.register.bet.model.Usuario;
import com.ig.register.bet.repository.BetRepository;
import com.ig.register.bet.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Service
public class DBService {

    @Autowired
    private BetRepository betRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void instantiateTestDatabase() throws ParseException {


        Bet bet_1 = new Bet(
                null,
                "Botafogo x Corinthians",
                LocalDate.of(2022, 4, 10),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(20),
                new BigDecimal(3)
        );

        Bet bet_2 = new Bet(
                null,
                "Corinthians x Avaí",
                LocalDate.of(2022, 4, 16),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(5),
                new BigDecimal(1.50)
        );

        Bet bet_3 = new Bet(
                null,
                "Palmeiras x Corinthians",
                LocalDate.of(2022, 4, 23),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(4.5)
        );

        Bet bet_4 = new Bet(
                null,
                "Corinthians x Fortaleza",
                LocalDate.of(2022, 5, 1),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(8),
                new BigDecimal(1.8)
        );

        Bet bet_5 = new Bet(
                null,
                "Bragantino x Corinthians",
                LocalDate.of(2022, 5, 8),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(19),
                new BigDecimal(2.9)
        );

        Bet bet_6 = new Bet(
                null,
                "Internacional x Corinthians",
                LocalDate.of(2022, 5, 14),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(3.3)
        );

        Bet bet_7 = new Bet(
                null,
                "Corinthians x São Paulo",
                LocalDate.of(2022, 5, 22),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(2.5)
        );

        Bet bet_8 = new Bet(
                null,
                "Corinthians x América-MG",
                LocalDate.of(2022, 5, 29),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(1.6)
        );

        Bet bet_9 = new Bet(
                null,
                "Corinthians x Atlético-GO",
                LocalDate.of(2022, 6, 4),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(24),
                new BigDecimal(3.4)
        );

        Bet bet_10 = new Bet(
                null,
                "Cuiabá x Corinthians",
                LocalDate.of(2022, 6, 7),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(2.75)
        );

        Bet bet_11 = new Bet(
                null,
                "Corinthians x Juventude",
                LocalDate.of(2022, 6, 11),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(7.5),
                new BigDecimal(1.75)
        );

        Bet bet_12 = new Bet(
                null,
                "Atlético-PR x Corinthians",
                LocalDate.of(2022, 6, 15),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(3.4)
        );

        Bet bet_13 = new Bet(
                null,
                "Corinthians x Goiás",
                LocalDate.of(2022, 6, 19),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(5.3),
                new BigDecimal(1.53)
        );

        Bet bet_14 = new Bet(
                null,
                "Corinthians x Santos",
                LocalDate.of(2022, 6, 25),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(2.20)
        );

        Bet bet_15 = new Bet(
                null,
                "Fluminense x Corinthians",
                LocalDate.of(2022, 7, 2),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(7.50)
        );

        Bet bet_16 = new Bet(
                null,
                "Corinthians x Flamengo",
                LocalDate.of(2022, 7, 10),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(19),
                new BigDecimal(2.90)
        );

        Bet bet_17 = new Bet(
                null,
                "Ceará x Corinthians",
                LocalDate.of(2022, 7, 16),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(-10),
                new BigDecimal(5)
        );

        Bet bet_18 = new Bet(
                null,
                "Corinthians x Coritiba",
                LocalDate.of(2022, 7, 20),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(6.1),
                new BigDecimal(1.61)
        );

        Bet bet_19 = new Bet(
                null,
                "Atlético-MG x Corinthians",
                LocalDate.of(2022, 7, 24),
                "Futebol",
                "Campeonato Brasileiro",
                "Winner",
                new BigDecimal(10),
                new BigDecimal(70),
                new BigDecimal(8)
        );

        Usuario usuario = new Usuario(
                null,
                "iangerolamo",
                "123456",
                "iangerolamo@gmail.com",
                "Ian Gerolamo",
                LocalDate.of(2022, 7, 21),
                Arrays.asList(bet_1, bet_2, bet_3, bet_4, bet_5, bet_6, bet_7, bet_8, bet_9, bet_10,
                        bet_11, bet_12, bet_13, bet_14, bet_15, bet_16, bet_17, bet_18));

        betRepository.saveAll(Arrays.asList(bet_1, bet_2, bet_3, bet_4, bet_5, bet_6, bet_7, bet_8, bet_9, bet_10,
                                            bet_11, bet_12, bet_13, bet_14, bet_15, bet_16, bet_17, bet_18, bet_19));

        usuarioRepository.saveAll(List.of(usuario));

    }
}
