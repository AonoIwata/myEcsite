<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー情報確認</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<h1>ユーザー情報入力確認画面</h1>
	<table class="box">
		<tr>
			<th scope="row"><s:label value="姓"/></th>
			<td><s:property value="familyName"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="名"/></th>
			<td><s:property value="firstName"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="姓ふりがな"/></th>
			<td><s:property value="familyKana"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="名ふりがな"/></th>
			<td><s:property value="firstKana"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="性別"/></th>
			<td><s:property value="sex"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="メールアドレス"/></th>
			<td><s:property value="email"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="ユーザーID"/>
			<td><s:property value="userId"/>
		</tr>
		<tr>
			<th scope="row"><s:label value="パスワード"/>
			<td><s:property value="password"/>
		</tr>
	</table>

	<s:form action="CreateUserCompleteAction">
		<div class="button_pos">
			<s:submit value="登録" class="button"/>
		</div>
	</s:form>
	<s:form action="CreateUserAction">
		<div class="button_pos">
			<s:submit value="戻る" class="button"/>
		</div>
		<s:hidden name="backFlag" value="1"/>
	</s:form>
	<br>
</body>
</html>
