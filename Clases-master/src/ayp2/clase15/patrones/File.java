package ayp2.clase15.patrones;

public class File  implements AbstractFile{
	
	 private String m_name;

	 public File(String name){
	        m_name = name;
	    }

	    public void ls(){
	        System.out.println(AbstractFile.g_indent + m_name);
	    }



}
