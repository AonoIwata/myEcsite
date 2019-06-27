<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宛先情報入力確認</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="box">
    	<h1>宛先情報入力確認画面</h1>
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
             <th scope="row"><s:label value="住所"/></th>
             <td><s:property value="address"/></td>
          </tr>

          <tr>
             <th scope="row"><s:label value="電話番号"/></th>
             <td><s:property value="telNumber"/></td>
          </tr>

          <tr>
             <th scope="row"><s:label value="メールアドレス"/></th>
             <td><s:property value="email"/></td>
          </tr>
		</table>

       <div class="button_pos">
          <s:form action="CreateDestinationCompleteAction">
          	<s:submit value="登録" class="button"/>
          </s:form>
       </div>

       <div class="button_pos">
          <s:form action="CreateDestinationAction">
	        <s:hidden name="backFlg" value="true"/>
	      	<s:submit value="戻る" class="button"/>
          </s:form>
       </div>
	</div>
</body>
</html>