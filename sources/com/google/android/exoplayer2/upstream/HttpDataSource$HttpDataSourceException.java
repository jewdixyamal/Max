package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public HttpDataSource$HttpDataSourceException(String str, z24 z24, int i) {
        super(str, a(i, 1));
    }

    public static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static HttpDataSource$HttpDataSourceException b(IOException iOException, z24 z24, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !lz7.T(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$HttpDataSourceException("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, z24, 2007) : new HttpDataSource$HttpDataSourceException(iOException, z24, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, z24 z24, int i, int i2) {
        super((Throwable) iOException, a(i, i2));
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, z24 z24, int i) {
        super(str, iOException, a(i, 1));
    }
}
