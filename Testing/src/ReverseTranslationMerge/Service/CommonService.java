package ReverseTranslationMerge.Service;

import java.util.LinkedHashMap;

import java.util.Map;

public class CommonService {
	
	public static Map<String,String> tableColumnMap=new LinkedHashMap<String,String>();
	
	public static Map<String,String> langCodeNameMap=new LinkedHashMap<String,String>();
	
	public static Map<String,String> localCode=new LinkedHashMap<String,String>();
	
	static
	{
		tableColumnMap.put("DIM_ATTR_SEL_TYPE_INFO_MLS.sql", "V_ATTRIBUTE_SEL_TYPE");
		tableColumnMap.put("DIM_ATTRIBUTE_INFO_MLS.sql", "V_ATTRIBUTE_NAME");
		tableColumnMap.put("DIM_ATTRIBUTE_TYPE_INFO_MLS.sql", "V_ATTRIBUTE_TYPE");
		tableColumnMap.put("DIM_COMPONENT_INFO_MLS.sql", "V_COMP_NAME");
		tableColumnMap.put("FCC_CS_CM_ALERT_ACTIONS_TL.sql", "V_ACTION_NAME");
		tableColumnMap.put("FCC_CS_CM_ALERT_PRIORITY_TL.sql", "V_ALERT_PRIORITY_NAME");
		tableColumnMap.put("FCC_CS_CM_ALERT_TYPE_TL.sql", "V_ALERT_TYPE_NAME");
		tableColumnMap.put("FCC_CS_CM_EVENT_STATUS_TL.sql", "V_STATUS_NAME");
		tableColumnMap.put("FCC_CS_CM_SAN_STD_CMNTS_TL.sql", "V_STD_CMNT_NAME");
		tableColumnMap.put("FCC_CS_CM_SCREENING_MODE_TL.sql", "V_SCREENING_MODE_NAME");
		tableColumnMap.put("FCC_CS_CM_STATUS_TL.sql", "V_STATUS_NAME");
		tableColumnMap.put("FCC_EVENT_STATUS_TL.sql", "V_STATUS_NAME");
		tableColumnMap.put("FCC_EVENT_TYPE_TL.sql", "V_EVENT_TYPE_DESCRIPTION");
		tableColumnMap.put("FCC_SCENARIO_MASTER_TL.sql", "V_SCENARIO_NAME");
		tableColumnMap.put("FCC_SUP_ACTION_TL.sql", "V_ACTION_NM");
		tableColumnMap.put("FCC_SUP_STATUS_TL.sql", "V_STATUS_NM");
		tableColumnMap.put("FCC_TP_ACTION_TL.sql", "V_ACTION_NM");
		tableColumnMap.put("FCC_TP_STATUS_TL.sql", "V_STATUS_NM");
		tableColumnMap.put("FCC_TPG_SETUP_PARAMS_SRVCS_TL.sql", "SERVICE_NAME");
		tableColumnMap.put("KDD_ACTION_CAT_CD_TL.sql", "DISPL_NM");
		tableColumnMap.put("KDD_ACTION_TL.sql", "ACTION_NM");
		tableColumnMap.put("KDD_CASE_TYPE_SUBTYPE_TL.sql", "CASE_TYPE_DESC");
		tableColumnMap.put("KDD_CASEATTRBT_MASTER_TL.sql", "ATTRBT_NM");
		tableColumnMap.put("KDD_CASEENTITY_MASTER_TL.sql", "ENTITY_NM");
		tableColumnMap.put("KDD_CMMNT_TL.sql", "CMMNT_TX");
		tableColumnMap.put("KDD_CODE_SET_TRNLN_TL.sql", "CODE_DISP_TX");
		tableColumnMap.put("KDD_COUNTRY_TL.sql", "COUNTRY_NM");
		tableColumnMap.put("KDD_INSTALL_PARAM_TL.sql", "PARAM_NM");
		tableColumnMap.put("KDD_LINK_ANLYS_DISPLAY_INFO_TL.sql", "LEGEND_TX");
		tableColumnMap.put("KDD_QUEUE_MASTER_TL.sql", "QUEUE_DISPLAY_NM");
		tableColumnMap.put("KDD_REG_REPORT_STATUS_TL.sql", "REG_STATUS_DESC_TX");
		tableColumnMap.put("KDD_STATUS_TL.sql", "STATUS_NM");
		tableColumnMap.put("aai_ff_control_options.sql", "V_OPTION_VALUE");
		tableColumnMap.put("AAI_FF_FORM_CONTROLS_TL.sql", "V_CONTROL_NAME");
		tableColumnMap.put("AAI_FF_FORMS_CONTAINERS_TL.sql", "V_CONTAINER_NAME");
		tableColumnMap.put("AAI_FF_FORMS_TL.sql", "V_FORM_NAME");
		tableColumnMap.put("AAI_MENU_TL.sql", "V_MENU_NAME");
		tableColumnMap.put("AAI_WF_ACTIVITY_TL.sql", "V_ACTIVITY_NAME");
		tableColumnMap.put("AAI_WF_APPLICATION_API_TL.sql", "V_APP_API_NAME");
		tableColumnMap.put("AAI_WF_DATA_FIELD_TL.sql", "V_DATA_FIELD_DESC");
		tableColumnMap.put("AAI_WF_PROCESS_TL.sql", "V_PROCESS_NAME");
		tableColumnMap.put("AAI_WF_STATUS_TL.sql", "V_STATUS_NAME");
		tableColumnMap.put("AAI_WF_TRANSITION_TL.sql", "V_TRANSITION_NAME");
		tableColumnMap.put("FORMS_LOCALE_MASTER.sql", "CONTROL_NAME");
		tableColumnMap.put("MENU_LOCALE_MAP.sql", "MENU_DESCRIPTION");
		tableColumnMap.put("MESSAGES_EN_US.sql", "MSG_DESCRIPTION");
		tableColumnMap.put("METADATA_LOCALE_MASTER.sql", "LOCALE_DESCRIPTION");
		
		langCodeNameMap.put("ar_EG", "Arabic");
		langCodeNameMap.put("es_ES", "Spanish");
		langCodeNameMap.put("fr_CA", "French - Canadian");
		langCodeNameMap.put("fr_FR", "French - France");
		langCodeNameMap.put("in_ID", "Indonesian");
		langCodeNameMap.put("ja_JP", "Japanese");
		langCodeNameMap.put("ko_KR", "Korean");
		langCodeNameMap.put("pt_BR", "Portuguese - Brazilian");
		langCodeNameMap.put("th_TH", "Thai");
		langCodeNameMap.put("vi_VN", "Vietnamese");
		langCodeNameMap.put("zh_TW", "Chinese - Traditional");
		
		
		localCode.put("3010","ECMQuantifindService");
		localCode.put("3020","TF_EVENT_DECISION_ACTION_MAP");
		localCode.put("3018","SANCTIONS_DETAILS");
		localCode.put("3007","TakeActionAddCommentChecked");
		localCode.put("3003","RFIResponseUpdater");
		localCode.put("3002","PMFActionsMutualExclusive");
		localCode.put("3001","CMNetvis");
		localCode.put("500","CS_EVENT_DECISION_ACTION_MAP");
		localCode.put("501","CS_ESC_EVENT_DECISION_ACTION_MAP");
		localCode.put("39","OBIEE");
	}

