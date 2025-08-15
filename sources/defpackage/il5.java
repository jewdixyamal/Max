package defpackage;

import android.net.TrafficStats;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.apache.http.auth.AUTH;
import org.apache.http.client.methods.HttpPost;

/* renamed from: il5  reason: default package */
public final class il5 implements jl5 {
    public static final Object m = new Object();
    public final fl5 a;
    public final gl5 b;
    public final ph4 c;
    public final qaf d;
    public final le7 e;
    public final o4c f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, ph4] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, o4c] */
    public il5(fl5 fl5, gpb gpb, ExecutorService executorService, p6d p6d) {
        fl5.a();
        gl5 gl5 = new gl5(fl5.a, gpb);
        ? obj = new Object();
        obj.b = fl5;
        if (mq9.Z == null) {
            mq9.Z = new mq9(17);
        }
        mq9 mq9 = mq9.Z;
        if (qaf.d == null) {
            qaf.d = new qaf(mq9);
        }
        qaf qaf = qaf.d;
        le7 le7 = new le7(new bc3(2, fl5));
        ? obj2 = new Object();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = fl5;
        this.b = gl5;
        this.c = obj;
        this.d = qaf;
        this.e = le7;
        this.f = obj2;
        this.h = executorService;
        this.i = p6d;
    }

    public final void a() {
        qz7 g2;
        hb0 t;
        synchronized (m) {
            try {
                fl5 fl5 = this.a;
                fl5.a();
                g2 = qz7.g(fl5.a);
                t = this.c.t();
                int i2 = t.b;
                boolean z = true;
                if (i2 != 2) {
                    if (i2 != 1) {
                        z = false;
                    }
                }
                if (z) {
                    String f2 = f(t);
                    ph4 ph4 = this.c;
                    gb0 a2 = t.a();
                    a2.a = f2;
                    a2.b = 3;
                    t = a2.a();
                    ph4.r(t);
                }
                if (g2 != null) {
                    g2.V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i(t);
        this.i.execute(new u60(9, this));
    }

    public final hb0 b(hb0 hb0) {
        gc0 f2;
        hb0 hb02 = hb0;
        fl5 fl5 = this.a;
        fl5.a();
        String str = fl5.c.a;
        String str2 = hb02.a;
        fl5 fl52 = this.a;
        fl52.a();
        String str3 = fl52.c.g;
        String str4 = hb02.d;
        gl5 gl5 = this.b;
        shc shc = gl5.c;
        if (shc.a()) {
            URL a2 = gl5.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            int i2 = 0;
            while (i2 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c2 = gl5.c(a2, str);
                try {
                    c2.setRequestMethod(HttpPost.METHOD_NAME);
                    c2.addRequestProperty(AUTH.WWW_AUTH_RESP, "FIS_v2 " + str4);
                    c2.setDoOutput(true);
                    gl5.h(c2);
                    int responseCode = c2.getResponseCode();
                    shc.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        f2 = gl5.f(c2);
                    } else {
                        gl5.b(c2, (String) null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            jn a3 = gc0.a();
                            a3.b = 3;
                            f2 = a3.i();
                        } else if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                jn a4 = gc0.a();
                                a4.b = 2;
                                f2 = a4.i();
                            }
                            c2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2++;
                        } else {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    }
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    int s = au1.s(f2.c);
                    if (s == 0) {
                        qaf qaf = this.d;
                        qaf.getClass();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        qaf.a.getClass();
                        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                        gb0 a5 = hb0.a();
                        a5.c = f2.a;
                        a5.f = Long.valueOf(f2.b);
                        a5.g = Long.valueOf(seconds);
                        return a5.a();
                    } else if (s == 1) {
                        gb0 a6 = hb0.a();
                        a6.e = "BAD CONFIG";
                        a6.b = 5;
                        return a6.a();
                    } else if (s == 2) {
                        synchronized (this) {
                            this.j = null;
                        }
                        gb0 a7 = hb0.a();
                        a7.b = 2;
                        return a7.a();
                    } else {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final ukg c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return j1e.r(str);
        }
        qne qne = new qne();
        yb6 yb6 = new yb6(qne);
        synchronized (this.g) {
            this.l.add(yb6);
        }
        ukg ukg = qne.a;
        this.h.execute(new hl5(this, 0));
        return ukg;
    }

    public final ukg d() {
        e();
        qne qne = new qne();
        bb6 bb6 = new bb6(this.d, qne);
        synchronized (this.g) {
            this.l.add(bb6);
        }
        this.h.execute(new hl5(this, 1));
        return qne.a;
    }

    public final void e() {
        fl5 fl5 = this.a;
        fl5.a();
        fp3.k(fl5.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fl5.a();
        fp3.k(fl5.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fl5.a();
        fp3.k(fl5.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fl5.a();
        String str = fl5.c.b;
        Pattern pattern = qaf.c;
        fp3.g("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        fl5.a();
        fp3.g("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", qaf.c.matcher(fl5.c.a).matches());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.b) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f(defpackage.hb0 r6) {
        /*
            r5 = this;
            fl5 r0 = r5.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            fl5 r0 = r5.a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005b
        L_0x001e:
            r0 = 1
            int r6 = r6.b
            if (r6 != r0) goto L_0x005b
            le7 r6 = r5.e
            java.lang.Object r6 = r6.get()
            jt6 r6 = (defpackage.jt6) r6
            android.content.SharedPreferences r0 = r6.a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.a     // Catch:{ all -> 0x003f }
            monitor-enter(r1)     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r6.a     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x0056 }
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0041
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0046
        L_0x003f:
            r5 = move-exception
            goto L_0x0059
        L_0x0041:
            java.lang.String r2 = r6.a()     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
        L_0x0046:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0055
            o4c r5 = r5.f
            r5.getClass()
            java.lang.String r2 = defpackage.o4c.a()
        L_0x0055:
            return r2
        L_0x0056:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            throw r5     // Catch:{ all -> 0x003f }
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r5
        L_0x005b:
            o4c r5 = r5.f
            r5.getClass()
            java.lang.String r5 = defpackage.o4c.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il5.f(hb0):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r9.startsWith("{") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = new org.json.JSONObject(r9).getString(ru.ok.android.externcalls.sdk.api.ApiProtocol.KEY_TOKEN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0187, code lost:
        r15.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005f */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }, ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }]), Splitter:B:34:0x00ba] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hb0 g(defpackage.hb0 r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = r1.a
            r3 = 4
            r5 = 0
            if (r2 == 0) goto L_0x006a
            int r2 = r2.length()
            r6 = 11
            if (r2 != r6) goto L_0x006a
            le7 r2 = r0.e
            java.lang.Object r2 = r2.get()
            jt6 r2 = (defpackage.jt6) r2
            android.content.SharedPreferences r6 = r2.a
            monitor-enter(r6)
            java.lang.String[] r7 = defpackage.jt6.c     // Catch:{ all -> 0x0061 }
            r8 = 0
        L_0x0020:
            if (r8 >= r3) goto L_0x0066
            r9 = r7[r8]     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r2.b     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            java.lang.String r12 = "|T|"
            r11.<init>(r12)     // Catch:{ all -> 0x0061 }
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            r11.append(r9)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0061 }
            android.content.SharedPreferences r10 = r2.a     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r10.getString(r9, r5)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x0063
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r10 != 0) goto L_0x0063
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005f }
            r2.<init>((java.lang.String) r9)     // Catch:{ JSONException -> 0x005f }
            java.lang.String r7 = "token"
            java.lang.String r5 = r2.getString(r7)     // Catch:{ JSONException -> 0x005f }
            goto L_0x005f
        L_0x005e:
            r5 = r9
        L_0x005f:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006a
        L_0x0061:
            r0 = move-exception
            goto L_0x0068
        L_0x0063:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0066:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006a
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x006a:
            gl5 r2 = r0.b
            fl5 r6 = r0.a
            r6.a()
            ol5 r6 = r6.c
            java.lang.String r6 = r6.a
            java.lang.String r7 = r1.a
            fl5 r8 = r0.a
            r8.a()
            ol5 r8 = r8.c
            java.lang.String r8 = r8.g
            fl5 r9 = r0.a
            r9.a()
            ol5 r9 = r9.c
            java.lang.String r9 = r9.b
            shc r10 = r2.c
            boolean r11 = r10.a()
            java.lang.String r12 = "Firebase Installations Service is unavailable. Please try again later."
            if (r11 == 0) goto L_0x019e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "projects/"
            r11.<init>(r13)
            r11.append(r8)
            java.lang.String r13 = "/installations"
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.net.URL r11 = defpackage.gl5.a(r11)
            r13 = 0
        L_0x00ab:
            r14 = 1
            if (r13 > r14) goto L_0x0198
            r15 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r15)
            java.net.HttpURLConnection r15 = r2.c(r11, r6)
            java.lang.String r4 = "POST"
            r15.setRequestMethod(r4)     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
            r15.setDoOutput(r14)     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
            if (r5 == 0) goto L_0x00cb
            java.lang.String r4 = "x-goog-fis-android-iid-migration-auth"
            r15.addRequestProperty(r4, r5)     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
            goto L_0x00cb
        L_0x00c8:
            r0 = move-exception
            goto L_0x0187
        L_0x00cb:
            defpackage.gl5.g(r15, r7, r9)     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
            int r4 = r15.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
            r10.b(r4)     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 < r3) goto L_0x00df
            r3 = 300(0x12c, float:4.2E-43)
            if (r4 >= r3) goto L_0x00df
            r3 = r14
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            if (r3 == 0) goto L_0x00f0
            ta0 r2 = defpackage.gl5.e(r15)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0120
        L_0x00ed:
            r3 = 4
            goto L_0x018e
        L_0x00f0:
            defpackage.gl5.b(r15, r9, r6, r8)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r3 = 429(0x1ad, float:6.01E-43)
            if (r4 == r3) goto L_0x017e
            r3 = 500(0x1f4, float:7.0E-43)
            if (r4 < r3) goto L_0x0108
            r3 = 600(0x258, float:8.41E-43)
            if (r4 >= r3) goto L_0x0108
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r3 = 4
            goto L_0x0194
        L_0x0108:
            ta0 r3 = new ta0     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r20 = 0
            r19 = 0
            r21 = 2
            r18 = 0
            r17 = 0
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x00ed, all -> 0x00c8 }
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r3
        L_0x0120:
            int r3 = r2.e
            int r3 = defpackage.au1.s(r3)
            if (r3 == 0) goto L_0x0142
            if (r3 != r14) goto L_0x013a
            gb0 r0 = r23.a()
            java.lang.String r1 = "BAD CONFIG"
            r0.e = r1
            r1 = 5
            r0.b = r1
            hb0 r0 = r0.a()
            return r0
        L_0x013a:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r1 = "Firebase Installations Service is unavailable. Please try again later."
            r0.<init>(r1)
            throw r0
        L_0x0142:
            java.lang.String r3 = r2.b
            java.lang.String r4 = r2.c
            qaf r0 = r0.d
            r0.getClass()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            mq9 r0 = r0.a
            r0.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            long r5 = r5.toSeconds(r6)
            gc0 r0 = r2.d
            java.lang.String r2 = r0.a
            long r7 = r0.b
            gb0 r0 = r23.a()
            r0.a = r3
            r3 = 4
            r0.b = r3
            r0.c = r2
            r0.d = r4
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r0.f = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.g = r1
            hb0 r0 = r0.a()
            return r0
        L_0x017e:
            r3 = 4
            com.google.firebase.installations.FirebaseInstallationsException r4 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
            java.lang.String r14 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r4.<init>(r14)     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
            throw r4     // Catch:{ IOException | AssertionError -> 0x018e, all -> 0x00c8 }
        L_0x0187:
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x018e:
            r15.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x0194:
            int r13 = r13 + 1
            goto L_0x00ab
        L_0x0198:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r0.<init>(r12)
            throw r0
        L_0x019e:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il5.g(hb0):hb0");
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((t0e) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public final void i(hb0 hb0) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((t0e) it.next()).b(hb0)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }
}
