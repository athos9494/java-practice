package club.banyuan;

import java.util.*;

public class PersonalRecommendor implements Recommendor{

    private Map<String, Set<String>> likes = new HashMap<>();

    @Override
    public void addLikes(String person, String project) {

        Set<String> personLikes;
        if (likes.containsKey(person)){
            personLikes = likes.get(person);
        }
        else {
            personLikes = new HashSet<>();
            likes.put(person,personLikes);
        }
        personLikes.add(project);

    }

    @Override
    public boolean likesBoth(String person, String project1, String project2) {

        if (!likes.containsKey(person)){
            throw new UnknownPersonException();
        }
        Set<String> project = likes.get(person);

        return project.containsAll(Set.of(project1,project2));
    }

    @Override
    public List<String> recommendByPerson(String person) {
        return new ArrayList<>(likes.get(person));
    }

    @Override
    public List<String> recommendByProject(String project) {
        Set<String> rlt = new HashSet<>();
        for (Set<String> value : likes.values()){
            if (value.contains(project)){
                rlt.addAll(value);
            }
        }
        rlt.remove(project);
        return new ArrayList<>(rlt);
    }

}
