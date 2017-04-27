import org.biojava.nbio.core.sequence.io.IUPACParser
import org.biojava.nbio.core.sequence.DNASequence

def p = IUPACParser.getInstance()

p.getTables().each {
    println it.getName()
}

def dna = new DNASequence("ATCG")

println dna.getReverseComplement().getSequenceAsString()

println dna.getReverseComplement().getSequenceAsString()
println dna.getRNASequence().getSequenceAsString()




