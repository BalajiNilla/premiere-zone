package com.pl.primere_zone.Player;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {


    private final PlayerService playerService;
    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<List<Player>> getPlayers(
            @RequestParam(required = false) String name,
            @RequestParam (required = false)String team,
            @RequestParam (required = false)String position,
            @RequestParam (required = false)String nation

    ){

        if(team!=null && position!=null){
            return new ResponseEntity<>(playerService.getPlayersByTeamAndPosition(team,position),HttpStatus.OK);
        }

        else if(name!=null){
            return new ResponseEntity<>(playerService.getPlayersByName(name),HttpStatus.OK);
        }
        else if(position!=null){
            return new ResponseEntity<>(playerService.getPlayersByPosition(position),HttpStatus.OK);
        }
        else if(nation!=null){
            return new ResponseEntity<>(playerService.getPlayersByNation(nation),HttpStatus.OK);
        }
        else if(team!=null)
            return new ResponseEntity<>(playerService.getPlayersByTeam(team),HttpStatus.OK);

        return new ResponseEntity<>(playerService.getPlayers(),HttpStatus.OK);
        }
        @PostMapping("/save")

        public ResponseEntity<Player> savePlayer(@RequestBody Player player){

            return ResponseEntity.status(HttpStatus.CREATED).body(playerService.addPlayer(player));

        }

        @PutMapping("/update")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
        var updated = playerService.updatePlayer(player);

        if(updated!=null)
            return ResponseEntity.status(HttpStatus.CREATED).body(playerService.updatePlayer(player));
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

        @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deletePlayer(@PathVariable String name){

        if(playerService.getPlayersByName(name)!=null){
            playerService.deletePlayerByName(name);
            return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
        }
        else
            return new ResponseEntity<>("Player not found", HttpStatus.NOT_FOUND);
        }



    }


