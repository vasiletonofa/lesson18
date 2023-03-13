import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1. array, List, Set

        String a[]  = new String[1000];
        a[0] = "S";

        ArrayList<String> list = new ArrayList<>();

         list.add("B");
         list.add("A");

         Set<String> set = new HashSet<>();
         set.add("A");
         set.add("B");

         // B, A

        Set<String> set2 = new TreeSet<>();
        set.add("A");
        set.add("B");

        // A, B


        Set<String> set3 = new HashSet<>();
        set3.add("Hello");


        Map<Employee, String> map = new HashMap<>();

        Employee employee = new Employee();
        Employee employe2 = new Employee();

        map.put(employee, "Value1");
        map.put(employe2, "Value2");

        map.get(employee);

        for(Employee employee1 :  map.keySet()) {
            System.out.println(map.get(employee1)); // Value1, Value2
        }

        Map<String, Employee> employeeMap = new HashMap<>();
        Employee e =  new Employee(22, "Ion");

        employeeMap.put("Key1", e);

        Employee emp =  employeeMap.get("Key1");

        employeeMap.clear();

        employeeMap.containsKey("Key1");
        employeeMap.containsValue(emp);



        Map<String, List<Employee>> map3 = new HashMap<>();

        List<Employee> employees = new ArrayList<>();
        employees.add(e);

        map3.put("PROGRAMATORI", employees);



        Map<String, Integer> contor = new HashMap<>();

        contor.put("APA", 2345);  // String.hashCode() => 678
        contor.put("LUMINA", 3456);

        contor.put("LUMINA", 1);
        contor.put("APA", 2);  // String.hashCode() => 678

        // APA: 789980,  LUMINA: 98765

        Map<String, Integer> contor2 = new HashMap<>();

        contor2.putAll(contor);

        contor.clear();





        Employee emp1 = new Employee(22, "Ion");
        Employee emp3 = new Employee(22, "Gheorghe");
        Employee emp2 = new Employee(23, "Vasile");

        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(emp1);
        employeeSet.add(emp3);

        // 123 -> emp1
        // 345 -> emp3

        Map<Employee, String> employeeMap1 = new HashMap<>();

        employeeMap1.put(emp1, "Value1");   // 22
//        employeeMap1.put(emp3, "Value1");  // 22
        employeeMap1.put(emp3, "Value1");  // 22
//        employeeMap1.put(emp2, "Value3");  // 23
        employeeMap1.put(emp2, "Value4");  // 23

        employeeMap1.put(emp2, "Value3");  // 23
        employeeMap1.put(emp2, "Value4");  // 23
        employeeMap1.put(emp2, "Value3");  // 23


        // 123 -> (emp1, "Value1"), (emp2, "Value3"), emp1.equals(emp2)
        // 123 -> (emp1, "Value1"), (emp2, "Value4"), emp1.equals(emp2)


        // 123 -> "Value1", "Value4"
        // 123 -> "Value1", "Value4"


        boolean ac = employeeMap1.containsValue("Value4");


        for(Employee employee1 :  map.keySet()) {
            System.out.println(employee1.varsta);
            System.out.println(employee1.nume);
            String val = map.get(employee1); // Value1
            System.out.println(val); // Value1, Value2
        }


        // 123 -> (emp1, "Value1") -> emp1.equals(emp2) -> emp2.equals(emp2) ->  (emp2, "Value4")
        // 345 -> (emp3, "Value2")


        // 1. Pentru fiecare cheie care este o clasa creata de noi, trebuie sa adaugam equals si hashcode

        employeeMap1.size(); // 2

        Map<String, Employee> employeeMap2 = new HashMap<>();

        employeeMap2.put("Cey1", new Employee(22, "Ion"));
        employeeMap2.put("IDNP:234235345345654", new Employee(22, "Ion"));

        String idnp = "IDNP" + 1233445;

        employeeMap2.put(idnp, new Employee(22, "Ion"));

        Employee empw =  employeeMap2.get("Key1");

        Employee e12 = new Employee(23, "Ion"); // 123
        Employee e45 = e12; // 123




    }
}