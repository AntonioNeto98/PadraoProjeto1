package factory;

public class ComContrato extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {

        switch(requestedGrade) {
            case "A":
                return new Tesla(500, "Carregado", "Vermelho");

            case "B":
                return new Audi(2400, "Cheio", "Preto");

            default:
                System.out.print("O veiculo solicitado ainda nao esta disponivel");

        }
        return null;
    }
}
