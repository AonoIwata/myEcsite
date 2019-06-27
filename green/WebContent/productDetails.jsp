<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品詳細</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
  <h1>商品詳細</h1>

  <s:if test="productInfoDTO !=null">
    <s:form action="AddCartAction">
      <div class="detailsbox">
        <div class="2column-container">

          <div class="left">
            <img src='<s:property value="productInfoDTO.imageFilePath" />/<s:property value="productInfoDTO.imageFileName" />' class="item-image-box-320" /><br>
          </div>

          <div class="right">
            <table class="vertical-list-table-mini">
              <tr>
                <th scope="row"><s:label>商品名</s:label></th>
                <td><s:property value="productInfoDTO.productName" /></td>
              </tr>
              <tr>
                <th scope="row"><s:label>商品名ふりがな</s:label></th>
                <td><s:property value="productInfoDTO.productKana"/></td>
              </tr>
              <tr>
                <th scope="row"><s:label>値段</s:label></th>
                <td><s:property value="productInfoDTO.price"/>円<s:hidden name="price" value="%{productInfoDTO.price}" /></td>
              </tr>
              <tr>
                <th scope="row"><s:label>購入個数</s:label></th>
                <td><s:select name="productCount" list="%{productCountList}" theme="simple" />個</td>
              </tr>
              <tr>
                <th scope="row"><s:label>発売会社名</s:label></th>
                <td><s:property value="productInfoDTO.releaseCompany"/></td>
              </tr>
              <tr>
                <th scope="row"><s:label>発売年月日</s:label></th>
                <td><s:property value="productInfoDTO.releaseDate"/></td>
              </tr>
              <tr>
                <th scope="row"><s:label>商品詳細情報</s:label></th>
                <td><s:property value="productInfoDTO.productDesc"/></td>
              </tr>
            </table>
            <div class="btn">
               <s:submit value="カートに追加" class="button" />
            </div>
          </div>
        </div>
        <s:hidden name="productId" value="%{productInfoDTO.productId}" />
      </div>
     </s:form>
    <s:if test="relatedProductList !=null && relatedProductList.size()>0">
      <div>
        <div class="product-details-recommend-box">
          <h2>【関連商品】</h2>
            <s:iterator value="relatedProductList">
              <div class="recomend-box">
                <a href='<s:url action="ProductDetailsAction">
                  <s:param name="productId" value="%{productId}"/></s:url>'>
                  <img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-100"/>
                  <s:property value="productName"/><br>
                </a>
              </div>
            </s:iterator>
        </div>
      </div>
    </s:if>
  </s:if>

  <s:else>
    <div class="errorBlue">
      商品の詳細情報がありません。
    </div>
  </s:else>
</div>
</body>
</html>