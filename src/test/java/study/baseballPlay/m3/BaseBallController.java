package study.baseballPlay.m3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseBallController {

    public List<Integer> set3RandomNumbers() {
        Set<Integer> set = new HashSet<>();
        while(set.size() != 3){
            set.add((int)(Math.random()*9));
        }
        return new ArrayList<>(set);
    }

}
