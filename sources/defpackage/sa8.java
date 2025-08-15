package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;

/* renamed from: sa8  reason: default package */
public final class sa8 implements t24 {
    public final t24 a;
    public sa4 b;

    public sa8(Context context, Uri uri) {
        this.a = new j94(context);
        G(new a34(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 0, (Object) null));
    }

    public final long G(a34 a34) {
        long G = this.a.G(a34);
        this.b = new sa4(this, a34.f, G != -1 ? a34.f + G : G);
        return G;
    }

    public final void H(z0f z0f) {
        this.a.H(z0f);
    }

    public final void close() {
        this.b = null;
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
