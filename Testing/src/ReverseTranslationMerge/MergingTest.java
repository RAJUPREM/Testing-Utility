package ReverseTranslationMerge;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import ReverseTranslationMerge.Service.CommonService;

public class MergingTest {
	
	
	public static void main(String [] args) throws IOException
	{
		long start = System.currentTimeMillis();
		String [] languages= {"ar_EG","es_ES","fr_CA","fr_FR","id_ID","ja_JP","ko_KR","pt_BR","th_TH","vi_VN","zh_TW"};
	//String [] languages= {"pt_BR"};
		//String [] schemas= {"atomic","config"};
		String [] atomicFilesName= {
				"DIM_ATTR_SEL_TYPE_INFO_MLS.sql",
									"DIM_ATTRIBUTE_INFO_MLS.sql",
									"DIM_ATTRIBUTE_TYPE_INFO_MLS.sql",
									"DIM_COMPONENT_INFO_MLS.sql",
									"FCC_CS_CM_ALERT_ACTIONS_TL.sql",
									"FCC_CS_CM_ALERT_PRIORITY_TL.sql",
									"FCC_CS_CM_ALERT_TYPE_TL.sql",
									"FCC_CS_CM_EVENT_STATUS_TL.sql",
									"FCC_CS_CM_SAN_STD_CMNTS_TL.sql",
									"FCC_CS_CM_SCREENING_MODE_TL.sql",
									"FCC_CS_CM_STATUS_TL.sql",
									"FCC_EVENT_STATUS_TL.sql",
									"FCC_EVENT_TYPE_TL.sql",
									"FCC_SCENARIO_MASTER_TL.sql",
									"FCC_SUP_ACTION_TL.sql",
									"FCC_SUP_STATUS_TL.sql",
									"FCC_TP_ACTION_TL.sql",
									"FCC_TP_STATUS_TL.sql",
									"FCC_TPG_SETUP_PARAMS_SRVCS_TL.sql",
									"KDD_ACTION_CAT_CD_TL.sql",
									"KDD_ACTION_TL.sql",
									"KDD_CASE_TYPE_SUBTYPE_TL.sql",
									"KDD_CASEATTRBT_MASTER_TL.sql",
									"KDD_CASEENTITY_MASTER_TL.sql",
									"KDD_CMMNT_TL.sql",
									"KDD_CODE_SET_TRNLN_TL.sql",
									"KDD_COUNTRY_TL.sql",
									"KDD_INSTALL_PARAM_TL.sql",
									"KDD_LINK_ANLYS_DISPLAY_INFO_TL.sql",
									"KDD_QUEUE_MASTER_TL.sql",
									"KDD_REG_REPORT_STATUS_TL.sql",
									"KDD_STATUS_TL.sql"
									};
		
		String [] configFilesName= {
				"aai_ff_control_options.sql",
									"AAI_FF_FORM_CONTROLS_TL.sql",
									"AAI_FF_FORMS_CONTAINERS_TL.sql",
									"AAI_FF_FORMS_TL.sql",
									"AAI_MENU_TL.sql",
									"AAI_WF_ACTIVITY_TL.sql",
									"AAI_WF_APPLICATION_API_TL.sql",
									"AAI_WF_DATA_FIELD_TL.sql",
									"AAI_WF_PROCESS_TL.sql",
									"AAI_WF_STATUS_TL.sql",
									"AAI_WF_TRANSITION_TL.sql",
									"FORMS_LOCALE_MASTER.sql",
									"MENU_LOCALE_MAP.sql",
									"MESSAGES_EN_US.sql",
									"METADATA_LOCALE_MASTER.sql"
									};
		
		
		for(int i=0;i<languages.length;i++)
		{
			for(int j=0;j<atomicFilesName.length;j++)
			{
				String file = "C:\\Users\\rajushar\\Downloads\\HELP\\experiment\\FRESH\\"+languages[i]+"\\atomic\\"+atomicFilesName[j];
		        Path path = Paths.get(file);
		        BufferedReader bufferedReader = Files.newBufferedReader(path);

		        System.out.println(file);
		        
		        String curLine;
		      //creating the instance of file
		        File outputPath = new File("C:\\Users\\rajushar\\Downloads\\HELP\\OutPutExperiment\\"+languages[i]+"\\atomic\\"+atomicFilesName[j]);
		       
		      //passing file instance in filewriter
		        FileWriter wr = new FileWriter(outputPath);
		        
		        String finalString="";
		        while ((curLine = bufferedReader.readLine()) != null){
		        	if(!curLine.equals("/"))
		        	{
		        		finalString+=CommonService.getCommonServices(curLine, languages[i],atomicFilesName[j]);
			        	System.out.println("First : "+finalString);
		        	}
		        	else
		        	{
		        		finalString+=curLine;
		        	}
		        	finalString+="\n";
		        	
		        }
		        wr.write(finalString);
			      //flushing the writer
			        wr.flush();
			         
			        //closing the writer
			        wr.close();
		        bufferedReader.close();
			}
			
			for(int k=0;k<configFilesName.length;k++)
			{
				String file = "C:\\Users\\rajushar\\Downloads\\HELP\\experiment\\FRESH\\"+languages[i]+"\\config\\"+configFilesName[k];
		        Path path = Paths.get(file);
		        BufferedReader bufferedReader = Files.newBufferedReader(path);

		        System.out.println(file);
		        
		        String curLine;
		        File outputPath=null;
		        //creating the instance of file
		        if(!configFilesName[k].equals("MESSAGES_EN_US.sql"))
        		{
		         outputPath = new File("C:\\Users\\rajushar\\Downloads\\HELP\\OutPutExperiment\\"+languages[i]+"\\config\\"+configFilesName[k]);
        		}
		        else
		        {
		        	String tempLang="";
		    		tempLang+="MESSAGES_";
		    		if(!languages[i].equals("id_ID"))
		    		{
		    			tempLang+=languages[i].toUpperCase();
		    		}
		    		else
		    		{
		    			tempLang+="IN_ID";
		    		}
		    		
		        outputPath = new File("C:\\Users\\rajushar\\Downloads\\HELP\\OutPutExperiment\\"+languages[i]+"\\config\\"+tempLang+".sql");	
		        }
		      //passing file instance in filewriter
		        FileWriter wr = new FileWriter(outputPath);
	        
		        String finalString="";
		        

		        if(configFilesName[k].equals("MESSAGES_EN_US.sql"))
		        {
		        	String messagesLan="";
		        	
		        	if(!languages[i].equals("id_ID"))
		        	{
		        		messagesLan+="MESSAGES_"+languages[i].toUpperCase();
		        	}
		        	else
		        	{
		        		messagesLan+="MESSAGES_IN_ID";
		        	}
		        			
		        	finalString+="DECLARE\r\n"
		        			+ "    v_count NUMBER(10) := 0;\r\n"
		        			+ "BEGIN\r\n"
		        			+ "    SELECT\r\n"
		        			+ "        COUNT(1)\r\n"
		        			+ "    INTO v_count\r\n"
		        			+ "    FROM\r\n"
		        			+ "        user_tables\r\n"
		        			+ "    WHERE\r\n"
		        			+ "        table_name = '"+messagesLan+"';\r\n"
		        			+ "\r\n"
		        			+ "    IF v_count > 0 THEN";
		        	
		        	finalString+="\n";
		        }
		        
		        int f=0;
		        String previString="";
		        int coun=0;
		        while ((curLine = bufferedReader.readLine()) != null){
		        	if(!curLine.equals("/"))
		        	{
		        		if(configFilesName[k].equals("MESSAGES_EN_US.sql"))
		        		{
		        			String temp="";
		        			
		        			
			        		temp=CommonService.getCommonServices(curLine, languages[i],configFilesName[k]);
			        		
			        		if(f==1 && coun==1)
			        		{
			        			//System.out.println(previString.substring(previString.length()-2,previString.length()));
			        			int c=0;
			        			
			        			char[] pre=previString.toCharArray();
			        			for(int l=pre.length-1;l>=0;l--)
			        				{
			        					if(Character.toString(pre[l]).equals("'"))
			        					{
			        						c+=1;
			        					}
			        					else
			        					{
			        						break;
			        					}
			        				}
			        			
			        			if(c%2==0)
			        			{
			        				if(Character.toString(temp.charAt(0)).equals("'"))
			        				{
			        					previString+=temp.substring(1);
			        				}
			        				else
			        				{
			        					previString+=temp;
			        				}
			        			}
			        			else
			        			{
			        				previString+=temp;
			        			}
			        			
			        			
			        			finalString+=previString;
			        			System.out.println("First : "+finalString);
			        			f=0;
			        			
			        			coun=0;
			        			previString="";
			        			continue;
			        		}
			        		
			        		if(!temp.substring(temp.length()-19,temp.length()-2).equals("SG_MODULE_NAME )'"))
			        		{
			        			previString=temp.substring(0,temp.length()-1);
			        			f=1;
			        			coun+=1;
			        			continue;
			        		}
			        	
			        			finalString+=temp;
					        	System.out.println("First : "+finalString);

		        		}
		        		else
		        		{
		        		finalString+=CommonService.getCommonServices(curLine, languages[i],configFilesName[k]);
			        	System.out.println("First : "+finalString);
		        		}
		        	
		        	}
		        	else
		        	{
		        		if(!configFilesName[k].equals("MESSAGES_EN_US.sql"))
		        		{
		        		finalString+=curLine;
		        		}
		        	}
		        	if(!configFilesName[k].equals("MESSAGES_EN_US.sql"))
	        		{
		        	finalString+="\n";
	        		}
		        	 
		        }
		        
		        if(configFilesName[k].equals("MESSAGES_EN_US.sql"))
		        {
		        	finalString+="END IF;\r\n"
		        			+ "\r\n"
		        			+ "END;\r\n"
		        			+ "/";
		        }
		       
		        wr.write(finalString);
			      //flushing the writer
			        wr.flush();
		        //closing the writer
		        wr.close();
		        bufferedReader.close();
		        
		        //for APP_LOCALE_DETAILS.sql extra file generation
		        File outputPathAppLocal=null;
		        outputPathAppLocal = new File("C:\\Users\\rajushar\\Downloads\\HELP\\OutPutExperiment\\"+languages[i]+"\\config\\APP_LOCALE_DETAILS.sql");	
		        
		        String finalStringAppLocal=CommonService.getAppLocalDetails(languages[i]);
		        finalStringAppLocal+="\n";
		        finalStringAppLocal+="/";
		        FileWriter wrLocal = new FileWriter(outputPathAppLocal);
		        wrLocal.write(finalStringAppLocal);
			      //flushing the writer
		        wrLocal.flush();
		        //closing the writer
		        wrLocal.close();
		        
			}
		  
		}
		// finding the time after the operation is executed
	      long end = System.currentTimeMillis();
	      // finding the time difference
	      float msec = end - start;
	      // converting it into seconds
	      float sec= msec/1000F;
	      // converting it into minutes
	      float minutes=sec/60F;
	      System.out.println(minutes + " minutes");
	}

}
