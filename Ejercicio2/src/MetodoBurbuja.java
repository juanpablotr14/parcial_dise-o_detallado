import Interfaces.IMetodoBurbuja;

public class MetodoBurbuja implements IMetodoBurbuja{

        /*
         * Este método ordena un arreglo de enteros utilizando el método de la burbuja
         * 
         * @param arr
         * @return void
         */
        public void burbujaEnteros(int[] arr) {
            boolean intercambiado;
            int temp;
        
            do {
                intercambiado = false;
                int index = 0;

                for (int num : arr) {
                    if (index > 0 && num < arr[index - 1]) {
                        temp = arr[index];
                        arr[index] = arr[index - 1];
                        arr[index - 1] = temp;
                        intercambiado = true;
                    }
                    index++;
                }
            } while (intercambiado);
        }
        
        /*
         * Este método ordena un arreglo de strings utilizando el método de la burbuja
         * 
         * @param arr
         * @return void
         */
        public void burbujaStrings(String[] arr) {
            boolean intercambiado;
            String temp;
        
            do {
                intercambiado = false;
                int index = 0;
                
                for (String str : arr) {
                    if (index > 0 && str.compareTo(arr[index - 1]) < 0) {
                        temp = arr[index];
                        arr[index] = arr[index - 1];
                        arr[index - 1] = temp;
                        intercambiado = true;
                    }
                    index++;
                }
            } while (intercambiado);
        }
        
        
    }