package top.janker.pattern.adapter;

/**
 * Mp4格式播放器
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
