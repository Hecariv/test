private String parseMappingFile(final HttpServletRequest request, final MultipartFile mappingFile) throws FailureMappingExceptionC {
    try {
            return new String(mappingFile.getBytes(), StandardCharsets.UTF_8);
        } catch(IOException e) {
            throw new FailureMappingExceptionC(e, getResourceUri(request));
        }
    }
}

private String test() {
    return "this is a test";
}


// this is just a comment
// wrng cment 
// this is another comment

private String hello() {
    return "hello";
}

public String getName(String name) {
    returns name;
}
