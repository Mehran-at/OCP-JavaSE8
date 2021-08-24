package advancedClassDesign._15fifteen;

public class VisitPark {
    enum AnimalsPark {
        SQUIRREL, CHIPMUNK, SPARROW;
    }

    public static void main(String[] args) {
        AnimalsPark[] animals = AnimalsPark.values();
        System.out.println(animals[1]);
    }
}
