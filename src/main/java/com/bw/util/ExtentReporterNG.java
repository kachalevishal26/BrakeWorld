package com.bw.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;

	public static ExtentReports getReportObject() {
//		String path = System.getProperty("user.dir")+"\\reports\\ExtentReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");
		reporter.config().setReportName("Web Automation Reports");
		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vishal Kachale");

		return extent;
	}
}
