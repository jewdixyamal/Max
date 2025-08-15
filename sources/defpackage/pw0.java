package defpackage;

import java.io.File;

/* renamed from: pw0  reason: default package */
public final class pw0 {
    public final File a;
    public final long b;
    public final long c;
    public final gx0 d;

    public pw0(File file, gx0 gx0) {
        this.a = file;
        this.b = file.length();
        this.c = file.lastModified();
        this.d = gx0;
    }

    public final String toString() {
        return "CacheEntry{file=" + this.a + ", length=" + this.b + ", lastModified=" + this.c + ", cacheType=" + this.d + '}';
    }
}
