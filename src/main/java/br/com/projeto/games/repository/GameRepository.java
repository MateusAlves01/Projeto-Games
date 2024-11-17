package br.com.projeto.games.repository;


import br.com.projeto.games.entities.Gamees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Gamees, Long> {

}
