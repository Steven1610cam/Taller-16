public class SistemaDescuento {

   
    public abstract static class Descuento {
        protected double cantidad;

        
        public Descuento(double cantidad) {
            this.cantidad = cantidad;
        }

        
        public abstract double calcularDescuento(double precio);
    }

    
    public static class DescuentoPorcentaje extends Descuento {

        
        public DescuentoPorcentaje(double porcentaje) {
            super(porcentaje);
        }

        
        @Override
        public double calcularDescuento(double precio) {
            return precio * (cantidad / 100);
        }
    }

    
    public static class DescuentoFijo extends Descuento {

        // Constructor
        public DescuentoFijo(double descuentoFijo) {
            super(descuentoFijo); 
        }

        
        @Override
        public double calcularDescuento(double precio) {
            return cantidad; 
        }
    }

    public static void main(String[] args) {
        
        double precioOriginal = 100.0;

        
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20); // 20% de descuento
        double descuentoAplicadoPorcentaje = descuentoPorcentaje.calcularDescuento(precioOriginal);
        System.out.println("Descuento del 20%: " + descuentoAplicadoPorcentaje);
        System.out.println("Precio final: " + (precioOriginal - descuentoAplicadoPorcentaje));

        
        Descuento descuentoFijo = new DescuentoFijo(15); // $15 de descuento
        double descuentoAplicadoFijo = descuentoFijo.calcularDescuento(precioOriginal);
        System.out.println("Descuento fijo de $15: " + descuentoAplicadoFijo);
        System.out.println("Precio final: " + (precioOriginal - descuentoAplicadoFijo));
    }
}