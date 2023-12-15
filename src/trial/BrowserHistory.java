package trial;

import java.util.Stack;

public class BrowserHistory {
	
	Stack<String> backStack = new Stack<>();
	Stack<String> forStack = new Stack<>();

	public BrowserHistory(String homePage) {
		backStack.push(homePage);
	}
	
	public void visit(String url) {
		while(forStack.size()>0) {
			forStack.pop();
		}
		backStack.push(url);
	}
	
	public String back(int steps) {
		return null;
	}
}
