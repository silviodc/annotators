package org.sifrproject;

import org.junit.Test;
import org.junit.Assert;

import org.sifrproject.format.JsonToRdf;
import org.sifrproject.util.JSON;

public class FormatTest {
    final static String jsonArrayStr = "[    {   \"annotatedClass\": {       \"@id\": \"http://edamontology.org/topic_2640\",        \"@type\": \"http://www.w3.org/2002/07/owl#Class\",     \"links\": {        \"self\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM/classes/http%3A%2F%2Fedamontology.org%2Ftopic_2640\",        \"ontology\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM\",       \"children\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM/classes/http%3A%2F%2Fedamontology.org%2Ftopic_2640/children\",       \"parents\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM/classes/http%3A%2F%2Fedamontology.org%2Ftopic_2640/parents\",         \"descendants\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM/classes/http%3A%2F%2Fedamontology.org%2Ftopic_2640/descendants\",         \"ancestors\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM/classes/http%3A%2F%2Fedamontology.org%2Ftopic_2640/ancestors\",         \"tree\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM/classes/http%3A%2F%2Fedamontology.org%2Ftopic_2640/tree\",       \"notes\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM/classes/http%3A%2F%2Fedamontology.org%2Ftopic_2640/notes\",         \"mappings\": \"http://bioportal.lirmm.fr:8082/ontologies/EDAM/classes/http%3A%2F%2Fedamontology.org%2Ftopic_2640/mappings\",       \"ui\": \"http://http://bioportal.lirmm.fr/ontologies/EDAM?p=classes&conceptid=http%3A%2F%2Fedamontology.org%2Ftopic_2640\",        \"@context\": {             \"self\": \"http://www.w3.org/2002/07/owl#Class\",              \"ontology\": \"http://data.bioontology.org/metadata/Ontology\",            \"children\": \"http://www.w3.org/2002/07/owl#Class\",              \"parents\": \"http://www.w3.org/2002/07/owl#Class\",           \"descendants\": \"http://www.w3.org/2002/07/owl#Class\",           \"ancestors\": \"http://www.w3.org/2002/07/owl#Class\",             \"tree\": \"http://www.w3.org/2002/07/owl#Class\",              \"notes\": \"http://data.bioontology.org/metadata/Note\",           \"mappings\": \"http://data.bioontology.org/metadata/Mapping\",             \"ui\": \"http://www.w3.org/2002/07/owl#Class\"         }   },          \"@context\": {             \"@vocab\": \"http://data.bioontology.org/metadata/\"       }   },      \"hierarchy\": [ ],     \"annotations\": [              {               \"from\": 1,                \"to\": 6,                  \"matchType\": \"SYN\",                 \"text\": \"CANCER\"            }       ],          \"mappings\": [ ]   },      {   \"annotatedClass\": {       \"@id\": \"http://purl.bioontology.org/ontology/MSHFRE/D009369\",       \"@type\": \"http://www.w3.org/2002/07/owl#Class\",     \"links\": {        \"self\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369\",         \"ontology\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE\",         \"children\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369/children\",        \"parents\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369/parents\",          \"descendants\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369/descendants\",          \"ancestors\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369/ancestors\",          \"tree\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369/tree\",        \"notes\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369/notes\",          \"mappings\": \"http://bioportal.lirmm.fr:8082/ontologies/MSHFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369/mappings\",        \"ui\": \"http://http://bioportal.lirmm.fr/ontologies/MSHFRE?p=classes&conceptid=http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMSHFRE%2FD009369\",         \"@context\": {             \"self\": \"http://www.w3.org/2002/07/owl#Class\",              \"ontology\": \"http://data.bioontology.org/metadata/Ontology\",            \"children\": \"http://www.w3.org/2002/07/owl#Class\",              \"parents\": \"http://www.w3.org/2002/07/owl#Class\",           \"descendants\": \"http://www.w3.org/2002/07/owl#Class\",           \"ancestors\": \"http://www.w3.org/2002/07/owl#Class\",             \"tree\": \"http://www.w3.org/2002/07/owl#Class\",              \"notes\": \"http://data.bioontology.org/metadata/Note\",           \"mappings\": \"http://data.bioontology.org/metadata/Mapping\",             \"ui\": \"http://www.w3.org/2002/07/owl#Class\"         }   },          \"@context\": {             \"@vocab\": \"http://data.bioontology.org/metadata/\"       }   },      \"hierarchy\": [ ],     \"annotations\": [              {               \"from\": 1,                \"to\": 6,                  \"matchType\": \"SYN\",                 \"text\": \"CANCER\"            }       ],          \"mappings\": [ ]   },      {   \"annotatedClass\": {       \"@id\": \"http://purl.bioontology.org/ontology/MDRFRE/10007050\",          \"@type\": \"http://www.w3.org/2002/07/owl#Class\",     \"links\": {        \"self\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050\",        \"ontology\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE\",         \"children\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050/children\",       \"parents\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050/parents\",         \"descendants\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050/descendants\",         \"ancestors\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050/ancestors\",         \"tree\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050/tree\",       \"notes\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050/notes\",         \"mappings\": \"http://bioportal.lirmm.fr:8082/ontologies/MDRFRE/classes/http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050/mappings\",       \"ui\": \"http://http://bioportal.lirmm.fr/ontologies/MDRFRE?p=classes&conceptid=http%3A%2F%2Fpurl.bioontology.org%2Fontology%2FMDRFRE%2F10007050\",        \"@context\": {             \"self\": \"http://www.w3.org/2002/07/owl#Class\",              \"ontology\": \"http://data.bioontology.org/metadata/Ontology\",            \"children\": \"http://www.w3.org/2002/07/owl#Class\",              \"parents\": \"http://www.w3.org/2002/07/owl#Class\",           \"descendants\": \"http://www.w3.org/2002/07/owl#Class\",           \"ancestors\": \"http://www.w3.org/2002/07/owl#Class\",             \"tree\": \"http://www.w3.org/2002/07/owl#Class\",              \"notes\": \"http://data.bioontology.org/metadata/Note\",           \"mappings\": \"http://data.bioontology.org/metadata/Mapping\",             \"ui\": \"http://www.w3.org/2002/07/owl#Class\"         }   },          \"@context\": {             \"@vocab\": \"http://data.bioontology.org/metadata/\"       }   },      \"hierarchy\": [ ],     \"annotations\": [              {               \"from\": 1,                \"to\": 6,                  \"matchType\": \"PREF\",                \"text\": \"CANCER\"            }       ],          \"mappings\": [ ]   },      {   \"annotatedClass\": {       \"@id\": \"http://chu-rouen.fr/cismef/SNOMED_int.#M-80003\",        \"@type\": \"http://www.w3.org/2002/07/owl#Class\",     \"links\": {        \"self\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003\",         \"ontology\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE\",        \"children\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003/children\",        \"parents\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003/parents\",          \"descendants\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003/descendants\",          \"ancestors\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003/ancestors\",          \"tree\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003/tree\",        \"notes\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003/notes\",          \"mappings\": \"http://bioportal.lirmm.fr:8082/ontologies/SNMIFRE/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003/mappings\",        \"ui\": \"http://http://bioportal.lirmm.fr/ontologies/SNMIFRE?p=classes&conceptid=http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FSNOMED_int.%23M-80003\",         \"@context\": {             \"self\": \"http://www.w3.org/2002/07/owl#Class\",              \"ontology\": \"http://data.bioontology.org/metadata/Ontology\",            \"children\": \"http://www.w3.org/2002/07/owl#Class\",              \"parents\": \"http://www.w3.org/2002/07/owl#Class\",           \"descendants\": \"http://www.w3.org/2002/07/owl#Class\",           \"ancestors\": \"http://www.w3.org/2002/07/owl#Class\",             \"tree\": \"http://www.w3.org/2002/07/owl#Class\",              \"notes\": \"http://data.bioontology.org/metadata/Note\",           \"mappings\": \"http://data.bioontology.org/metadata/Mapping\",             \"ui\": \"http://www.w3.org/2002/07/owl#Class\"         }   },          \"@context\": {             \"@vocab\": \"http://data.bioontology.org/metadata/\"       }   },      \"hierarchy\": [ ],     \"annotations\": [              {               \"from\": 1,                \"to\": 6,                  \"matchType\": \"SYN\",                 \"text\": \"CANCER\"            }       ],          \"mappings\": [ ]   },      {   \"annotatedClass\": {       \"@id\": \"http://chu-rouen.fr/cismef/MedlinePlus#T25\",        \"@type\": \"http://www.w3.org/2002/07/owl#Class\",     \"links\": {        \"self\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25\",         \"ontology\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS\",        \"children\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25/children\",        \"parents\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25/parents\",          \"descendants\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25/descendants\",          \"ancestors\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25/ancestors\",          \"tree\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25/tree\",        \"notes\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25/notes\",          \"mappings\": \"http://bioportal.lirmm.fr:8082/ontologies/MEDLINEPLUS/classes/http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25/mappings\",        \"ui\": \"http://http://bioportal.lirmm.fr/ontologies/MEDLINEPLUS?p=classes&conceptid=http%3A%2F%2Fchu-rouen.fr%2Fcismef%2FMedlinePlus%23T25\",         \"@context\": {             \"self\": \"http://www.w3.org/2002/07/owl#Class\",              \"ontology\": \"http://data.bioontology.org/metadata/Ontology\",            \"children\": \"http://www.w3.org/2002/07/owl#Class\",              \"parents\": \"http://www.w3.org/2002/07/owl#Class\",           \"descendants\": \"http://www.w3.org/2002/07/owl#Class\",           \"ancestors\": \"http://www.w3.org/2002/07/owl#Class\",             \"tree\": \"http://www.w3.org/2002/07/owl#Class\",              \"notes\": \"http://data.bioontology.org/metadata/Note\",           \"mappings\": \"http://data.bioontology.org/metadata/Mapping\",             \"ui\": \"http://www.w3.org/2002/07/owl#Class\"         }   },          \"@context\": {             \"@vocab\": \"http://data.bioontology.org/metadata/\"       }   },      \"hierarchy\": [ ],     \"annotations\": [                  {                   \"from\": 1,                    \"to\": 6,                      \"matchType\": \"PREF\",                    \"text\": \"CANCER\"                }           ],              \"mappings\": [ ]   }  ]";
    
    @Test
    public void testJson2Rdf(){
        JSON jsonInput = new JSON(jsonArrayStr);
        String rdfOutput = JsonToRdf.convert(jsonInput);
        
        // TODO: test RDF output
        Assert.assertNotNull("returned rdf is null", rdfOutput);
    }

}
