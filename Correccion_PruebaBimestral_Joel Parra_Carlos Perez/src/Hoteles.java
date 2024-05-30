public class Hoteles {

    String NombreHotel;
    int numero_habitaciones;
    String ubicacion_hotel;
    int num_estrellas_hotel;
    String Reseñas;

    public Hoteles() {
    }

    public Hoteles(String nombreHotel, int numero_habitaciones, String ubicacion_hotel, int num_estrellas_hotel, String Reseñas) {
        NombreHotel = nombreHotel;
        this.numero_habitaciones = numero_habitaciones;
        this.ubicacion_hotel = ubicacion_hotel;
        this.num_estrellas_hotel = num_estrellas_hotel;
        this.Reseñas = Reseñas;
    }

    public String getNombreHotel() {
        return NombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        NombreHotel = nombreHotel;
    }

    public int getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(int numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getUbicacion_hotel() {
        return ubicacion_hotel;
    }

    public void setUbicacion_hotel(String ubicacion_hotel) {
        this.ubicacion_hotel = ubicacion_hotel;
    }

    public int getNum_estrellas_hotel() {
        return num_estrellas_hotel;
    }

    public void setNum_estrellas_hotel(int num_estrellas_hotel) {
        this.num_estrellas_hotel = num_estrellas_hotel;
    }

    public String getReseñas() {
        return Reseñas;
    }

    public void setReseñas(String Reseñas) {
        this.Reseñas = Reseñas;
    }

    public void ImprimirDatosHoteles() {

        // Esta funcion Imprimira los valores de los hoteles
        System.out.println("Nombre Hotel: " + NombreHotel);
        System.out.println("Numero habitaciones: " + numero_habitaciones);
        System.out.println("Ubicacion hotel: " + ubicacion_hotel);
        System.out.println("Num estrellas hotel: " + num_estrellas_hotel);
        System.out.println ("Reseñas: " + Reseñas);
        System.out.println("");
    }

    public void ModificarDatosHoteles() {

        // Modificara los valores de un hotel por otros

        Hoteles hoteles = new Hoteles();
        hoteles.setNombreHotel("Prueba");
        hoteles.setNumero_habitaciones(100);
        hoteles.setUbicacion_hotel("Quito");
        hoteles.setNum_estrellas_hotel(5);
        hoteles.setReseñas("Buen Hotel");

        hoteles.ImprimirDatosHoteles();
    }

    public void HotelesNull () {

        // Con la ayuda de funciones pasadas modificara el valor de hoteles con valor NUll
        Hoteles hoteles = new Hoteles();
        hoteles.ModificarDatosHoteles();
    }


}
