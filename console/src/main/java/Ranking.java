package learner;

import java.util.*;

public class Ranking{
    Ranking(int[] cons){
        ranking = new byte[cons.length];
        for (int i=0; i < cons.length;i++){
            ranking[i] = (byte) cons[i];
        }
        hc = Arrays.hashCode(ranking);
    }
    private byte[] ranking;
    private int hc;

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Ranking ranking1 = (Ranking) object;

        if (!java.util.Arrays.equals(ranking, ranking1.ranking)) return false;

        return true;
    }

    public int hashCode() {
        return hc;
    }
}