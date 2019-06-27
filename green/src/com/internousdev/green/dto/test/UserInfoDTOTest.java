package com.internousdev.green.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.green.dto.UserInfoDTO;

public class UserInfoDTOTest {
//get Id test

	@Test
	public void testGetId1() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetId3() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = -9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
		}


	@Test
	public void testGetId4() throws Exception {
		UserInfoDTO dto =new UserInfoDTO();
		try{
				int postalMax = 10000000;
				dto.setId(postalMax);
		}catch(RuntimeException e){
				assertEquals(e.getMessage() , "For input string: \"10000000.00\"");
			}

	}

	@Test
	public void testGetId5() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMin = -10000000;
				dto.setId(postalMin);
		}catch(RuntimeException e){
				assertEquals(e.getMessage(),"For input string: \"-10000000.00\"");
		}
	}

	//set Id test
	@Test
	public void testSetId1() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = 9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetId3() {
		UserInfoDTO dto =new UserInfoDTO();
		int expected = -9999999;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetId4() throws Exception {
		UserInfoDTO dto =new UserInfoDTO();
		try{
				int postalMax = 10000000;
				dto.setId(postalMax);
		}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetId5() throws Exception {
			UserInfoDTO dto = new UserInfoDTO();
			try{
					int postalMin = -10000000;
					dto.setId(postalMin);
			}catch(RuntimeException e){
						assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
			}

	}

	//get UserId test
	@Test
	public void testGetUserId1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void	testGetUserId4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserId9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//set UserId test
	@Test
	public void testSetUserId1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserId2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected =" ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected ="ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//get Password test
	@Test
	public void testGetPassword1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	//set password Test
	@Test
	public void testSetPassword1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	//get FamilyName test

	@Test
	public void testGetFamilyName1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	//set FamilyName test

	@Test
	public void testSetFamilyName1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyName8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	//get firstName test

	@Test
	public void testGetFirstName1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	//set FirstName test
	@Test
	public void testSetFirstName1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstName8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	// get FamilyKana

	@Test
	public void testGetFamilyKana1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyKana8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyKana12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	//set FamilKana test

	@Test
	public void testSetFamilyKana1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFamilyKana8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyKana12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFamilyKana(expected);
		String actual = dto.getFamilyKana();
		assertEquals(expected, actual);
	}

	//get FirstKana test

	@Test
	public void testGetFirstKana1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstKana8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstKana12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	//set firstKana test

	@Test
	public void testSetFirstKana1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetFirstKana8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstKana12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setFirstKana(expected);
		String actual = dto.getFirstKana();
		assertEquals(expected, actual);
	}

	//get Sex test
	@Test
	public void testGetSex1(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSex2(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 9999999;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSex3(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -999999;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSex4() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMax = 10000000;
				dto.setSex(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), " For input String: \"10000000.00\"");
		}
	}

	@Test
	public void testGetSex5() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMin = -10000000;
				dto.setSex(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}
	//set Sex test

	@Test
	public void testSetSex1(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetSex2(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 9999999;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetSex3(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -999999;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetSex4() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMax = 10000000;
				dto.setSex(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), " For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetSex5() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMin = -10000000;
				dto.setSex(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	//get Email test

	@Test
	public void testGetEmail1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//set Email test

	@Test
	public void testSetEmail1(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "0";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail2(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail3(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "-2147483647";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail4(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "null";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail5(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail6(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail7(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEmail8(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail9(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail10(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail11(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail12(){
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//get LoginFlg test

	@Test
	public void testGetLoginFlg1(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setLoginFlg(expected);
		int actual = dto.getLoginFlg();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetLoginFlg2(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 9999999;

		dto.setLoginFlg(expected);
		int actual = dto.getLoginFlg();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetLoginFlg3(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -999999;

		dto.setLoginFlg(expected);
		int actual = dto.getLoginFlg();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetLoginFlg4() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMax = 10000000;
				dto.setLoginFlg(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), " For input String: \"10000000.00\"");
		}
	}

	@Test
	public void testGetLoginFlg5() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMin = -10000000;
				dto.setLoginFlg(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}
	//set LoginFlg test
	@Test
	public void testSetLoginFlg1(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;

		dto.setLoginFlg(expected);
		int actual = dto.getLoginFlg();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetLoginFlg2(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 9999999;

		dto.setLoginFlg(expected);
		int actual = dto.getLoginFlg();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetLoginFlg3(){
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -999999;

		dto.setLoginFlg(expected);
		int actual = dto.getLoginFlg();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetLoginFlg4() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMax = 10000000;
				dto.setLoginFlg(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), " For input String: \"10000000.00\"");
		}
	}

	@Test
	public void testSetLoginFlg5() throws Exception{
		UserInfoDTO dto = new UserInfoDTO();
		try{
				int postalMin = -10000000;
				dto.setLoginFlg(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

}


