package Figuras;


public class Circulo extends Figura{
    //Atributos
    private double radio;
    //Método constructor vacío
    public Circulo(){

    }
    //Método contructor con parametros
    public Circulo(Double radio){
        super();
        this.radio=radio;
    }
    //Métodos accesores
    public double getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    //Métodos

    public Double calcularArea(){
        double area=3.1416*(radio*radio);
        System.out.println("El área del círculo es "+area);
        return area;
    }
    public Double calcularPerimetro(){
        double perimetro=2*3.1416*radio;
        System.out.println("El área del círculo es "+perimetro);
        return perimetro;
    }

}
