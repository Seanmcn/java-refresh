public class Json implements Format {
    @Override
    public void printData() {
        // Data from https://oc-index.library.ubc.ca/collections/berkpost/items/1.0001623/output-format/json
        System.out.println("{\n" +
                "    \"CatalogueRecord\": [\n" +
                "        {\n" +
                "            \"label\": \"Catalogue Record\",\n" +
                "            \"value\": \"http:\\/\\/webcat2.library.ubc.ca\\/vwebv\\/holdingsInfo?bibId=2503105\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/isReferencedBy\",\n" +
                "                \"classmap\": \"edm:ProvidedCHO\",\n" +
                "                \"property\": \"dcterms:isReferencedBy\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/isReferencedBy\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; A related resource that references, cites, or otherwise points to the described resource.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Collection\": [\n" +
                "        {\n" +
                "            \"label\": \"Is Part Of\",\n" +
                "            \"value\": \"Berkeley Poster Collection\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/isPartOf\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:isPartOf\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/isPartOf\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; A related resource in which the described resource is physically or logically included.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Creator\": [\n" +
                "        {\n" +
                "            \"label\": \"Creator\",\n" +
                "            \"value\": \"[Unknown]\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/creator\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:creator\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/creator\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; An entity primarily responsible for making the resource.; Examples of a Contributor include a person, an organization, or a service.\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"label\": \"Creator\",\n" +
                "            \"value\": \"Carson-Morris\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/creator\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:creator\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/creator\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; An entity primarily responsible for making the resource.; Examples of a Contributor include a person, an organization, or a service.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Date\": [\n" +
                "        {\n" +
                "            \"label\": \"Sort Date\",\n" +
                "            \"value\": \"1973\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/elements\\/1.1\\/date\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dc:date\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/elements\\/1.1\\/date\",\n" +
                "            \"explain\": \"A Dublin Core Elements Property; A point or period of time associated with an event in the lifecycle of the resource.; Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF].\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"DateAvailable\": [\n" +
                "        {\n" +
                "            \"label\": \"Date Available\",\n" +
                "            \"value\": \"2009-02-01\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/issued\",\n" +
                "                \"classmap\": \"edm:WebResource\",\n" +
                "                \"property\": \"dcterms:issued\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/issued\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; Date of formal issuance (e.g., publication) of the resource.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"DateCreated\": [\n" +
                "        {\n" +
                "            \"label\": \"Date Created\",\n" +
                "            \"value\": \"[between 1968 and 1973?]\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/created\",\n" +
                "                \"classmap\": \"oc:SourceResource\",\n" +
                "                \"property\": \"dcterms:created\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/created\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; Date of creation of the resource.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Description\": [\n" +
                "        {\n" +
                "            \"label\": \"Description\",\n" +
                "            \"value\": \"Image of American one dollar bill and text on front page.\\nThe back page is a manufactured mass media poster of a calendar for the months of January to March.\\nThe production date of the back page states 1967.\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/description\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:description\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/description\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; An account of the resource.; Description may include but is not limited to: an abstract, a table of contents, a graphical representation, or a free-text account of the resource.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"DigitalResourceOriginalRecord\": [\n" +
                "        {\n" +
                "            \"label\": \"Digital Resource Original Record\",\n" +
                "            \"value\": \"https:\\/\\/open.library.ubc.ca\\/collections\\/berkpost\\/items\\/1.0001623\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/www.europeana.eu\\/schemas\\/edm\\/aggregatedCHO\",\n" +
                "                \"classmap\": \"ore:Aggregation\",\n" +
                "                \"property\": \"edm:aggregatedCHO\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/www.europeana.eu\\/schemas\\/edm\\/aggregatedCHO\",\n" +
                "            \"explain\": \"A Europeana Data Model Property; The identifier of the source object, e.g. the Mona Lisa itself. This could be a full linked open date URI or an internal identifier\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Extent\": [\n" +
                "        {\n" +
                "            \"label\": \"Extent\",\n" +
                "            \"value\": \"2 posters on 1 sheet ; 56 x 36 cm\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/extent\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:extent\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/extent\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; The size or duration of the resource.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"FileFormat\": [\n" +
                "        {\n" +
                "            \"label\": \"Format\",\n" +
                "            \"value\": \"image\\/jpeg\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/elements\\/1.1\\/format\",\n" +
                "                \"classmap\": \"edm:WebResource\",\n" +
                "                \"property\": \"dc:format\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/elements\\/1.1\\/format\",\n" +
                "            \"explain\": \"A Dublin Core Elements Property; The file format, physical medium, or dimensions of the resource.; Examples of dimensions include size and duration. Recommended best practice is to use a controlled vocabulary such as the list of Internet Media Types [MIME].\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Genre\": [\n" +
                "        {\n" +
                "            \"label\": \"Genre\",\n" +
                "            \"value\": \"Posters\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/www.europeana.eu\\/schemas\\/edm\\/hasType\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"edm:hasType\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/www.europeana.eu\\/schemas\\/edm\\/hasType\",\n" +
                "            \"explain\": \"A Europeana Data Model Property; This property relates a resource with the concepts it belongs to in a suitable type system such as MIME or any thesaurus that captures categories of objects in a given field. It does NOT capture aboutness\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Identifier\": [\n" +
                "        {\n" +
                "            \"label\": \"UBC Call Number\",\n" +
                "            \"value\": \"SPAM96.P\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/identifier\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:identifier\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/identifier\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; An unambiguous reference to the resource within a given context.; Recommended best practice is to identify the resource by means of a string conforming to a formal identification system.\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"label\": \"Digital Identifier\",\n" +
                "            \"value\": \"Berkeley_28_138 and Berkeley_28_138_verso\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/identifier\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:identifier\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/identifier\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; An unambiguous reference to the resource within a given context.; Recommended best practice is to identify the resource by means of a string conforming to a formal identification system.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"IsShownAt\": [\n" +
                "        {\n" +
                "            \"label\": \"DOI\",\n" +
                "            \"value\": \"10.14288\\/1.0001623\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/www.europeana.eu\\/schemas\\/edm\\/isShownAt\",\n" +
                "                \"classmap\": \"edm:WebResource\",\n" +
                "                \"property\": \"edm:isShownAt\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/www.europeana.eu\\/schemas\\/edm\\/isShownAt\",\n" +
                "            \"explain\": \"A Europeana Data Model Property; An unambiguous URL reference to the digital object on the provider\\u2019s website in its full information context.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Language\": [\n" +
                "        {\n" +
                "            \"label\": \"Language\",\n" +
                "            \"value\": \"English\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/language\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:language\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/language\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; A language of the resource.; Recommended best practice is to use a controlled vocabulary such as RFC 4646 [RFC4646].\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Notes\": [\n" +
                "        {\n" +
                "            \"label\": \"Notes\",\n" +
                "            \"value\": \"Green painted print on back of lithographic poster ; unknown creator for front page ; back page created by Carson-Morris and published by Images Inc.\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/www.w3.org\\/2009\\/08\\/skos-reference\\/skos.html#note\",\n" +
                "                \"classmap\": \"skos:Concept\",\n" +
                "                \"property\": \"skos:note\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/www.w3.org\\/2009\\/08\\/skos-reference\\/skos.html#note\",\n" +
                "            \"explain\": \"Simple Knowledge Organisation System; Notes are used to provide information relating to SKOS concepts. There is no restriction on the nature of this information, e.g., it could be plain text, hypertext, or an image; it could be a definition, information about the scope of a concept, editorial information, or any other type of information.\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"label\": \"Provenance\",\n" +
                "            \"value\": \"Donated from Helmut Jung in 1979\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/www.w3.org\\/2009\\/08\\/skos-reference\\/skos.html#note\",\n" +
                "                \"classmap\": \"skos:Concept\",\n" +
                "                \"property\": \"skos:note\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/www.w3.org\\/2009\\/08\\/skos-reference\\/skos.html#note\",\n" +
                "            \"explain\": \"Simple Knowledge Organisation System; Notes are used to provide information relating to SKOS concepts. There is no restriction on the nature of this information, e.g., it could be plain text, hypertext, or an image; it could be a definition, information about the scope of a concept, editorial information, or any other type of information.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"PersonOrCorporation\": [\n" +
                "        {\n" +
                "            \"label\": \"Personal Names\",\n" +
                "            \"value\": \"Washington, George, 1732-1799\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/subject\",\n" +
                "                \"classmap\": \"oc:PublicationDescription\",\n" +
                "                \"property\": \"dcterms:subject\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/subject\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; The topic of the resource.; Typically, the subject will be represented using keywords, key phrases, or classification codes. Recommended best practice is to use a controlled vocabulary.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Publisher\": [\n" +
                "        {\n" +
                "            \"label\": \"Publisher - Original\",\n" +
                "            \"value\": \"[Unknown] ; [San Fransisco] : Images Inc.\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/publisher\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:publisher\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/publisher\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; An entity responsible for making the resource available.; Examples of a Publisher include a person, an organization, or a service.\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"label\": \"Publisher - Digital\",\n" +
                "            \"value\": \"Vancouver : University of British Columbia Library\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/publisher\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:publisher\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/publisher\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; An entity responsible for making the resource available.; Examples of a Publisher include a person, an organization, or a service.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Rights\": [\n" +
                "        {\n" +
                "            \"label\": \"Rights\",\n" +
                "            \"value\": \"Images provided for research and reference use only. Permission to publish, copy or otherwise use these images must be obtained from Rare Books and Special Collections: http:\\/\\/rbsc.library.ubc.ca\\/\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/rights\",\n" +
                "                \"classmap\": \"edm:WebResource\",\n" +
                "                \"property\": \"dcterms:rights\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/rights\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; Information about rights held in and over the resource.; Typically, rights information includes a statement about various property rights associated with the resource, including intellectual property rights.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"SortDate\": [\n" +
                "        {\n" +
                "            \"label\": \"Sort Date\",\n" +
                "            \"value\": \"1973-12-31 AD\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/elements\\/1.1\\/date\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/elements\\/1.1\\/date\",\n" +
                "            \"explain\": \"A Dublin Core Elements Property; A point or period of time associated with an event in the lifecycle of the resource.; Date may be used to express temporal information at any level of granularity. Recommended best practice is to use an encoding scheme, such as the W3CDTF profile of ISO 8601 [W3CDTF].\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Source\": [\n" +
                "        {\n" +
                "            \"label\": \"Source\",\n" +
                "            \"value\": \"Original Format: University of British Columbia. Library. Rare Books and Special Collections. Berkeley Poster Collection\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/source\",\n" +
                "                \"classmap\": \"oc:SourceResource\",\n" +
                "                \"property\": \"dcterms:source\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/source\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; A related resource from which the described resource is derived.; The described resource may be derived from the related resource in whole or in part. Recommended best practice is to identify the related resource by means of a string conforming to a formal identification system.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Title\": [\n" +
                "        {\n" +
                "            \"label\": \"Title\",\n" +
                "            \"value\": \"[Money talks: Boycott war profiteers] and [Psychedelic calendar]\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/title\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:title\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/title\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; TA name given to the resource.\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Type\": [\n" +
                "        {\n" +
                "            \"label\": \"Type\",\n" +
                "            \"value\": \"Still Image\",\n" +
                "            \"attrs\": {\n" +
                "                \"lang\": \"en\",\n" +
                "                \"ns\": \"http:\\/\\/purl.org\\/dc\\/terms\\/type\",\n" +
                "                \"classmap\": \"dpla:SourceResource\",\n" +
                "                \"property\": \"dcterms:type\"\n" +
                "            },\n" +
                "            \"iri\": \"http:\\/\\/purl.org\\/dc\\/terms\\/type\",\n" +
                "            \"explain\": \"A Dublin Core Terms Property; The nature or genre of the resource.; Recommended best practice is to use a controlled vocabulary such as the DCMI Type Vocabulary [DCMITYPE]. To describe the file format, physical medium, or dimensions of the resource, use the Format element.\"\n" +
                "        }\n" +
                "    ]\n" +
                "}");
    }


}
