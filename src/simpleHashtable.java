public class simpleHashtable {


    public  StoredEmployee[] hashTable;

    public simpleHashtable(){
        hashTable = new StoredEmployee[10];
    }

    public void  put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if (isOccupied(hashedKey)){
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length -1){
                hashedKey = 0;
            }else {
                hashedKey++;
            }
            while (isOccupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }
        System.out.println(hashKey(key));

        if (isOccupied(hashedKey)){
            System.out.println("Sorry, there's already an employee at position" + hashedKey);
        }else {
            hashTable[hashedKey] = new StoredEmployee(key,employee);
        }
    }

    public  Employee get(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1){
            return null;
        }
        return hashTable[hashedKey].employee;
    }

    public  Employee remove(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1){
            return null;
        }

        Employee employee = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;

        StoredEmployee[] oldHashTable = hashTable;
        hashTable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length;i++){
            if (oldHashTable[i] != null){
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }
        return employee;
    }

    private  int hashKey(String key){
        return key.length() % hashTable.length;
    }

    private int findKey(String key){
        int hashKey = hashKey(key);
        if (hashTable[hashKey] != null && hashTable[hashKey].key.equals(key)) {

            return hashKey;
        }
        int stopIndex = hashKey;
            if (hashKey == hashTable.length -1){
                hashKey = 0;
            }else {
                hashKey++;
            }
            while (hashKey != stopIndex && hashTable[hashKey] != null && !hashTable[hashKey].key.equals(key)){
                hashKey = (hashKey + 1) % hashTable.length;
            }

            if (hashTable[hashKey] != null && hashTable[hashKey] .key.equals(key)){
                return hashKey;
            }else {
                return  -1;
            }

    }
    private boolean isOccupied(int index){
        return hashTable[index] != null;
    }

    public void printHashTable(){
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null){
                System.out.println("empty");
            }else {
                System.out.println( "Position" + i + ": " + hashTable[i].employee);
            }
        }

    }
}
