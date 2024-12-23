package br.com.projeto.games.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Gamees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String title;

    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Gamees(){

    }

    public Gamees(Long id, String title, Integer year, String genre, String imgUrl,
                  String platforms, Double score, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.imgUrl = imgUrl;
        this.platforms = platforms;
        this.score =score;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlatform() {
        return platforms;
    }

    public void setPlatform(String platform) {
        this.platforms = platform;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gamees gamees = (Gamees) o;
        return Objects.equals(id, gamees.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
