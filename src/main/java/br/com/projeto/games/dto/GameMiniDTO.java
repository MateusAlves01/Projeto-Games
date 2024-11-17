package br.com.projeto.games.dto;

import br.com.projeto.games.entities.Gamees;
import jakarta.persistence.Column;

public class GameMiniDTO {

    private  Long id;
    private  String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMiniDTO(){

    }

    public GameMiniDTO(Gamees entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
