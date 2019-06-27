<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>マイページ</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<div class="contents">
		<h1>マイページ画面</h1>
		<s:if test="dto !=null">
			<s:form action="PurchaseHistoryAction">
				<table class="box">
					<tr>
						<th scope="row"><s:label value="姓"/></th>
						<td><s:property value="dto.familyName"/></td>
					</tr>
					<tr>
						<th scope="row"><s:label value="名"/></th>
						<td><s:property value="dto.firstName"/></td>
					</tr>
					<tr>
						<th scope="row"><s:label value="ふりがな"/></th>
						<td><s:property value="dto.familyKana" /><span>　</span><s:property value="dto.firstKana" /></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="性別"/></th>
						<td><s:if test="dto.sex==1">女性</s:if><s:else>男性</s:else></td>
					</tr>

					<tr>
						<th scope="row"><s:label value="メールアドレス"/></th>
						<td><s:property value="dto.email"/></td>
					</tr>
				</table>
				<div class="button_pos">
					<s:submit value="購入履歴" class="button" />
				</div>
			</s:form>
		</s:if>
		<s:else>
			<div class="errorBlue">
				ユーザー情報がありません。
			</div>
		</s:else>
		<br>
	</div>
</body>
</html>