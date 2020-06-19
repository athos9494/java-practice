package club.banyuan;

public class GenericDemo<K,V> {
    private K key;
    private V value;
    public void setKey(K key){
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
class Test{
    public static void main(String[] args) {
        GenericDemo<String,Integer> genericDemo = new GenericDemo();
        genericDemo.setKey("carl");
        genericDemo.setValue(23);
        System.out.println("name:"+genericDemo.getKey()+"-age:"+genericDemo.getValue());
    }
}

