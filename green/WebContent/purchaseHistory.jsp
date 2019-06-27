<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品購入履歴</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>商品購入履歴画面</h1>
		<s:if test="purchaseHistoryInfoDTOList!=null && purchaseHistoryInfoDTOList.size()>0">
			<table class="horizonBox">
				<thead>
					<tr>
					  <th><s:label>商品名</s:label></th>
					  <th><s:label>ふりがな</s:label></th>
					  <th><s:label>商品画像</s:label></th>
					  <th><s:label>発売会社名</s:label></th>
					  <th><s:label>発売年月日</s:label></th>
					  <th><s:label>値段</s:label></th>
					  <th><s:label>個数</s:label></th>
					  <th><s:label>合計金額</s:label></th>
					  <th><s:label>宛先名前</s:label></th>
			          <th><s:label>宛先住所</s:label></th>
					</tr>
				<tbody>
					<s:iterator value="purchaseHistoryInfoDTOList">
						<tr>
						    <td><s:property value="productName"/></td>
						    <td><s:property value="productKana"/></td>
						    <td class="gazo"><img src="<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>" width="60px" height="60px" /></td>
							<td><s:property value="releaseCompany"/></td>
							<td><s:property value="releaseDate"/></td>
							<td><s:property value="price"/>円</td>
							<td><s:property value="productCount"/>個</td>
							<td><s:property value="totalPrice"/>円</td>
							<td><s:property value="familyName"/><span> </span><s:property value="firstName"/></td>
							<td><s:property value="address"/></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<div class="button_pos">
				<s:form action="DeletePurchaseHistoryAction">
					<s:submit value="履歴削除" class="button" />
				</s:form>
			</div>
		</s:if>
		<s:else>
			<div class="errorBlue">
			商品購入履歴情報がありません。
			</div>
		</s:else>
	</div>
</body>
</html>