package com.pokemod.pokemod.world.item;

import com.pokemod.pokemod.PokeMod;

public class TechnicalRecord extends MoveTeachingItem {
    public TechnicalRecord(String move, Properties properties) {
        super(PokeMod.id(move), properties);
    }
}
