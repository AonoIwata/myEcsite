package com.internousdev.green.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.DestinationInfoDAO;
import com.internousdev.green.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteDestinationAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private DestinationInfoDAO dao = new DestinationInfoDAO();
	private ArrayList<DestinationInfoDTO> dtoList;
	private int[] destinationId;

	public String execute(){
		//セッションタイムアウトの確認
		if(!session.containsKey("userId") && !session.containsKey("tempUserId")) {
			return "sessionTimeout";
		}

		int result = dao.deleteDestinationInfo(destinationId);

		//削除が成功したかどうかをdeleteDestinationメソッドの戻り値を比較してチェックする。
		if(result == destinationId.length){
			dtoList = dao.getDestinationInfo(session.get("userId").toString());
			return SUCCESS;
		}else{
			return ERROR;
		}
	}

	public Map<String,Object> getSession(){
		return this.session;
	}

	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public int[] getDestinationId(){
		return this.destinationId;
	}

	public void setDestinationId(int[] destinationId){
		this.destinationId = destinationId;
	}

	public ArrayList<DestinationInfoDTO> getDtoList() {
		return dtoList;
	}

	public void setDtoList(ArrayList<DestinationInfoDTO> dtoList) {
		this.dtoList = dtoList;
	}

}
