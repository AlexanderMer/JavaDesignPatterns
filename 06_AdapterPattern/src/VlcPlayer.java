/**
 * Created by Alexander on 11/05/2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name : " + filename);
    }

    @Override
    public void playMp4(String filename) {
        //do nothing
    }
}
