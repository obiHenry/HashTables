import java.util.Objects;

public class Employee {
    private String  username;
    private  String name;
    private  String id;

    public Employee(String username, String name, String id) {
        this.username = username;
        this.name = name;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return username.equals(employee.username) && name.equals(employee.name) && id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, name, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
