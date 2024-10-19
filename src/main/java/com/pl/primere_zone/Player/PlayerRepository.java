package com.pl.primere_zone.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayerName(String Name);

    Optional<Player> findByPlayerName(String Name);

    List<Player> findAllByPosition(String position);

    List<Player> findAllByNation(String nation);

    List<Player> findAllByTeamName(String team);




}
