/**
 * Created by Alexander on 11/05/2016.
 */
public class Mp4Player implements  AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        //do nothing
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. Name : " + filename);
    }
}
