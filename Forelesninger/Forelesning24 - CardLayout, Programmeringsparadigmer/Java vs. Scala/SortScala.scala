
object SortScala extends App {
  var list = List(5,3,6,9,1,4,8,2,7)

  def insert(elementToInsert : Int, sortedList : List[Int]) : List[Int] = {
    sortedList match {
      case Nil => elementToInsert :: Nil
      case element :: sortedList1 if (elementToInsert <= element)
      => elementToInsert :: sortedList
      case element :: sortedList1 => element :: insert(elementToInsert, sortedList1)
    }
  }

  def sort(list : List[Int]) : List[Int] = {
    list match {
      case Nil => Nil
      case element :: list1 => insert(element, sort(list1))
    }
  }

  println(list)
  println(sort(list))
}
