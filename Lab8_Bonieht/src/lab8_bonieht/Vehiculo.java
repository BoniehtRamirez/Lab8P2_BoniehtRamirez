package lab8_bonieht;

public class Vehiculo {
    private long VIN;
    private String marca, carroceria, color, tipoMotor, tipoHibridacion;
    private int numeroPuertas, cantPasajeros, tiempoEnsamblaje;
    private double precio;

    public Vehiculo(long VIN, String marca, String carroceria, String color, String tipoMotor, String tipoHibridacion, int numeroPuertas, int cantPasajeros, int tiempoEnsamblaje, double precio) {
        this.VIN = VIN;
        this.marca = marca;
        this.carroceria = carroceria;
        this.color = color;
        this.tipoMotor = tipoMotor;
        this.tipoHibridacion = tipoHibridacion;
        this.numeroPuertas = numeroPuertas;
        this.cantPasajeros = cantPasajeros;
        this.tiempoEnsamblaje = tiempoEnsamblaje;
        this.precio = precio;
    }

    public long getVIN() {
        return VIN;
    }

    public void setVIN(long VIN) {
        this.VIN = VIN;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoHibridacion() {
        return tipoHibridacion;
    }

    public void setTipoHibridacion(String tipoHidridacion) {
        this.tipoHibridacion = tipoHidridacion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getTiempoEnsamblaje() {
        return tiempoEnsamblaje;
    }

    public void setTiempoEnsamblaje(int tiempoEnsamblaje) {
        this.tiempoEnsamblaje = tiempoEnsamblaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}