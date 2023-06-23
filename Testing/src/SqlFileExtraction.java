import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SqlFileExtraction {

	public static void main(String[] args) throws IOException {

		String file = "C:\\Users\\rajushar\\Downloads\\HELP\\SQLfileExtraction\\installer.log";//please add the putty log file path with file name
        Path path = Paths.get(file);
        BufferedReader bufferedReader = Files.newBufferedReader(path);
        System.out.println(file);     
        String curLine;
        String finalSqlString = "";
        
        Map<String,Integer> seq=new LinkedHashMap<String,Integer>();
        
        
        while ((curLine = bufferedReader.readLine()) != null){
        	System.out.println(curLine);
        	int len=curLine.length();      	
        	int count=0;
        	
        	for(int i=curLine.length()-1;i>-1;i--)
        	{
        		if(Character.toString(curLine.charAt(i)).equals("."))
        		{
        			break;
        		}
        		else
        		{
        			count+=1;	
        		}
        		
        	}
        	
        	if(seq.containsKey(curLine.substring(len-count).toLowerCase()))
        	{
        		seq.put(curLine.substring(len-count).toLowerCase(), seq.get(curLine.substring(len-count).toLowerCase())+1);
        	}
        	else
        	{
        		seq.put(curLine.substring(len-count), 1);
        	}
        	
        	if(len>2)
        	{
        	if(curLine.substring(len-4).equals(".sql") || curLine.substring(len-4).equals(".SQL"))
        	{
        		finalSqlString+=curLine;
        		finalSqlString+="\n";
        	}
        	}
        }
        
        List<String> extSeq=new ArrayList<String>();

        for(Map.Entry<String, Integer> temp:seq.entrySet())
        {

        	int flag=0;
        	
        	for(int l=0;l<temp.getKey().length();l++)
        	{
        		if(Character.toString(temp.getKey().charAt(l)).equals(" ") || Character.toString(temp.getKey().charAt(l)).equals("/"))
        		{
        			flag=1;
        			break;
        		}
        	}
        	
        	if(flag==0)
        	{
        		System.out.println("extensions : "+temp.getKey());
        		extSeq.add(temp.getKey());
        	}
        	
        	//System.out.println("prem Value : "+temp.getValue());
        }

        File outputPathSQL = new File("C:\\\\Users\\\\rajushar\\\\Downloads\\\\HELP\\\\SQLfileExtraction\\\\Files_Impacting_Database.txt"); //please add the output file localtion for SQL with desired file name

        FileWriter wr = new FileWriter(outputPathSQL);
        wr.write(finalSqlString);
	        wr.flush();  
	        wr.close();
    //  bufferedReader.close();

      File outputPathALL = new File("C:\\\\Users\\\\rajushar\\\\Downloads\\\\HELP\\\\SQLfileExtraction\\\\Files_Modified_Due_to_This_Patch.txt"); //please add the output file localtion for all the extentions except SQL with desired file name
      String finalALLString = "";
       
      for(int j=0;j<extSeq.size();j++)
      {
    	  bufferedReader = Files.newBufferedReader(path);
      while ((curLine = bufferedReader.readLine()) != null){
    	  int len=curLine.length();
    	  
//    	  System.out.println("len"+len);
//    	  System.out.println(extSeq.get(j));
    	  if(extSeq.get(j).length()<len) {
    	//System.out.println("checking exten : "+curLine.substring(len-extSeq.get(j).length()));
    	  if(!extSeq.get(j).equalsIgnoreCase("sql")) {
    	  if(curLine.substring(len-extSeq.get(j).length()).equals(extSeq.get(j)) || curLine.substring(len-extSeq.get(j).length()).equals(extSeq.get(j).toUpperCase()))
      	{
      		finalALLString+=curLine;
      		//System.out.println("finalALLString all : "+curLine);
      		finalALLString+="\n";
      	}
    	  }
    	  }
      }
     // System.out.println("------------------------------------");
      }
      FileWriter wr1 = new FileWriter(outputPathALL);
      wr1.write(finalALLString);
	        wr1.flush();  
	        wr1.close();
	        bufferedReader.close();
	}

}
