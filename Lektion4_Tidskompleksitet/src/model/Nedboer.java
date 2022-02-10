package model;

import javax.print.attribute.standard.RequestingUserName;
import java.io.PrintWriter;

public class Nedboer {
    private int[] nedboerPrUge = {20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
            15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
            0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
            19, 21, 32, 24, 13};

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */

    public int bedsteTreFerieUger() {
        int bedsteuge = 0;
        int sum = 0;
        int regnbedsteuge = Integer.MAX_VALUE;
        for (int i = 0; i <= nedboerPrUge.length - 3; i++) {
            sum = nedboerPrUge[i] + nedboerPrUge[i + 1] + nedboerPrUge[i + 2];
            if (sum < regnbedsteuge) {
                bedsteuge = i + 1;
                regnbedsteuge = sum;

            }
        }
        return bedsteuge;
    }

    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */

    public int bedsteFerieUgerStart(int antal) {
        int sum = 0;
        int bedsteuger = 0;
        int regnbedsteuge = Integer.MAX_VALUE;

        for (int i = 0; i <= nedboerPrUge.length - antal; i++) {
            sum = 0;
            for (int j = 0; j < antal; j++) {
                sum += nedboerPrUge[i + j];
            }
            if (sum < regnbedsteuge) {
                bedsteuger = i + 1;
                regnbedsteuge = sum;
            }
        }

        return bedsteuger;
    }

    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */
    public int ensNedboer(){
        int index = 0;
        int result = 0;
        int counter  = 0;
        for (int i = 0; i < nedboerPrUge.length-1; i++) {
            if (nedboerPrUge[i] == nedboerPrUge[i+1]){
                counter++;
                if (counter > result){
                    index = i;
                    result = counter;
                }
            }
            else {
                counter = 0;
            }
        }
        return index - result;
    }




}
