package scala.study.chapter06

class Object_One {

  //  通过object声明单例对象
  object Student {
    private var studentNo : Int = 0
    def uniStudentNo() = {
      studentNo += 1
      studentNo
    }
  }
  Student.uniStudentNo()
  // 单例对象中的成员变量状态随程序执行而改变
  Student.uniStudentNo()






}
