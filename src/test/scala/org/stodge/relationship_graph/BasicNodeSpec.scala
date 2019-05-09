package org.stodge.relationship_graph

import org.scalatest.{FlatSpec, Matchers}

class BasicNodeSpec extends FlatSpec with Matchers {

  "BasicNode" can "be created" in {
    val n = BasicNode("hello")
  }


}
