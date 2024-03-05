//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
package ejercicio3operacion;


public class Operacion {
    private int num1,num2;
    public int sumar,restar,multiplicar;
    public double dividir;

    public Operacion() {
    }

    public Operacion(int num1, int num2, int sumar, int restar, int multiplicar, double dividir) {
        this.num1 = num1;
        this.num2 = num2;
        this.sumar = sumar;
        this.restar = restar;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSumar() {
        return sumar;
    }

    public void setSumar(int sumar) {
        this.sumar = sumar;
    }

    public int getRestar() {
        return restar;
    }

    public void setRestar(int restar) {
        this.restar = restar;
    }

    public int getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(int multiplicar) {
        this.multiplicar = multiplicar;
    }

    public double getDividir() {
        return dividir;
    }

    public void setDividir(double dividir) {
        this.dividir = dividir;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", sumar=" + sumar + ", restar=" + restar + ", multiplicar=" + multiplicar + ", dividir=" + dividir + '}';
    }
    
}
