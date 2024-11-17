package br.com.projeto.games.service;

import br.com.projeto.games.dto.GameMiniDTO;
import br.com.projeto.games.entities.Gamees;
import br.com.projeto.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMiniDTO> findAll(){
        List<Gamees> result = gameRepository.findAll();
        List<GameMiniDTO> dto = result.stream().map(x -> new GameMiniDTO(x)).toList();
        return dto;
    }

}
