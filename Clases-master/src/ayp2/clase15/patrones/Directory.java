package ayp2.clase15.patrones;

import java.util.ArrayList;

public class Directory implements AbstractFile{
	
	private String m_name;
	
	private ArrayList<AbstractFile> m_files = new ArrayList<AbstractFile>();

	public Directory(String name){
		m_name = name;
	}

	public void add(AbstractFile obj){
		m_files.add(obj);
	}

	public void ls(){

		System.out.println(AbstractFile.g_indent + m_name);
		AbstractFile.g_indent.append("   ");
		for (int i = 0; i < m_files.size(); ++i){

		//Aplicarle a todos el comportamiento común
		        AbstractFile obj = m_files.get(i);
		        obj.ls();
		}
		AbstractFile.g_indent.setLength(AbstractFile.g_indent.length() - 3);
		}


}
