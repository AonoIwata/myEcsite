<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
		<title>パスワード再設定確認画面</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>パスワード再設定確認画面</h1>
		<s:form id="resetPasswordForm">
			<table class="box">
				<tr>
					<th scope="row"><s:label value="ユーザーID"/></th>
					<td><s:property value="userId"/></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="新しいパスワード"/></th>
					<td><s:property value="concealedPassword"/></td>
				</tr>
			</table>
		</s:form>
		<s:form action="ResetPasswordCompleteAction">
			<div class="button_pos">
				<s:submit value="パスワード再設定" class="button"/>
			</div>
		</s:form>
		<s:form action="ResetPasswordAction">
			<div class="button_pos">
				<s:submit value="戻る" class="button"/>
			</div>
			<s:hidden  name="backFlg" value="true"/>
		</s:form>
	</div>
</body>
</html>