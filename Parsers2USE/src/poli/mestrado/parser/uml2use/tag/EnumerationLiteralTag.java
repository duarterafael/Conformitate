package poli.mestrado.parser.uml2use.tag;

import java.io.Serializable;

public class EnumerationLiteralTag implements Serializable{
	public static final String TAG_NAME = "UML:EnumerationLiteral";
	
	private String id;
	private String name;
	
	
	
	public EnumerationLiteralTag(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
