/**
 * 
 */
package service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persist.MatchManager;
import service.MatchService;
import showModel.ShowMatch;
import showModel.ShowResult;

/**
 * @author kuang
 *
 */
@Service
public class MatchServiceImp implements MatchService {

	@Autowired
	private MatchManager mm=null;
	
	/* (non-Javadoc)
	 * @see service.MatchService#getMatchsByGroup(java.lang.String)
	 */
	@Override
	public List<ShowResult> getMatchsByGroup(String groupName) {
		// TODO Auto-generated method stub
		return mm.getShowMatchsByGroup(groupName);
	}

}
