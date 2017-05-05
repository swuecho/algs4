/**
 * Created by hwu on 5/3/17.
 */
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



def number_of_raw_seq_with_barcode = reader.read(new File(filename)).inject(0) {
    result, fastq-> result + Integer.parseInt(fastq.description.split(/:/)[-1])
}
