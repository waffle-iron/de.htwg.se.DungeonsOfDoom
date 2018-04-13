
case class Cell(isFloor:Boolean, isWall:Boolean, isLava:Boolean) {
  var walkable = false
  if(!isWall && isFloor){
    walkable = true
  }
}

val cell1 = Cell(true, false, false)
case class Field(cells: Array[Array[Cell]])

val field1 = Field(Array.ofDim[Cell](2,2))
field1.cells(0)(0)=cell1
field1.cells(0)(0).walkable

