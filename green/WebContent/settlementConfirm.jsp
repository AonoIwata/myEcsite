<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>決済確認画面</title>
<script>
	function SettlementCompleteAction(element){
		$(element).attr('action','SettlementCompleteAction');
	}

	function DeleteDestinationAction(element){
		$(element).attr('action','DeleteDestinationAction');
	}
</script>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="contents">
		<h1>決済確認画面</h1>
		<div>
			<!-- 宛先情報がない場合、エラーメッセージを表示 -->
			<s:if test="dtoList == null || dtoList.size()==0">
				<div class="errorBlue">
					宛先情報がありません。
				</div>
			</s:if>

			<!-- 宛先情報が存在する場合 -->
			<s:else>
				<div class="errorBlue">
					宛先情報を選択してください。
				</div>

				<s:form theme="simple">
					<table class="horizonBox">
						<tr>
							<th class="radio">#</th>
							<th>姓</th>
							<th>名</th>
							<th>ふりがな</th>
							<th>住所</th>
							<th>電話番号</th>
							<th>メールアドレス</th>
						</tr>
						<s:iterator value="dtoList" status="st">
							<tr>
								<td class="radio">
									<s:if test="#st.index==0">
										<input type="radio" name="destinationId" checked="checked" value="<s:property value='id'/>"/>
									</s:if>
									<s:else>
										<input type="radio" name="destinationId" value="<s:property value='id'/>"/>
									</s:else>
								</td>
								<td>
									<s:property value="familyName"/>
								</td>
								<td>
									<s:property value="firstName"/>
								</td>
								<td>
									<s:property value="familyKana"/> <s:property value="firstKana"/>
								</td>
								<td class="address">
									<s:property value="address" />
								</td>
								<td>
									<s:property value="telNumber"/>
								</td>
								<td>
									<s:property value="email"/>
								</td>
							</tr>
						</s:iterator>
					</table>
					<div class="button_pos">
						<s:submit type="button" value="決済" onclick="SettlementCompleteAction(this.form)" class="button"/>
					</div>
					<div class="button_pos">
						<s:submit type="button" value="削除" onclick="DeleteDestinationAction(this.form)" class="button"/>
					</div>
				</s:form>
			</s:else>
			<div class="button_pos">
				<s:form action="CreateDestinationAction">
					<s:submit value="新規宛先登録" class="button"/>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>