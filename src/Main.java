public class Main {
    public static void main(String[] args) {
        Cuadrado _cuadrado = new Cuadrado(5);
        _cuadrado.dibujar_puntos();
        _cuadrado.rellenar_forma();
        System.out.println("El area del cuadrado es: "+_cuadrado.calcular_area());
        System.out.println("El perimetro del cuadrado es: "+_cuadrado.calcular_perimetro());
        Rectangulo _rectangulo = new Rectangulo(8,5);
        _rectangulo.dibujar_puntos();
        _rectangulo.rellenar_forma();
        System.out.println("El area del rectangulo es: "+_rectangulo.calcular_area());
        System.out.println("El perimetro del rectangulo es: "+_rectangulo.calcular_perimetro());
        Triangulo _triangulo = new Triangulo(5,8);
        _triangulo.dibujar_puntos();
        _triangulo.rellenar_forma();
        System.out.println("El area del triangulo es: "+_triangulo.calcular_area());
        System.out.println("El perimetro del triangulo es: "+_triangulo.calcular_perimetro());
        Forma[] array_forma = new Forma[3];
        array_forma[0] = _cuadrado;
        array_forma[1] = _rectangulo;
        array_forma[2] = _triangulo;
    }
}
