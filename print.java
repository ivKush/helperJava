import java.net.Socket;

import javax.annotation.processing.SupportedOptions;
import javax.sound.midi.Soundbank;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/**
 * print
 */
public class print {
    public static void name(String[] args) {
        String a = "abcde";

        System.out.print(a); // Вывод в строку
        System.out.println(a); // Вывод по строчно
    }
    
    name(); 
}