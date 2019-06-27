package com.internousdev.green.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.green.dto.DestinationInfoDTO;

public class DestinationInfoDTOTest {

//get Id test
	@Test
	public void testGetId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		DestinationInfoDTO dto=new DestinationInfoDTO();
		int expected=2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMax=Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"2147483628\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

//set Id test
	@Test
	public void testSetId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
		}
	}

//get userId test
	@Test
	public void testGetUserId1(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId2(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUserId3(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId4(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId5(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId6(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void GetUserId7(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetUserId8(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId9(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="あいう１２３";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId10(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId11(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abcあいう123漢字";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testsetUserId12(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abcあいう123漢字";

		dto.setUserId(expected);
		String actual=dto.getUserId();
		assertEquals(expected,actual);
	}

	//get FamilyName test
	@Test
	public void testGetFamilyName1(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName2(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName3(){
		DestinationInfoDTO dto =new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName4(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName5(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName6(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName7(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName8(){
		DestinationInfoDTO dto =new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName9(){
		DestinationInfoDTO dto =new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName10(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName11(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFamilyName12(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="a b cあいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	//set Family Name test
	@Test
	public void testSetFamilyName1(){
		DestinationInfoDTO dto =new DestinationInfoDTO();
		String expected="0";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName2(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="21474836147";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName3(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName4(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName5(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName6(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName7(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName8(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName9(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName10(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName11(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFamilyName12(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="a b c あいう１２３漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	//get FirstName test
	@Test
	public void testGetFirstName1(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName2(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName3(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName4(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName5(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName6(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName7(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName8(){
		DestinationInfoDTO dto =new DestinationInfoDTO();
		String expected="abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName9(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName10(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName11(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetFirstName12(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="a b c あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	//set First Name test
	@Test
	public void testSetFirstName1(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="0";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName2(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName3(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="-2147483647";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName4(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="null";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName5(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName6(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected=" ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName7(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName8(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName9(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName10(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName11(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetFirstName12(){
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected="a b c あいう１２３漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	// get FirstKana test
		@Test
		public void testGetFirstKana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstKana2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);;
		}

		@Test
		public void testGetFirstKana3(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstKana4(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void TestGetFirstKana5(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void TestGetFirstKana6(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstKana7(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstKana8(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstKana9(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstKana10(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGestFirstKana11(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetFirstKana12(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		//set FirstKana test
		@Test
		public void testSetFirstKana1(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana2(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana3(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana4(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana5(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana6(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana7(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana8(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana9(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana10(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstKana11(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setFirstKana(expected);
			String actual = dto.getFirstKana();
			assertEquals(expected, actual);
		}

		// get Email test
		@Test
		public void testGetEmail1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetEmail12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		//set Email test
		@Test
		public void testSetEmail1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetEmail12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}


		//get TelNumber test
		@Test
		public void testGetTelNumber1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetTelNumber12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		// set TelNumber test
		@Test
		public void testSetTelNumber1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetTelNumber12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

		//get Address test
		@Test
		public void testGetAddress1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress2(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress3(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress4(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress5(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress6(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress7(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress8(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress9(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress10(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress11(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testGetAddress12(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		//set Address test
		@Test
		public void testSetAddress1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress2(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress3(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress4(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress5(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress6(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress7(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress8(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress9(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress10(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress11(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetAddress12(){
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setAddress(expected);
			String actual = dto.getAddress();
			assertEquals(expected, actual);
		}
}
