import java.util.LinkedList;

public class CustomHashTable {
    LinkedList<Object>[] hashTable = new LinkedList[5];
    int index;

    public void put(String key, String value) {
        index = key.hashCode()%hashTable.length;

        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].addLast(new EntrySet(key, value));
        }else{
            for(int i = 0; i<hashTable[index].size();i++){
                EntrySet set = (EntrySet) hashTable[index].get(i);

                if (set.getKey()==key){
                   set.setValue(value);
                }else{
                    hashTable[index].addLast(new EntrySet(key, value));
                }
            }
        }
    }

    public String get(String key){
        index = key.hashCode()%hashTable.length;

        for(int i = 0; i<hashTable[index].size();i++){
            EntrySet set = (EntrySet) hashTable[index].get(i);

            if(set.getKey()==key){
                return set.getValue();
            }
        }
        return null;
    }

    public void remove(String key){

    }

}
