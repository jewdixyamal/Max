package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: j94  reason: default package */
public final class j94 implements t24 {
    public ut X;
    public vs3 Y;
    public t24 Z;
    public final Context a;
    public final ArrayList b;
    public final t24 c;
    public vg5 o;
    public r4f s0;
    public o24 t0;
    public m5c u0;
    public t24 v0;

    public j94(Context context) {
        this(context, new nb4((String) null, 8000, 8000, false, new imc(21)));
    }

    public static void c(t24 t24, z0f z0f) {
        if (t24 != null) {
            t24.H(z0f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [ki0, vg5, t24] */
    /* JADX WARNING: type inference failed for: r0v18, types: [o24, ki0, t24] */
    public final long G(a34 a34) {
        fm9.k(this.v0 == null);
        String scheme = a34.a.getScheme();
        int i = oaf.a;
        Uri uri = a34.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.o == null) {
                    ? ki0 = new ki0(false);
                    this.o = ki0;
                    b(ki0);
                }
                this.v0 = this.o;
            } else {
                if (this.X == null) {
                    ut utVar = new ut(context);
                    this.X = utVar;
                    b(utVar);
                }
                this.v0 = this.X;
            }
        } else if ("asset".equals(scheme)) {
            if (this.X == null) {
                ut utVar2 = new ut(context);
                this.X = utVar2;
                b(utVar2);
            }
            this.v0 = this.X;
        } else if ("content".equals(scheme)) {
            if (this.Y == null) {
                vs3 vs3 = new vs3(context);
                this.Y = vs3;
                b(vs3);
            }
            this.v0 = this.Y;
        } else {
            boolean equals = "rtmp".equals(scheme);
            t24 t24 = this.c;
            if (equals) {
                if (this.Z == null) {
                    try {
                        t24 t242 = (t24) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                        this.Z = t242;
                        b(t242);
                    } catch (ClassNotFoundException unused) {
                        z04.c0("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.Z == null) {
                        this.Z = t24;
                    }
                }
                this.v0 = this.Z;
            } else if ("udp".equals(scheme)) {
                if (this.s0 == null) {
                    r4f r4f = new r4f();
                    this.s0 = r4f;
                    b(r4f);
                }
                this.v0 = this.s0;
            } else if ("data".equals(scheme)) {
                if (this.t0 == null) {
                    ? ki02 = new ki0(false);
                    this.t0 = ki02;
                    b(ki02);
                }
                this.v0 = this.t0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.u0 == null) {
                    m5c m5c = new m5c(context);
                    this.u0 = m5c;
                    b(m5c);
                }
                this.v0 = this.u0;
            } else {
                this.v0 = t24;
            }
        }
        return this.v0.G(a34);
    }

    public final void H(z0f z0f) {
        z0f.getClass();
        this.c.H(z0f);
        this.b.add(z0f);
        c(this.o, z0f);
        c(this.X, z0f);
        c(this.Y, z0f);
        c(this.Z, z0f);
        c(this.s0, z0f);
        c(this.t0, z0f);
        c(this.u0, z0f);
    }

    public final Map a() {
        t24 t24 = this.v0;
        return t24 == null ? Collections.emptyMap() : t24.a();
    }

    public final void b(t24 t24) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                t24.H((z0f) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void close() {
        t24 t24 = this.v0;
        if (t24 != null) {
            try {
                t24.close();
            } finally {
                this.v0 = null;
            }
        }
    }

    public final Uri getUri() {
        t24 t24 = this.v0;
        if (t24 == null) {
            return null;
        }
        return t24.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        t24 t24 = this.v0;
        t24.getClass();
        return t24.read(bArr, i, i2);
    }

    public j94(Context context, t24 t24) {
        this.a = context.getApplicationContext();
        t24.getClass();
        this.c = t24;
        this.b = new ArrayList();
    }
}
