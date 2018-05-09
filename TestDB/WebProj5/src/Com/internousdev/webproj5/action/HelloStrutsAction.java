package Com.internousdev.webproj5.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import Com.internousdev.webproj5.dao.HelloStrutsDAO;
import Com.internousdev.webproj5.dto.HelloStrutsDTO;

public class HelloStrutsAction extends ActionSupport implements SessionAware {
	private List<HelloStrutsDTO> helloStrutsDTOList =new ArrayList<HelloStrutsDTO>();
	private Map<String,Object> session;

	public String execute(){
		String ret=ERROR;
		HelloStrutsDAO dao=new HelloStrutsDAO();

		helloStrutsDTOList=dao.select();

		if(helloStrutsDTOList.size() > 0){
			session.put("helloStruts",helloStrutsDTOList);
			ret=SUCCESS;

		}else{
			ret=ERROR;
		}
		return ret;
	}
	public Map<String,Object> getSession(){
		return session;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
