/*
 * Copyright 2018 scala-steward contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.timepit.scalasteward.sbt.data

import io.circe.{Decoder, Encoder}

final case class ScalaVersion(value: String)

object ScalaVersion {
  implicit val scalaVersionDecoder: Decoder[ScalaVersion] =
    Decoder[String].map(ScalaVersion.apply)

  implicit val scalaVersionEncoder: Encoder[ScalaVersion] =
    Encoder[String].contramap(_.value)
}
