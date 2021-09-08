package métodos.get.set.e.construtores;
public class Figura {
    private int lado1;
    private int lado2;
    private int lado3;
    private int raio;
    private String tipo;
    
    
    //métodos getter e setter
    public int getLado1() {
        return this.lado1;
    }
    public void setLado1(int l1) {
        this.lado1 = l1;
    }
    public int getLado2() {
        return this.lado2;
    }
    public void setLado2(int l2) {
        this.lado2 = l2;
    }
    public int getLado3() {
        return this.lado3;
    }
    public void setLado3(int l3) {
        this.lado3 = l3;
    }
    public int getRaio() {
        return this.raio;
    }
    public void setRaio(int r) {
        this.raio = r;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String mostraStatus(int lado1, int lado2, int lado3, int raio) {
        if (lado1 != 0 || lado2 != 0){
            System.out.println(lado1 + lado2);
        }if(lado3 != 0){
            System.out.println(lado3);
        }if(raio != 0){
            System.out.println(raio);
        }
     return null;   
    }
//construtores
     //construtores para quadrados
    public Figura(int lado1, int lado2) {
        if (lado1 == lado2){
            this.tipo = "quadrado";
        }
        if (lado1 != lado2){
            this.tipo = "retâncgulo";
        }
    }
    //construtor para triângulos
    public Figura(int lado1, int lado2, int lado3, String tipo) {
        if(lado1 == lado3 || lado1 == lado2){
            this.tipo = "Triângulo equilátero";
        }
        if (lado1 == lado3 || lado1 == lado2 & lado1 != lado2 || lado1 != lado3){
            this.tipo = "Triângulo isósceles";
        }
        if (lado1 != lado2 || lado1 != lado3 || lado2 != lado3){
            this.tipo = "Triângulo escaleno";
        }
    }
    //contrutor para cículo
    public Figura(int raio) {
           this.tipo = "Círculo";      
    }
}