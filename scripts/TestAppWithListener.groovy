/*
    Note: you must run a compile before running this to make LoggingGrailsBuildListener available.
*/

scriptEnv = 'test'
includeTargets << grailsScript("_GrailsEvents") // sets up eventListener
includeTargets << grailsScript("_GrailsTest")

target('default': "Run a Grails applications tests with the logging build listener") {
    depends(compile)
    // eventListener is an instance of org.codehaus.groovy.grails.cli.support.GrailsBuildEventListener
    // see: http://grails.org/doc/latest/api/org/codehaus/groovy/grails/cli/support/GrailsBuildEventListener.html#addGrailsBuildListener(grails.build.GrailsBuildListener)
    eventListener.addGrailsBuildListener(classLoader.loadClass('LoggingGrailsBuildListener').newInstance())
    
    allTests()
}