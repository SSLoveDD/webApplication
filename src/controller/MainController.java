package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import model.User;
import service.TeamService;
import service.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService us=null;
	@Autowired
	private TeamService tm=null;
	
	private static final Log log=LogFactory.getLog(MainController.class);
	@RequestMapping(value="/index")
	public  String index(HttpSession session){
		
		return "index";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user,HttpServletRequest request,HttpSession session,HttpServletResponse response) {
		String name=user.getUser_name();
		String psw=user.getUser_psw();
		User rus=us.queryUserByName(name);
		if(rus!=null&&rus.getUser_psw()!=null&&rus.getUser_psw().equals(psw)){
			session.setAttribute("username", name);
			return "redirect:index";
		}

		else{
			return "用户名或密码不正确";
		}

	}
	
	@RequestMapping(value="/adlogin",method=RequestMethod.POST)
	public String adlogin(User user,HttpServletRequest request,HttpSession session,HttpServletResponse response) {
		String name=user.getUser_name();
		String psw=user.getUser_psw();
		User rus=us.queryUserByName(name);
		if(rus!=null&&rus.getUser_psw()!=null&&rus.getUser_psw().equals(psw)){
			session.setAttribute("username", name);
			return "redirect:index";
		}

		else{
			return "用户名或密码不正确";
		}

	}
	
	
	
	@RequestMapping(value="/quit")
	public String quit(HttpSession session){
		session.removeAttribute("username");
		return "redirect:index";
	}
	
	
	@RequestMapping(value="/register")
	public  String register(HttpServletRequest request,HttpSession session,User user){
		if(request.getMethod().equals("POST")){
			us.addUser(user);
			session.setAttribute("username", user.getUser_name());
			return "redirect:index";
		}
		return "register";
		
	}
	
	@RequestMapping(value="/userCenter")
	public  String userCenter(HttpSession session){
		return "userCenter";
	}
	
	@RequestMapping(value="/getUserInfo")
	@ResponseBody
	public  Object getUserInfo(HttpSession session){
		String un=(String) session.getAttribute("username");
		Object ui=us.getUserInfo(un);
		return ui;
	}
	
	
	@RequestMapping(value="/updateUser")
	@ResponseBody
	public  void updateUser(HttpSession session,@RequestBody User newUser){
		us.updateUser(newUser);
	}
	
	@RequestMapping(value="/testPSW")
	@ResponseBody
	public  String testPSW(HttpSession session,@RequestBody JSONObject json,HttpServletResponse response) throws IOException{
		String newPSW=json.getString("newPSW");
		String originPSW=json.getString("originPSW");
		User user=us.queryUserByName((String) session.getAttribute("username"));
		if(user.getUser_psw().equals(originPSW)){
			user.setUser_psw(newPSW);
			us.updateUser(user);
			return "OK";
		}
		else{
			response.sendError(HttpServletResponse.SC_FORBIDDEN,"密码不正确");
		}
		return "BAD"; 
	}
	
	
	@RequestMapping(value="/teamInfoShow",method=RequestMethod.GET)
	@ResponseBody
	public  Object teamInfoShow(HttpSession session){
		return tm.getTeamInfo((String)session.getAttribute("username"));
	}
	
	
	@RequestMapping(value="/memberInfo",method=RequestMethod.GET)
	@ResponseBody
	public  List<User> memberInfo(HttpSession session){
		return tm.getTeamMembers((String)session.getAttribute("username"));
	}
	
	@RequestMapping(value="/updateMember",method=RequestMethod.POST)
	@ResponseBody
	public  String updateMember(HttpSession session,@RequestBody JSONObject json,HttpServletResponse response){
		us.updateUserByPart(json);
		return "OK";
	}
	
	@RequestMapping(value="/searchUser",method=RequestMethod.POST)
	@ResponseBody
	public  List<User> searchUser(HttpSession session,@RequestBody JSONObject json){
		return us.searchUserFuzy(json);
	}
	
	@RequestMapping(value="/deleteMember",method=RequestMethod.POST)
	@ResponseBody
	public  String deleteMember(HttpSession session,@RequestBody String jsonstr){
		User user=us.queryUserByName(((JSONObject) JSON.parse(jsonstr)).getString("user_name"));
		user.setUser_team_id(0);
		us.save(user);
		return "OK";
	}
}
