package com.internousdev.green.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.green.dto.MCategoryDTO;

public class MCategoryDTOTest {

	//get id test
	@Test
	public void testGetId1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	@Test
	public void testGetId5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//set id test
	@Test
	public void testSetId1() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;
		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//get CategoryId test
	@Test
	public void testGetCategoryId1() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId2() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId3() {
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategoryId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryId5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//set CategoryId test
	@Test
	public void testSetCategoryId1() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 0;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId2() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		int expected = 2147483647;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId3() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		int expected = -2147483647;
		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId4() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMax = Integer.parseInt("214748364");
			dto.setCategoryId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategoryId5() throws Exception{
		MCategoryDTO dto = new MCategoryDTO();
		try{
			int postalMin = Integer.parseInt("-214748364");
			dto.setCategoryId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//get CategoryName test
	@Test
	public void testGetCategoryName1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryName12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}



	//set CategoryName test
	@Test
	public void testSetCategoryName1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "2147483647";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "-2147483647";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "null";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = " ";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "　";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "あいう１２３";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryName12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "ａｂｃあいう１２３漢字";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	//get CategoryDesc test
	@Test
	public void testGetCategoryDesc1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryDesc12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	//set CategoryDesc test
	@Test
	public void testSetCategoryDesc1() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc2() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryName(expected);
		String actual = dto.getCategoryName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc3() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc4() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc5() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc6() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc7() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc8() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc9() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc10() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc11() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryDesc12() {
		MCategoryDTO dto = new MCategoryDTO();
		String expected = "0";
		dto.setCategoryDesc(expected);
		String actual = dto.getCategoryDesc();
		assertEquals(expected, actual);
	}
}
