import org.apache.spark._
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.{DataFrame, SparkSession}

object hello3_2 {

  def main(args: Array[String]): Unit = {

    //val spark = SparkSession.builder.master("local[*]").appName("hello3").getOrCreate()
    val spark = SparkSession.builder.appName("hello3").enableHiveSupport().getOrCreate()

    //val df = spark.read.option("header", true).csv("src/main/resources/Continent-Country.csv")
    val df = spark.read.option("header", true).table("essai.continent_country")

    val df2 = df.select("Continent")

    println("res = "+df2.show(false))

    df.write.mode("overwrite").csv("hdfs://databeezcluster:8020/home/databeez_atos/ressources/promo_2/file_cont_count")

    // Arrêter la session Spark lorsque vous avez terminé
    spark.stop()
  }

}
