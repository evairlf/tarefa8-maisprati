package tarefa5;

public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando.");
    }
}