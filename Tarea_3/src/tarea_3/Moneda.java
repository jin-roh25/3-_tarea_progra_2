package tarea_3;

public abstract class Moneda {

    public Moneda() {

    }

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();
}

class Moneda100 extends Moneda {

    @Override
    public int getValor() {
        return 100;
    }

}

class Moneda500 extends Moneda {

    @Override
    public int getValor() {
        return 500;
    }

}

class Moneda1000 extends Moneda {

    @Override
    public int getValor() {
        return 1000;
    }

}

class Moneda1500 extends Moneda {

    @Override
    public int getValor() {
        return 1500;
    }

}
