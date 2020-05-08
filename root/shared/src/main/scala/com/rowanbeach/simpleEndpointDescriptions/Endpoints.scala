package com.rowanbeach.simpleEndpointDescriptions

import upickle.default.ReadWriter
import upickle.default.Writer

sealed trait EndpointDescription

case class GetAllEndpointDescription[O](urlFragment: UrlFragment)(implicit readWriter: ReadWriter[O]) extends EndpointDescription

case class GetSingleEndpointDescription[IU, O](urlFragment: UrlExtractorFragment[IU])(implicit writer: Writer[O]) extends EndpointDescription

case class PostEndpointDescription[IB, O](urlFragment: UrlFragment) extends EndpointDescription

case class PutEndpointDescription[IU, IB](urlFragment: UrlExtractorFragment[IU]) extends EndpointDescription

case class DeleteEndpointDescription[IU](urlFragment: UrlExtractorFragment[IU]) extends EndpointDescription
