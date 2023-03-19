import java.util.*;

public class Main {

    public static void main(String[] args) {
//        toDoList();

        List<String> names = new ArrayList<>();
        names.add("Dumitru");
        names.add("Dumitru");
        names.add("Ion");
        names.add("Aurel");
        names.add("Ian");
        names.add("Ian");

//        for (String s : names){
//            System.out.println(s);
//        }

//        uniqueValue(names);
        dictionary();

    }

    public static List<String> toDoList(){
        List<String> toDo = new ArrayList<>();
        toDo.add("Spalat vesela");
        toDo.add("Aspirat prin casa");
        toDo.add("Facut cumparaturi");
        toDo.add("De citit 1 ora");

        System.out.println(toDo);
        return toDo;
    }

    public static Set<String> uniqueValue(List<String> value){
        Set<String> uniqueValue = new HashSet<>(value);
        System.out.println(uniqueValue);
        return uniqueValue;
    }

    public static void dictionary(){
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("Orange", "Portocala");
        dictionary.put("Colors", "Culori");
        dictionary.put("Apple", "Mar");
        dictionary.put("Verbs", "Verbe");
        dictionary.put("Hair", "Par");
        dictionary.put("Mouse", "Soarece");
        dictionary.put("Head", "Cap");
        dictionary.put("Mix", "Amestec");
        dictionary.put("Car", "Masina");
        dictionary.put("Cycle", "Bicicleta");

        for(Map.Entry<String, String> s : dictionary.entrySet()){
            System.out.println(s.getKey() + " : " + s.getValue());
        }
    }

}
