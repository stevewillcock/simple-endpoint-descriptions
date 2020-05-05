package com.rowanbeach.simpleEndpointDescriptions

sealed trait Endpoint

case class GetAllEndpoint[O](urlFragment: UrlFragment)

case class GetSingleEndpoint[IU, O](urlFragment: UrlExtractorFragment[IU])

case class PostEndpoint[IB, O](urlFragment: UrlFragment)

case class PutEndpoint[IU, IB](urlFragment: UrlExtractorFragment[IU])

case class DeleteEndpoint[IU](urlFragment: UrlExtractorFragment[IU])
