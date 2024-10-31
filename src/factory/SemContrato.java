package factory;

public class SemContrato extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {

        switch(requestedGrade) {
            case "A":
                return new Ford(100, "Cheio", "Azul");

            case "B":
                return new Chevrolet(150, "Cheio", "Verde");

            default:
                System.out.print("O veiculo solicitado ainda nao esta disponivel");

        }
        return null;
    }
}
