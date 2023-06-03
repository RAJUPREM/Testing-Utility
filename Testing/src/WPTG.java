import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
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



public class WPTG {
	
	public static Map<String,String> st8123=new LinkedHashMap<String,String>();
	
	public static Map<String,String> st8123_ar_EG=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_es_ES=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_fr_CA=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_fr_FR=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_in_ID=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_ja_JP=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_ko_KR=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_pt_BR=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_th_TH=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_vi_VN=new LinkedHashMap<String,String>();
	public static Map<String,String> st8123_zh_TW=new LinkedHashMap<String,String>();
	
//	public static List<ArrayList<String>> finalReport=new ArrayList<ArrayList<String>>();
	
	public static String finalReport;
	
	public static void main(String [] args) throws IOException
	{
		String [] languages= {"ar_EG","es_ES","fr_CA","fr_FR","in_ID","ja_JP","ko_KR","pt_BR","th_TH","vi_VN","zh_TW"};
		
		//String [] languages= {"ar_EG"};
		
		//creating the instance of file
        File outputPath = new File("C:\\Users\\rajushar\\Downloads\\WPTG\\report.txt");
       
      //passing file instance in filewriter
        FileWriter wr = new FileWriter(outputPath);
		
		for(int i=0;i<languages.length;i++)
		{
		String file = "C:\\Users\\rajushar\\Downloads\\WPTG\\8123\\ECM_TEMP_REFERENCE_"+languages[i]+".xlf";
        Path path = Paths.get(file);
        BufferedReader bufferedReader = Files.newBufferedReader(path);

        System.out.println(file);
        
        String curLine;
      //creating the instance of file
      //  File outputPath = new File("C:\\Users\\rajushar\\Downloads\\HELP\\OutPutExperiment\\"+languages[i]+"\\atomic\\"+atomicFilesName[j]);
       
      //passing file instance in filewriter
       // FileWriter wr = new FileWriter(outputPath);
        
        String finalString="";
        int c=0;
        List<String> lstring=new ArrayList<String>();
        while ((curLine = bufferedReader.readLine()) != null){
        	
        	
        	
        	if(curLine.contains("<trans-unit") || curLine.contains("<source>") || curLine.contains("<target>") || curLine.contains("<drop_num>") || curLine.contains("</trans-unit>"))
    		{
        		
        		lstring.add(curLine);
        		c+=1;
        		
        		if(c==5)
        		{
        			c=0;
        			
        			if(lstring.get(0).contains("<trans-unit"))
        			{
        				checking8123(lstring,languages[i]);
            			lstring.removeAll(lstring);
        			}
        			
        		}
        		
    		}
        	
         
       // System.out.println(curLine);
        	
        }
        
	}
		
		
		for(int i=0;i<languages.length;i++)
		{
		String file = "C:\\Users\\rajushar\\Downloads\\WPTG\\8124\\ECM_TEMP_REFERENCE_"+languages[i]+".xlf";
        Path path = Paths.get(file);
        BufferedReader bufferedReader = Files.newBufferedReader(path);

        System.out.println(file);
        
        String curLine;
      
        
        String finalString="";
        int c=0;
        ArrayList<String> lstring=new ArrayList<String>();
        while ((curLine = bufferedReader.readLine()) != null){
        	
        	
        	
        	if(curLine.contains("<trans-unit") || curLine.contains("<source>") || curLine.contains("<target>") || curLine.contains("<drop_num>") || curLine.contains("</trans-unit>"))
    		{
        		
        		lstring.add(curLine);
        		c+=1;
        		
        		if(c==5)
        		{
        			c=0;
        			checking8124(lstring,languages[i]);
        			lstring.removeAll(lstring);
        		}
        		
    		}
        	
         
       // System.out.println(curLine);
        	
        }
        
	}
		
		
		
		 wr.write(finalReport);
	      //flushing the writer
	        wr.flush();
	         
	        //closing the writer
	        wr.close();
		
		
	}
	
