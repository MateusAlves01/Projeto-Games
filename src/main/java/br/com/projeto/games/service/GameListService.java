package br.com.projeto.games.service;

import br.com.projeto.games.dto.GameDTO;
import br.com.projeto.games.dto.GameListDTO;
import br.com.projeto.games.dto.GameMiniDTO;
import br.com.projeto.games.entities.GameList;
import br.com.projeto.games.entities.Gamees;
import br.com.projeto.games.repository.GameListRepository;
import br.com.projeto.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

}
