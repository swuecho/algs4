import org.biojava.nbio.core.sequence.DNASequence
import org.biojava.nbio.sequencing.io.fastq.*
// Illumina reads will throw error when use IllumiaReader.
// https://en.wikipedia.org/wiki/FASTQ_format
// Starting in Illumina 1.8, the quality scores have basically
// returned to the use of the Sanger format (Phred+33).
FastqReader reader = new SangerFastqReader()

filename = "/home/hwu/dev/MS/UMI/UMI-H_S1_L001/merged/merged_R12.fastq"

def i = 1
reader.read(new File(filename)).take(5).each {
   // println(it.description.split(/:/)[-1])
     def seq = it.sequence
     if (seq.length() < 10) {
        println(seq)
     }
}


def seq_number_each_barcode = reader.read(new File(filename)).collect {
     Integer.parseInt(it.description.split(/:/)[-1])
}

new File("/tmp/seq_count_with_same_umi.csv").withWriter{ out ->
    seq_number_each_barcode.each {out.println it}
}
println(seq_number_each_barcode)
def count_map = seq_number_each_barcode.countBy { it}
println(count_map)

def length_of_seqs = reader.read(new File(filename)).collect {
    it.sequence.length()
}

new File("/tmp/seq_len.csv").withWriter{ out ->
    length_of_seqs.each {out.println it}
}

def count_map_len = length_of_seqs.countBy { it}
println(count_map_len)






