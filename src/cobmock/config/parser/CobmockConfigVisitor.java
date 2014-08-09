package cobmock.config.parser;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.misc.Interval;

import cobmock.config.Assignment;
import cobmock.config.parser.ConfigParser.TargetContext;

public class CobmockConfigVisitor extends ConfigBaseVisitor<Hashtable<String, List<Assignment>>> {
	private Hashtable<String, List<Assignment>> result;
	private ArrayList<Assignment> assignList;
	private String callId;
	
	@Override
	public Hashtable<String, List<Assignment>> visitConfigRoot(ConfigParser.ConfigRootContext ctx) {
		result = new Hashtable<String, List<Assignment>>();
		visitChildren(ctx);
		return result;
	}
	
	@Override
	public Hashtable<String, List<Assignment>> visitMockCall(ConfigParser.MockCallContext ctx) {
		callId = ctx.callId().getText();
		assignList = new ArrayList<Assignment>();
		visitChildren(ctx);	
		result.put(callId, assignList);
		return null;
	}
	
	@Override
	public Hashtable<String, List<Assignment>> visitAssignment(ConfigParser.AssignmentContext ctx) {
		Assignment assignment = new Assignment();
		assignment.setSource(ctx.source().getText());
		assignment.setTarget(getTargetTextWithSpaces(ctx.target()));
		
		assignList.add(assignment);
		
		return visitChildren(ctx);
	}
	private String getTargetTextWithSpaces(TargetContext ctx) {
		int start = ctx.start.getStartIndex();
		int stop = ctx.stop.getStopIndex();
		Interval interval = new Interval(start, stop);
		return ctx.start.getInputStream().getText(interval);
	}
}
