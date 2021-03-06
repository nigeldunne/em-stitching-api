package uk.gov.hmcts.reform.em.stitching.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DmStoreUriFormatter {

    private final String dmStoreAppBaseUrl;

    public DmStoreUriFormatter(@Value("${dm-store-app.base-url}") String dmStoreAppBaseUrl) {
        this.dmStoreAppBaseUrl = dmStoreAppBaseUrl;
    }

    public String formatDmStoreUri(String s) {
        if (s.contains("/documents/")) {
            s = s.substring(s.indexOf("/documents/"));
            s = this.dmStoreAppBaseUrl + s;
        }
        return s;
    }

}
