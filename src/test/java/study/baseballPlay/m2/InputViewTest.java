package study.baseballPlay.m2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class InputViewTest {
    InputView inputView;
    
    @Test
    public void trialNumberIsIntegerArrayListTest(){
        String simulatedInput  = "123\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        
        inputView = new InputView();
        assertEquals(inputView.getTrialNumberFromUser(new ArrayList<Integer>()), new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
        }});
    }

    @Test
    public void isGameContinueTest(){
        inputView = new InputView();

        String simulatedInput  = "1\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        
        assertEquals(true, inputView.isGameContinue());

        simulatedInput  = "2\n";
        inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        
        assertEquals(false, inputView.isGameContinue());
    }
}
