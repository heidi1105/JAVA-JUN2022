// import java.util.ArrayList;
import java.util.*;

class JavaFun{
    public static void main(String[] args){
        System.out.println("Hello");

        // ---- fixed array ------
        // fixed array of int
        int[] intFixedArray; // declare this variable
        intFixedArray = new int[5];  // instantiate the array
        intFixedArray[0] = 100;
        intFixedArray[1] = 200;
        intFixedArray[2] = 300;


        System.out.println(intFixedArray); // memory address
        for(int i=0; i<intFixedArray.length; i++){
            System.out.println(intFixedArray[i]);
        }

        // fixed array of different item names
        String[] itemFixedArray ={"Red Gaming Chair", "Potato", "Tuna", "Black belt"}; 
        // new String[4] , arr[0] = Red Gaming Chair...
        System.out.println(itemFixedArray.length);


        // ------ dynamic array --------
        // ArrayList
        ArrayList<Integer> intArrayList; // declare the variable
        intArrayList = new ArrayList<Integer>();// instantiate the array
        intArrayList.add(100);
        intArrayList.add(200);
        intArrayList.add((int)9.99);
        System.out.println(intArrayList);


        ArrayList<String> itemArrayList = new ArrayList<String>();
        itemArrayList.add("Red Gaming Chair");
        itemArrayList.add("Red Belt");
        itemArrayList.add("Disneyland ticket");
        System.out.println(itemArrayList);

        ArrayList<Object> things = new ArrayList<>();
        things.add("Pepper");
        things.add(14);
        things.add(true);
        things.add(new ArrayList<String>());

        System.out.println(things);

        itemArrayList.set(0, "Blue Gaming Chair");

        // .get
        for(int i=0; i< itemArrayList.size(); i++){
            System.out.println(i + " : " + itemArrayList.get(i));
        } 
        
        // enhanced loop 
        for(String element: itemArrayList){
            System.out.println(element);
        }
        // int
        for(Integer whatever: intArrayList ){
            System.out.println(whatever);
        }

        // key-value pair -- hashmap
        HashMap<String, Integer> petmap = new HashMap<String, Integer>();
        petmap.put("Pepper", 14);
        petmap.put("Stitch", 2);
        petmap.put("idk", 100);
        petmap.put("Pepper", 20);
        Integer age = petmap.get("Pepper");
        System.out.println(age);

        Set<String> keys = petmap.keySet();
        // Set<String> testSet = new HashSet<String>();
        // testSet.add("testing");
        // testSet.add("testing1");
        // testSet.add("testing2");
        // testSet.add("testing");

        // for(String ele: testSet){
        //     System.out.println(ele);
        // }
        


        for(String key: keys){
            System.out.println("Key: " + key);
            System.out.println("Value: " + petmap.get(key));
        }


    }
}