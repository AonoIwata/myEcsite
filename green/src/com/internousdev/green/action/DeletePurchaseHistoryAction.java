package com.internousdev.green.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.PurchaseHistoryInfoDAO;
import com.internousdev.green.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeletePurchaseHistoryAction extends ActionSupport implements SessionAware{
	private List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList;
	private Map<String ,Object> session;
	public String execute(){
		//セッションタイムアウトした場合
		if (!session.containsKey("userId") && !session.containsKey("tempUserId")){
			   return "sessionTimeout";
		}
		String result =ERROR;
		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO= new PurchaseHistoryInfoDAO();
		int count =purchaseHistoryInfoDAO.deleteAll(String.valueOf(session.get("userId")));
		if(count > 0){
			purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getPurchaseHistoryList(String.valueOf(session.get("userId")));
			result=SUCCESS;
		}
		return result;
		}

	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryInfoDTOList(){
		return purchaseHistoryInfoDTOList;
	    }

    public void setPurchaseHistoryInfoDTOList(List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList) {
			this.purchaseHistoryInfoDTOList = purchaseHistoryInfoDTOList;
		}

    public Map<String ,Object>getSession() {
		return session;
        }

    public void setSession(Map<String,Object>session){
		 this.session = session;
	}

}
