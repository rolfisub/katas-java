package kyu6.countsmileyfaces;

import java.util.ArrayList;
import java.util.List;

public class CountSmileyFaces {

    public static int countSmileys(List<String> list) {

        ArrayList<String> eyes, nose, mouth;
        eyes = new ArrayList<>(2);
        nose = new ArrayList<>(2);
        mouth = new ArrayList<>(2);

        eyes.add(":");
        eyes.add(";");
        nose.add("-");
        nose.add("~");
        mouth.add(")");
        mouth.add("D");

        int smileys = 0;
        for(String face: list) {
            int faceLength = face.length();

            if(faceLength < 2 || faceLength > 3) continue;

            String posEyes = face.substring(0, 1);
            if(!eyes.contains(posEyes)) continue;

            if(faceLength == 2) {
                String posMouth = face.substring(1, 2);
                if(!mouth.contains(posMouth)) continue;
            } else {
                String posNose = face.substring(1, 2);
                if(!nose.contains(posNose)) continue;

                String posMouth = face.substring(2, 3);
                if(!mouth.contains(posMouth)) continue;
            }

            smileys++;
        }
        return smileys;
    }
}
