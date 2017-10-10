package service;

import java.util.List;

import showModel.ShowResult;
public interface MatchService {

	List<ShowResult> getMatchsByGroup(String groupName);
	
}
