import processing.core._

object MySketch extends PApplet {
  def main() = {
    PApplet.runSketch(Array("MAIN"), new MySketch)
  }
}

// This is where your Sketch code goes

class MySketch extends PApplet {
  var yPos = 10
  var moveDown = true

  override def settings() = {
    size(300, 500)
  }

  // Processing sketch code goes here!
  override def setup() = {
    background(3)
    fill(200, 100, 200)
    ellipse(50, yPos, 50, 50)
  }

  override def draw() ={
    background(3)

    if (moveDown && yPos > height - 50) {
      moveDown = false
    }

    if (!moveDown && yPos < 50) {
      moveDown = true
    }

    yPos = moveDown match {
      case true => yPos + 2
      case false => yPos - 2
    }

    ellipse(50, yPos, 50, 50)
  }

}

MySketch.main()
