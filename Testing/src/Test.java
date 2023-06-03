import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

import com.ofs.aai.inline.model.response.RTIResponse.Result;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String eventSkey="284";
//		
//		char[] es=eventSkey.toCharArray();
//		
//		int numEventSkey = 0;
//		   
//	    for(int i = 0; i < es.length; i++)
//	    {
//	    	numEventSkey = numEventSkey * 10 + eventSkey.charAt(i) - '0'; 
//	    	System.out.println(numEventSkey);
//	     }
//	    
//	    System.out.println(numEventSkey + " is of type " + ((Object)numEventSkey).getClass().getSimpleName()); 
//	   System.out.println(numEventSkey);
		
		
//		String d="2014-12-30T03:01:03Z";
//		
//		
//	 String finalString="";
//	 
//	 String [] s=d.split("T");
//	 
//	 String[] prefix=s[0].split("-");
//	 String suffix=s[1].substring(0,s[1].length()-1);
//	 
//	 finalString+=prefix[1]+"/"+prefix[2]+"/"+prefix[0]+" "+suffix;
//	 
//	 System.out.println(finalString);
//	 
////String messages="Merge into MESSAGES_KO_KR T USING ( Select ''이 레벨에서는 추가 작업을 수행할 수 없습니다.'' MSG_DESCRIPTION, ''RENDERER'' MSG_PACKAGE, ''ADD_CANNOT_AT_THIS_LEVEL'' MSG_IDENTIFIER,O.MSG_CODE,O.MSG_TYPE,O.MSG_APPL_NAME,O.MSG_MODULE_NAME from dual D inner join MESSAGES_EN_US O on O.MSG_PACKAGE=''RENDERER'' and O.MSG_IDENTIFIER=''ADD_CANNOT_AT_THIS_LEVEL''  )  S on (T.MSG_PACKAGE=S.MSG_PACKAGE and T.MSG_IDENTIFIER=S.MSG_IDENTIFIER  ) when matched then update set T.MSG_DESCRIPTION=S.MSG_DESCRIPTION when not matched then insert ( MSG_PACKAGE , MSG_IDENTIFIER , MSG_CODE , MSG_DESCRIPTION , MSG_TYPE , MSG_APPL_NAME , MSG_MODULE_NAME ) values (S.MSG_PACKAGE , S.MSG_IDENTIFIER , S.MSG_CODE , S.MSG_DESCRIPTION , S.MSG_TYPE , S.MSG_APPL_NAME , S.MSG_MODULE_NAME )";
//
//String messages="'이벤트''를 정의할 때 시나리오는 시장 뉴스 이벤트 및 베타 값뿐만 아니라 상당한 가격 및/또는 거래량 움직임의 분석을 포함한 여러 방식을 제공합니다. 관심 증권이 식별되면 시나리오는 해당 증권에서 매매를 한 모든 고객, 사원, 매매자 및 투자 자문가를 찾습니다.";
//	
//		System.out.println(messages.substring(0,10));
//		
//		System.out.println(messages.substring(0,1));
//		
//		System.out.println(messages.substring(1));
//		
//		System.out.println(Character.toString(messages.charAt(0)));
//		
//		System.out.println(messages.substring(messages.length()-19,messages.length()));
//	 
//	 
		
		
String temp="Merge into MESSAGES_EN_US T USING ( Select 'عرض المبلغ متبوعًا بالعملة\r\n"
		+ "\r\n"
		+ "' MSG_DESCRIPTION, 'RENDERER' MSG_PACKAGE, 'LAST_CNTRCT_CRNCY_CD' MSG_IDENTIFIER,O.MSG_CODE,O.MSG_TYPE,O.MSG_APPL_NAME,O.MSG_MODULE_NAME,'ar_EG' LOCALE from dual D inner join MESSAGES_EN_US O on O.MSG_PACKAGE='RENDERER' and O.MSG_IDENTIFIER='LAST_CNTRCT_CRNCY_CD' and O.LOCALE='en_US' )  S on (T.MSG_PACKAGE=S.MSG_PACKAGE and T.MSG_IDENTIFIER=S.MSG_IDENTIFIER and t.LOCALE='ar_EG' ) when matched then update set T.MSG_DESCRIPTION=S.MSG_DESCRIPTION when not matched then insert ( MSG_PACKAGE , MSG_IDENTIFIER , MSG_CODE , MSG_DESCRIPTION , MSG_TYPE , MSG_APPL_NAME , MSG_MODULE_NAME , LOCALE) values (S.MSG_PACKAGE , S.MSG_IDENTIFIER , S.MSG_CODE , S.MSG_DESCRIPTION , S.MSG_TYPE , S.MSG_APPL_NAME , S.MSG_MODULE_NAME , S.LOCALE)\r\n"
		+ "";

String t="Merge into MESSAGES_EN_US T USING ( Select 'عرض المبلغ متبوعًا بالعملة";

for(String tem:t.split(" "))
{
	System.out.println(tem);
}
System.out.println(t.length());
System.out.println(t.substring(t.length()-19,t.length()));

		System.out.println(temp.substring(temp.length()-19,temp.length()));
		System.out.println(temp.substring(temp.length()-19,temp.length()).equals("SG_MODULE_NAME )';"));
		
		
		

//		try {
//		      File xmlfile = new File("C:\\Users\\rajushar\\Downloads\\HELP\\FOP\\organization.xml");
//		      File xsltfile = new File("C:\\Users\\rajushar\\Downloads\\HELP\\FOP\\organization.xsl");
//		      File pdfDir = new File("./Test");
//		      pdfDir.mkdirs();
//		      File pdfFile = new File(pdfDir, "organization.pdf");
//		      System.out.println(pdfFile.getAbsolutePath());
//		      // configure fopFactory as desired
//		      final FopFactory fopFactory = FopFactory.newInstance();        
//		      FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
//		      // configure foUserAgent as desired        
//		      // Setup output
//		   // Setup output
//				OutputStream out = new java.io.FileOutputStream(pdfFile);
//				out = new java.io.DataOutputStream(out);
//				
////		      OutputStream out = new FileOutputStream(pdfFile);
////		      out = new java.io.BufferedOutputStream(out);
//		      try {
//		        // Construct fop with desired output format
//		        Fop fop;                
//		        fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);    
//		        // Setup XSLT
//		        TransformerFactory factory = TransformerFactory.newInstance();
//		        Transformer transformer = factory.newTransformer(new StreamSource(xsltfile));        
//		        // Setup input for XSLT transformation
//		        Source src = new StreamSource(xmlfile);                   
//		        // Resulting SAX events (the generated FO) must be piped through to FOP
//		        javax.xml.transform.Result res = new SAXResult(fop.getDefaultHandler());          
//		        // Start XSLT transformation and FOP processing
//		        transformer.transform(src, res);
//		      } catch (FOPException | TransformerException e) {
//		          // TODO Auto-generated catch block
//		          e.printStackTrace();
//		      } finally {
//		        out.close();
//		      }
//		    }catch(IOException exp){
//		      exp.printStackTrace();
//		    }
		
	}

}
