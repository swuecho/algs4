def password= System.getenv('dbpass')
def sql = groovy.sql.Sql.newInstance('jdbc:postgresql://localhost:5432/hwu',
'hwu', '@#wuhao5', 'org.postgresql.Driver')
println sql.connection.catalog

println "All Records:"
def query = "select distinct subset from bcr"
sql.eachRow query, {r-> 
 println r.subset
}
