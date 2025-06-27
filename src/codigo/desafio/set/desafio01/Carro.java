package codigo.desafio.set.desafio01;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo);
    }

    @Override
    public int compareTo(Carro o) {
        int resultadoMarca = this.getMarca().compareTo(o.getMarca());
        if (resultadoMarca != 0) {
            return resultadoMarca;
        }

        return this.getModelo().compareTo(o.getModelo());
    }

}
