import java.util.*;

class Solution {
    static int maxDungeons = 0;
    
    public int solution(int currentFatigue, int[][] dungeons) {      
        boolean[] explored = new boolean[dungeons.length];
        exploreDungeons(0, currentFatigue, dungeons, explored);
        return maxDungeons;
    }
    
    public void exploreDungeons(int exploredDungeons, int remainingFatigue, int[][] dungeons, boolean[] explored) {
        maxDungeons = Math.max(exploredDungeons, maxDungeons);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!explored[i] && dungeons[i][0] <= remainingFatigue) {
                explored[i] = true;
                exploreDungeons(exploredDungeons + 1, remainingFatigue - dungeons[i][1], dungeons, explored);
                explored[i] = false;
            }
        }
    }
}
