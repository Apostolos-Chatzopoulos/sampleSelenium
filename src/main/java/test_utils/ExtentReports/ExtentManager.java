package test_utils.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;

import java.text.SimpleDateFormat;
import java.util.Date;

//OB: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.

public class ExtentManager {

    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir+"\\extent-reports\\ExtentReportResults_" + getTimestamp() + ".html", true);
        }
        return extent;
    }

    public static String getTimestamp() {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        return timeStamp;
    }
}
