public class Main {
    public static void main(String[] args) {
        Cuadrado _cuadrado = new Cuadrado(5);
     
        Rectangulo _rectangulo = new Rectangulo(8, 5);

        Triangulo _triangulo = new Triangulo(5, 8);

        Forma[] array_forma = new Forma[3];
        array_forma[0] = _cuadrado;
        array_forma[1] = _rectangulo;
        array_forma[2] = _triangulo;
        for (Forma f : array_forma) {
            f.dibujar_puntos();
            f.rellenar_forma();
            f.calcular_area();
            f.calcular_perimetro();
        }
    }
}
