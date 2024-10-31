package factory;

public abstract class Car {

    private int horsePower;
    private String fuelSourse;
    private String color;

    public Car(int horsePower, String fuelSourse, String color) {
        this.horsePower = horsePower;
        this.fuelSourse = fuelSourse;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("O carro esta " + fuelSourse + " , pronto para ser utilizado com, " + horsePower +"Cavalos, é " + color + ".");
    }
    public void  clean() {
        System.out.println("Carro esta limpo, e a cor " + color.toLowerCase() + " esta impecavel.");
    }
    public void mechanicCheck() {
        System.out.print("O carro foi checado pelo mecanico. Esta em otimo estado");
    }
    public void fuelCar() {
        System.out.println("O carro foi totalmente carregado" + fuelSourse.toLowerCase());
    }

}
