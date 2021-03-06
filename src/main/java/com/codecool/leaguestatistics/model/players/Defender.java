package com.codecool.leaguestatistics.model.players;

public class Defender extends Player implements Comparable<Defender>, DefenderPotential{
    private final int defenceSkill;

    public Defender(int defenceSkill, int aggression, int injuryPotential, String team, Position position) {
        super(aggression, injuryPotential, team, position);
        this.defenceSkill = defenceSkill;
    }

    @Override
    public int compareTo(Defender o) {
        return o.defenceSkill - this.defenceSkill;
    }

    @Override
    public int getDefSkill() {
        return defenceSkill;
    }

    @Override
    public int getTotalSkill() {
        return defenceSkill;
    }
}

