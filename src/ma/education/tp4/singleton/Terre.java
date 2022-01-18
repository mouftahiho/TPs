package ma.education.tp4.singleton;

public class Terre {
    private static Terre tr;
    double distanceToSoleil;
    double surface;

    public Terre(double distanceToSoleil, double surface) {
        this.distanceToSoleil = distanceToSoleil;
        this.surface = surface;
    }

    public static Terre getInstance(double distanceToSoleil, double surface){

        if (tr==null)
            tr=new Terre(distanceToSoleil,surface);
            return tr;

    }
}
