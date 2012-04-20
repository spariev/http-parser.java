package http_parser;

/**
 * Special interface for headers_complete callback.
 * This is somewhat different than other callbacks because if the user returns 1, we
 * will interpret that as saying that this message has no body. This
 * is needed for the annoying case of receiving a response to a HEAD
 * request.
 */
public abstract class HTTPHeadersCompleteCallback extends HTTPCallback
    implements http_parser.lolevel.HTTPHeadersCompleteCallback{

}
