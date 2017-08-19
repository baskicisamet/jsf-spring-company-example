package controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class IndexContentBean {

	public String loadContent(){
		
		return "Company managment; \n yukarida menuden isteginiz alani secip yonetimi saglayabilirsiniz.";
	}
	
}
