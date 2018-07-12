package com.alison.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("成功进入IndexAction！");
		return "index";
	}
	
	
	
}
