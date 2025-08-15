package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* renamed from: ek5  reason: default package */
public final class ek5 implements kq6 {
    public static final rl8 d;
    public static final rl8 e;
    public static final Pattern f = Pattern.compile("^([0-9]+)-([0-9]+)/([0-9]+)");
    public final je7 a;
    public final khe b;
    public final w0f c;

    static {
        rl8 rl8;
        Pattern pattern = rl8.d;
        rl8 rl82 = null;
        try {
            rl8 = fm9.A("application/x-binary; charset=x-user-defined");
        } catch (IllegalArgumentException unused) {
            rl8 = null;
        }
        d = rl8;
        try {
            rl82 = fm9.A("application/octet-stream");
        } catch (IllegalArgumentException unused2) {
        }
        e = rl82;
        try {
            fm9.A("multipart/form-data");
        } catch (IllegalArgumentException unused3) {
        }
    }

    public ek5(je7 je7, w0f w0f) {
        this.a = je7;
        this.c = w0f;
        this.b = new khe(new z30(13, je7));
    }

    public static void a(ek5 ek5, pad pad, boolean z, String str) {
        pad.d = z;
        pad.e = str;
        w0f w0f = ek5.c;
        pad.g = w0f.b();
        w0f.a(pad.a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long c(defpackage.yic r4) {
        /*
            r0 = 0
            java.lang.String r1 = "X-Reason"
            cj6 r2 = r4.Y     // Catch:{ Exception -> 0x000c }
            java.lang.String r1 = r2.a(r1)     // Catch:{ Exception -> 0x000c }
            if (r1 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            int r4 = r4.o
            eq6 r4 = defpackage.nu0.j(r4, r1)
            eq6 r1 = defpackage.nu0.b
            boolean r1 = r1.equals(r4)
            java.lang.String r2 = "ek5"
            if (r1 != 0) goto L_0x005b
            eq6 r1 = defpackage.nu0.c
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0026
            goto L_0x005b
        L_0x0026:
            eq6 r1 = defpackage.nu0.Z
            boolean r1 = r1.equals(r4)
            r3 = 1
            if (r1 != 0) goto L_0x004b
            eq6 r1 = defpackage.nu0.X
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0038
            goto L_0x004b
        L_0x0038:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r3 = "getErrorUploadPositionFromResponse"
            defpackage.hm9.k0(r2, r0, r3, r1)
            ck5 r0 = new ck5
            r0.<init>(r4)
            throw r0
        L_0x004b:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r1 = "getErrorUploadPositionFromResponse forbidden or bad request"
            defpackage.hm9.k0(r2, r0, r1, r4)
            r0 = -1
            return r0
        L_0x005b:
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r1 = "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0"
            defpackage.hm9.k0(r2, r0, r1, r4)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek5.c(yic):long");
    }

    public static long e(yic yic) {
        cj6 cj6 = yic.Y;
        String a2 = cj6.a("X-Last-Known-Byte");
        String str = null;
        if (a2 == null) {
            a2 = null;
        }
        if (a2 == null) {
            return 0;
        }
        String a3 = cj6.a("X-Last-Known-Byte");
        if (a3 != null) {
            str = a3;
        }
        try {
            return Long.parseLong(str) + 1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static void f(tq6 tq6) {
        if (!tq6.s0.get()) {
            tq6.Y.b(new nn6(1, tq6));
        }
    }

    public final mhc b(File file, String str, vq6 vq6, rl8 rl8, long j, pad pad, tq6 tq6, int i) {
        l84 l84 = new l84();
        l84.a = vq6;
        l84.Q(UUID.randomUUID().toString());
        int i2 = bh3.$EnumSwitchMapping$0[this.c.c().ordinal()];
        dk5 dk5 = new dk5(file, rl8, j, pad, tq6, (i2 == 1 || i2 == 2) ? 32768 : i2 != 3 ? 4096 : 16384);
        if (i == 5) {
            String name = TextUtils.isEmpty(str) ? file.getName() : Uri.encode(str);
            String uuid = UUID.randomUUID().toString();
            aw0 aw0 = new aw0(uuid.getBytes(a52.a));
            aw0.b = uuid;
            rl8 rl82 = rg9.l;
            ArrayList arrayList = new ArrayList();
            rl8 rl83 = rg9.l;
            if (tpa.f(rl83.b, "multipart")) {
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                mr0.a(sb, "file");
                if (name != null) {
                    sb.append("; filename=");
                    mr0.a(sb, name);
                }
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(20);
                ngg.l("Content-Disposition");
                arrayList2.add("Content-Disposition");
                arrayList2.add(w9e.b1(sb2).toString());
                Object[] array = arrayList2.toArray(new String[0]);
                if (array != null) {
                    cj6 cj6 = new cj6((String[]) array);
                    if (cj6.a(HTTP.CONTENT_TYPE) != null) {
                        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                    } else if (cj6.a(HTTP.CONTENT_LEN) == null) {
                        arrayList.add(new qg9(cj6, dk5));
                        if (!arrayList.isEmpty()) {
                            rg9 rg9 = new rg9(aw0, rl83, naf.w(arrayList));
                            Locale locale = Locale.ENGLISH;
                            String i3 = wg0.i("attachment; filename=", name);
                            ((bj6) l84.c).a("Content-type", rl83.a);
                            ((bj6) l84.c).a("Content-Disposition", i3);
                            l84.G(HttpPost.METHOD_NAME, rg9);
                            return l84.r();
                        }
                        throw new IllegalStateException("Multipart body must have at least one part.".toString());
                    } else {
                        throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalArgumentException(("multipart != " + rl83).toString());
            }
        } else {
            String num = TextUtils.isEmpty(str) ? Integer.toString(file.getName().hashCode()) : Uri.encode(str);
            Locale locale2 = Locale.ENGLISH;
            long length = file.length();
            StringBuilder k = au1.k(j, "bytes ", "-/");
            k.append(length);
            String sb3 = k.toString();
            String i4 = wg0.i("attachment; filename=", num);
            ((bj6) l84.c).a("Content-Range", sb3);
            ((bj6) l84.c).a("Content-Disposition", i4);
            l84.G(HttpPost.METHOD_NAME, dk5);
            return l84.r();
        }
    }

    public final long d(vq6 vq6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(20);
        String uuid = UUID.randomUUID().toString();
        Class<Object> cls = Object.class;
        if (uuid == null) {
            linkedHashMap.remove(cls);
        } else {
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(cls, cls.cast(uuid));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            cj6 cj6 = new cj6((String[]) array);
            byte[] bArr = naf.a;
            yic f2 = ((u2a) this.a.getValue()).b(new mhc(vq6, HttpGet.METHOD_NAME, cj6, (tfg) null, linkedHashMap.isEmpty() ? oz4.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)))).f();
            i8c i8c = f2.Z;
            try {
                if (!f2.m() || i8c == null) {
                    long c2 = c(f2);
                    if (i8c != null) {
                        i8c.close();
                    }
                    return c2;
                }
                String U = i8c.U();
                hm9.m("ek5", "getUploadPosition body result: ".concat(U), new Object[0]);
                Matcher matcher = f.matcher(U);
                if (matcher.find()) {
                    long parseLong = Long.parseLong(matcher.group(2));
                    hm9.m("ek5", "getUploadPosition result: ".concat(U), new Object[0]);
                    i8c.close();
                    return parseLong;
                }
                hm9.p("ek5", "getUploadPosition unexpected response from server, range not found: ".concat(U), (Throwable) null);
                this.c.d("unexpected range header: ".concat(U));
                i8c.close();
                return -1;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw th;
    }

    public final long g(vq6 vq6) {
        l84 l84 = new l84();
        l84.a = vq6;
        l84.Q(UUID.randomUUID().toString());
        l84.G(HttpPost.METHOD_NAME, new ak5(0));
        yic f2 = ((u2a) this.a.getValue()).b(l84.r()).f();
        i8c i8c = f2.Z;
        try {
            if (f2.m()) {
                return e(f2);
            }
            long c2 = c(f2);
            if (i8c != null) {
                i8c.close();
            }
            return c2;
        } finally {
            if (i8c != null) {
                i8c.close();
            }
        }
    }
}
