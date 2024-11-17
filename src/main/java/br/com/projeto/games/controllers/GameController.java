package br.com.projeto.games.controllers;

import br.com.projeto.games.dto.GameMiniDTO;
import br.com.projeto.games.entities.Gamees;
import br.com.projeto.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMiniDTO> findAll(){
        List<GameMiniDTO> result = gameService.findAll();
        return result;
    }
}
