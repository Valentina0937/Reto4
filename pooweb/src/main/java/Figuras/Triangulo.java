package Figuras;



public class Triangulo extends Figura{
    //Atributos
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    //Método constructor vacío
    public Triangulo(){

    }
    //Método constructor con parametros
    public Triangulo(double base,double altura){
        super();
        this.base=base;
        this.altura=altura;
    }
    
    public Triangulo(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
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

    @Override
    public Double calcularArea(){
        double area=(base*altura)/2;
        System.out.println("El área del triangulo es "+area);
        return area;
        
    }
    public Double calcularPerimetro(){
        double perimetro=lado1+lado2+base;
        return perimetro;
    }
}

