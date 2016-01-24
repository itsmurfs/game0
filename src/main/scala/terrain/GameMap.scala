package terrain

/**
  * Created by snowp on 24/01/2016.
  */
class GameMap(n:  Int, m: Int) {
  val grid =  Array.ofDim[MapUnit](n,m)

  def getMapUnit(x: Int, y: Int) = grid(x)(y)

  def IsBuildable(m: MapUnit): Boolean = m match {
    case Resource(e) => if ( e == "corn") true else false
    case Ground(_) => true
    case Water(_) => false
  }
}

