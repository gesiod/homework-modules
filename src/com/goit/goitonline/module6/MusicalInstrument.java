package com.goit.goitonline.module6;

/**
 * Created by Grigoriy on 07.03.2016.
 */

abstract class MusicalInstrument {
    public abstract String getType();

    @Override
    public String toString() {
        return "Musical Instrument {"+getType()+"}\n";
    }

}
