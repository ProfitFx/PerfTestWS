import java.text.SimpleDateFormat
import java.util.{Date, TimeZone}
import java.text.DateFormat

object HW extends App {

  println("HW")


  def time = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date())
  println(time)
  // 2021-12-26T18:30:09.843+0500


  val df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  df.setTimeZone(TimeZone.getTimeZone("UTC"))
  val nowAsISO = df.format(new Date())
  println(nowAsISO)
  //2021-12-26T13:30:09.843Z



}
