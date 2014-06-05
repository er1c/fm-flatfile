/*
 * Copyright 2014 Frugal Mechanic (http://frugalmechanic.com)
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
package fm.flatfile

object FlatFileWriterOptions {
  val CSV = FlatFileWriterOptions(sep = ",")
  val TSV = FlatFileWriterOptions(sep = "\t")
}

final case class FlatFileWriterOptions(
  headers: Option[IndexedSeq[String]] = None,
  sep: String = ",",
  quote: String = "\"",
  newline: String = "\n", // Can be configured to: \r\n
  trailingNewline: Boolean = true,
  writeHeaders: Boolean = true
)