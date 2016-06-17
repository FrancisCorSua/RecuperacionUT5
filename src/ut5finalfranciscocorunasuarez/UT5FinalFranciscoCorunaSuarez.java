/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5finalfranciscocorunasuarez;

/**
 *
 * @author fran
 */
public class UT5FinalFranciscoCorunaSuarez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class Gasolinera {
    private int litrosVendidosMesActual98;
    private int litrosVendidosMesActual95;
    private int litrosVendidosMesActualDiesel;
    private String ubicacion;

        /**
         * @return the litrosVendidosMesActual98
         */
        public int getLitrosVendidosMesActual98() {
            return litrosVendidosMesActual98;
        }

        /**
         * @param litrosVendidosMesActual98 the litrosVendidosMesActual98 to set
         */
        public void setLitrosVendidosMesActual98(int litrosVendidosMesActual98) {
            this.litrosVendidosMesActual98 = litrosVendidosMesActual98;
        }

        /**
         * @return the litrosVendidosMesActual95
         */
        public int getLitrosVendidosMesActual95() {
            return litrosVendidosMesActual95;
        }

        /**
         * @param litrosVendidosMesActual95 the litrosVendidosMesActual95 to set
         */
        public void setLitrosVendidosMesActual95(int litrosVendidosMesActual95) {
            this.litrosVendidosMesActual95 = litrosVendidosMesActual95;
        }

        /**
         * @return the litrosVendidosMesActualDiesel
         */
        public int getLitrosVendidosMesActualDiesel() {
            return litrosVendidosMesActualDiesel;
        }

        /**
         * @param litrosVendidosMesActualDiesel the litrosVendidosMesActualDiesel to set
         */
        public void setLitrosVendidosMesActualDiesel(int litrosVendidosMesActualDiesel) {
            this.litrosVendidosMesActualDiesel = litrosVendidosMesActualDiesel;
        }

        /**
         * @return the direccion
         */
        public String getDireccion() {
            return ubicacion;
        }

        /**
         * @param direccion the direccion to set
         */
        public void setDireccion(String direccion) {
            this.ubicacion = direccion;
        }
    }
    
}