	public static String getAppLocalDetails(String language)
	{
		String V_VERSION="8.1.2.4.3";
		String V_LOCALE=language;
		if(language.equals("id_ID"))
		{
			V_LOCALE="in_ID";
		}
		String V_REMARKS=langCodeNameMap.get(V_LOCALE);
		
		String retuString="MERGE INTO APP_LOCALE_DETAILS T USING ( \r\n"
				+ " SELECT 'OFS_NGECM' V_CONTEXT, '##CMINFODOM##' V_INFODOM, 'NA' V_FOLDER, '"+V_VERSION+"' V_VERSION, 'Y' V_FICAPP, 'Y' V_FICDB, 'Y' V_FICWEB, '"+V_LOCALE+"' V_LOCALE, '"+V_REMARKS+"' V_REMARKS,SYSDATE  D_APPLIED_DATE FROM DUAL) S \r\n"
				+ " ON ( T.V_CONTEXT = S.V_CONTEXT AND T.V_FOLDER = S.V_FOLDER AND T.V_INFODOM = S.V_INFODOM AND T.V_LOCALE = S.V_LOCALE AND T.V_VERSION = S.V_VERSION )\r\n"
				+ " WHEN MATCHED THEN UPDATE SET T.V_FICAPP = S.V_FICAPP, T.V_FICDB = S.V_FICDB, T.V_FICWEB = S.V_FICWEB, T.V_REMARKS = S.V_REMARKS, T.D_APPLIED_DATE = S.D_APPLIED_DATE \r\n"
				+ " WHEN NOT MATCHED THEN INSERT \r\n"
				+ " (V_CONTEXT,V_INFODOM,V_FOLDER,V_VERSION,V_FICAPP,V_FICDB,V_FICWEB,V_LOCALE,V_REMARKS,D_APPLIED_DATE)\r\n"
				+ " VALUES \r\n"
				+ " (S.V_CONTEXT,S.V_INFODOM,S.V_FOLDER,S.V_VERSION,S.V_FICAPP,S.V_FICDB,S.V_FICWEB,S.V_LOCALE,S.V_REMARKS,S.D_APPLIED_DATE)";
		
		return retuString;
	}
	
	
	public static String getCommonServices(String currentLine,String language,String fileName)
	{
		currentLine=currentLine.replace("'UT8124INFO'", "'##CMINFODOM##'");// select DSN_ID from AAI_FF_FORMS_B where V_FORM_CODE like  ('CM%'); 
		
		if(!language.equals("id_ID"))
		{
		currentLine=currentLine.replace("'en_US' V_LOCALE_CD", "'"+language+"' V_LOCALE_CD");
		currentLine=currentLine.replace("'en_US' V_LOCALE", "'"+language+"' V_LOCALE");
		currentLine=currentLine.replace("'en_US' METADATA_LOCALE", "'"+language+"' METADATA_LOCALE");
		}
		else
		{
			String newLan="in_ID";
			currentLine=currentLine.replace("'en_US' V_LOCALE_CD", "'"+newLan+"' V_LOCALE_CD");
			currentLine=currentLine.replace("'en_US' V_LOCALE", "'"+newLan+"' V_LOCALE");
			currentLine=currentLine.replace("'en_US' METADATA_LOCALE", "'"+newLan+"' METADATA_LOCALE");
			currentLine=currentLine.replace(language, newLan);
		}
		
		
		if(fileName.equals("FCC_SUP_STATUS_TL.sql") || fileName.equals("FCC_SUP_ACTION_TL.sql"))
    	{
			if(!language.equals("id_ID"))
			{
			currentLine=currentLine.replace(",'"+language+"' V_LOCALE_CD", ",'"+language+"' V_LOCALE_CD,'"+language+"' V_SOURCE_LOCALE");
			}
			else
			{
				String newLan="in_ID";
				currentLine=currentLine.replace(",'"+newLan+"' V_LOCALE_CD", ",'"+newLan+"' V_LOCALE_CD,'"+newLan+"' V_SOURCE_LOCALE");
			}
    	}
		
		
		
		
		
		if(fileName.equals("KDD_INSTALL_PARAM_TL.sql"))
		{
			for(Map.Entry<String, String> tempLocal:localCode.entrySet())
			{
				if(currentLine.contains("V_LOCALE_CD, '"+tempLocal.getKey()+"'"))
				{
					currentLine=currentLine.replace("Select ''", "Select '"+tempLocal.getValue()+"'");
				}
			}
		}
		
		if(fileName.equals("METADATA_LOCALE_MASTER.sql"))
		{
			currentLine=currentLine.replace("and O.SOURCE_LOCALE='en_US' and O.SOURCE_LOCALE='en_US'", "and O.SOURCE_LOCALE='en_US'");
	    	currentLine=currentLine.replace("and T.LOCALE_DESCRIPTION=S.LOCALE_DESCRIPTION", "");
	    	if(!language.equals("id_ID"))
			{
	    	    currentLine=currentLine.replace("and T.IS_METADATA=S.IS_METADATA and T.SOURCE_LOCALE=S.SOURCE_LOCALE and t.SOURCE_LOCALE='"+language+"'", "");
			}
	    	else
	    	{
	    		String newLan="in_ID";
	    	    currentLine=currentLine.replace("and T.IS_METADATA=S.IS_METADATA and T.SOURCE_LOCALE=S.SOURCE_LOCALE and t.SOURCE_LOCALE='"+newLan+"'", "");	
	    	}
	    	currentLine=currentLine.replace("when matched then update set", "when matched then update set T.LOCALE_DESCRIPTION = S.LOCALE_DESCRIPTION, T.IS_METADATA = S.IS_METADATA, T.SOURCE_LOCALE = S.SOURCE_LOCALE");
		}
		
		if(fileName.equals("MESSAGES_EN_US.sql"))
		{
			if(!currentLine.equals(""))
			{
			currentLine=forMessagesEnUs( currentLine, language);
			currentLine+="\n";
			}
		}
		else
		{
			currentLine=forOtherLanguages( currentLine, fileName);
		}
		
		return  currentLine;
	}
	
