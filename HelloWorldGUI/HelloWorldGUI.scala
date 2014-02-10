import scala.swing._

object HelloWorldGUI extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Hello, world!"
    contents = new Button {
      text = "Clickable"
    }
  }
}
