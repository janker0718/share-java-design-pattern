package top.janker.pattern.adapter;

/**
 * 影音播放器
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}