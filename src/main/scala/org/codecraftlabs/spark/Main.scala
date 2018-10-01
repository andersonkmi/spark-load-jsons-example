package org.codecraftlabs.spark

import org.apache.log4j.Level.OFF
import org.apache.log4j.Logger
import org.apache.spark.sql.SparkSession

object Main {

  def main(args: Array[String]): Unit = {

    @transient lazy val logger = Logger.getLogger(getClass.getName)
    Logger.getLogger("org.apache").setLevel(OFF)

    logger.info("Processing flight data information")

    val sparkSession: SparkSession = SparkSession.builder.appName("spark-load-jsons-example").master("local[*]").getOrCreate()

    val flightDataFrame = sparkSession.read.json("*.json")

    flightDataFrame.printSchema

    println(flightDataFrame.count())
  }
}
