import processing.core._
import processing.core.PConstants._
import PConstants._
import PApplet._

// Processing sketch code goes here!
object MySketch extends PApplet {
  private var mySketch:MySketch = _

  def main() = {
    mySketch = new MySketch

    val frame = new javax.swing.JFrame("MySketch")
    frame.getContentPane().add(mySketch)
    mySketch.init
    frame.pack
    frame.setSize(500, 500)
    frame.setVisible(true)
    frame.setResizable(false)
  }
}
class MySketch extends PApplet {
  override def setup() = {
    size(500, 500)
    background(3)

    fill(200, 100, 200)
    ellipse(50, 50 , 50, 50)
    frameRate(1)
  }

  override def draw() ={
    background(3)
    fill(random(200), 100, 200)
    ellipse(50, 50 , 50, 50)

  }
}

MySketch.main()
