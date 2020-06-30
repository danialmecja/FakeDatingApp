
package fakedatingsim;

import java.io.File;
import javax.sound.sampled.*;


public class music{
    
    public Clip clip;
    public Clip clipT;

    public void music(){
        try{
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("music.wav"));
            clip.open(inputStream);
            clip.start(); 
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    public void stop(){
        clip.stop();
    }
    
}
