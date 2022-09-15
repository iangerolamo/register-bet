package com.ig.register.bet.repository;

import com.ig.register.bet.model.Bet;
import com.ig.register.bet.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BetRepository extends JpaRepository<Bet, Integer> {

    @Transactional(readOnly = true)
    List<Bet> findBetByUsuarioId(Integer id);
}
