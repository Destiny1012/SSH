package com.user.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.user.domain.User;
import com.user.service.IUserService;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 419871870741080002L;

	@Resource
	private IUserService userService;
	private long id;
	private String email;
	private String password;
	private String phone;
	private String qq;
	private String result;

	public String save() throws Exception {
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		user.setQq(qq);
		userService.saveUser(user);
		return "save";
	}
	
	public String delete() throws Exception{
		if(userService.deleteUser(id)){
			result = "success";
		}else{
			result = "fail";
		}
		return "delete";
	}
	
	public String update() throws Exception{
		User user = userService.getById(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		user.setQq(qq);
		if(userService.updateUser(user)){
			result = "success";
		}else{
			result = "fail";
		}
		return "update";
	}
	
	public String get() throws Exception{
		User user = userService.getById(id);
		email = user.getEmail();
		password = user.getPassword();
		phone = user.getPhone();
		qq = user.getQq();
		return "get";
	}
	
	public String goToSave() throws Exception{
		return "goToSave";
	}
	
	public String goToDelete() throws Exception{
		return "goToDelete";
	}
	
	public String goToUpdate() throws Exception{
		return "goToUpdate";
	}
	
	public String goToGet() throws Exception{
		return "goToGet";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
