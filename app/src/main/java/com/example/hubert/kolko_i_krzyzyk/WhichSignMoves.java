package com.example.hubert.kolko_i_krzyzyk;

/**
 * Created by Hubert on 2015-02-10.
 */
public class WhichSignMoves {
    private String moveSign;

    public WhichSignMoves(String moveSign) {
        this.moveSign = moveSign;
    }

    public String getMoveSign() {
        return moveSign;
    }

    public void setMoveSign(String moveSign) {
        this.moveSign = moveSign;
    }

    public void changeSign(String Sign){
        if(Sign.equalsIgnoreCase("O")) setMoveSign("X");
        else setMoveSign("O");
    }
}