	public static  void checking8123(List<String> curLine,String language)
	{
		System.out.println("8123_"+language+curLine.toString())	;
		
		switch(language)
		{
		case "ar_EG":
		{
			if(!st8123_ar_EG.containsKey(curLine.get(1)))
			{
				st8123_ar_EG.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "es_ES":
		{
			if(!st8123_es_ES.containsKey(curLine.get(1)))
			{
				st8123_es_ES.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "fr_CA":
		{
			if(!st8123_fr_CA.containsKey(curLine.get(1)))
			{
				st8123_fr_CA.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "fr_FR":
		{
			if(!st8123_fr_FR.containsKey(curLine.get(1)))
			{
				st8123_fr_FR.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "in_ID":
		{
			if(!st8123_in_ID.containsKey(curLine.get(1)))
			{
				st8123_in_ID.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "ja_JP":
		{
			if(!st8123_ja_JP.containsKey(curLine.get(1)))
			{
				st8123_ja_JP.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "ko_KR":
		{
			if(!st8123_ko_KR.containsKey(curLine.get(1)))
			{
				st8123_ko_KR.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "pt_BR":
		{
			if(!st8123_pt_BR.containsKey(curLine.get(1)))
			{
				st8123_pt_BR.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "th_TH":
		{
			if(!st8123_th_TH.containsKey(curLine.get(1)))
			{
				st8123_th_TH.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "vi_VN":
		{
			if(!st8123_vi_VN.containsKey(curLine.get(1)))
			{
				st8123_vi_VN.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
		
		case "zh_TW":
		{
			if(!st8123_zh_TW.containsKey(curLine.get(1)))
			{
				st8123_zh_TW.put(curLine.get(1), curLine.get(2));
			}
			break;
		}
			
		}
		

	}
	
	public static  void checking8124(ArrayList<String> curLine,String language)
	{

		System.out.println(curLine.toString())	;
		
		switch(language)
		{
		case "ar_EG":
		{
			
			
			if(st8123_ar_EG.containsKey(curLine.get(1)))
			{
				
				String t=st8123_ar_EG.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			
			break;
		}
		
		case "es_ES":
		{
			
			if(st8123_es_ES.containsKey(curLine.get(1)))
			{
				
				String t=st8123_es_ES.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "fr_CA":
		{
			
			if(st8123_fr_CA.containsKey(curLine.get(1)))
			{
				
				String t=st8123_fr_CA.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "fr_FR":
		{
			
			if(st8123_fr_FR.containsKey(curLine.get(1)))
			{
				
				String t=st8123_fr_FR.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "in_ID":
		{
			
			if(st8123_in_ID.containsKey(curLine.get(1)))
			{
				
				String t=st8123_in_ID.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "ja_JP":
		{
			
			if(st8123_ja_JP.containsKey(curLine.get(1)))
			{
				
				String t=st8123_ja_JP.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "ko_KR":
		{
			
			if(st8123_ko_KR.containsKey(curLine.get(1)))
			{
				
				String t=st8123_ko_KR.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "pt_BR":
		{
			
			if(st8123_pt_BR.containsKey(curLine.get(1)))
			{
				
				String t=st8123_pt_BR.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "th_TH":
		{
			
			if(st8123_th_TH.containsKey(curLine.get(1)))
			{
				
				String t=st8123_th_TH.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "vi_VN":
		{
			
			if(st8123_vi_VN.containsKey(curLine.get(1)))
			{
				
				String t=st8123_vi_VN.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
		
		case "zh_TW":
		{
			
			if(st8123_zh_TW.containsKey(curLine.get(1)))
			{
				
				String t=st8123_zh_TW.get(curLine.get(1));
				
				if(!t.equals(curLine.get(2)))
				{
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
					finalReport+="\n";
					finalReport+="english string "+curLine.get(1);
					finalReport+="\n";
					finalReport+="8123_"+language+t;
					finalReport+="\n";
					finalReport+="8124_"+language+curLine.get(2);
					finalReport+="\n";
					finalReport+="reference_"+language+curLine.toString();
					finalReport+="\n";
					finalReport+="---------------------------------------------------------------------------------------------------------------------------------------";
				}
			}
			break;
		}
			
		}
		
		
		
	
	}

}
