package opgave3sortedlinkelistdouble;

import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) {
        SortedLinkedListDouble s1 = new SortedLinkedListDouble();

        s1.addElement("basdf");
        s1.addElement("asaf");
        s1.addElement("C");

        s1.udskrivElements();
        System.out.println();
        s1.udskrivBagfra();

        System.out.println(s1.countElements());
    }
}
