package com.internousdev.green.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.green.dto.CartInfoDTO;

public class CartInfoDTOTest {

	//getProductId test
	@Test
	public void testGetProductId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	//setProductId test
	@Test
	public void testSetProductId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abcあいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	//getProductCount test
	@Test
	public void testGetProductCount1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductCount12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	//setProductCount test
	@Test
	public void testSetProductCount1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abcあいう１２３漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductCount12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductCount(expected);
		String actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	//getPrice test
	@Test
	public void testGetPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	//setPrice test
	@Test
	public void testSetPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abcあいう１２３漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	//getProductName test
	@Test
	public void testGetProductName1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	//setProductName test
	@Test
	public void testSetProductName1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abcあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	//getProductKana test
	@Test
	public void testGetProductKana1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductKana12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}

	//setProductKana test
	@Test
	public void testSetProductKana1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abcあいう１２３漢字";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductKana12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductKana(expected);
		String actual = dto.getProductKana();
		assertEquals(expected, actual);
	}

	//getProductPrice test
	@Test
	public void testGetProductPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductPrice12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}

	//setProductPrice test
	@Test
	public void testSetProductPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abcあいう１２３漢字";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductPrice12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setProductPrice(expected);
		String actual = dto.getProductPrice();
		assertEquals(expected, actual);
	}

	//getImageFilePath test
	@Test
	public void testGetImageFilePath1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFilePath12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//setImageFilePath test
	@Test
	public void testSetImageFilePath1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFilePath12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//getImageFileName test
	@Test
	public void testGetImageFileName1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	//setImageFileName test
	@Test
	public void testSetImageFileName1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	//getReleaseDate test
	@Test
	public void testGetReleaseDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate2() throws ParseException{
		CartInfoDTO dto = new CartInfoDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	// set ReleaseDate test
	@Test
	public void testSetReleaseDate1() {
		CartInfoDTO dto = new CartInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate2() throws ParseException{
		CartInfoDTO dto = new CartInfoDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	//getReleaseCompany test
	@Test
	public void testGetReleaseCompany1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	//setReleaseCompany test
	@Test
	public void testSetReleaseCompany1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

}
