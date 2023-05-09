package semana10;

public class Programa {
    public static void main(String[] args) {
        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;
        double areaRet1 = calcularArea(baseRet1, alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1, alturaRet1);

        System.out.println("Area do retangulo 1: " + areaRet1);
        System.out.println("Perimetro do retangulo 1: " + perimetroRet1);

        System.out.println("---------------------------------");

        // Objeto é uma instaância de uma classe
        String palavra = "abc";
        System.out.println(palavra.toUpperCase());

        Retangulo ret2 = new Retangulo(10.0, 5.0);

        Retangulo ret3 = new Retangulo();
        ret3.base = 30.0;
        ret3.altura = 100.0;

        System.out.println("Area do retangulo 2: " + ret2.calcularArea());
        System.out.println("Perimetro do retangulo 2: " + ret2.calcularPerimetro());
        
        System.out.println("Area do retangulo 3: " + ret3.calcularArea());
        System.out.println("Perimetro do retangulo 3: " + ret3.calcularPerimetro());

        System.out.println("---------------------------------");

        System.out.println("Area do retangulo 2: " + Retangulo.calcularArea(ret2.base, ret2.altura));
        System.out.println("Perimetro do retangulo 2: " + Retangulo.calcularPerimetro(ret2.base, ret2.altura));
        
        System.out.println("Area do retangulo 3: " + Retangulo.calcularArea(ret3.base, ret3.altura));
        System.out.println("Perimetro do retangulo 3: " + Retangulo.calcularPerimetro(ret3.base, ret3.altura));

        System.out.println("---------------------------------");

        // Objeto é uma instaância de uma classe
        Quadrado quad1 = new Quadrado(10.0);

        Quadrado quad2 = new Quadrado();
        quad2.lado = 30.0;
        
        System.out.println("Area do qudrado 1: " + quad1.calcularArea());
        System.out.println("Perimetro do qudrado 1: " + quad1.calcularPerimetro());
        
        System.out.println("Area do qudrado 2: " + quad2.calcularArea());
        System.out.println("Perimetro do qudrado 2: " + quad2.calcularPerimetro());

        System.out.println("---------------------------------");

        System.out.println("Area do qudrado 1: " + Quadrado.calcularArea(quad1.lado));
        System.out.println("Perimetro do qudrado 1: " + Quadrado.calcularPerimetro(quad1.lado));

        System.out.println("Area do qudrado 2: " + Quadrado.calcularArea(quad2.lado));
        System.out.println("Perimetro do qudrado 2: " + Quadrado.calcularPerimetro(quad2.lado));

        System.out.println("---------------------------------");

        // Objeto é uma instaância de uma classe
        Circulo circ1 = new Circulo(20.0);

        Circulo circ2 = new Circulo();
        circ2.raio = 35.0;

        System.out.println("Area do circulo 1: " + circ1.calcularArea());
        System.out.println("Perimetro do circulo 1: " + circ1.calcularPerimetro());
        
        System.out.println("Area do circulo 2: " + circ2.calcularArea());
        System.out.println("Perimetro do circulo 2: " + circ2.calcularPerimetro());

        System.out.println("---------------------------------");

        System.out.println("Area do circulo 1: " + Circulo.calcularArea(circ1.raio));
        System.out.println("Perimetro do circulo 1: " + Circulo.calcularPerimetro(circ1.raio));
        
        System.out.println("Area do circulo 2: " + Circulo.calcularArea(circ2.raio));
        System.out.println("Perimetro do circulo 2: " + Circulo.calcularPerimetro(circ2.raio));

    }

    // area = base * altura 
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    // perimetro = 2 * (lado + altura)
    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    
}
