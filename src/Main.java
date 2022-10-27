public class Main {

    public static void main (String[] args){

        Employee emmaEmeka =  new Employee("emma", "emeka", "1233" );
        Employee ucheKing =  new Employee("uchenna", "kinsely", "133" );
        Employee favourObi =  new Employee("Favour", "obi", "3458" );
        Employee paulKamso =  new Employee("paul", "kamso", "3452" );
        Employee henryObi =  new Employee("Henry", "Obi", "3442" );
//        Employee Amanda =  new Employee("Amanda", "Obi", "7852" );

        simpleHashtable hashtable = new simpleHashtable();

        hashtable.put("emma", emmaEmeka );
        hashtable.put("ucheKi", ucheKing );
        hashtable.put("obi", favourObi );
        hashtable.put("kamsowert", paulKamso );
        hashtable.put("henryerty", henryObi );
        hashtable.put("henryerty", henryObi );

        hashtable.printHashTable();

        System.out.println("Retrieve key kamso " + hashtable.get("kamso"));
System.out.println("           ");
        hashtable.remove("emma");
        hashtable.remove("henryerty");

        hashtable.printHashTable();


    }
}
