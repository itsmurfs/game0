package terrain

/**
  * Created by snowp on 24/01/2016.
  */
trait MapUnit {
  def isBuildable : Boolean
 // def Build() : Unit
}

case class Water(density: Float) extends MapUnit{
  override def isBuildable: Boolean = false
  //override def Build(): Unit = ???
}

case class Ground(buildUnit: Building) extends MapUnit{
  override def isBuildable: Boolean = true
  //override def Build(): Unit = ???
}

case class Resource(resourceType: String) extends MapUnit{
  override def isBuildable: Boolean = false
  //override def Build(): Unit = ???
}
