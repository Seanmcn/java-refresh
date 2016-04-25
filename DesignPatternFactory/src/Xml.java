public class Xml implements Format {
    @Override
    public void printData() {
        // Data from https://oc-index.library.ubc.ca/collections/berkpost/items/1.0001623/output-format/xml
        System.out.println("\n" +
                "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n" +
                "         xmlns:dcterms=\"http://purl.org/dc/terms/\"\n" +
                "         xmlns:dc=\"http://purl.org/dc/elements/1.1/\"\n" +
                "         xmlns:edm=\"http://www.europeana.eu/schemas/edm/\"\n" +
                "         xmlns:skos=\"http://www.w3.org/2009/08/skos-reference/skos.html#\">\n" +
                "\n" +
                "  <rdf:Description rdf:about=\"http://dx.doi.org/10.14288/1.0001623\">\n" +
                "    <dcterms:isReferencedBy xml:lang=\"en\">http://webcat2.library.ubc.ca/vwebv/holdingsInfo?bibId=2503105</dcterms:isReferencedBy>\n" +
                "    <dcterms:isPartOf xml:lang=\"en\">Berkeley Poster Collection</dcterms:isPartOf>\n" +
                "    <dcterms:creator xml:lang=\"en\">[Unknown]</dcterms:creator>\n" +
                "    <dcterms:creator xml:lang=\"en\">Carson-Morris</dcterms:creator>\n" +
                "    <dc:date xml:lang=\"en\">1973</dc:date>\n" +
                "    <dcterms:issued xml:lang=\"en\">2009-02-01</dcterms:issued>\n" +
                "    <dcterms:created xml:lang=\"en\">[between 1968 and 1973?]</dcterms:created>\n" +
                "    <dcterms:description xml:lang=\"en\">Image of American one dollar bill and text on front page.\n" +
                "The back page is a manufactured mass media poster of a calendar for the months of January to March.\n" +
                "The production date of the back page states 1967.</dcterms:description>\n" +
                "    <edm:aggregatedCHO xml:lang=\"en\">https://open.library.ubc.ca/collections/berkpost/items/1.0001623</edm:aggregatedCHO>\n" +
                "    <dcterms:extent xml:lang=\"en\">2 posters on 1 sheet ; 56 x 36 cm</dcterms:extent>\n" +
                "    <dc:format xml:lang=\"en\">image/jpeg</dc:format>\n" +
                "    <edm:hasType xml:lang=\"en\">Posters</edm:hasType>\n" +
                "    <dcterms:identifier xml:lang=\"en\">SPAM96.P</dcterms:identifier>\n" +
                "    <dcterms:identifier xml:lang=\"en\">Berkeley_28_138 and Berkeley_28_138_verso</dcterms:identifier>\n" +
                "    <edm:isShownAt xml:lang=\"en\">10.14288/1.0001623</edm:isShownAt>\n" +
                "    <dcterms:language xml:lang=\"en\">English</dcterms:language>\n" +
                "    <skos:note xml:lang=\"en\">Green painted print on back of lithographic poster ; unknown creator for front page ; back page created by Carson-Morris and published by Images Inc.</skos:note>\n" +
                "    <skos:note xml:lang=\"en\">Donated from Helmut Jung in 1979</skos:note>\n" +
                "    <dcterms:subject xml:lang=\"en\">Washington, George, 1732-1799</dcterms:subject>\n" +
                "    <dcterms:publisher xml:lang=\"en\">[Unknown] ; [San Fransisco] : Images Inc.</dcterms:publisher>\n" +
                "    <dcterms:publisher xml:lang=\"en\">Vancouver : University of British Columbia Library</dcterms:publisher>\n" +
                "    <dcterms:rights xml:lang=\"en\">Images provided for research and reference use only. Permission to publish, copy or otherwise use these images must be obtained from Rare Books and Special Collections: http://rbsc.library.ubc.ca/</dcterms:rights>\n" +
                "    <dcterms:source xml:lang=\"en\">Original Format: University of British Columbia. Library. Rare Books and Special Collections. Berkeley Poster Collection</dcterms:source>\n" +
                "    <dcterms:title xml:lang=\"en\">[Money talks: Boycott war profiteers] and [Psychedelic calendar]</dcterms:title>\n" +
                "    <dcterms:type xml:lang=\"en\">Still Image</dcterms:type>\n" +
                "  </rdf:Description>\n" +
                "\n" +
                "</rdf:RDF>\n");
    }
}
