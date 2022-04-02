package top.janker.pattern.filter;

import java.util.List;

/**
 * 标准接口
 * @author janker
 * @date 2022/4/3
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface Criteria {
    //符合标准
    public List<Person> meetCriteria(List<Person> persons);
}
