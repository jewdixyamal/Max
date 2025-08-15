package defpackage;

import android.net.Uri;

/* renamed from: ao0  reason: default package */
public interface ao0 {
    bm7 B(byte[] bArr);

    bm7 u(Uri uri);

    bm7 v(gd8 gd8) {
        byte[] bArr = gd8.k;
        if (bArr != null) {
            return B(bArr);
        }
        Uri uri = gd8.m;
        if (uri != null) {
            return u(uri);
        }
        return null;
    }
}
