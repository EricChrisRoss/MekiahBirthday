package ross;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Sentence implements Fragments{
    private String birthdayMessage;

    public Sentence() {
        int beginPicker = ThreadLocalRandom.current().nextInt(0, begin.length);
        String beginMessage = begin[beginPicker].toString();

        int part1Picker = ThreadLocalRandom.current().nextInt(0, part1.length);
        String part1Message = part1[beginPicker].toString();

        int part2Picker = ThreadLocalRandom.current().nextInt(0, part2.length);
        String part2Message = part2[beginPicker].toString();

        int part3Picker = ThreadLocalRandom.current().nextInt(0, part3.length);
        String part3Message = part3[beginPicker].toString();

        int part4Picker = ThreadLocalRandom.current().nextInt(0, part4.length);
        String part4Message = part4[beginPicker].toString();

        int part5Picker = ThreadLocalRandom.current().nextInt(0, part5.length);
        String part5Message = part5[beginPicker].toString();

        this.birthdayMessage = beginMessage + part1Message + part2Message + part3Message + part4Message + part5Message + "From Eric";
    }

    public String getBirthdayMessage() {
        return birthdayMessage;
    }
}
