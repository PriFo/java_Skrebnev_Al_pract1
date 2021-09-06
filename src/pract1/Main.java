package pract1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("What do you want to see? 1 - dog, 2 - book");
        int choice;
        Scanner in = new Scanner(System.in);
        choice = in.nextInt();
        switch(choice){
            case 1:
                System.out.println("What do you know about this dog? 1 - age and name, 2 - name, 3 - age, 4 - nothing");
                choice = in.nextInt();
                switch(choice){
                    case 1:
                        Dog dog1 = new Dog(in.nextInt(), in.next());
                        System.out.println(dog1.getInfo());
                        System.out.println(dog1.getHumanAge());
                        break;
                    case 2:
                        Dog dog2 = new Dog(in.next());
                        dog2.setAge(in.nextInt());
                        System.out.println(dog2.getInfo());
                        System.out.println(dog2.getHumanAge());
                        break;
                    case 3:
                        Dog dog3 = new Dog(in.nextInt());
                        dog3.setName(in.next());
                        System.out.println(dog3.getInfo());
                        System.out.println(dog3.getHumanAge());
                        break;
                    case 4:
                        Dog dog4 = new Dog();
                        dog4.setAge(in.nextInt());
                        dog4.setName(in.next());
                        System.out.println(dog4.getInfo());
                        System.out.println(dog4.getHumanAge());
                        break;
                }
                break;
            case 2:
                System.out.println("What do you know about this book?\n1 - all\n2 - name and author\n3 - year and name\n4 - year\n5 - author\n6 - nothing");
                choice = in.nextInt();
                switch(choice){
                    case 1:
                        Book book1 = new Book(in.nextInt(), in.next(), in.next());
                        System.out.println(book1.getInfo());
                        break;
                    case 2:
                        Book book2 = new Book(in.next(), in.next());
                        book2.setYear(in.nextInt());
                        System.out.println(book2.getInfo());
                        break;
                    case 3:
                        Book book3 = new Book(in.nextInt(), in.next());
                        book3.setAuthor(in.next());
                        System.out.println(book3.getInfo());
                        break;
                    case 4:
                        Book book4 = new Book(in.nextInt());
                        book4.setAuthor(in.next());
                        book4.setName(in.next());
                        System.out.println(book4.getInfo());
                        break;
                    case 5:
                        Book book5 = new Book(in.next());
                        book5.setName(in.next());
                        book5.setYear(in.nextInt());
                        System.out.println(book5.getInfo());
                        break;
                    case 6:
                        Book book6 = new Book();
                        book6.setYear(in.nextInt());
                        book6.setAuthor(in.next());
                        book6.setName(in.next());
                        System.out.println(book6.getInfo());
                        break;
                }
                break;
        }
    }
}
