This app demonstrates the new “Build Listening” feature of Grails 1.2.

Implementations of [GrailsBuildListener](http://grails.org/doc/latest/api/grails/build/GrailsBuildListener.html "GrailsBuildListener") can be injected into the build in 3 different ways

A very trivial implementation is included in this project as `LoggingGrailsBuildListener`. This implementation simply logs all events to `buildEvents.log` in the project directory.

## Registration

### System Property

To try it out, run…

	grails -Dgrails.build.listeners=LoggingGrailsBuildListener test-app

The property value is a comma separated list of class names (that implement `GrailsBuildListener`).

### BuildConfig

Listeners can be set in `grails-app/conf/BuildConfig.groovy`. Check out that file in this project.

### Programmatic

Listeners can be registered during the build. See `scripts/TestAppWithListener.groovy` in this project for an example of how to do so.

To try it out, run…

	grails test-app-with-listener

## Test Events

Grails 1.2 adds a “test event publishing” contract to ensure that all test types publish suitable events to inform interested parties on what is happening. The most obvious usage of this would be for an IDE to provide rich visual feedback of test execution.

Test types call an instance of [GrailsTestEventPublisher](http://github.com/grails/grails/blob/master/grails/src/java/org/codehaus/groovy/grails/test/event/GrailsTestEventPublisher.groovy) to publish events during test execution into the Grails build system.

An IDE could inject a listener via the `grails.build.listeners` system property, that communicates back with the IDE somehow. It could respond appropriately to the test event published by `GrailsTestEventPublisher`.