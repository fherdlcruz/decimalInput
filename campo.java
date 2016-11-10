 /*
*@author Fernando Hernández fherdlcruz@gmail.com
*@description Validación de número decimales, apartir del evento KeyType.
 */
 private void volumenKeyTyped(java.awt.event.KeyEvent evt) {                                 
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            if (enter != '.') {
                evt.consume();
                JOptionPane.showMessageDialog(null, "Este campo sólo acepta números décimales", "Advertencia", 1);
            }
        }
    }               