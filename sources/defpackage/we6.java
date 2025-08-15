package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: we6  reason: default package */
public final class we6 implements cud {
    public final Context a;
    public final kld b;
    public final v7c c;
    public final ContextScope d;
    public final String e;
    public reg f;
    public int g = 6;
    public ukg h;

    public we6(Context context, kke kke) {
        this.a = context;
        kld b2 = lld.b(0, 0, 0, 7);
        this.b = b2;
        this.c = new v7c(b2);
        this.d = j1e.a(((w9a) kke).c().getImmediate());
        String name = we6.class.getName();
        this.e = name;
        khe khe = new khe(new es3(23, this));
        if (z7.N(context, (ve6) khe.getValue(), new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", 2) == null) {
            hm9.r(name, new Error("SMS Retriever registration failed"), (String) null, new Object[0]);
        }
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.we6 r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            java.lang.String r0 = "[0-9]{"
            boolean r1 = r11 instanceof defpackage.te6
            if (r1 == 0) goto L_0x0018
            r1 = r11
            te6 r1 = (defpackage.te6) r1
            int r2 = r1.t0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.t0 = r2
            goto L_0x001d
        L_0x0018:
            te6 r1 = new te6
            r1.<init>(r9, r11)
        L_0x001d:
            java.lang.Object r11 = r1.Z
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.t0
            java.lang.String r4 = ", message="
            java.lang.String r5 = "sms code matching failed: codeLength="
            r6 = 0
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r8) goto L_0x003b
            java.io.Serializable r9 = r1.Y
            java.lang.String r10 = r1.X
            we6 r0 = r1.o
            defpackage.od2.a0(r11)
            r11 = r9
            r9 = r0
            goto L_0x00b2
        L_0x003b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0043:
            defpackage.od2.a0(r11)
            int r11 = r9.g     // Catch:{ all -> 0x006c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r3.<init>(r0)     // Catch:{ all -> 0x006c }
            r3.append(r11)     // Catch:{ all -> 0x006c }
            java.lang.String r11 = "}"
            r3.append(r11)     // Catch:{ all -> 0x006c }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x006c }
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch:{ all -> 0x006c }
            java.util.regex.Matcher r11 = r11.matcher(r10)     // Catch:{ all -> 0x006c }
            boolean r0 = r11.find()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x006e
            java.lang.String r11 = r11.group(r7)     // Catch:{ all -> 0x006c }
            goto L_0x0076
        L_0x006c:
            r11 = move-exception
            goto L_0x0070
        L_0x006e:
            r11 = r6
            goto L_0x0076
        L_0x0070:
            njc r0 = new njc
            r0.<init>(r11)
            r11 = r0
        L_0x0076:
            boolean r0 = r11 instanceof defpackage.njc
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x00b2
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00a1
            yx3 r0 = new yx3
            int r1 = r9.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r1)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = r9.e
            defpackage.hm9.r(r2, r0, r6, r1)
            goto L_0x00b2
        L_0x00a1:
            kld r3 = r9.b
            r1.o = r9
            r1.X = r10
            r1.Y = r11
            r1.t0 = r8
            java.lang.Object r0 = r3.a(r0, r1)
            if (r0 != r2) goto L_0x00b2
            goto L_0x00da
        L_0x00b2:
            java.lang.Throwable r11 = defpackage.pjc.a(r11)
            if (r11 == 0) goto L_0x00d8
            java.lang.String r0 = r9.e
            yx3 r1 = new yx3
            int r9 = r9.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r9)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r9 = r2.toString()
            r1.<init>(r9, r11)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            defpackage.hm9.r(r0, r1, r6, r9)
        L_0x00d8:
            e5f r2 = defpackage.e5f.a
        L_0x00da:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we6.a(we6, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [de6, reg] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, rq9] */
    public final void b() {
        ukg c2;
        if (this.h != null) {
            hm9.m(this.e, "task not null! skip start retriever", new Object[0]);
            return;
        }
        ukg ukg = null;
        if (this.f == null) {
            ? obj = new Object();
            this.f = new de6(this.a, reg.x0, (GoogleSignInOptions) null, (rq9) obj);
        }
        reg reg = this.f;
        if (!(reg == null || (c2 = reg.c(1, new ydg())) == null)) {
            wp wpVar = new wp(2, (m56) new jy2(19, this));
            q67 q67 = xne.a;
            c2.d(q67, wpVar);
            c2.i(new se6(this));
            c2.c(q67, new se6(this));
            c2.a(q67, new se6(this));
            ukg = c2;
        }
        this.h = ukg;
    }
}
