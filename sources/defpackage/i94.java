package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: i94  reason: default package */
public final class i94 implements r24 {
    public tt X;
    public us3 Y;
    public r24 Z;
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final r24 c;
    public ug5 o;
    public q4f s0;
    public n24 t0;
    public l5c u0;
    public r24 v0;

    public i94(Context context, r24 r24) {
        this.a = context.getApplicationContext();
        r24.getClass();
        this.c = r24;
    }

    public static void c(r24 r24, y0f y0f) {
        if (r24 != null) {
            r24.N(y0f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [ji0, ug5, r24] */
    /* JADX WARNING: type inference failed for: r0v18, types: [ji0, n24, r24] */
    public final long L(z24 z24) {
        np8.f(this.v0 == null);
        String scheme = z24.a.getScheme();
        int i = maf.a;
        Uri uri = z24.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.o == null) {
                    ? ji0 = new ji0(false);
                    this.o = ji0;
                    b(ji0);
                }
                this.v0 = this.o;
            } else {
                if (this.X == null) {
                    tt ttVar = new tt(context);
                    this.X = ttVar;
                    b(ttVar);
                }
                this.v0 = this.X;
            }
        } else if ("asset".equals(scheme)) {
            if (this.X == null) {
                tt ttVar2 = new tt(context);
                this.X = ttVar2;
                b(ttVar2);
            }
            this.v0 = this.X;
        } else if ("content".equals(scheme)) {
            if (this.Y == null) {
                us3 us3 = new us3(context);
                this.Y = us3;
                b(us3);
            }
            this.v0 = this.Y;
        } else {
            boolean equals = "rtmp".equals(scheme);
            r24 r24 = this.c;
            if (equals) {
                if (this.Z == null) {
                    try {
                        r24 r242 = (r24) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                        this.Z = r242;
                        b(r242);
                    } catch (ClassNotFoundException unused) {
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.Z == null) {
                        this.Z = r24;
                    }
                }
                this.v0 = this.Z;
            } else if ("udp".equals(scheme)) {
                if (this.s0 == null) {
                    q4f q4f = new q4f();
                    this.s0 = q4f;
                    b(q4f);
                }
                this.v0 = this.s0;
            } else if ("data".equals(scheme)) {
                if (this.t0 == null) {
                    ? ji02 = new ji0(false);
                    this.t0 = ji02;
                    b(ji02);
                }
                this.v0 = this.t0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.u0 == null) {
                    l5c l5c = new l5c(context);
                    this.u0 = l5c;
                    b(l5c);
                }
                this.v0 = this.u0;
            } else {
                this.v0 = r24;
            }
        }
        return this.v0.L(z24);
    }

    public final void N(y0f y0f) {
        y0f.getClass();
        this.c.N(y0f);
        this.b.add(y0f);
        c(this.o, y0f);
        c(this.X, y0f);
        c(this.Y, y0f);
        c(this.Z, y0f);
        c(this.s0, y0f);
        c(this.t0, y0f);
        c(this.u0, y0f);
    }

    public final Map a() {
        r24 r24 = this.v0;
        return r24 == null ? Collections.emptyMap() : r24.a();
    }

    public final void b(r24 r24) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                r24.N((y0f) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void close() {
        r24 r24 = this.v0;
        if (r24 != null) {
            try {
                r24.close();
            } finally {
                this.v0 = null;
            }
        }
    }

    public final Uri getUri() {
        r24 r24 = this.v0;
        if (r24 == null) {
            return null;
        }
        return r24.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        r24 r24 = this.v0;
        r24.getClass();
        return r24.read(bArr, i, i2);
    }
}
