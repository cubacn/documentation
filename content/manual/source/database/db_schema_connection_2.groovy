task updateDb(dependsOn: assembleDbScripts, type: CubaDbUpdate) {
    dbms = 'mssql'
    dbmsVersion = '2012'
    host = 'localhost'
    dbName = 'demo'
    connectionParams = ';currentSchema=my_schema'
    dbUser = 'JohnDoe'
    dbPassword = 'saPass1'
}