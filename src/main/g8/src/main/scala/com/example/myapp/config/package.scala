package com.example.myapp

package object config {
  final val Prefix = "lioqu."

  final val Http_Host = Prefix + "http.host"
  final val Http_Port = Prefix + "http.port"
  final val Db_Postgres = Prefix + "postgres"
  final val Db_Schema = "db.schema"
}
