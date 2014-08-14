package cobmock.cobol.rft;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;

import cobmock.cobol.generator.CodeGenerator;
import cobmock.cobol.parser.CobmockParser;
import cobmock.cobol.preprocesser.CommentPreprocessor;
import cobmock.cobol.preprocesser.MockStatementPreprocessor;
import cobmock.cobol.preprocesser.PreprocessorPipe;
import cobmock.config.CobmockConfigParser;
import cobmock.helper.FileReaderHelper;

public class RftCodeGenerator {
	private InputStream cobolFileStream, configFileStream, templateStream;
	private BufferedWriter outputStream;
	private String cobolFile, configFile, template;
	public RftCodeGenerator(InputStream cobolFile, InputStream configFile, InputStream template, BufferedWriter outputStream) {
		this.cobolFileStream = cobolFile;
		this.configFileStream = configFile;
		this.templateStream = template;
		this.outputStream = outputStream;
	}
	private void readFiles() throws IOException {
		cobolFile = FileReaderHelper.fromStream(cobolFileStream);
		configFile = FileReaderHelper.fromStream(configFileStream);
		template = FileReaderHelper.fromStream(templateStream);
	}

	public void generate() throws Exception {
		readFiles();

		preprocessCobolFile();

		String result = generateCode();

		save(result);

	}
	private String generateCode() throws IOException, Exception {
		CobmockParser cobolParser = new CobmockParser(cobolFile);
		CobmockConfigParser configParser = new CobmockConfigParser(configFile);

		CodeGenerator generator = new CodeGenerator();
		generator.setCobolParser(cobolParser);
		generator.setConfigParser(configParser);
		generator.setOutputTemplate(template);

		return generator.generate();
	}
	private void preprocessCobolFile() {
		PreprocessorPipe pipe = new PreprocessorPipe();

		pipe.addPreprocessor(new MockStatementPreprocessor());

		pipe.addPreprocessor(new CommentPreprocessor());

		cobolFile = pipe.preprocess(cobolFile);
	}
	private void save(String content) throws IOException {
		try {
			outputStream.write(content);
		}
		catch (Exception e) {
			throw e;
		}
		finally {
			outputStream.close();
		}
	}
}
