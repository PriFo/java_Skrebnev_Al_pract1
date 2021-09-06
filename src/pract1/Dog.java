package pract1;

public class Dog {
    private int age;
    private String name;
    public Dog() {
        this.age = 0;
        this.name = "Pup";
    }
    public Dog(int age) {
        this.age = age;
        this.name = "Pup";
    }
    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }
    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getInfo(){
        return("Name: "+this.name+"\nAge: "+this.age);
    }
    public int getAge(){
        return (this.age);
    }
    public String getName(){
        return (this.name);
    }
    public String getHumanAge(){
        return("Human age: "+this.age*7);
    }
}
