public class Employee {
    String name;
    String position;
    long phone;
    int salary;
    int age;
    int id;

    public Employee(String name, String position, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        //this.id++ = ID;
    }

    public static void ID(Employee[] staff){
        int ID = 1;
        for (int i = 1; i < staff.length; i++) {
            ID+=1;
            System.out.println("ID: " + ID);
        }
    }


    public int getID(Employee[] staff) {
        int ID = 1;
        for (int i = 1; i < staff.length; i++) {
            ID++;
        }
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public long getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getFullInfo() {
        return  " name: " + name + " | position: " + position
                + " phone : " + phone + " | salary: " + salary + " | age: "
                + age;
    }
}
