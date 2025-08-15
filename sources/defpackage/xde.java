package defpackage;

import java.io.Closeable;

/* renamed from: xde  reason: default package */
public interface xde extends Closeable {
    k36 getReadableDatabase();

    k36 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
