package top.janker.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准女性
 * @author janker
 * @date 2022/4/3
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
