
import java.applet.Applet;
import java.awt.*;

public class VentaApplet extends Applet
{

 /*public void init() 
 {
		resize(300, 400);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Mensaje", 20, 20);
		g.drawOval(50, 50, 50, 50);
        }*/
 Label label1 = new Label("P.O.O");
 Label label2 = new Label("Su nombre hijuputa:");
 TextField t1 = new TextField(20);
 Button b1 = new Button("Aceptar");
 TextField t2 = new TextField(20);

 public void init()
 {
  add(label1);
  add(label2);
  add(t1);
  add(b1);
  add(t2);
 }
 
 public boolean action(Event e, Object ob)
 {
  if (b1 == e.target)
  {
   t2.setText(t1.getText());
   return true;
  }
  return false;
 }
}
