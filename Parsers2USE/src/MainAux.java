import poli.mestrado.parser.bpmn2use.ParserBPMNHelper;
import poli.mestrado.parser.bpmn2use.tag.ProcessTag;


public class MainAux {

	public static void main(String[] args) {
		ProcessTag process = ParserBPMNHelper.getInstance().parserBpmn2Assl();
		System.out.println(process.toString());
//		ParserBPMNHelper.getInstance().saveModel();

	}

}
