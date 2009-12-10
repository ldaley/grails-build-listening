/*
  Property must be the class NAME, not the class object  
  Can be a class name, list of class names, a class, or a list of classes.
  
  Make sure you run a compile with this commented before uncommenting so LoggingGrailsBuildListener is available.
* 

//grails.build.listeners='LoggingGrailsBuildListener'

// Note: because of class loader issues, if the implementation is coming from the project itself, you must
//       use the class name because the class is not available at the time build config is sourced.