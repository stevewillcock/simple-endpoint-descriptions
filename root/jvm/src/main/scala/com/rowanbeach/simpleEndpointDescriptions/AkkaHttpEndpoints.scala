package com.rowanbeach.simpleEndpointDescriptions

import akka.http.scaladsl.server.Route
import akka.http.scaladsl.marshalling.ToResponseMarshaller
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import upickle.default.Writer

object AkkaHttpEndpoints {

  def write[O](o: O)(implicit writer: Writer[O]): String = ???


  def build[O](endpointDescription: EndpointDescription): Route = {

    endpointDescription match {
      case GetAllEndpointDescription(urlFragment) => path("GetAllEndpointDescriptionTestPath1") {
        get {
          complete(write(23))
        }
      }
      case GetSingleEndpointDescription(urlFragment) => ???
      case PostEndpointDescription(urlFragment) => ???
      case PutEndpointDescription(urlFragment) => ???
      case DeleteEndpointDescription(urlFragment) => ???
    }

  }

}