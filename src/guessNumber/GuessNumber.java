package guessNumber;

import static javax.xml.bind.DatatypeConverter.parseInt;
import static javax.xml.bind.DatatypeConverter.parseString;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        char [] inputs=userInput.toCharArray();
        int correct=0;
        int placecorrect=0;
        for (int i=0;i<4;i++){
            if(inputs[i]==randomNumber.charAt(i))
                correct++;
            else if(randomNumber.toString().contains(String.valueOf(inputs[i])) )
                    placecorrect++;
        }
        return correct +"a"+placecorrect+"b";

    }
}
