import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MergingTest {
	
	
	public static void main(String [] args) throws IOException
	{
		String [] languages= {"ar_EG","es_ES","fr_CA","fr_FR","id_ID","ja_JP","ko_KR","pt_BR","th_TH","vi_VN","zh_TW"};
		//String [] schemas= {"atomic","config"};
		String [] atomicFilesName= {"DIM_ATTR_SEL_TYPE_INFO_MLS.sql",
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
									"KDD_STATUS_TL.sql"};
		
		String [] configFilesName= {"aai_ff_control_options.sql",
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
									"METADATA_LOCALE_MASTER.sql"};
		String raju="raju";
		String sakshi="'en_US' V_LOCALE_CD";
		
		sakshi=sakshi.replace("'en_US' V_LOCALE_CD", "'"+raju+"' V_LOCALE_CD");
		
		System.out.println("Sakshi "+sakshi);
		
//		String line ="Merge into MESSAGES_EN_US T USING ( Select 'Échec de l'épuration du document' MSG_DESCRIPTION, 'RENDERER' MSG_PACKAGE, 'DOCUMENT_PURGE_FAILED' MSG_IDENTIFIER,O.MSG_CODE,O.MSG_TYPE,O.MSG_APPL_NAME,O.MSG_MODULE_NAME,'fr_CA' LOCALE from dual D inner join MESSAGES_EN_US O on O.MSG_PACKAGE='RENDERER' and O.MSG_IDENTIFIER='DOCUMENT_PURGE_FAILED' and O.LOCALE='en_US' )  S on (T.MSG_PACKAGE=S.MSG_PACKAGE and T.MSG_IDENTIFIER=S.MSG_IDENTIFIER and t.LOCALE='fr_CA' ) when matched then update set T.MSG_DESCRIPTION=S.MSG_DESCRIPTION when not matched then insert ( MSG_PACKAGE , MSG_IDENTIFIER , MSG_CODE , MSG_DESCRIPTION , MSG_TYPE , MSG_APPL_NAME , MSG_MODULE_NAME , LOCALE) values (S.MSG_PACKAGE , S.MSG_IDENTIFIER , S.MSG_CODE , S.MSG_DESCRIPTION , S.MSG_TYPE , S.MSG_APPL_NAME , S.MSG_MODULE_NAME , S.LOCALE)";
//		 line=line.replaceAll("(?<=\\P{L})'(?=\\P{L})", "''''") ;
//		 line=line.replaceAll("(?<=\\p{L})'(?=\\P{L})", "''''") ;
//		 line=line.replaceAll("(?<=\\P{L})'(?=\\p{L})", "''''") ;
//		 line=line.replaceAll("(?<=\\p{L})'(?=\\p{L})", "''''") ;
//		 
//		 line=line.replaceAll("^", "Raju") ;
//		 line=line.replaceAll("$", "Prem") ;
//		System.out.println(line );
		
		String line ="Merge into MESSAGES_EN_US T USING ( Select 'Échec de l'épuration du document' MSG_DESCRIPTION, 'RENDERER' MSG_PACKAGE, 'DOCUMENT_PURGE_FAILED' MSG_IDENTIFIER,O.MSG_CODE,O.MSG_TYPE,O.MSG_APPL_NAME,O.MSG_MODULE_NAME,'fr_CA' LOCALE from dual D inner join MESSAGES_EN_US O on O.MSG_PACKAGE='RENDERER' and O.MSG_IDENTIFIER='DOCUMENT_PURGE_FAILED' and O.LOCALE='en_US' )  S on (T.MSG_PACKAGE=S.MSG_PACKAGE and T.MSG_IDENTIFIER=S.MSG_IDENTIFIER and t.LOCALE='fr_CA' ) when matched then update set T.MSG_DESCRIPTION=S.MSG_DESCRIPTION when not matched then insert ( MSG_PACKAGE , MSG_IDENTIFIER , MSG_CODE , MSG_DESCRIPTION , MSG_TYPE , MSG_APPL_NAME , MSG_MODULE_NAME , LOCALE) values (S.MSG_PACKAGE , S.MSG_IDENTIFIER , S.MSG_CODE , S.MSG_DESCRIPTION , S.MSG_TYPE , S.MSG_APPL_NAME , S.MSG_MODULE_NAME , S.LOCALE)";
		 line=line.replaceAll("(?<=\\P{L})'(?=\\P{L})", "''") ;
		 line=line.replaceAll("(?<=\\p{L})'(?=\\P{L})", "''") ;
		 line=line.replaceAll("(?<=\\P{L})'(?=\\p{L})", "''") ;
		 line=line.replaceAll("(?<=\\p{L})'(?=\\p{L})", "''") ;
		 
		 line=line.replaceAll("^", "Raju") ;
		 line=line.replaceAll("$", "Prem") ;
		System.out.println(line );
		
		
		for(int i=0;i<languages.length;i++)
		{
			for(int j=0;j<atomicFilesName.length;j++)
			{
				String file = "C:\\Users\\rajushar\\Downloads\\HELP\\experiment\\FRESH\\"+languages[i]+"\\atomic\\"+atomicFilesName[j];
		        Path path = Paths.get(file);
		        BufferedReader bufferedReader = Files.newBufferedReader(path);

		        System.out.println(file);
		        
		        String curLine;
		        while ((curLine = bufferedReader.readLine()) != null){
//		        	String str=curLine.replace("'en_US' V_LOCALE_CD", "'ar_EG' V_LOCALE_CD");
//		        	 System.out.println("Raju "+str);
		            //System.out.println(curLine);
		        }
		        bufferedReader.close();
			}
			
			for(int k=0;k<configFilesName.length;k++)
			{
				String file = "C:\\Users\\rajushar\\Downloads\\HELP\\experiment\\FRESH\\"+languages[i]+"\\config\\"+configFilesName[k];
		        Path path = Paths.get(file);
		        BufferedReader bufferedReader = Files.newBufferedReader(path);

		        System.out.println(file);
		        
		        String curLine;
		        while ((curLine = bufferedReader.readLine()) != null){
//		        	String str=curLine.replace("'en_US' V_LOCALE_CD", "'ar_EG' V_LOCALE_CD");
//		        	 System.out.println("Raju "+str);
		           // System.out.println(curLine);
		        }
		        bufferedReader.close();
			}
		  
		}
	}

}
