package model;

public class CantidadCarreras {

     public enum CantCarreras {
        ICI("ICI"),
        ICII("ICII"),
        ICIB("ICIB"),
        ICIM("ICIM");


        private String cantCarreras;

        private CantCarreras(String cantCarreras) {
            this.cantCarreras = cantCarreras;
        }

        public String getCantCarreras() {
            return cantCarreras;
        }
    }
}
