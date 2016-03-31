package com.goit.goitonline.module6;

import java.util.List;

/**
 * Created by Grigoriy on 07.03.2016.
 */
public class MusicStore {
    private List<Guitar> guitars;
    private List<Piano> pianos;
    private List<Trumpet> trumpets;

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public List<Piano> getPianos() {
        return pianos;
    }

    public void setPianos(List<Piano> pianos) {
        this.pianos = pianos;
    }

    @Override
    public String toString() {
        return "MusicStore{" +
                "guitars=" + guitars.size() +
                ", pianos=" + pianos.size() +
                ", trumpets=" + trumpets.size() +
                '}';
    }

    //List<MusicalInstrument> musicalInstruments;


}
