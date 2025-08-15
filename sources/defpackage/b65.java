package defpackage;

import java.io.InputStream;

/* renamed from: b65  reason: default package */
public final class b65 extends x55 {
    public b65(byte[] bArr) {
        super(bArr);
        this.a.mark(Integer.MAX_VALUE);
    }

    public final void d(long j) {
        int i = this.c;
        if (((long) i) > j) {
            this.c = 0;
            this.a.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }

    public b65(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
