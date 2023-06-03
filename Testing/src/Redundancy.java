import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class Redundancy {
	
	
	public static void main(String [] args)
	{
//		String file = "C:\\SVN_REPO\\8123\\8.1.2.3\\Integrated_Case_Management\\Language_Pack\\New_8123LP\\scripts\\id_ID\\config\\AAI_FF_FORMS_CONTAINERS_TL.sql";
		String file = "C:\\SVN_REPO\\8123\\8.1.2.2\\Integrated_Case_Management\\Language_Pack\\New_8122LP\\scripts\\id_ID\\config\\AAI_FF_FORMS_CONTAINERS_TL.sql";
        Path path = Paths.get(file);
        BufferedReader bufferedReader = null;
		try {
			bufferedReader = Files.newBufferedReader(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println(file);
        
        String curLine;
        
        Map<String, Integer> lhm=new LinkedHashMap<String,Integer>();
        
        try {
			while ((curLine = bufferedReader.readLine()) != null){
				if(!lhm.containsKey(curLine))
				{
					lhm.put(curLine, 1);
				}
				else
				{
					lhm.put(curLine, lhm.get(curLine)+1);
				}
//				System.out.println(curLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        for(Map.Entry<String,Integer> temp:lhm.entrySet())
        {
//        	System.out.println(temp.getKey());
        	if(temp.getValue()>1)
        	{
        		System.out.println(temp.getKey());
        	}
        }
	}

}
