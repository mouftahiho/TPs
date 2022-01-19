package abstarctkeyword;

public class Test {

    FormeGeometrique f3 = new Triangle();
    FormeGeometrique f4 = new FormeGeometrique() {
        @Override // Classe fille Annonyme
        public double calculerSurface() {
            return 22;
        }
    };
}
