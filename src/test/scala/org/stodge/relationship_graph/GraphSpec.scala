package org.stodge.relationship_graph

import org.scalatest.{FlatSpec, Matchers}

class GraphSpec extends FlatSpec with Matchers {

  "Graph" should "be creatable" in {
    class E extends EdgeTrait
    class N extends NodeTrait
    val G:Graph[N,E] = new Graph()
  }


}
