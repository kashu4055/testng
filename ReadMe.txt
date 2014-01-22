Selenium2-Testng-Maven-TestProject

Instructions
Using the Maven task "mvn clean test".

Configuration And Setup
Eclipse
To get it working on a regular Eclipse, follow these steps:
1. Use the "Eclipse Marketplace" panel to install the Maven M2E
   plugin for your version of Eclipse.  Also, install the TestNG
   plugin for Eclipse.  
2. Use the Eclipse "Import" function from the Eclipse "File
   menu" to import a existing "Project" of type "Maven".
3. Use the pom.xml editor to resolve any build problems you
   may have after the import.
4. Right click on your project and choose "Run As-->External
   Tools Configuration".  Configure a new "clean" and "test"
   configuration for running a Maven build.

TestNG
Edit the "testng.xml" file in root directory

<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="Suite" parallel="false">
    <test name="Test">
        <parameter name="email" value="ruan.keyu@gmail.com" /> ---->Test Data
        <parameter name="password" value="k20260150" /> ---->Test Data
        <parameter name="homePage" value="https://podio.com/login" /> ---->Test Data
        <parameter name="driverPath" value="C:/xunlei/Project/testng/Driver/chromedriver.exe" /> ---->Provide the directory where you store "chromedriver.exe"
        <classes>
            <class name="com.keyu.testng.HomePageTest" /> --->Which test case should be execute
        </classes>
    </test> <!-- Test -->
</suite> <!-- Suite -->

