package codigo.desafio.set.desafio02;

import java.util.Objects;

public class Carro02 implements Comparable<Carro02> {

    private String marca;
    private String modelo;
    private int anoModelo;

    public Carro02(String marca, String modelo, int anoModelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
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

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Override
    public String toString() {
        return marca + "-" + modelo + "-" + anoModelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro02 carro02 = (Carro02) o;
        return anoModelo ==
                carro02.anoModelo && Objects.equals(marca, carro02.marca) &&
                Objects.equals(modelo, carro02.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, anoModelo);
    }

    @Override
    public int compareTo(Carro02 o) {
        int resultadoMarca = this.getMarca().compareTo(o.getMarca());
        if (resultadoMarca != 0) {
            return resultadoMarca;
        }

        int resultadoModelo = this.getModelo().compareTo(o.getModelo());
        if (resultadoModelo !=0) {
            return resultadoModelo;
        }

        return Integer.compare(getAnoModelo(), o.getAnoModelo());
    }
}
