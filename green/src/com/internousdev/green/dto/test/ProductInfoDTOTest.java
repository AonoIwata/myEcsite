package com.internousdev.green.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.green.dto.ProductInfoDTO;

public class ProductInfoDTOTest {

	// id Test
	@Test
	public void testGetId1() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected=0;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId2() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected=2147483647;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId3() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected= -2147483647;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetId4()throws Exception{
		ProductInfoDTO dto=new ProductInfoDTO();
		try{
		    int postalMax=Integer.parseInt("2147483648");
		    dto.setId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5()throws Exception{
		ProductInfoDTO dto=new ProductInfoDTO();
		try{
		    int postalMin=Integer.parseInt("-2147483648");
		    dto.setId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testSetId1() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected= 0;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected= 2147483647;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId3() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected= -2147483647;

		dto.setId(expected);
		int actual=dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetId4()throws Exception{
		ProductInfoDTO dto=new ProductInfoDTO();
		try{
		    int postalMax=Integer.parseInt("2147483648");
		    dto.setId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5()throws Exception{
		ProductInfoDTO dto=new ProductInfoDTO();
		try{
		    int postalMin=Integer.parseInt("-2147483648");
		    dto.setId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	//productId test
	@Test
	public void testGetProductId1() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected=0;

		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId2() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected=2147483647;

		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId3() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected= -2147483647;

		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductId4()throws Exception{
		ProductInfoDTO dto=new ProductInfoDTO();
		try{
		    int postalMax=Integer.parseInt("2147483648");
		    dto.setProductId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5()throws Exception{
		ProductInfoDTO dto=new ProductInfoDTO();
		try{
		    int postalMin=Integer.parseInt("-2147483648");
		    dto.setProductId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testSetProductId1() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected= 0;

		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId2() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected= 2147483647;

		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId3() {
		ProductInfoDTO dto=new ProductInfoDTO();
		int expected= -2147483647;

		dto.setProductId(expected);
		int actual=dto.getProductId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductId4()throws Exception{
		ProductInfoDTO dto=new ProductInfoDTO();
		try{
		    int postalMax=Integer.parseInt("2147483648");
		    dto.setProductId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5()throws Exception{
		ProductInfoDTO dto=new ProductInfoDTO();
		try{
		    int postalMin=Integer.parseInt("-2147483648");
		    dto.setProductId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
		}
	}

	//productName test
	@Test
	public void testGetProductName1() {
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected="0";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName2() {
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected="2147483647";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName3() {
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "-2147483647";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName4(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "null";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName5(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName6(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= " ";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName7(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "　";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName8(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "abc123";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName9(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "あいう１２３";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName10(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName11(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetProductName12(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName1() {
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "0";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName2() {
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "2147483647";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName3() {
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "-2147483647";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName4(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "null";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName5(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName6(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= " ";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName7(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "　";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName8(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "abc123";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName9(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "あいう１２３";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName10(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "abc123あいう１２３";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName11(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetProductName12(){
		ProductInfoDTO dto=new ProductInfoDTO();
		String expected= "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual=dto.getProductName();
		assertEquals(expected,actual);
	}

	//productKana test
		@Test
		public void testGetProductKana1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="0";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="2147483647";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "-2147483647";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana4(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "null";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana5(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductKana12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "0";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "2147483647";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductKana3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "-2147483647";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana4(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "null";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana5(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductKana12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setProductKana(expected);
			String actual=dto.getProductKana();
			assertEquals(expected,actual);
		}

		//productDesc test
		@Test
		public void testGetProductDesc1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="0";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="2147483647";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "-2147483647";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc4(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "null";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc5(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetProductDesc12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "0";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "2147483647";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductDesc3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "-2147483647";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc4(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "null";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc5(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetProductDesc12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setProductDesc(expected);
			String actual=dto.getProductDesc();
			assertEquals(expected,actual);
		}

		// categoryId Test
		@Test
		public void testGetCategoryId1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected=0;

			dto.setCategoryId(expected);
			int actual=dto.getCategoryId();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetCategoryId2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected=2147483647;

			dto.setCategoryId(expected);
			int actual=dto.getCategoryId();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetCategoryId3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected= -2147483647;

			dto.setCategoryId(expected);
			int actual=dto.getCategoryId();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetCategoryId4()throws Exception{
			ProductInfoDTO dto=new ProductInfoDTO();
			try{
			    int postalMax=Integer.parseInt("2147483648");
			    dto.setCategoryId(postalMax);

			}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
			}
		}

		@Test
		public void testGetCategoryId5()throws Exception{
			ProductInfoDTO dto=new ProductInfoDTO();
			try{
			    int postalMin=Integer.parseInt("-2147483648");
			    dto.setCategoryId(postalMin);

			}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
			}
		}

		@Test
		public void testSetCategoryId1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected= 0;

			dto.setCategoryId(expected);
			int actual=dto.getCategoryId();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetCategoryId2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected= 2147483647;

			dto.setCategoryId(expected);
			int actual=dto.getCategoryId();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetCategoryId3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected= -2147483647;

			dto.setCategoryId(expected);
			int actual=dto.getCategoryId();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetCategoryId4()throws Exception{
			ProductInfoDTO dto=new ProductInfoDTO();
			try{
			    int postalMax=Integer.parseInt("2147483648");
			    dto.setCategoryId(postalMax);

			}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
			}
		}

		@Test
		public void testSetCategoryId5()throws Exception{
			ProductInfoDTO dto=new ProductInfoDTO();
			try{
			    int postalMin=Integer.parseInt("-2147483648");
			    dto.setCategoryId(postalMin);

			}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
			}
		}

		// price Test
		@Test
		public void testGetPrice1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected=0;

			dto.setPrice(expected);
			int actual=dto.getPrice();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetPrice2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected=9999999;

			dto.setPrice(expected);
			int actual=dto.getPrice();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetPrice3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected= -9999999;

			dto.setPrice(expected);
			int actual=dto.getPrice();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetPrice4()throws Exception{
			ProductInfoDTO dto=new ProductInfoDTO();
			try{
			    int postalMax=10000000;
			    dto.setPrice(postalMax);

			}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"10000000.00\"");
			}
		}

		@Test
		public void testGetPrice5()throws Exception{
			ProductInfoDTO dto=new ProductInfoDTO();
			try{
			    int postalMin=-10000000;
			    dto.setPrice(postalMin);

			}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-10000000.00\"");
			}
		}

		@Test
		public void testSetPrice1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected= 0;

			dto.setPrice(expected);
			int actual=dto.getPrice();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetPrice2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected= 9999999;

			dto.setPrice(expected);
			int actual=dto.getPrice();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetPrice3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			int expected= -9999999;

			dto.setPrice(expected);
			int actual=dto.getPrice();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetPrice4()throws Exception{
			ProductInfoDTO dto=new ProductInfoDTO();
			try{
			    int postalMax=10000000;
			    dto.setPrice(postalMax);

			}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"10000000.00\"");
			}
		}

		@Test
		public void testSetPrice5()throws Exception{
			ProductInfoDTO dto=new ProductInfoDTO();
			try{
			    int postalMin=-10000000;
			    dto.setPrice(postalMin);

			}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-10000000.00\"");
			}
		}

		// imageFilePath Test
		@Test
		public void testGetImageFilePath1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFilePath6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFilePath7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFilePath8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFilePath9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFilePath10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFilePath11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFilePath12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFilePath1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFilePath6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFilePath7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFilePath8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFilePath9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFilePath10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFilePath11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFilePath12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setImageFilePath(expected);
			String actual=dto.getImageFilePath();
			assertEquals(expected,actual);
		}


		//imageFileName test
		@Test
		public void testGetImageFileName1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="0";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="2147483647";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "-2147483647";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName4(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "null";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName5(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetImageFileName12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "0";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "2147483647";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "-2147483647";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName4(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "null";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName5(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetImageFileName12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setImageFileName(expected);
			String actual=dto.getImageFileName();
			assertEquals(expected,actual);
		}
        // releaseDate test
		@Test
		public void testGetReleaseDate1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			Date expected=null;

			dto.setReleaseDate(expected);
			Date actual=dto.getReleaseDate();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseDate2()throws ParseException {
		    ProductInfoDTO dto=new ProductInfoDTO();

            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected=sdf.parse("20180420 12:00:00");
            dto.setReleaseDate(expected);
		    assertEquals(expected,dto.getReleaseDate());
		}

		@Test
		public void testSetReleaseDate1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			Date expected=null;

			dto.setReleaseDate(expected);
			Date actual=dto.getReleaseDate();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseDate2()throws ParseException {
		    ProductInfoDTO dto=new ProductInfoDTO();

            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected=sdf.parse("20180420 12:00:00");
            dto.setReleaseDate(expected);
		    assertEquals(expected,dto.getReleaseDate());
		}

		// releaseCompany test
		@Test
		public void testGetReleaseCompany1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="0";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected="2147483647";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "-2147483647";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany4(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "null";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany5(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testGetReleaseCompany12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany1() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "0";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany2() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "2147483647";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseCompany3() {
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "-2147483647";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany4(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "null";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany5(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany6(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= " ";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany7(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "　";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany8(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany9(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "あいう１２３";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany10(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany11(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}

		@Test
		public void testSetReleaseCompany12(){
			ProductInfoDTO dto=new ProductInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setReleaseCompany(expected);
			String actual=dto.getReleaseCompany();
			assertEquals(expected,actual);
		}
}
