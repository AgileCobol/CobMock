package cobmock.cobol.generator;

import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.TokenStreamRewriter;
import org.stringtemplate.v4.ST;

import cobmock.cobol.MockStatement;
import cobmock.cobol.parser.CobmockParser;
import cobmock.config.Assignment;
import cobmock.config.CobmockConfigParser;

public class CodeGenerator {
	private TokenStreamRewriter rewriter;
	private String outputTemplate;
	private List<MockStatement> inputList;
	private Hashtable<String, List<Assignment>> assignmentTable;
	private CobmockParser cobolParser;
	private CobmockConfigParser configParser;
	
	public CodeGenerator() {
		
	}
	public String generate() throws Exception {
		checkInputValues();
		
		parseCobolFile();
		
		parseConfigFile();
		
		replaceMockCallsWithCode();
		
		return rewriter.getText();
	}
	private void replaceMockCallsWithCode() {
		for (MockStatement statement : inputList) {
			generateMockCodeAndReplaceOriginalCallInTokenStream(statement);
		}
	}
	private void generateMockCodeAndReplaceOriginalCallInTokenStream(
			MockStatement statement) {
		String code = generateCodeForMockStatement(statement);
		
		code = addNewlines(code);
		
		rewriter.replace(statement.getStartToken(), statement.getStopToken(), code);
	}
	private String addNewlines(String code) {
		code = System.getProperty("line.separator") + code + System.getProperty("line.separator");
		return code;
	}
	private String generateCodeForMockStatement(MockStatement statement) {		
		String callId = statement.getCallId();
		List<Assignment> assignmentList = assignmentTable.get(callId);
		
		ST template = new ST(outputTemplate);
		template.add("callId", callId);		
		template.add("assignmentList", assignmentList);
		return template.render();
	}
	private void parseConfigFile() {
		assignmentTable = configParser.parse();
	}
	private void parseCobolFile() {
		inputList = cobolParser.parse();
		rewriter = cobolParser.getTokenStreamRewriter();
	}
	private void checkInputValues() throws Exception {
		if (cobolParser == null) {
			throw new Exception("No CobolParser provided!");
		}
		if (configParser == null) {
			throw new Exception("No ConfigParser provided!");
		}
		if (outputTemplate == null) {
			throw new Exception("No Output-Template defined!");
		}
	}
	
	public void setCobolParser(CobmockParser cobolParser) {
		this.cobolParser = cobolParser;
	}

	public void setOutputTemplate(String outputTemplate) {
		this.outputTemplate = outputTemplate;
	}

	public void setConfigParser(CobmockConfigParser configParser) {
		this.configParser = configParser;
	}
	
}
