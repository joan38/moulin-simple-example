#!/usr/bin/env -S ./scala shebang --workspace=.scala-build/moulin --semanticdb-sourceroot=.
//> using dep com.goyeau::moulin:0.1.0-SNAPSHOT
import com.goyeau.moulin.*

object simple extends Moulin:
  object app1 extends MyProjectModule:
    override def dependsOn = super.dependsOn :+ common

  object app2 extends MyProjectModule:
    override def dependsOn = super.dependsOn :+ common

  object common extends MyProjectModule

  trait MyProjectModule extends ScalaModule:
    override def scalaVersion = "3.5.0"
