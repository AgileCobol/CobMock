package cobmock.cobol;

import java.util.List;

import org.stringtemplate.v4.ST;

import cobmock.config.Assignment;

public class StringTemplateHandler {
	private ST template;
	public StringTemplateHandler(String template) {
		this.template = new ST(template);
	}
	public String renderAssignments(String callId, List<Assignment> assignmentList) {
		template.add("callId", callId);		
		template.add("assignmentList", assignmentList);
		return template.render();
	}

}
