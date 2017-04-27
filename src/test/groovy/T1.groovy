/**
 * Created by dell on 4/26/2017.
 */
import groovy.util.GroovyTestCase

class T1 extends GroovyTestCase {
    void testListSize() {
        def lst = [1, 2]
        assert 2 == lst.size(): "ArrayList size must be 2"
    }
}