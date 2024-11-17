package br.com.projeto.games.controllers;

import br.com.projeto.games.dto.GameDTO;
import br.com.projeto.games.dto.GameListDTO;
import br.com.projeto.games.dto.GameMiniDTO;
import br.com.projeto.games.service.GameListService;
import br.com.projeto.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
