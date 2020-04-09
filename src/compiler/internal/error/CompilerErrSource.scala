/*
 * Short version for non-lawyers:
 *
 * The ShEx Lite Project is dual-licensed under GNU 3.0 and
 * MIT terms.
 *
 * Longer version:
 *
 * Copyrights in the ShEx Lite project are retained by their contributors. No
 * copyright assignment is required to contribute to the ShEx Lite project.
 *
 * Some files include explicit copyright notices and/or license notices.
 * For full authorship information, see the version control history.
 *
 * Except as otherwise noted (below and/or in individual files), ShEx Lite is
 * licensed under the GNU, Version 3.0 <LICENSE-GNU> or
 * <https://choosealicense.com/licenses/gpl-3.0/> or the MIT license
 * <LICENSE-MIT> or <http://opensource.org/licenses/MIT>, at your option.
 *
 * The ShEx Lite Project includes packages written by third parties.
 */

package compiler.internal.error

import compiler.ast.{NodeWithPosition}

/**
 * Compiler implementation of the error source trait.
 *
 * @param cause that describes the event that trigger the error.
 */
private[compiler] class CompilerErrSource(val node: NodeWithPosition, val cause: String) extends ErrSource {

  /**
   * Line where the error is being generated.
   */
  override val line: Int = node.getPosition.line

  /**
   * Column where the error is being generated.
   */
  override val column: Int = node.getPosition.column
}
