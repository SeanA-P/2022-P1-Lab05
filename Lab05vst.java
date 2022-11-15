// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
    public void paint(Graph
                              ics g)
    {
        int width = 980;
        int height = 630;
        int x1 = 10;
        int y1 = 640;
        int x2 = 990;
        int y2 = 630;
        g.drawRect(10,10,width,height);
        for(int k=0; k<49; k++){
            g.drawLine(x1, y1, x2, y2);
            x1 += 20;
            y2 -= 13;
        }
        int lx1= 990;
        int ly1 = 640;
        int lx2 = 10;
        int ly2 = 640;
        for(int k=0; k<49; k++){
            g.drawLine(lx1, ly1, lx2, ly2);
            lx1 -= 20;
            ly2 -= 13;
        }
        int trx1 = 10;
        int try1 = 10;
        int trx2 = 990;
        int try2  = 10;
        for(int k=0; k<49; k++){
            g.drawLine(trx1, try1, trx2, try2);
            trx1 += 20;
            try2 += 13;
        }
        int tlx1 = 990;
        int tly1 = 10;
        int tlx2 = 10;
        int tly2  = 10;
        for(int k=0; k<49; k++) {
            g.drawLine(tlx1, tly1, tlx2, tly2);
            tlx1 -= 20;
            tly2 += 13;
        }

        int w = 550;
        int h = 250;
        int sx1 = 225;
        int sy1 = 450;
        int sx2 = 775;
        int sy2 = 440;

        g.drawRect(225,200,w,h);
        for(int k=0; k<28; k++){
            g.drawLine(sx1, sy1, sx2, sy2);
            sx1 += 20;
            sy2 -= 9;
        }
        int slx1= 775;
        int sly1 = 450;
        int slx2 = 225;
        int sly2 = 450;
        for(int k=0; k<28; k++){
            g.drawLine(slx1, sly1, slx2, sly2);
            slx1 -= 20;
            sly2 -= 9;
        }
        int strx1 = 225;
        int stry1 = 200;
        int strx2 = 775;
        int stry2  = 205;
        for(int k=0; k<28; k++){
            g.drawLine(strx1, stry1, strx2, stry2);
            strx1 += 20;
            stry2 += 9;
        }
        int stlx1 = 775;
        int stly1 = 200;
        int stlx2 = 225;
        int stly2  = 205;
        for(int k=0; k<28; k++) {
            g.drawLine(stlx1, stly1, stlx2, stly2);
            stlx1 -= 20;
            stly2 += 9;
        }









    }
}

