package Com.internousdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Com.internousdev.webproj4.dao.InquiryCompleteDAO;
import Com.internousdev.webproj4.dto.InquiryDTO;

public class InquiryCompleteAction extends ActionSupport{
	
	private String name;
	private String qtype;
	private String body;
	
	List<InquiryDTO> inquiryDTOList=new ArrayList<InquiryDTO>();
	
	public String execute(){
		String ret=ERROR;
		InquiryCompleteDAO dao=new InquiryCompleteDAO();
	}

}
