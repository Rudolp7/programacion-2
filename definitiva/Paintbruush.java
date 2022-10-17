import java.awt.Graphics;
import java.awt.Polygon;

public class Paintbruush {
    private Graphics g;

    public Paintbruush(Graphics g) {
        this.g = g;

    }

    // sky
    public void drawSky() {
        g.setColor(Confiig.COLOR_SKY);
        g.fillRect(Confiig.SKY_X, Confiig.SKY_Y, Confiig.SKY_W, Confiig.SKY_H);
        g.setColor(Confiig.COLOR_SUN);
        g.fillOval(10, 10, 30, 30);
    }

   
    // lake
    public void drawLake() {
        g.setColor(Confiig.COLOR_LAKE);
        g.fillRect(Confiig.LAKE_X, Confiig.LAKE_Y, Confiig.LAKE_W, Confiig.LAKE_H);
    }

      //carretera
      public void drawHighway(){
        g.setColor(Confiig.COLOR_Highway);
        g.fillRect(Confiig.Highway_X, Confiig.Highway_Y, Confiig.Highway_W, Confiig.Highway_H);
    }
     //linea_carretera
     public void drawLine1(){
        g.setColor(Confiig.COLOR_Line1);
        g.fillRect(Confiig.Line1_X, Confiig.Line1_Y, Confiig.Line1_W, Confiig.Line1_H);

    }

    //linea_carretera2
    public void drawLine2(){
        g.setColor(Confiig.COLOR_Line2);
        g.fillRect(Confiig.Line2_X, Confiig.Line2_Y, Confiig.Line2_W, Confiig.Line2_H);

    }

    //linea_carretera2
    public void drawLine3(){
        g.setColor(Confiig.COLOR_Line3);
        g.fillRect(Confiig.Line3_X, Confiig.Line3_Y, Confiig.Line3_W, Confiig.Line3_H);

    }

    // mountains
    public void drawMountains() {
        int start = 40;
        int top = 25;
        for (int i = 0; i < 12; i++) {
            Polygon triangle = new Polygon();
            int width = 90;
            int spacing = 70;

            triangle.addPoint(start + (spacing * i), top);
            triangle.addPoint((start - (width / 2)) + (spacing * i), top + width);
            triangle.addPoint((start + (width / 2)) + (spacing * i), top + width);

            g.setColor(Confiig.COLOR_BROWN);
            g.fillPolygon(triangle);
        }
    }

    // tree
    public void drawTree(int start, int top) {

        // draw trunk´s
        g.setColor(Confiig.COLOR_TRUNK_TREE);
        g.fillRect(start - 10, top + 110, 26, 40);
        // draw tree's

        g.setColor(Confiig.COLOR_TREE);
        for (int i = 0; i < 5; i++) {
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width / 2), top + height + (spacing * i));
            triangle.addPoint(start + (width / 2), top + height + (spacing * i));

            g.fillPolygon(triangle);
        }

    }
}