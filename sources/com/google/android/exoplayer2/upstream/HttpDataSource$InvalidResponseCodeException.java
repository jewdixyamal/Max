package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.util.Map;

public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final int c;
    public final Map o;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, z24 z24) {
        super(z7b.h(26, i, "Response code: "), (IOException) dataSourceException, z24, 2004);
        this.c = i;
        this.o = map;
    }
}
