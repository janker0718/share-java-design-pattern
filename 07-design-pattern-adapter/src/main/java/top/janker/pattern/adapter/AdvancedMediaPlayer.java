package top.janker.pattern.adapter;

/**
 * 更高级的播放器
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface AdvancedMediaPlayer {
    //播放vlc格式
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
