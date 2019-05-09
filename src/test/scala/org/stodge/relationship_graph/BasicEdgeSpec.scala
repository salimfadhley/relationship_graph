package org.stodge.relationship_graph

import org.scalatest.{FlatSpec, Matchers}

class BasicEdgeSpec extends FlatSpec with Matchers {

  "BasicEdge" should "link two nodes" in {
    val e0: EdgeTrait = BasicEdge(
      n0 = BasicNode("a"),
      n1 = BasicNode("b")
    )
  }

}
