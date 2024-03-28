package class12;

import java. applet.*;
import java. awt.*;
public class HelloWorld extends
Applet
{
  public
void
init()
{
    setBackground(Color.white);
  }
  public
void
paint(Graphics g)
{
    g.setColor(Color.black);
    g.drawString("Hello, world!", 50, 50);
  }
}