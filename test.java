private String parseMappingFile(final HttpServletRequest request, final MultipartFile mappingFile) throws FailureMappingExceptionC {
    if (!MediaType.APPLICATION_JSON_VALUE.equals(mappingFile.getContentType())) {
            final String errMsg = MessageFormatterUtil.format("The file '{}' is not a json file!", mappingFile.getOriginalFilename());
            throw new FailureMappingExceptionC(errMsg, getResourceUri(request));
    }
    try {
        return new String(mappingFile.getBytes());
    } catch (IOException e) {
       throw new FailureMappingExceptionC(e, getResourceUri(request));
    }
}

//private String test() {
//    return "this is a test";
//}


// this is just a comment
// wrong comment 


private String hello() {
    return "hello";
}

public String getName(String firstName) {
    returns firstName;
}
