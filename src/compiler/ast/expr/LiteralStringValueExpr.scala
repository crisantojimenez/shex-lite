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

package compiler.ast.expr
import compiler.ast.Position

/**
 * A Literal String Value Expression is a literal that contains an String value. It is used to store Strings that appear
 * in the source code.
 *
 * @author Guillermo Facundo Colunga
 *
 * @param line in the source code where the token that generates de Base Definition Statement is located.
 * @param column in the source code where the token that generates de Base Definition Statement is located.
 * @param value of the String.
 */
class LiteralStringValueExpr(line: Int, column: Int, val value: String) extends LiteralExpr with ConstraintValidValueSetExpr {
  override def getPosition: Position = Position.pos(line, column)
  override def isLiteralStringValueExpr: Boolean = true
  override def asLiteralStringValueExpr: LiteralStringValueExpr = this
}