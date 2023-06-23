package Figuras;



public class Rectangulo extends Figura {
    //Atributos
    private double base;
    private double altura;
    //Método constructor vacío
    public Rectangulo(){

    }
    //Método constructor con parametros
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    //Métodos accesores
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Métodos

    public Double calcularArea(){
        double area=base*altura;
        System.out.println("El área del rectángulo es "+area);
        return area;
    }
    public Double calcularPerimetro(){
        double perimetro= (base+altura)*2;
        System.out.println("El perimetro del rectángulo es "+perimetro);
        return perimetro;
    }
}
