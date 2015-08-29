package org.chodavarapu.datamill.http;

import rx.Observable;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public interface ResponseBuilder {
    Observable<Response> noContent();
    Observable<Response> notFound();
    Observable<Response> ok();
}
