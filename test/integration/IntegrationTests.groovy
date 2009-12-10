class IntegrationTests extends GroovyTestCase {

    void testError() {
        throw new Error("!")
    }
    
    void testFailure() {
        assertEquals(1, 2)
    }
    
    void testPass() {
        println "some output from the test"
        System.err.println "some stderr output from the test"
    }
}