package club.banyuan;

public class ArrayList implements List {

    private Object [] arrayList = new Object[8];
    public Object set (int index, Object element) {
        if (index >= arrayList.length) {
            System.out.println("error index");
        }
        Object updateElement = arrayList[index];
        arrayList[index] = element;
        return updateElement;
    }

    @Override
    public Object get(int index) {
        if(index >= arrayList.length) {
            System.out.println("error index");
        }

        return arrayList[index];
    }

    @Override
    public void clear() {
        for (int i = 0;i < arrayList.length;i++) {
            arrayList[i] = null;
        }

    }

    @Override
    public Object remove(int index) {
        if (index > arrayList.length) {
            System.out.println("error index");
            return null;
        }
        Object removeElement = get(index);
        for (int i = index ;i < arrayList.length; i++) {
            arrayList[i] = arrayList[i+1];
        }
        return removeElement;
    }

    @Override
    public boolean remove(Object o) {
        boolean isRemove = false;
        for(int i = 0;i < arrayList.length;i++) {
            if (arrayList[i] == o) {
                for (int j = i; j < arrayList.length; j++) {
                    arrayList[j] = arrayList[j+1];
                }
                isRemove = true;
            }
            else
            {
                isRemove = false;
            }
        }
        return isRemove;
    }


    @Override
    public boolean add(Object o) {
        boolean isAdd = false;
        for (int i = 0;i < arrayList.length;) {
            if (arrayList[i] != null){
                i++;
                isAdd = false;
            }else{
                arrayList[i]=o;

                isAdd = true;

                break;
            }
        }
        return isAdd;
    }

    @Override
    public boolean isEmpty() {
        boolean isempty = false;
        for (int i = 0;i < arrayList.length;i++) {
            if (arrayList[i] != null){
                isempty = true;
            }
            else {
                isempty = false;
            }
        }
        return isempty;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0;i < arrayList.length;i++) {
            if (arrayList[i] != null) {
                count ++;
            }
        }
        return count;
    }
}
