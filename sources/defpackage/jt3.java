package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* renamed from: jt3  reason: default package */
public final class jt3 implements a95, ke7 {
    public static o9e c;
    public static o9e o;
    public final Object a;
    public volatile Object b;

    public /* synthetic */ jt3(Object obj) {
        this.a = obj;
    }

    public Uri a(fl flVar) {
        Uri uri = flVar.getUri();
        if (!tpa.f(uri.getScheme(), "ok")) {
            return uri;
        }
        Uri p = ((vp6) this.b).p(uri.getAuthority());
        Uri.Builder encodedAuthority = uri.buildUpon().scheme(p.getScheme()).encodedAuthority(p.getEncodedAuthority());
        String encodedPath = p.getEncodedPath();
        String encodedPath2 = uri.getEncodedPath();
        if (encodedPath == null || encodedPath.length() == 0 || encodedPath.equals("/")) {
            encodedPath = encodedPath2;
        } else if (!(encodedPath2 == null || encodedPath2.length() == 0 || encodedPath2.equals("/"))) {
            if (encodedPath.charAt(encodedPath.length() - 1) == '/') {
                encodedPath = encodedPath.substring(0, encodedPath.length() - 1);
            }
            encodedPath = encodedPath.concat(encodedPath2);
        }
        Uri.Builder encodedPath3 = encodedAuthority.encodedPath(encodedPath);
        String encodedQuery = p.getEncodedQuery();
        String encodedQuery2 = uri.getEncodedQuery();
        if (!(encodedQuery == null || encodedQuery.length() == 0)) {
            if (!(encodedQuery2 == null || encodedQuery.length() == 0)) {
                encodedQuery = encodedQuery + '&' + encodedQuery2;
            }
            encodedQuery2 = encodedQuery;
        }
        return encodedPath3.encodedQuery(encodedQuery2).build();
    }

    public void b() {
        ((se3) this.a).setSessionInfo((re3) null);
        this.b = null;
    }

    public jxc c() {
        String str;
        String str2;
        if (((jxc) this.b) == null) {
            re3 sessionInfo = ((se3) this.a).getSessionInfo();
            jxc d = jxc.c.b(((se3) this.a).getAppKey()).d(Uri.parse(((se3) this.a).getBaseEndpoint()));
            if (!(sessionInfo == null || (str = sessionInfo.a) == null || (str2 = sessionInfo.b) == null)) {
                d = d.c(str, str2);
            }
            this.b = d;
        }
        return (jxc) this.b;
    }

    public void d(jxc jxc) {
        this.b = jxc;
        Uri a2 = ((jxc) this.b).a();
        ((se3) this.a).setSessionInfo(new re3(((jxc) this.b).a.d, ((jxc) this.b).a.e, a2 == null ? null : a2.toString(), ((jxc) this.b).a.c));
    }

