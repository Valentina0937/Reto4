package Figuras;



public class Trapecio extends Figura {
    //Atributos
    private double baseMenor;
    private double baseMayor;
    private double altura;
    private double lado1;
    private double lado2;

    //Método contructor vacío
    public Trapecio(){

    }
    //Método constructor on parametros

    public Trapecio(double baseMenor, double baseMayor, double altura) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
    }

    
    //Método accesores

    public Trapecio(double baseMenor, double baseMayor, double lado1, double lado2) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
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
        double area=((baseMayor+baseMenor)/2)*altura;
        System.out.println("EL área del trapecio es: "+area);
        return area;
    }
    public Double calcularPerimetro(){
        double perimetro=baseMayor+baseMenor+lado1+lado2;
        System.out.println("EL área del trapecio es: "+perimetro);
        return perimetro;
    }
    
}