	public static String forMessagesEnUs(String currentLine,String language)
	{
		String tempLang="";
		tempLang+="MESSAGES_";
		tempLang+=language.toUpperCase();
		
		if(!language.equals("id_ID"))
		{
		currentLine=currentLine.replace("Merge into MESSAGES_EN_US", "Merge into "+tempLang);
		}
		else
		{
			currentLine=currentLine.replace("Merge into MESSAGES_EN_US", "Merge into MESSAGES_IN_ID");
		}
		
		if(!language.equals("id_ID"))
		{
		currentLine=currentLine.replace(",'"+language+"' LOCALE", "");
		currentLine=currentLine.replace("and O.LOCALE='en_US'", "");
		currentLine=currentLine.replace("and t.LOCALE='"+language+"'", "");
		currentLine=currentLine.replace(", LOCALE", "");
		currentLine=currentLine.replace(", S.LOCALE", "");
		}
		else
		{
			String newLan="in_ID";
			currentLine=currentLine.replace(",'"+newLan+"' LOCALE", "");
			currentLine=currentLine.replace("and O.LOCALE='en_US'", "");
			currentLine=currentLine.replace("and t.LOCALE='"+newLan+"'", "");
			currentLine=currentLine.replace(", LOCALE", "");
			currentLine=currentLine.replace(", S.LOCALE", "");
		}
		
		currentLine=currentLine.replaceAll("(?<=\\P{L})'(?=\\P{L})", "''''") ;
		currentLine=currentLine.replaceAll("Select ''''", "Select ''");
		currentLine=currentLine.replaceAll("(?<=\\p{L})'(?=\\P{L})", "''''") ;
		currentLine=currentLine.replaceAll("(?<=\\P{L})'(?=\\p{L})", "''''") ;
		currentLine=currentLine.replaceAll("(?<=\\p{L})'(?=\\p{L})", "''''") ;
		
		if(currentLine.contains("Select ''''''"))
		{
			currentLine=currentLine.replace("Select ''''''", "Select ''");	
		}
		
		currentLine=currentLine.replace("Select ''''", "Select ''");
		currentLine=currentLine.replace("'''' "+tableColumnMap.get("MESSAGES_EN_US.sql"), "'' "+tableColumnMap.get("MESSAGES_EN_US.sql"));
		//currentLine=currentLine.replace("'''' MSG_DESCRIPTION", "'' MSG_DESCRIPTION");
		currentLine=currentLine.replace("MSG_DESCRIPTION, ''''", "MSG_DESCRIPTION, ''");
		currentLine=currentLine.replace("'''' MSG_PACKAGE, ''''", "'' MSG_PACKAGE, ''");
		currentLine=currentLine.replace("'''' MSG_IDENTIFIER", "'' MSG_IDENTIFIER");
		currentLine=currentLine.replace("O.MSG_PACKAGE=''''", "O.MSG_PACKAGE=''");
		currentLine=currentLine.replace("'''' and O.MSG_IDENTIFIER=''''", "'' and O.MSG_IDENTIFIER=''");
		currentLine=currentLine.replace("''''  )  S on (T.MSG_PACKAGE", "''  )  S on (T.MSG_PACKAGE");
//		currentLine=currentLine.replace("S.MSG_MODULE_NAME )\r\n"
//				+ "/", "S.MSG_MODULE_NAME )");

		if(currentLine.substring(0,10).equals("Merge into"))
		{
			currentLine=currentLine.replaceAll("^", "EXECUTE IMMEDIATE '") ;	
		}
		
		if(currentLine.substring(currentLine.length()-19,currentLine.length()).equals("S.MSG_MODULE_NAME )"))
		{
			currentLine=currentLine.replaceAll("$", "';") ;
		}
		else
		{
			currentLine=currentLine.replaceAll("$", "'") ;
		}
		
		
		
		return currentLine;
	}
	