    public Logger e() {
        Logger logger = (Logger) this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (defpackage.tpa.f(((defpackage.vp6) r10.b).p(r1).getScheme(), "https") == false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.io.OutputStream r11, defpackage.fl r12, defpackage.wk r13, int r14) {
        /*
            r10 = this;
            kl r0 = r12.getScope()
            android.net.Uri r1 = r12.getUri()
            java.lang.String r1 = r1.getAuthority()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.lang.Object r3 = r10.a
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r4 = 2
            int r3 = r3 + r4
            r2.<init>(r3)
            java.lang.Object r3 = r10.a
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r3.next()
            o9e r5 = (defpackage.o9e) r5
            r5.getClass()
            r2.add(r5)
            goto L_0x0023
        L_0x0036:
            int r3 = r0.ordinal()
            r5 = 1
            r6 = 3
            r7 = 0
            if (r3 == r5) goto L_0x0045
            if (r3 == r4) goto L_0x0045
            if (r3 == r6) goto L_0x0045
            r3 = r7
            goto L_0x0049
        L_0x0045:
            java.lang.String r3 = r13.a
            if (r3 == 0) goto L_0x01ba
        L_0x0049:
            if (r3 == 0) goto L_0x0064
            o9e r8 = c
            if (r8 == 0) goto L_0x0058
            java.lang.String r9 = r8.b
            boolean r9 = defpackage.tpa.f(r9, r3)
            if (r9 == 0) goto L_0x0058
            goto L_0x0061
        L_0x0058:
            o9e r8 = new o9e
            java.lang.String r9 = "application_key"
            r8.<init>(r9, r3)
            c = r8
        L_0x0061:
            r2.add(r8)
        L_0x0064:
            int r3 = r0.ordinal()
            if (r3 == r4) goto L_0x006e
            if (r3 == r6) goto L_0x006e
            r3 = r7
            goto L_0x0072
        L_0x006e:
            java.lang.String r3 = r13.d
            if (r3 == 0) goto L_0x01b2
        L_0x0072:
            int r8 = r0.ordinal()
            if (r8 == r4) goto L_0x007c
            if (r8 == r6) goto L_0x007c
            r6 = r7
            goto L_0x007e
        L_0x007c:
            java.lang.String r6 = r13.e
        L_0x007e:
            int[] r8 = defpackage.wp6.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r8[r0]
            if (r0 != r5) goto L_0x0095
            java.lang.String r13 = r13.b
            if (r13 == 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            ru.ok.android.api.core.ApiScopeException r10 = new ru.ok.android.api.core.ApiScopeException
            java.lang.String r11 = "No user"
            r10.<init>(r11)
            throw r10
        L_0x0095:
            if (r3 == 0) goto L_0x00b0
            o9e r13 = o
            if (r13 == 0) goto L_0x00a4
            java.lang.String r0 = r13.b
            boolean r0 = defpackage.tpa.f(r0, r3)
            if (r0 == 0) goto L_0x00a4
            goto L_0x00ad
        L_0x00a4:
            o9e r13 = new o9e
            java.lang.String r0 = "session_key"
            r13.<init>(r0, r3)
            o = r13
        L_0x00ad:
            r2.add(r13)
        L_0x00b0:
            int r13 = defpackage.au1.s(r14)
            if (r13 == 0) goto L_0x00d5
            if (r13 == r5) goto L_0x00d6
            if (r13 != r4) goto L_0x00cf
            java.lang.Object r10 = r10.b
            vp6 r10 = (defpackage.vp6) r10
            android.net.Uri r10 = r10.p(r1)
            java.lang.String r10 = r10.getScheme()
            java.lang.String r13 = "https"
            boolean r10 = defpackage.tpa.f(r10, r13)
            if (r10 != 0) goto L_0x00d6
            goto L_0x00d5
        L_0x00cf:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00d5:
            r7 = r6
        L_0x00d6:
            if (r7 == 0) goto L_0x00e8
            int r10 = r2.size()
            if (r10 <= r5) goto L_0x00e8
            fs4 r10 = new fs4
            r13 = 29
            r10.<init>(r13)
            defpackage.c63.U(r2, r10)
        L_0x00e8:
            oq6 r10 = new oq6
            r10.<init>(r11, r2, r7)
            sh0 r11 = r10.o
            int r13 = r11.b
            r14 = 0
            if (r13 != 0) goto L_0x00f6
            r13 = r5
            goto L_0x00f7
        L_0x00f6:
            r13 = r14
        L_0x00f7:
            java.lang.String r0 = "Nesting problem: "
            if (r13 == 0) goto L_0x01a4
            if (r7 == 0) goto L_0x00ff
            r13 = r5
            goto L_0x0100
        L_0x00ff:
            r13 = r14
        L_0x0100:
            r10.s0 = r13
            r1 = -1
            if (r13 == 0) goto L_0x0107
            r13 = r14
            goto L_0x0108
        L_0x0107:
            r13 = r1
        L_0x0108:
            r10.Z = r13
            java.security.MessageDigest r13 = r10.X
            r13.reset()
            r11.w(r14)
            boolean r11 = r10.s0
            if (r11 != 0) goto L_0x012a
            java.util.Iterator r11 = r2.iterator()
        L_0x011a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x012a
            java.lang.Object r13 = r11.next()
            o9e r13 = (defpackage.o9e) r13
            r13.a(r10)
            goto L_0x011a
        L_0x012a:
            r12.writeParams(r10)     // Catch:{ JsonSerializeException -> 0x019d }
            sh0 r11 = r10.o
            int r12 = r11.b
            if (r12 != r5) goto L_0x018f
            int r12 = r10.Z
            if (r12 < 0) goto L_0x014d
            r10.Z = r1
        L_0x0139:
            java.util.List r13 = r10.b
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x014d
            java.lang.Object r13 = r13.get(r12)
            o9e r13 = (defpackage.o9e) r13
            r13.a(r10)
            int r12 = r12 + 1
            goto L_0x0139
        L_0x014d:
            boolean r12 = r10.s0
            if (r12 == 0) goto L_0x018b
            java.nio.charset.Charset r12 = defpackage.a52.a
            java.lang.String r13 = r10.c
            byte[] r12 = r13.getBytes(r12)
            java.security.MessageDigest r13 = r10.X
            r13.update(r12)
            byte[] r12 = r13.digest()
            java.lang.String r13 = "sig"
            r10.n(r13)
            r10.m()
            int r13 = r12.length
            r0 = r14
        L_0x016c:
            if (r0 >= r13) goto L_0x0189
            byte r1 = r12[r0]
            int r2 = r1 >> 4
            r2 = r2 & 15
            int r2 = defpackage.z7.F(r2)
            java.io.OutputStream r3 = r10.a
            r3.write(r2)
            r1 = r1 & 15
            int r1 = defpackage.z7.F(r1)
            r3.write(r1)
            int r0 = r0 + 1
            goto L_0x016c
        L_0x0189:
            r10.s0 = r14
        L_0x018b:
            r11.u()
            return
        L_0x018f:
            java.lang.String r10 = defpackage.hx9.l(r11)
            java.lang.String r10 = r0.concat(r10)
            ru.ok.android.api.json.JsonStateException r11 = new ru.ok.android.api.json.JsonStateException
            r11.<init>(r10)
            throw r11
        L_0x019d:
            r10 = move-exception
            ru.ok.android.api.core.ApiRequestException r11 = new ru.ok.android.api.core.ApiRequestException
            r11.<init>(r10)
            throw r11
        L_0x01a4:
            java.lang.String r10 = defpackage.hx9.l(r11)
            java.lang.String r10 = r0.concat(r10)
            ru.ok.android.api.json.JsonStateException r11 = new ru.ok.android.api.json.JsonStateException
            r11.<init>(r10)
            throw r11
        L_0x01b2:
            ru.ok.android.api.core.ApiScopeException r10 = new ru.ok.android.api.core.ApiScopeException
            java.lang.String r11 = "No session key"
            r10.<init>(r11)
            throw r10
        L_0x01ba:
            ru.ok.android.api.core.ApiScopeException r10 = new ru.ok.android.api.core.ApiScopeException
            java.lang.String r11 = "No app key"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt3.f(java.io.OutputStream, fl, wk, int):void");
    }

    public Object get() {
        Object obj = this.b;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == null) {
                        obj = ((lde) this.a).get();
                        this.b = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }

    public jt3(Class cls) {
        this.a = cls.getName();
    }

    public jt3(int i) {
        switch (i) {
            case 2:
                this.b = vp6.x;
                this.a = new ArrayList();
                return;
            default:
                this.a = new CopyOnWriteArraySet();
                return;
        }
    }
}
