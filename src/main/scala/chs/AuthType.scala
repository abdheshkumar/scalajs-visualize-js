package chs

import scala.scalajs.js


sealed trait AuthType extends js.Object {
  //loginFn: function (properties, request)
  //logoutFn: function (properties, request)
}

class LoginWithPlainText(
                          name: String,
                          password: String,
                          organization: js.UndefOr[String],
                          timezone: js.UndefOr[String],
                        ) extends AuthType

object LoginWithPlainText {
  @inline
  def apply(name: String,
            password: String,
            organization: js.UndefOr[String] = js.undefined,
            timezone: js.UndefOr[String] = js.undefined): LoginWithPlainText =
    new LoginWithPlainText(name, password, organization, timezone)
}

class LoginWithSSOToken(
                         token: String,
                         preAuth: js.UndefOr[Boolean],
                         tokenName: js.UndefOr[String],
                       ) extends AuthType

object LoginWithSSOToken {
  @inline
  def apply(token: String,
            preAuth: js.UndefOr[Boolean] = js.undefined,
            tokenName: js.UndefOr[String] = js.undefined): LoginWithSSOToken =
    new LoginWithSSOToken(token, preAuth, tokenName)
}