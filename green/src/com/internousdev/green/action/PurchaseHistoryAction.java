package com.internousdev.green.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.green.dao.PurchaseHistoryInfoDAO;
import com.internousdev.green.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {
     private List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList;
     private Map<String , Object> session;

     public  String execute(){
    	//セッションタイムアウトした場合
    	 if(!session.containsKey("userId") && !session.containsKey("tempUserId")){
    		 return "sessionTimeout";
    	 }

    	 PurchaseHistoryInfoDAO dao = new PurchaseHistoryInfoDAO();
    	 purchaseHistoryInfoDTOList = dao.getPurchaseHistoryList(String.valueOf(session.get("userId")));

    	 return SUCCESS;
         }

     public List<PurchaseHistoryInfoDTO> getPurchaseHistoryInfoDTOList(){
    	 return purchaseHistoryInfoDTOList;
     }

     public void setPurchaseHistoryInfoDTOList(List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList){
    	 this.purchaseHistoryInfoDTOList =  purchaseHistoryInfoDTOList;
     }

     public Map<String, Object> getSession(){
    	 return session;
     }

     public void setSession(Map<String, Object> session){
    	 this.session =session;
     }
}
