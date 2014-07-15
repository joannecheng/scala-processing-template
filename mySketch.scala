import processing.core._

object MySketch extends PApplet {
  private var mySketch:MySketch = _

  def main() = {
    mySketch = new MySketch

    val frame = new javax.swing.JFrame("MySketch")
    frame.getContentPane().add(mySketch)
    mySketch.init

    frame.setSize(500, 500)
    frame.setVisible(true)
  }
}

class MySketch extends PApplet {
  // Processing sketch code goes here!
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
