package com.internousdev.green.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.green.dto.PurchaseHistoryInfoDTO;


public class PurchaseHistoryInfoDTOTest {
	int max = 2147483647;
	int min = -2147483648;
	String exmax = "2147483648";
	String exmin = "-2147483649";


	// get Id test
	@Test
	public void testGetId1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		try{
			int expected = Integer.parseInt(exmax);
			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected, actual);
	}catch (RuntimeException e ) {
		assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
	}

	@Test
	public void testGetId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {
			int expected = Integer.parseInt(exmin);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	// set Id test
	@Test
	public void testSetId1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {
			int expected = Integer.parseInt(exmax);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

    //get UserId test
	@Test
	public void testGetUserId1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = null;
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = " ";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "　";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "abc123";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "あいう１２３";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "abc123あいう１２３";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId9() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//get UserId test
	@Test
	public void testSetUserId1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = null;
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = " ";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "　";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "abc123";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetUserId6() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "あいう１２３";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "abc123あいう１２３";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId9() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//get puroductId test
	@Test
	public void testGetProductId1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = 0;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = max;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = min;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		try{
			 int expected = Integer.parseInt(exmax);
			  dto.setProductId(expected);
			  int actual=dto.getProductId();
			  assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
		}

	@Test
	public void testGetProductId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {

			int expected = Integer.parseInt(exmin);
			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//set puroductId test
	@Test
	public void testSetProductId1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = 0;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = max;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = min;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		try{
			 int expected = Integer.parseInt(exmax);
			  dto.setProductId(expected);
			  int actual=dto.getProductId();
			  assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
		}

	@Test
	public void testSetProductId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {

			int expected = Integer.parseInt(exmin);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	//get puroductCount test
	@Test
	public void testGetProductCount1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = 0;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = max;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = min;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		try{
			 int expected = Integer.parseInt(exmax);
			  dto.setProductId(expected);
			  int actual=dto.getProductId();
			  assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
		}

	@Test
	public void testGetProductCount5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setProductCount(expected);
		int actual= dto.getProductCount();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//set puroductCount test
	@Test
	public void testSetProductCount1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = 0;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = max;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = min;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		try{
			 int expected = Integer.parseInt(exmax);
			  dto.setProductId(expected);
			  int actual=dto.getProductId();
			  assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
		}

	@Test
	public void testSetProductCount5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setProductCount(expected);
		int actual= dto.getProductCount();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//get price test
	@Test
	public void testGetPrice1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected , actual);
	}

	@Test
	public void testgetPrice2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = max;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}


	@Test
	public void testGetPrice3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = min;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		try{
			 int expected = Integer.parseInt(exmax);
			  dto.setProductId(expected);
			  int actual=dto.getProductId();
			  assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
		}

	@Test
	public void testGetPrice5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//set price test
	@Test
	public void testSetPrice1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetPrice2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = max;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		  int expected = min;
		  dto.setProductId(expected);
		  int actual=dto.getProductId();
		  assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		try{
			 int expected = Integer.parseInt(exmax);
			  dto.setProductId(expected);
			  int actual=dto.getProductId();
			  assertEquals(expected, actual);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
		}

	@Test
	public void testSetPrice5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//get totalprice test
	@Test
	public void testGetTotalPrice1() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetTotalPrice2() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetTotalPrice3() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetTotalPrice4() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetTotalPrice5() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//get totalprice test
	@Test
	public void testSetSubtotal1() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetSubtotal2() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetSubtotal3() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetSubtotal4() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetSubtotal5() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setTotalPrice(expected);
		int actual = dto.getTotalPrice();
		assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
	// get ProductName test
		@Test
		public void testGetProductName1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductName2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductName3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductName4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductName5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductName6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductName7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductName8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		// set ProductName test
		@Test
		public void testSetProductName1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductName2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductName3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductName4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductName5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductName6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductName7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductName8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setProductName(expected);
			String actual = dto.getProductName();
			assertEquals(expected, actual);
		}

		// get ProductKana test
		@Test
		public void testGetProductKana1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductKana2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductKana3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductKana4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductKana5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductKana6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductKana7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetProductKana8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		// set ProductKana test
		@Test
		public void testSetProductKana1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductKana2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductKana3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductKana4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductKana5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductKana6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductKana7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetProductKana8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setProductKana(expected);
			String actual = dto.getProductKana();
			assertEquals(expected, actual);
		}

		// get ImageFilePath test
		@Test
		public void testGetImageFilePath1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testGetImageFilePath2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testGetImageFilePath3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testGetImageFilePath4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testGetImageFilePath5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testGetImageFilePath6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testGetImageFilePath7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testGetImageFilePath8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		// set ImageFilePath test
		@Test
		public void testSetImageFilePath1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testSetImageFilePath2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testSetImageFilePath3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testSetImageFilePath4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testSetImageFilePath5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testSetImageFilePath6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testSetImageFilePath7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		public void testSetImageFilePath8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setImageFilePath(expected);
			String actual = dto.getImageFilePath();
			assertEquals(expected, actual);
		}

		// get ImageFileName test
		@Test
		public void testGetImageFileName1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFileName2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFileName3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFileName4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFileName5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFileName6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFileName7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetImageFileName8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		// set ImageFileName test
		@Test
		public void testSetImageFileName1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetImageFileName8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setImageFileName(expected);
			String actual = dto.getImageFileName();
			assertEquals(expected, actual);
		}

		// get ReleaseCompany test
		@Test
		public void testGetReleaseCompany1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetReleaseCompany2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetReleaseCompany3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetReleaseCompany4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetReleaseCompany5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetReleaseCompany6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetReleaseCompany7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetReleaseCompany8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		// set ReleaseCompany test
		@Test
		public void testSetReleaseCompany1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseCompany2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseCompany3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseCompany4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseCompany5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseCompany6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseCompany7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseCompany8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setReleaseCompany(expected);
			String actual = dto.getReleaseCompany();
			assertEquals(expected, actual);
		}

		// get ReleaseDate test
		@Test
		public void testGetReleaseDate1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			Date expected = null;
			dto.setReleaseDate(expected);
			Date actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetReleaseDate2() throws ParseException {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		}

		// set ReleaseDate test
		@Test
		public void testSetReleaseDate1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			Date expected = null;
			dto.setReleaseDate(expected);
			Date actual = dto.getReleaseDate();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetReleaseDate2() throws ParseException {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		}

		// get familyName test
		@Test
		public void testGetFamilyName1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFamilyName8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		// set familyName test
		@Test
		public void testSetFamilyName1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFamilyName8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		// get firstName test
		@Test
		public void testGetFirstName1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstName8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		// set firstName test
		@Test
		public void testSetFirstName1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstName8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		// get address test
		@Test
		public void testGetAddress1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		// set address test
		@Test
		public void testSetAddress1() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "null";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress2() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress3() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = " ";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress4() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "　";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress5() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress6() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "あいう１２３";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress7() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "abc123あいう１２３";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress8() {
			PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
			String expected = "ａｂｃ１２３あいう漢字";
			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}
	}






