public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Harry Potter", 100, 100, 100, 100, 100);
    //    System.out.println(harry);
     //  System.out.println(harry.calculateSpecificScore());
     //   System.out.println(harry.calculateGeneralScore());

        Slytherin draco = new Slytherin("Draco Malfoy", 85, 85,90,70, 90,80,100);
   //     System.out.println(draco.calculateSpecificScore());
    //    System.out.println(draco.calculateGeneralScore());

        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 50, 50, 50, 80, 50, 50, 50);

        gregoryGoyle.compare(draco);

    }
}
