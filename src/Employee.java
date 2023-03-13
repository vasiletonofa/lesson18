public class Employee {


    String profesie;

    int varsta;

    String nume;

    String familia;


    public Employee(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        return nume.equals(employee.nume) && familia.equals(employee.familia) && varsta == employee.varsta;
    }

    @Override
    public int hashCode() {
        return varsta; // 22   23
    }
}
