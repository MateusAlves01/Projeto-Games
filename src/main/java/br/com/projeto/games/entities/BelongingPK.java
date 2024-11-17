package br.com.projeto.games.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Gamees gamees;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;

    public BelongingPK () {

    }

    public BelongingPK(Gamees gamees, GameList gameList) {
        this.gamees = gamees;
        this.gameList = gameList;
    }

    public Gamees getGamees() {
        return gamees;
    }

    public void setGamees(Gamees gamees) {
        this.gamees = gamees;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(gamees, that.gamees) && Objects.equals(gameList, that.gameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gamees, gameList);
    }
}
