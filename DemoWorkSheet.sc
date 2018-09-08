
object Example6_05 extends App {
  // 定义无参的主构造函数
  class Person{
    // 类成员
    private var name : String = null
    private var age : Int = 12
    private var sex : Int = 0

    // 辅助构造函数
    def this(name:String){
      // this()调用的无参的默认主构造函数
      this()
      this.name = name
    }
    def this(name:String,age:Int){
      // this(name)调用的是前面定义的辅助构造函数this(name:String)
      this(name)
      this.age = age
    }
    def this(name:String,age:Int,sex:Int){
      // this(name)调用的是前面定义的辅助构造函数this(name:String,age:Int)
      this(name,age)
      this.sex = sex
    }

    override def toString: String = {
      val sexStr = if(sex == 1) "男" else "女"
      s"name = $name, age = $age ,sex = $sexStr"
    }

    // 调用的是3个参数的辅助构造函数
    println(new Person("jone",21,1))
    // 调用的是2个参数的辅助构造函数
    println(new Person("your",11))
    // 调用的是1个参数的辅助构造函数
    println(new Person("jone"))
  }

}
