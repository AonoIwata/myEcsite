<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<title>カート画面</title>

	<script>
		function settlementAction(element) {
			$(element).attr('action','SettlementConfirmAction');
		}

		function checkValue(check) {
			var checkList = document.getElementsByClassName("checkList");
			var checkFlg = 0;
			for(var i = 0; i < checkList.length; i++) {
				if(checkFlg == 0) {
					if(checkList[i].checked) {
						checkFlg = 1;
						break;
					}
				}
			}
			if(checkFlg == 1) {
				document.getElementById('delete').disabled = "";
			}else {
				document.getElementById('delete').disabled = "true";
			}
		}

		function deleteAction(element) {
			$(element).attr('action','DeleteCartAction');
		}
	</script>
</head>
<body>
	<div id="header">
		<jsp:include page="header.jsp" />
	</div>
	<div id="main">
		<div>
			<h1>カート画面</h1>
		</div>
		<s:if test="cartInfoList == null || cartInfoList.isEmpty()">
			<div class="errorBlue">
				カート情報がありません。
			</div>
		</s:if>
		<s:else>
			<s:form theme="simple">
				<table class="horizonBox">
					<tr>
						<th class="check">#</th>
						<th>商品名</th>
						<th>商品名ふりがな</th>
						<th>商品画像</th>
						<th>値段</th>
						<th>発売会社名</th>
						<th>発売年月日</th>
						<th>購入個数</th>
						<th>合計金額</th>
					</tr>
					<s:iterator value="cartInfoList">
						<tr>
							<td><s:checkbox fieldValue="%{productId}" name="checkList" class="checkList" onchange="checkValue(this)"/></td>
							<td><s:property value="productName"/></td>
							<td><s:property value="productKana"/></td>
							<td class="gazo"><img src="<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>" width="60px" height="60px" /></td>
							<td><s:property value="price"/>円</td>
							<td><s:property value="releaseCompany"/></td>
							<td><s:property value="releaseDate"/></td>
							<td><s:property value="productCount"/>個</td>
							<td><s:property value="productPrice"/>円</td>
						</tr>
					</s:iterator>
				</table>
				<div class="sum">
					カート合計金額:<s:property value="totalPrice"/>円
				</div>
					<div class="settlement">
						<s:submit class="button" value="決済" onclick="settlementAction(this.form)"/>
					</div>
					<div class="delete">
						<s:submit id="delete" class="button" value="削除" disabled="true" onclick="deleteAction(this.form)"/>
					</div>
			</s:form>
		</s:else>
	</div>
	<div class="bottom">
	</div>
</body>
</html>