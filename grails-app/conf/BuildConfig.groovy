/*
  Property must be the class NAME, not the class object  
  Can be a class name, list of class names, a class, or a list of classes.
  
  Make sure you run a compile with this commented before uncommenting so LoggingGrailsBuildListener is available.
*/ 

//grails.build.listeners='LoggingGrailsBuildListener'

// Note: because of class loader issues, if the implementation is coming from the project itself, you must
//       use the class name because the class is not available at the time build config is sourced.






grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"
grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits( "global" ) {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {        
        grailsPlugins()
        grailsHome()
    }
    dependencies {}
}