	public static String forOtherLanguages(String currentLine,String fileName)
	{
		currentLine=currentLine.replaceAll("(?<=\\P{L})'(?=\\P{L})", "''") ;
		currentLine=currentLine.replace("Select ''", "Select '");
		currentLine=currentLine.replaceAll("(?<=\\p{L})'(?=\\P{L})", "''") ;
		currentLine=currentLine.replace("'' "+tableColumnMap.get(fileName), "' "+tableColumnMap.get(fileName));
		currentLine=currentLine.replaceAll("(?<=\\P{L})'(?=\\p{L})", "''") ;
		currentLine=currentLine.replaceAll("(?<=\\p{L})'(?=\\p{L})", "''") ;
		
		if(!currentLine.contains("Select ''"+" "+tableColumnMap.get(fileName)))
		{
			currentLine=currentLine.replace("Select ''", "Select '");
		}

		if(currentLine.contains(tableColumnMap.get(fileName)+", '"))
		{
			currentLine=currentLine.replace(tableColumnMap.get(fileName)+", ''", tableColumnMap.get(fileName)+", '");
		}
		else if(currentLine.contains(tableColumnMap.get(fileName)+",'"))
		{
			currentLine=currentLine.replace(tableColumnMap.get(fileName)+",''", tableColumnMap.get(fileName)+",'");
		}
		
		
		switch(fileName)
		{
	    case "DIM_ATTR_SEL_TYPE_INFO_MLS.sql"  :
	    {
	    	currentLine=currentLine.replace("'' N_ATTRIBUTE_SEL_ID,''", "' N_ATTRIBUTE_SEL_ID,'");
	    	currentLine=currentLine.replace("'' DESCLOCALE", "' DESCLOCALE");
	    	currentLine=currentLine.replace("O.N_ATTRIBUTE_SEL_ID=''", "O.N_ATTRIBUTE_SEL_ID='");
	    	currentLine=currentLine.replace("'' and O.DESCLOCALE=''", "' and O.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' and O.DESCLOCALE=''", "' and O.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.N_ATTRIBUTE_SEL_ID", "' )  S on (T.N_ATTRIBUTE_SEL_ID");
	    	currentLine=currentLine.replace("t.DESCLOCALE=''", "t.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
	    }
		case "DIM_ATTRIBUTE_INFO_MLS.sql"  :
		{
	    	currentLine=currentLine.replace("'' N_ATTRIBUTE_ID,''", "' N_ATTRIBUTE_ID,'");
	    	currentLine=currentLine.replace("'' DESCLOCALE", "' DESCLOCALE");
	    	currentLine=currentLine.replace("O.N_ATTRIBUTE_ID=''", "O.N_ATTRIBUTE_ID='");
	    	currentLine=currentLine.replace("'' and O.DESCLOCALE=''", "' and O.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' and O.DESCLOCALE=''", "' and O.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.N_ATTRIBUTE_ID", "' )  S on (T.N_ATTRIBUTE_ID");
	    	currentLine=currentLine.replace("t.DESCLOCALE=''", "t.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "DIM_ATTRIBUTE_TYPE_INFO_MLS.sql" :
		{
	    	currentLine=currentLine.replace("'' N_ATTRIBUTE_TYPE_ID,''", "' N_ATTRIBUTE_TYPE_ID,'");
	    	currentLine=currentLine.replace("'' DESCLOCALE", "' DESCLOCALE");
	    	currentLine=currentLine.replace("O.N_ATTRIBUTE_TYPE_ID=''", "O.N_ATTRIBUTE_TYPE_ID='");
	    	currentLine=currentLine.replace("'' and O.DESCLOCALE=''", "' and O.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' and O.DESCLOCALE=''", "' and O.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.N_ATTRIBUTE_TYPE_ID", "' )  S on (T.N_ATTRIBUTE_TYPE_ID");
	    	currentLine=currentLine.replace("t.DESCLOCALE=''", "t.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "DIM_COMPONENT_INFO_MLS.sql" :
		{
	    	currentLine=currentLine.replace("'' N_COMP_ID,''", "' N_COMP_ID,'");
	    	currentLine=currentLine.replace("'' DESCLOCALE from", "' DESCLOCALE from");
	    	currentLine=currentLine.replace("O.N_COMP_ID=''", "O.N_COMP_ID='");
	    	currentLine=currentLine.replace("'' and O.DESCLOCALE=''", "' and O.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' and O.DESCLOCALE=''", "' and O.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.N_COMP_ID", "' )  S on (T.N_COMP_ID");
	    	currentLine=currentLine.replace("t.DESCLOCALE=''", "t.DESCLOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_CS_CM_ALERT_ACTIONS_TL.sql" :
		{
	    	currentLine=currentLine.replace("'' V_ACTION_CD,''", "' V_ACTION_CD,'");
	    	currentLine=currentLine.replace("'' V_LOCALE from", "' V_LOCALE from");
	    	currentLine=currentLine.replace("on O.V_ACTION_CD=''", "on O.V_ACTION_CD='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_ACTION_CD", "' )  S on (T.V_ACTION_CD");
	    	currentLine=currentLine.replace("t.DESCLOCALE=''", "t.DESCLOCALE='");
	    	currentLine=currentLine.replace("and t.V_LOCALE=''", "and t.V_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_CS_CM_ALERT_PRIORITY_TL.sql" :
		{
	    	currentLine=currentLine.replace("'' V_ALERT_PRIORITY_CODE,''", "' V_ALERT_PRIORITY_CODE,'");
	    	currentLine=currentLine.replace("'' V_LOCALE from", "' V_LOCALE from");
	    	currentLine=currentLine.replace("O.V_ALERT_PRIORITY_CODE=''", "O.V_ALERT_PRIORITY_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_ALERT_PRIORITY_CODE", "' )  S on (T.V_ALERT_PRIORITY_CODE");
	    	currentLine=currentLine.replace("and t.V_LOCALE=''", "and t.V_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_CS_CM_ALERT_TYPE_TL.sql"  :
		{
			currentLine=currentLine.replace("'' V_ALERT_TYPE_CODE,''", "' V_ALERT_TYPE_CODE,'");
	    	currentLine=currentLine.replace("'' V_LOCALE from", "' V_LOCALE from");
	    	currentLine=currentLine.replace("O.V_ALERT_TYPE_CODE=''", "O.V_ALERT_TYPE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_ALERT_TYPE_CODE", "' )  S on (T.V_ALERT_TYPE_CODE");
	    	currentLine=currentLine.replace("and t.V_LOCALE=''", "and t.V_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_CS_CM_EVENT_STATUS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_STATUS_CODE,''", "' V_STATUS_CODE,'");
	    	currentLine=currentLine.replace("'' V_LOCALE from", "' V_LOCALE from");
	    	currentLine=currentLine.replace("on O.V_LOCALE=''", "on O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.V_STATUS_CODE=''", "' and O.V_STATUS_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE", "' )  S on (T.V_LOCALE");
	    	currentLine=currentLine.replace("and t.V_LOCALE=''", "and t.V_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_CS_CM_SAN_STD_CMNTS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_STD_COMNT_CD,''", "' V_STD_COMNT_CD,'");
			currentLine=currentLine.replace("'' V_LOCALE from", "' V_LOCALE from");
	    	currentLine=currentLine.replace("O.V_STD_COMNT_CD=''", "O.V_STD_COMNT_CD='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_STD_COMNT_CD", "' )  S on (T.V_STD_COMNT_CD");
	    	currentLine=currentLine.replace("and t.V_LOCALE=''", "and t.V_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_CS_CM_SCREENING_MODE_TL.sql"  :
		{
			currentLine=currentLine.replace("'' V_SCREENING_MODE_CODE,''", "' V_SCREENING_MODE_CODE,'");
			currentLine=currentLine.replace("'' V_LOCALE from", "' V_LOCALE from");
	    	currentLine=currentLine.replace("O.V_SCREENING_MODE_CODE=''", "O.V_SCREENING_MODE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_SCREENING_MODE_CODE", "' )  S on (T.V_SCREENING_MODE_CODE");
	    	currentLine=currentLine.replace("and t.V_LOCALE=''", "and t.V_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_CS_CM_STATUS_TL.sql"  :
		{
			currentLine=currentLine.replace("'' V_STATUS_CODE,''", "' V_STATUS_CODE,'");
			currentLine=currentLine.replace("'' V_LOCALE from", "' V_LOCALE from");
	    	currentLine=currentLine.replace("O.V_STATUS_CODE=''", "O.V_STATUS_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE=''", "' and O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_STATUS_CODE", "' )  S on (T.V_STATUS_CODE");
	    	currentLine=currentLine.replace("and t.V_LOCALE=''", "and t.V_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_EVENT_STATUS_TL.sql"  :
		{
			currentLine=currentLine.replace("'' V_LOCALE, ''", "' V_LOCALE, '");
			currentLine=currentLine.replace("'' N_STATUS_ID,", "' N_STATUS_ID,");
			currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE from", "' V_SOURCE_LOCALE from");
	    	currentLine=currentLine.replace("O.V_LOCALE=''", "O.V_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.N_STATUS_ID=''", "' and O.N_STATUS_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE", "' )  S on (T.V_LOCALE");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_EVENT_TYPE_TL.sql"  :
		{
			currentLine=currentLine.replace("'' N_EVENT_TYPE_SKEY, ''", "' N_EVENT_TYPE_SKEY, '");
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
	    	currentLine=currentLine.replace("'' V_EVENT_TYPE,", "' V_EVENT_TYPE,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.N_EVENT_TYPE_SKEY=''", "O.N_EVENT_TYPE_SKEY='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_EVENT_TYPE=''", "' and O.V_EVENT_TYPE='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.N_EVENT_TYPE_SKEY", "' )  S on (T.N_EVENT_TYPE_SKEY");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_SCENARIO_MASTER_TL.sql"  :
		{
			currentLine=currentLine.replace("'' V_SCENARIO_DESCRIPTION, ''", "' V_SCENARIO_DESCRIPTION, '");
			currentLine=currentLine.replace("'' N_SCENARIO_SKEY, ''", "' N_SCENARIO_SKEY, '");
	    	currentLine=currentLine.replace("'' V_LOCALE_CD,", "' V_LOCALE_CD,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.N_SCENARIO_SKEY=''", "O.N_SCENARIO_SKEY='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.N_SCENARIO_SKEY", "' )  S on (T.N_SCENARIO_SKEY");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	currentLine=currentLine.replace("' V_SCENARIO_DESCRIPTION, ''", "' V_SCENARIO_DESCRIPTION, '");
	    	break;
		}
		case "FCC_SUP_ACTION_TL.sql"  :
		{
			currentLine=currentLine.replace("'' V_ACTION_DESC, ''", "' V_ACTION_DESC, '");
			currentLine=currentLine.replace("'' N_ACTION_ID", "' N_ACTION_ID");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CD,''", "' V_LOCALE_CD,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE ");
	    	currentLine=currentLine.replace("O.N_ACTION_ID=''", "O.N_ACTION_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' )  S on (T.N_ACTION_ID", "' )  S on (T.N_ACTION_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CD=''", "t.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_SUP_STATUS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_STATUS_CD", "' V_STATUS_CD");
			currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CD,''", "' V_LOCALE_CD,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE ");
	    	currentLine=currentLine.replace("O.V_STATUS_CD=''", "O.V_STATUS_CD='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_STATUS_CD", "' )  S on (T.V_STATUS_CD");
	    	currentLine=currentLine.replace("t.V_LOCALE_CD=''", "t.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_TP_ACTION_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_ACTION_DESC, ''", "' V_ACTION_DESC, '");
			currentLine=currentLine.replace("'' N_ACTION_ID, ''", "' N_ACTION_ID, '");
	    	currentLine=currentLine.replace("'' V_LOCALE_CD,", "' V_LOCALE_CD,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.N_ACTION_ID=''", "on O.N_ACTION_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.N_ACTION_ID", "' )  S on (T.N_ACTION_ID");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_TP_STATUS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_STATUS_CD, ''", "' V_STATUS_CD, '");
			currentLine=currentLine.replace("'' V_LOCALE_CD", "' V_LOCALE_CD");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.V_STATUS_CD=''", "O.V_STATUS_CD='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_STATUS_CD", "' )  S on (T.V_STATUS_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FCC_TPG_SETUP_PARAMS_SRVCS_TL.sql" :
		{
			currentLine=currentLine.replace("'' SERVICE_CD, ''", "' SERVICE_CD, '");
			currentLine=currentLine.replace("'' V_LOCALE_CD", "' V_LOCALE_CD");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.SERVICE_CD=''", "on O.SERVICE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.SERVICE_CD", "' )  S on (T.SERVICE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_ACTION_CAT_CD_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
			currentLine=currentLine.replace("'' ACTION_CAT_CD", "' ACTION_CAT_CD");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.V_LOCALE_CD=''", "O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.ACTION_CAT_CD=''", "' and O.ACTION_CAT_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_ACTION_TL.sql" :
		{
			currentLine=currentLine.replace("'' ACTION_DESC, ''", "' ACTION_DESC, '");
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
	    	currentLine=currentLine.replace("'' ACTION_ID,", "' ACTION_ID,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.V_LOCALE_CD=''", "on O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.ACTION_ID=''", "' and O.ACTION_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_CASE_TYPE_SUBTYPE_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
			currentLine=currentLine.replace("'' CASE_TYPE_SUBTYPE_CD", "' CASE_TYPE_SUBTYPE_CD");
	    	currentLine=currentLine.replace(",O.D_CREATED_DT,''", ",O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.V_LOCALE_CD=''", "O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.CASE_TYPE_SUBTYPE_CD=''", "' and O.CASE_TYPE_SUBTYPE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_CASEATTRBT_MASTER_TL.sql" :
		{
			currentLine=currentLine.replace("'' ATTRBT_DESC_TX, ''", "' ATTRBT_DESC_TX, '");
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
	    	currentLine=currentLine.replace("'' ATTRBT_ID,", "' ATTRBT_ID,");
	    	currentLine=currentLine.replace("D_CREATED_DT,''", "D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.V_LOCALE_CD=''", "on O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.ATTRBT_ID=''", "' and O.ATTRBT_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_CASEENTITY_MASTER_TL.sql" :
		{
			currentLine=currentLine.replace("'' ENTITY_DESC_TX, ''", "' ENTITY_DESC_TX, '");
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
	    	currentLine=currentLine.replace("'' ENTITY_ID,", "' ENTITY_ID,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.V_LOCALE_CD=''", "on O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.ENTITY_ID=''", "' and O.ENTITY_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_CMMNT_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
			currentLine=currentLine.replace("'' CMMNT_ID,", "' CMMNT_ID,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.V_LOCALE_CD=''", "on O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.CMMNT_ID=''", "' and O.CMMNT_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_CODE_SET_TRNLN_TL.sql" :
		{
			currentLine=currentLine.replace("'' CODE_SET, ''", "' CODE_SET, '");
			currentLine=currentLine.replace("'' CODE_VAL, ''", "' CODE_VAL, '");
	    	currentLine=currentLine.replace("'' V_LOCALE_CD,", "' V_LOCALE_CD,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.CODE_SET=''", "on O.CODE_SET='");
	    	currentLine=currentLine.replace("'' and O.CODE_VAL=''", "' and O.CODE_VAL='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CD=''", "' and O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.CODE_SET", "' )  S on (T.CODE_SET");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_COUNTRY_TL.sql" :
		{
			currentLine=currentLine.replace("'' COUNTRY_DESC, ''", "' COUNTRY_DESC, '");
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
	    	currentLine=currentLine.replace("'' COUNTRY_ID,", "' COUNTRY_ID,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.V_LOCALE_CD=''", "on O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.COUNTRY_ID=''", "' and O.COUNTRY_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_INSTALL_PARAM_TL.sql" :
		{
			currentLine=currentLine.replace("'' PARAM_CAT_CD,''", "' PARAM_CAT_CD,'");
			currentLine=currentLine.replace("'' PARAM_DESC_TX,''", "' PARAM_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_1_DESC_TX,''", "' ATTR_1_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_2_DESC_TX,''", "' ATTR_2_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_3_DESC_TX,''", "' ATTR_3_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_4_DESC_TX,''", "' ATTR_4_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_5_DESC_TX,''", "' ATTR_5_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_6_DESC_TX,''", "' ATTR_6_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_7_DESC_TX,''", "' ATTR_7_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_8_DESC_TX,''", "' ATTR_8_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_9_DESC_TX,''", "' ATTR_9_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_10_DESC_TX,''", "' ATTR_10_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_11_DESC_TX,''", "' ATTR_11_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_12_DESC_TX,''", "' ATTR_12_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_13_DESC_TX,''", "' ATTR_13_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_14_DESC_TX,''", "' ATTR_14_DESC_TX,'");
	    	currentLine=currentLine.replace("'' ATTR_15_DESC_TX, ''", "' ATTR_15_DESC_TX, '");
	    	currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
	    	currentLine=currentLine.replace("'' PARAM_ID,", "' PARAM_ID,");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("on O.V_LOCALE_CD=''", "on O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.PARAM_ID=''", "' and O.PARAM_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_LINK_ANLYS_DISPLAY_INFO_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
			currentLine=currentLine.replace("'' TYPE_ID,O", "' TYPE_ID,O");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.V_LOCALE_CD=''", "O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.TYPE_ID=''", "' and O.TYPE_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_QUEUE_MASTER_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
			currentLine=currentLine.replace("'' QUEUE_SEQ_ID", "' QUEUE_SEQ_ID");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.V_LOCALE_CD=''", "O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.QUEUE_SEQ_ID=''", "' and O.QUEUE_SEQ_ID='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_REG_REPORT_STATUS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
			currentLine=currentLine.replace("'' REG_STATUS_CD", "' REG_STATUS_CD");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.V_LOCALE_CD=''", "O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.REG_STATUS_CD=''", "' and O.REG_STATUS_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "KDD_STATUS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_LOCALE_CD, ''", "' V_LOCALE_CD, '");
			currentLine=currentLine.replace("'' STATUS_CD", "' STATUS_CD");
	    	currentLine=currentLine.replace("O.D_CREATED_DT,''", "O.D_CREATED_DT,'");
	    	currentLine=currentLine.replace("'' V_SOURCE_LOCALE", "' V_SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.V_LOCALE_CD=''", "O.V_LOCALE_CD='");
	    	currentLine=currentLine.replace("'' and O.STATUS_CD=''", "' and O.STATUS_CD='");
	    	currentLine=currentLine.replace("'' and O.V_SOURCE_LOCALE=''", "' and O.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_LOCALE_CD", "' )  S on (T.V_LOCALE_CD");
	    	currentLine=currentLine.replace("t.V_SOURCE_LOCALE=''", "t.V_SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "aai_ff_control_options.sql" :
		{
			currentLine=currentLine.replace("'' V_UNIQUE_CONTROL_ID, ''", "' V_UNIQUE_CONTROL_ID, '");
			currentLine=currentLine.replace("'' V_OPTION_KEY, ''", "' V_OPTION_KEY, '");
	    	currentLine=currentLine.replace("'' V_ALIGN,O.V_DSN_ID,''", "' V_ALIGN,O.V_DSN_ID,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("on O.V_UNIQUE_CONTROL_ID=''", "on O.V_UNIQUE_CONTROL_ID='");
	    	currentLine=currentLine.replace("'' and O.V_OPTION_KEY=''", "' and O.V_OPTION_KEY='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_ALIGN=''", "' and O.V_ALIGN='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE='''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_UNIQUE_CONTROL_ID", "' )  S on (T.V_UNIQUE_CONTROL_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_FF_FORM_CONTROLS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_UNIQUE_CONTROL_ID,''", "' V_UNIQUE_CONTROL_ID,'");
			currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_UNIQUE_CONTROL_ID=''", "O.V_UNIQUE_CONTROL_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_UNIQUE_CONTROL_ID", "' )  S on (T.V_UNIQUE_CONTROL_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_FF_FORMS_CONTAINERS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_FORM_CODE, ''", "' V_FORM_CODE, '");
			currentLine=currentLine.replace("'' V_CONTAINER_ID", "' V_CONTAINER_ID");
	    	currentLine=currentLine.replace("O.N_VERSION,''", "O.N_VERSION,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("on O.V_FORM_CODE=''", "on O.V_FORM_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_CONTAINER_ID=''", "' and O.V_CONTAINER_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_FORM_CODE", "' )  S on (T.V_FORM_CODE");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_FF_FORMS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_FORM_DESC, ''", "' V_FORM_DESC, '");
			currentLine=currentLine.replace("'' V_FORM_CODE,''", "' V_FORM_CODE,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_FORM_CODE=''", "O.V_FORM_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_FORM_CODE", "' )  S on (T.V_FORM_CODE");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_MENU_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_MENU_DESC, ''", "' V_MENU_DESC, '");
			currentLine=currentLine.replace("'' V_MENU_ID,''", "' V_MENU_ID,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_MENU_ID=''", "O.V_MENU_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_MENU_ID", "' )  S on (T.V_MENU_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_WF_ACTIVITY_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_ACTIVITY_DESC, ''", "' V_ACTIVITY_DESC, '");
			currentLine=currentLine.replace("'' V_PROCESS_ID, ''", "' V_PROCESS_ID, '");
	    	currentLine=currentLine.replace("'' V_ACTIVITY_ID,''", "' V_ACTIVITY_ID,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_PROCESS_ID=''", "O.V_PROCESS_ID='");
	    	currentLine=currentLine.replace("'' and O.V_ACTIVITY_ID=''", "' and O.V_ACTIVITY_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_PROCESS_ID", "' )  S on (T.V_PROCESS_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_WF_APPLICATION_API_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_APP_API_DESC, ''", "' V_APP_API_DESC, '");
			currentLine=currentLine.replace("'' V_APP_API_ID, ''", "' V_APP_API_ID, '");
	    	currentLine=currentLine.replace("'' V_APP_PACKAGE_ID, ''", "' V_APP_PACKAGE_ID, '");
	    	currentLine=currentLine.replace("'' V_PROCESS_ID,''", "' V_PROCESS_ID,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_APP_API_ID=''", "O.V_APP_API_ID='");
	    	currentLine=currentLine.replace("'' and O.V_APP_PACKAGE_ID=''", "' and O.V_APP_PACKAGE_ID='");
	    	currentLine=currentLine.replace("'' and O.V_PROCESS_ID=''", "' and O.V_PROCESS_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_APP_API_ID", "' )  S on (T.V_APP_API_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_WF_DATA_FIELD_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_DATA_FIELD_ID, ''", "' V_DATA_FIELD_ID, '");
			currentLine=currentLine.replace("'' V_APP_PACKAGE_ID, ''", "' V_APP_PACKAGE_ID, '");
	    	currentLine=currentLine.replace("'' V_PROCESS_ID, ''", "' V_PROCESS_ID, '");
	    	currentLine=currentLine.replace("'' V_DATA_FIELD_NAME,''", "' V_DATA_FIELD_NAME,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_DATA_FIELD_ID=''", "O.V_DATA_FIELD_ID='");
	    	currentLine=currentLine.replace("'' and O.V_APP_PACKAGE_ID=''", "' and O.V_APP_PACKAGE_ID='");
	    	currentLine=currentLine.replace("'' and O.V_PROCESS_ID=''", "' and O.V_PROCESS_ID='");
	    	currentLine=currentLine.replace("'' and O.V_DATA_FIELD_NAME=''", "' and O.V_DATA_FIELD_NAME='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_DATA_FIELD_ID", "' )  S on (T.V_DATA_FIELD_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_WF_PROCESS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_PROCESS_DESC, ''", "' V_PROCESS_DESC, '");
			currentLine=currentLine.replace("'' V_PROCESS_ID,''", "' V_PROCESS_ID,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_PROCESS_ID=''", "O.V_PROCESS_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_PROCESS_ID", "' )  S on (T.V_PROCESS_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_WF_STATUS_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_STATUS_DESC, ''", "' V_STATUS_DESC, '");
			currentLine=currentLine.replace("'' V_STATUS_ID, ''", "' V_STATUS_ID, '");
	    	currentLine=currentLine.replace("'' V_APP_PACKAGE_ID,''", "' V_APP_PACKAGE_ID,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_STATUS_ID=''", "O.V_STATUS_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_APP_PACKAGE_ID=''", "' and O.V_APP_PACKAGE_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_STATUS_ID", "' )  S on (T.V_STATUS_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "AAI_WF_TRANSITION_TL.sql" :
		{
			currentLine=currentLine.replace("'' V_TRANSITION_DESC, ''", "' V_TRANSITION_DESC, '");
			currentLine=currentLine.replace("'' V_PROCESS_ID, ''", "' V_PROCESS_ID, '");
	    	currentLine=currentLine.replace("'' V_TRANSITION_ID,''", "' V_TRANSITION_ID,'");
	    	currentLine=currentLine.replace("'' V_LOCALE_CODE", "' V_LOCALE_CODE");
	    	currentLine=currentLine.replace("O.V_PROCESS_ID=''", "O.V_PROCESS_ID='");
	    	currentLine=currentLine.replace("'' and O.V_TRANSITION_ID=''", "' and O.V_TRANSITION_ID='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' and O.V_LOCALE_CODE=''", "' and O.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' )  S on (T.V_PROCESS_ID", "' )  S on (T.V_PROCESS_ID");
	    	currentLine=currentLine.replace("t.V_LOCALE_CODE=''", "t.V_LOCALE_CODE='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "FORMS_LOCALE_MASTER.sql" :
		{
			currentLine=currentLine.replace("'' FORM_CODE, ''", "' FORM_CODE, '");
			currentLine=currentLine.replace("'' DSN_ID, ''", "' DSN_ID, '");
	    	currentLine=currentLine.replace("'' CONTROL_ID, ''", "' CONTROL_ID, '");
	    	currentLine=currentLine.replace("'' CONTROL_TYPE", "' CONTROL_TYPE");
	    	currentLine=currentLine.replace("O.FORM_VERSION,''", "O.FORM_VERSION,'");
	    	currentLine=currentLine.replace("'' LOCALE_ID", "' LOCALE_ID");
	    	currentLine=currentLine.replace("on O.FORM_CODE=''", "on O.FORM_CODE='");
	    	currentLine=currentLine.replace("'' and O.DSN_ID=''", "' and O.DSN_ID='");
	    	currentLine=currentLine.replace("'' and O.CONTROL_ID=''", "' and O.CONTROL_ID='");
	    	currentLine=currentLine.replace("'' and O.LOCALE_ID=''", "' and O.LOCALE_ID='");
	    	currentLine=currentLine.replace("'' and O.CONTROL_TYPE=''", "' and O.CONTROL_TYPE='");
	    	currentLine=currentLine.replace("'' and O.LOCALE_ID=''", "' and O.LOCALE_ID='");
	    	currentLine=currentLine.replace("'' )  S on (T.FORM_CODE", "' )  S on (T.FORM_CODE");
	    	currentLine=currentLine.replace("t.LOCALE_ID=''", "t.LOCALE_ID='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "MENU_LOCALE_MAP.sql" :
		{
			currentLine=currentLine.replace("'' MENU_ID, ''", "' MENU_ID, '");
			currentLine=currentLine.replace("'' DSN_ID, ''", "' DSN_ID, '");
	    	currentLine=currentLine.replace("'' APP_ID,''", "' APP_ID,'");
	    	currentLine=currentLine.replace("'' LOCALE_ID", "' LOCALE_ID");
	    	currentLine=currentLine.replace("O.MENU_ID=''", "O.MENU_ID='");
	    	currentLine=currentLine.replace("'' and O.DSN_ID=''", "' and O.DSN_ID='");
	    	currentLine=currentLine.replace("'' and O.LOCALE_ID=''", "' and O.LOCALE_ID='");
	    	currentLine=currentLine.replace("'' and O.APP_ID=''", "' and O.APP_ID='");
	    	currentLine=currentLine.replace("'' and O.LOCALE_ID=''", "' and O.LOCALE_ID='");
	    	currentLine=currentLine.replace("'' )  S on (T.MENU_ID", "' )  S on (T.MENU_ID");
	    	currentLine=currentLine.replace("t.LOCALE_ID=''", "t.LOCALE_ID='");
	    	currentLine=currentLine.replace("'' ) when matched", "' ) when matched");
	    	break;
		}
		case "METADATA_LOCALE_MASTER.sql" :
		{
			currentLine=currentLine.replace("'' METADATA_LOCALE, ''", "' METADATA_LOCALE, '");
			currentLine=currentLine.replace("'' METADATA_KEY, ''", "' METADATA_KEY, '");
			
			int in=currentLine.indexOf("LOCALE_DESCRIPTION",currentLine.indexOf("LOCALE_DESCRIPTION")+1);
			currentLine=currentLine.substring(0,in)+"LOCALE_DESCRIPTION1"+currentLine.substring(in+18,currentLine.length());
			
	    	currentLine=currentLine.replace("'' VERSION_NO, ''", "' VERSION_NO, '");
	    	currentLine=currentLine.replace("'' METADATA_INFODOM, ''", "' METADATA_INFODOM, '");
	    	currentLine=currentLine.replace("'' IS_METADATA,''", "' IS_METADATA,'");
	    	currentLine=currentLine.replace("'' SOURCE_LOCALE", "' SOURCE_LOCALE");
	    	currentLine=currentLine.replace("O.METADATA_LOCALE=''", "O.METADATA_LOCALE='");
	    	currentLine=currentLine.replace("'' and O.METADATA_KEY=''", "' and O.METADATA_KEY='");
	    	currentLine=currentLine.replace("'' and O.LOCALE_DESCRIPTION=''", "' and O.LOCALE_DESCRIPTION='");
	    	currentLine=currentLine.replace("'' and O.VERSION_NO=''", "' and O.VERSION_NO='");
	    	currentLine=currentLine.replace("'' and O.METADATA_INFODOM=''", "' and O.METADATA_INFODOM='");
	    	currentLine=currentLine.replace("'' and O.IS_METADATA=''", "' and O.IS_METADATA='");
	    	currentLine=currentLine.replace("'' and O.SOURCE_LOCALE=''", "' and O.SOURCE_LOCALE='");
	    	currentLine=currentLine.replace("'' )  S on (T.METADATA_LOCALE", "' )  S on (T.METADATA_LOCALE");
	    	break;
		}
		}
		
		return currentLine;
	}
	
	
	

}
