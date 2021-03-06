package ch.uzh.ifi.seal.PerfAwareUnitTestsEval

import org.funktionale.either.Either

interface Transformer {
    // returns paths to transformed testsuites
    fun transform(ts: TestSuite): List<CompilationInfo>
    fun cpDeps(): Either<String, List<String>>
}