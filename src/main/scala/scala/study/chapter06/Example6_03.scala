package scala.study.chapter06

object Example6_03 extends App {
// 伴生类Student
  class Student {
    var name :String = null
  }

  // 伴生对象Student
  object Student{
    // apply方法，供非现实new创建对象时调用
    def apply() = new Student()
  }

  // 无 new 方式创建对象，调用的是伴生对象的apply方法：
  // def apply() = new Student()
  val s = Student()
  s.name = "HoHN"
  // 打印输出 name
  println(s.name)

  class Person(val name:String , val age:Int){
    println("con......")
    override def toString: String = name +":"+ age
  }
  val p = new Person("hjog",23)

}
