package cobmock.config;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import cobmock.config.parser.ConfigParser;
import cobmock.config.parser.ConfigParser.ConfigRootContext;
import cobmock.helper.ParserTool;

public class CobmockConfigParser {
	private ConfigRootContext ctx;
	public CobmockConfigParser(String filename) throws IOException {
		ConfigParser parser = ParserTool.getConfigParserForFile(filename);
		ctx = parser.configRoot();
	}
	

}
