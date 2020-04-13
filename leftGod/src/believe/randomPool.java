package believe;

import java.util.HashMap;

public class randomPool {
    HashMap<Object,Integer> hashMap1;
    HashMap<Integer,Object> hashMap2;
    int size;

    public randomPool(){
        hashMap1 = new HashMap<>();
        hashMap2 = new HashMap<>();
        size = 0;
    }


    public void insert(Object key){
        if (!hashMap1.containsKey(key)){
            hashMap1.put(key,size);
            hashMap2.put(size,key);
            size++;
        }else {
            return;
        }
    }

    public Object getRandom(){
        if (size>0){
            return hashMap2.get((int)Math.random()*size);
        }
        return null;
    }

    public void delete(Object key){
        if (hashMap1.containsKey(key)){
            //删除的索引
            int deletIndex = hashMap1.get(key);
            //最后一个对象
            int lastIndex = size-1;
            Object lastkey = hashMap2.get(lastIndex);

            hashMap1.put(lastkey,deletIndex);
            hashMap2.put(deletIndex,lastkey);

            hashMap1.remove(key);
            hashMap2.remove(lastIndex);
        }
    }



}
