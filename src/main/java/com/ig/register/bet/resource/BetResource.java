package com.ig.register.bet.resource;


import com.ig.register.bet.dto.StatisticDTO;
import com.ig.register.bet.model.Bet;
import com.ig.register.bet.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
public class BetResource {

    @Autowired
    private BetService betService;

    @GetMapping("/bet")
    List<Bet> getAll() {
        return betService.getAll();
    }

    @GetMapping("/bet/{id}")
    List<Bet> getBetByUsuarioId(@PathVariable Integer id) {
        return betService.getBetByUsuarioId(id);
    }

    @PostMapping("/bet")
    Bet createAposta(@RequestBody Bet newBet) {

        return betService.createBet(newBet);
    }

    @PutMapping("bet/{id}")
    Optional<Bet> editBet(@RequestBody Bet newBet, @PathVariable Integer id) {

        return betService.editBet(newBet, id);
    }

    @DeleteMapping("/bet/{id}")
    void deleteBet(@PathVariable Integer id) {
        betService.deleteBet(id);
    }

    @GetMapping("/statistic")
    StatisticDTO getStatistic() {
        return betService.getStatistic();
    }

}
