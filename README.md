
This project shows the problem with the IntelliJ GWT plugin and JSP files.

 * load the project
 * run the 'Test Super Dev' run configuration
 * initially there are no class files generated
 * press 'Jump!'
    * JSP page is loaded
    * console shows that the JSP compilation is compiling the sources and writing them to the src folder
    * a project refresh shows the class files in the project source folder 

Reproduced with Adopt OpenJDK 1.8.0_252 on Mac OSX, but it's also been seen on Windows machines.
