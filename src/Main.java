public class Main {
    public static void main(String[] args){

        Book b = new Book();
        // use setters to set values
        b.setCode("7856562");
        b.setDescription("guide book for learning a programming in Java.");
        b.setPrice(29.99);
        b.setAuthor("Nahom Haile");
        b.setPages(359);


        Book c = new Book();
        // use setters to set values

        b.setCode("5545455");
        b.setDescription("guide book for learning a programming in Python.");
        b.setPrice(25.99);
        b.setAuthor("Hermn Tes");
        b.setPages(310);

        Software s = new Software();
        // use setters to set values

        s.setCode("IntelliJ");
        s.setDescription("guide book for learning a programming in Java.");
        s.setPrice(29.99);
        s.setOs("All");
        s.setPlatform("IDE");
        s.setProgrammer("Java");

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());
    }
}
