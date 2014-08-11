package cobmock.cobol.generator;

import java.util.Hashtable;
import java.util.List;

import org.stringtemplate.v4.ST;

import cobmock.cobol.MockStatement;
import cobmock.cobol.StringTemplateHandler;
import cobmock.cobol.TokenStreamRewriterHandler;
import cobmock.cobol.parser.CobmockParser;
import cobmock.cobol.preprocesser.PreprocessorPipe;
import cobmock.config.Assignment;
import cobmock.config.CobmockConfigParser;

public class CodeGenerator {
	private TokenStreamRewriterHandler outputGenerator;
	private StringTemplateHandler outputTemplate;
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

		return getResult();
	}
	private String getResult() {
		return outputGenerator.getText();
	}
	private void replaceMockCallsWithCode() {
		for (MockStatement statement : inputList) {
			generateMockCodeAndReplaceOriginalCallInTokenStream(statement);
		}
	}
	private void generateMockCodeAndReplaceOriginalCallInTokenStream(MockStatement statement) {
		String code = generateCodeForMockStatement(statement);
		outputGenerator.replaceMockStatementWithCode(statement, code);
	}

	private String generateCodeForMockStatement(MockStatement statement) {		
		String callId = statement.getCallId();
		List<Assignment> assignmentList = assignmentTable.get(callId);

		return generateCodeTemplate(callId, assignmentList);
	}
	private String generateCodeTemplate(String callId, List<Assignment> assignmentList) {
		String result = outputTemplate.renderAssignments(callId, assignmentList);
		return addNewline(result);
	}
	private void parseConfigFile() {
		assignmentTable = configParser.parse();
	}
	private void parseCobolFile() {
		inputList = cobolParser.parse();
		outputGenerator = cobolParser.getTokenStreamRewriterHandler();
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
	private String addNewline(String code) {
		code = System.getProperty("line.separator") + code;
		return code;
	}
	public void setCobolParser(CobmockParser cobolParser) {
		this.cobolParser = cobolParser;
	}

	public void setOutputTemplate(String outputTemplate) {
		this.outputTemplate = new StringTemplateHandler(outputTemplate);
	}	

	public void setConfigParser(CobmockConfigParser configParser) {
		this.configParser = configParser;
	}

}
