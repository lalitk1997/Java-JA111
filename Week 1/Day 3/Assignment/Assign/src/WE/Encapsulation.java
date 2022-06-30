package WE;

public class Encapsulation {
    String artist;
    String title;
    void play(){
        System.out.println(artist+" is singing "+title);
    }
    public static void main(String[] args) {
        // State & Behaviour Of Object DOUBT

        // WE.Encapsulation: This is the basic principle of object-oriented programming, according to this
        // principle, we bundle the data and methods, that operate on that data in a single
        // unit. DOUBT

        // Static members belongs to the class.
        // Non-Static members belongs to the object.
        Encapsulation track1 = new Encapsulation();
        track1.artist = "Lata";
        track1.title = "Aye Mere Watan Ke Logo";
        track1.play();

        Encapsulation track2 = new Encapsulation();
        track2.artist = "A R Rehman";
        track2.title = "O Jane Jana";
        track2.play();
    }
}
