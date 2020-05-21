package club.banyuan;

import java.util.List;

public interface Recommendor {
    public void addLikes(String person, String project);
    public boolean likesBoth(String person , String project1 ,String project2);
    List<String> recommendByPerson(String person);
    List<String> recommendByProject(String project);
}
