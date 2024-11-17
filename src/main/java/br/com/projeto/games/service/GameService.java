package br.com.projeto.games.service;

import br.com.projeto.games.dto.GameDTO;
import br.com.projeto.games.dto.GameMiniDTO;
import br.com.projeto.games.entities.Gamees;
import br.com.projeto.games.projections.GameMinProjection;
import br.com.projeto.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Gamees result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMiniDTO> findAll(){
        List<Gamees> result = gameRepository.findAll();
        List<GameMiniDTO> dto = result.stream().map(x -> new GameMiniDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMiniDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        List<GameMiniDTO> dto = result.stream().map(x -> new GameMiniDTO(x)).toList();
        return dto;
    }

}
