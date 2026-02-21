package Local;

class Copies {
    String name;
    int age;
    public Copies(int age,String name){
        this.name=name;
        this.age=age;
    }
    public Copies(Copies other){
        this.name=other.name;
        this.age=other.age;
    }
    void display() { System.out.println("Name: " + name + ", Age: " + age); }
}
public class Copy{
    public static void main(String args[]){

        Copies c1=new Copies(23,"Jay");
        Copies c2= new Copies(c1);
        c1.name="Ram";
        c2.name="Sita";
        c1.age=23;
        c2.age=16;
        c1.display();
        c2.display();
    }

}

