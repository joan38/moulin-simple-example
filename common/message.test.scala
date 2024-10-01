package common

import munit.FunSuite

class MoulinTest extends FunSuite:
  test("message should Hello, World!"):
    assertEquals(message, "Hello, World!")
