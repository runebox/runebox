package com.jagex.oldscape.pub;

import java.net.URL;
import java.util.Map;
import java.util.concurrent.Future;

public interface OtlTokenRequester {
    Future<OtlTokenResponse> request(String var1, URL var2, Map<String, String> var3, String var4);
}
