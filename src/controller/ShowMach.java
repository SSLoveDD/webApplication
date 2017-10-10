/**
 * 
 */
package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import service.MatchService;
import showModel.ShowMatch;
import showModel.ShowResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kuang
 *
 */
@Controller
public class ShowMach {

	@Autowired
	private MatchService ms;
	
	@RequestMapping("/showMatch")
	public String showMach(HttpServletRequest request){
		return "showMatch";
	}
	
	
	@RequestMapping("/showMatch/table")
	public @ResponseBody List<ShowResult> showMatchTable(){
		
		return ms.getMatchsByGroup("A组");
	}
	
}
