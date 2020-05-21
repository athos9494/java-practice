package club.banyuan;

public interface Recommendor {
    public void addLikes(String name, String objectName);
    public boolean likeBoth(String name , String objectName1 ,String objectName2);
    public void recmmendByPerson(String name);
}
