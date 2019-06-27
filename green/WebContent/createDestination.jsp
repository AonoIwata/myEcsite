<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>宛先情報入力画面</title>
</head>
<body>
	<jsp:include page="header.jsp"/>

   <h1>宛先情報入力画面</h1>

    <s:if test="familyNameErrorMessage!=null && familyNameErrorMessage.size()>0">
      <div class="errorRed">
          <s:iterator value="familyNameErrorMessage"><s:property/><br></s:iterator>
      </div>
    </s:if>

    <s:if test="firstNameErrorMessage!=null && firstNameErrorMessage.size()>0">
      <div class="errorRed">
          <s:iterator value="firstNameErrorMessage"><s:property/><br></s:iterator>
      </div>
    </s:if>

    <s:if test="familyKanaErrorMessage!=null && familyKanaErrorMessage.size()>0">
      <div class="errorRed">
          <s:iterator value="familyKanaErrorMessage"><s:property/><br></s:iterator>
      </div>
	</s:if>

    <s:if test="firstKanaErrorMessage!=null && firstKanaErrorMessage.size()>0">
      <div class="errorRed">
          <s:iterator value="firstKanaErrorMessage"><s:property/><br></s:iterator>
      </div>
    </s:if>

    <s:if test="addressErrorMessage!=null && addressErrorMessage.size()>0">
      <div class="errorRed">
          <s:iterator value="addressErrorMessage"><s:property/><br></s:iterator>
      </div>
    </s:if>

    <s:if test="telNumberErrorMessage!=null && telNumberErrorMessage.size()>0">
      <div class="errorRed">
          <s:iterator value="telNumberErrorMessage"><s:property/><br></s:iterator>
      </div>
    </s:if>

    <s:if test="emailErrorMessage!=null && emailErrorMessage.size()>0">
      <div class="errorRed">
          <s:iterator value="emailErrorMessage"><s:property/><br></s:iterator>
      </div>
    </s:if>

 	<s:form action="CreateDestinationConfirmAction">
	  	<table class="box">
	    	<tr>
	        	<th scope="row">姓</th>
	        	<td><s:textfield name="familyName" value="%{#session.familyName}" placeholder="姓" class="txt"/></td>
	     	</tr>

		    <tr>
		        <th scope="row">名</th>
		        <td><s:textfield name="firstName" value="%{#session.firstName}" placeholder="名" class="txt"/></td>
		    </tr>

		    <tr>
		        <th scope="row">姓ふりがな</th>
		        <td><s:textfield name="familyKana" value="%{#session.familyKana}" placeholder="姓ふりがな" class="txt"/></td>
		    </tr>

		    <tr>
		        <th scope="row">名ふりがな</th>
		        <td><s:textfield name="firstKana" value="%{#session.firstKana}" placeholder="名ふりがな" class="txt"/></td>
		    </tr>

		    <tr>
		        <th scope="row">住所</th>
		        <td><s:textfield name="address" value="%{#session.address}" placeholder="住所" class="txt"/></td>
		    </tr>

		    <tr>
		        <th scope="row">電話番号</th>
		        <td><s:textfield name="telNumber" value="%{#session.telNumber}" placeholder="電話番号" class="txt"/></td>
		    </tr>

		    <tr>
		        <th scope="row">メールアドレス</th>
		        <td><s:textfield name="email" value="%{#session.email}" placeholder="メールアドレス" class="txt"/></td>
		    </tr>
	   </table>

	   <div class="button_pos">
	     <s:submit value="確認" class="button" />
	   </div>
   </s:form>

</body>
</html>