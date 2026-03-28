void main() {

    double velocidadeVia;
    double velocidadeVeiculo;

    IO.println("Verificador de Infração de Velocidade");

    String velocidadeViaString = IO.readln("Digite a velocidade máxima da via (km/h): ");
    String velocidadeVeiculoString = IO.readln("Digite a velocidade do veículo (km/h): ");

    velocidadeVia = Double.parseDouble(velocidadeViaString);
    velocidadeVeiculo = Double.parseDouble(velocidadeVeiculoString);

    double limiteMedia = velocidadeVia * 1.2;

    if (velocidadeVeiculo <= velocidadeVia)
        IO.println("Sem Infração");
    else if (velocidadeVeiculo <= limiteMedia)
        IO.println("Infração Média");
    else
        IO.println("Infração Grave");

}