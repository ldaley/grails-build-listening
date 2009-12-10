scriptEnv = 'test'

includeTargets << grailsScript("_GrailsEvents")
includeTargets << grailsScript("_GrailsTest")

target('default': "Run a Grails applications tests with the logging build listener") {
    
    // eventListener is an instance of org.codehaus.groovy.grails.cli.support.GrailsBuildEventListener
    // see: http://grails.org/doc/latest/api/org/codehaus/groovy/grails/cli/support/GrailsBuildEventListener.html#addGrailsBuildListener(grails.build.GrailsBuildListener)
    eventListener.addGrailsBuildListener(new LoggingGrailsBuildListener())
    
    allTests()
}