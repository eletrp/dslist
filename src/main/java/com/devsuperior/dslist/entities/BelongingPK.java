package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Games games;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK(){
    }

    public BelongingPK(Games games, GameList list) {
        this.games = games;
        this.list = list;
    }

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(games, that.games) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(games, list);
    }
}
