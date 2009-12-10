import grails.build.GrailsBuildListener
class LoggingGrailsBuildListener implements GrailsBuildListener {
    def log = new File("buildEvents.log")
    void receiveGrailsBuildEvent(String name, Object[] args) {
        log << "Event: $name\n"
        log << "Args:\n\t${args.join(',\n\t')}\n"
        log << "----\n" 
    }
}