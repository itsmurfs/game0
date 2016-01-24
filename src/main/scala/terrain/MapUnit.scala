import terrain.Building

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



def IsBuildable(m: MapUnit): Boolean = m match {
  case Resource(e) => if ( e == "corn") true else false
  case Ground(_) => true
  case Water(_) => false

}