package com.rowanbeach.simpleEndpointDescriptions

case class Url(urlFragments: Seq[UrlFragment])

sealed trait UrlFragment

case class UrlLiteralFragment(s: String) extends UrlFragment

case class UrlExtractorFragment[A](name: String) extends UrlFragment
