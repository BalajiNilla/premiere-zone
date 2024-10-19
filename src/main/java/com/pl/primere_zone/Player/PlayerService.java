package com.pl.primere_zone.Player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerService {

    @Autowired
    private final PlayerRepository repository;

    public PlayerService(PlayerRepository repository) {
        this.repository = repository;
    }

    public List<Player> getPlayers(){
        return repository.findAll();
    }
    public List<Player> getPlayersByName(String searchText){
        return List.of(repository.findByPlayerName(searchText).get());
    }

    public List<Player> getPlayersByPosition(String position){
        return repository.findAllByPosition(position);
    }
    public List<Player> getPlayersByTeam(String team){
        return repository.findAllByTeamName(team);
    }
    public List<Player> getPlayersByNation(String nation){
        return repository.findAllByNation(nation);
    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position){
        return repository.findAllByPosition(position).stream().filter(player -> player.getTeamName().contains(team))
                .collect(Collectors.toList());
    }
    public Player addPlayer(Player player){
        return repository.save(player);
    }

    public Player updatePlayer(Player updatedPlayer){
        Optional<Player> existingPlayer  = repository.findByPlayerName(updatedPlayer.getPlayerName());

        if(existingPlayer.isPresent()){

            Player playerToUpdate = existingPlayer.get();

            playerToUpdate.setPlayerName(updatedPlayer.getPlayerName());
            playerToUpdate.setTeamName(updatedPlayer.getTeamName());
            playerToUpdate.setPosition(updatedPlayer.getPosition());
             playerToUpdate.setNation(updatedPlayer.getNation());

             return repository.save(playerToUpdate);
        }
         return null;
    }

    @Transactional
    public  void deletePlayerByName(String name){
        repository.deleteByPlayerName(name);
    }

}
