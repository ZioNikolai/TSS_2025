package es_ereditarieta;

public class Esercizio {

    // Classe base statica
    static class FormaGeometrica {
        public double calcolaArea() {
            return 0;
        }
        public double calcolaPerimetro() {
            return 0;
        }
    }

    // Cerchio
    static class Cerchio extends FormaGeometrica {
        private double raggio;
        public Cerchio(double raggio) {
            this.raggio = raggio;
        }
        @Override
        public double calcolaArea() {
            return Math.PI * raggio * raggio;
        }
        @Override
        public double calcolaPerimetro() {
            return 2 * Math.PI * raggio;
        }
    }

    // Rettangolo
    static class Rettangolo extends FormaGeometrica {
        protected double base, altezza;
        public Rettangolo(double base, double altezza) {
            this.base = base;
            this.altezza = altezza;
        }
        @Override
        public double calcolaArea() {
            return base * altezza;
        }
        @Override
        public double calcolaPerimetro() {
            return 2 * (base + altezza);
        }
    }

    // Quadrato eredita da Rettangolo
    static class Quadrato extends Rettangolo {
        public Quadrato(double lato) {
            super(lato, lato);
        }
    }

    // Triangolo
    static class Triangolo extends FormaGeometrica {
        private double lato1, lato2, lato3;
        public Triangolo(double lato1, double lato2, double lato3) {
            this.lato1 = lato1;
            this.lato2 = lato2;
            this.lato3 = lato3;
        }
        @Override
        public double calcolaArea() {
            double s = (lato1 + lato2 + lato3) / 2;
            return Math.sqrt(s * (s - lato1) * (s - lato2) * (s - lato3)); // Erone
        }
        @Override
        public double calcolaPerimetro() {
            return lato1 + lato2 + lato3;
        }
    }

    // Metodo main
    public static void main(String[] args) {
        FormaGeometrica[] forme = {
            new Cerchio(5),
            new Rettangolo(4, 6),
            new Quadrato(3),
            new Triangolo(3, 4, 5)
        };

        for (FormaGeometrica forma : forme) {
            System.out.println(forma.getClass().getSimpleName() + ":");
            System.out.printf("  Area: %.2f\n", forma.calcolaArea());
            System.out.printf("  Perimetro: %.2f\n\n", forma.calcolaPerimetro());
        }
    }
}

