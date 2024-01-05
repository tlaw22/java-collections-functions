public class Employee implements Comparable<Employee> {
    String name;
    int wadge;
    String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWadge() {
        return wadge;
    }

    public void setWadge(int wadge) {
        this.wadge = wadge;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String name, int wadge, String department) {
        this.name = name;
        this.wadge = wadge;
        this.department = department;
    }

    @Override
    public int compareTo(Employee o) {
        
        if(this.wadge < o.getWadge()){
            return -1;
        } else if (this.wadge > o.getWadge()){
            return 1;
        }
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", wadge=" + wadge + ", department=" + department + "]";
    }
    
}
