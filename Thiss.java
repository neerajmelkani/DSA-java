class Student {

    String name;

    void setName(String name) {
        this.name = name;  // this refers to instance variable
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rahul");
        s1.display();
    }
}