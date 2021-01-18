package sample.Interprete;

import javafx.scene.control.TextArea;


import java.awt.*;

import static sample.Interprete.TiposToken.*;

public class Compilador {
    String texto="";
    private TextArea consola;
    public Compilador(TextArea tx){
        this.consola=tx;
    }
    public boolean compilar(String renglon){
        boolean errores=false;
        if (renglon.contains("print")){
            int i1=renglon.indexOf('(')+1;
            int i2=renglon.indexOf(')');
            String texto=renglon.substring(i1,i2);
            this.consola.appendText("\n "+texto);
        }else if (renglon.contains("declarar")){
            String[] arreglo=renglon.split(" ");
            if (!validar(arreglo[1].trim())){
                String tipotoken="";
                if (arreglo[3].equals("pelota")){
                    tipotoken=PELOTA;
                }
                Token token=new Token(tipotoken, arreglo[1].trim());
                arrayToken.add(token);
                System.out.println(arreglo[1]);
                System.out.println(arreglo[3]);
            }else {
                this.consola.appendText("\n la variable con el nombre "+arreglo[1]+" ya esta declarada");
            }

        }
        return errores;
    }
    public boolean validar(String nombre){
        boolean existe=false;
        for (int x=0; x<arrayToken.size();x++){
            if (arrayToken.get(x).getNombre().equals(nombre)){
                existe=true;

            }
        }
        return existe;
    }
}
