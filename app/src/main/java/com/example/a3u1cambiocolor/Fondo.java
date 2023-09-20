package com.example.a3u1cambiocolor;

import android.graphics.Color;

public class Fondo {

    //Se crea un a atributo de clase de tipo Color, se hace la importación de la librería
    private Color colorFondo;

    public Fondo() {
        //Se crea el método constructor sin parámetro porque no se va a recibir ningún valor
        this.colorFondo = colorFondo;
    }


    public int cambiaColor(){
        //se crea un arrayColor de tipo color con los colores disponibles para cambiar de fondo

        int[] arrayColor = new int[5];
        arrayColor[0] = Color.GREEN;
        arrayColor[1] = Color.BLUE;
        arrayColor[2] = Color.YELLOW;
        arrayColor[3] = Color.CYAN;
        arrayColor[4] = Color.MAGENTA;

        int aleatorio = (int) (Math.random()*4)+1;

        return arrayColor[aleatorio];
    }



    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }
}
