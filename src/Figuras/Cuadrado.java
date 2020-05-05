
package Figuras;


public class Cuadrado implements Figura{
    
        private double lado;
    
    public Cuadrado(){
        
    }
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
    
    @Override
    public double calcularArea(){
        double resultado;        
        resultado = Math.pow(lado, 2);
        return resultado;
    }
    
    @Override
    public void dibujar(){
        System.out.println("Dibujando un cuadrado");
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override 
    public String toString(){
        return "Este es un cuadrado de lado " + lado;
    }
}
