package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: qyc  reason: default package */
public abstract class qyc extends e3 implements y7d {
    public static final nz4 n = nz4.a;
    public static final khe o = new khe(new hbc(13));
    public final xs h = new xs(1);
    public final khe i = new khe(new re5(this, 1));
    public final fic j = new fic(new re5(this, 2));
    public final fic k;
    public final CopyOnWriteArraySet l;
    public final khe m;

    static {
        y53.M("TOP", "NEW");
        y53.M("RECENT", "NEW", "TOP");
    }

    public qyc(Context context, mi5 mi5) {
        super(context, "settings.prefs", mi5);
        this.k = new fic(new xda(context, 26));
        this.l = new CopyOnWriteArraySet();
        this.m = new khe(new re5(this, 3));
    }

    public final boolean n(Enum enumR, boolean z) {
        return this.g.getBoolean(enumR.name(), z);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List o(java.lang.Enum r3, java.util.List r4) {
        /*
            r2 = this;
            java.lang.String r3 = r3.name()
            r0 = 0
            java.lang.String r2 = r2.g(r3, r0)
            if (r2 != 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0012 }
            r3.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x0012 }
            r0 = r3
        L_0x0012:
            if (r0 != 0) goto L_0x0015
            goto L_0x0033
        L_0x0015:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r2 = r0.length()
            r4.<init>(r2)
            int r2 = r0.length()
            r3 = 0
        L_0x0023:
            if (r3 >= r2) goto L_0x0033
            int r1 = r0.getInt(r3)     // Catch:{ all -> 0x0030 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0030 }
            r4.add(r1)     // Catch:{ all -> 0x0030 }
        L_0x0030:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0033:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyc.o(java.lang.Enum, java.util.List):java.util.List");
    }

    public final String p() {
        return s(PmsKey.f53invitelink, "https://max.ru");
    }

    public final long q(Enum enumR, long j2) {
        Number number;
        try {
            number = Long.valueOf(f(enumR.name(), j2));
        } catch (ClassCastException unused) {
            number = Integer.valueOf(e(enumR.name(), (int) j2));
        }
        return number.longValue();
    }

    public final int r() {
        return (int) q(PmsKey.f66maxdescriptionlength, (long) HttpStatus.SC_BAD_REQUEST);
    }

    public final String s(Enum enumR, String str) {
        String w = w(enumR, str);
        if (w != null) {
            return w;
        }
        throw new IllegalArgumentException(("got null string value for " + enumR).toString());
    }

    public final List t(Enum enumR, List list) {
        List h2 = h(enumR.name(), list);
        if (h2 != null) {
            return h2;
        }
        throw new IllegalArgumentException(("got null stringlist value for " + enumR).toString());
    }

    public final boolean u() {
        return n(PmsKey.f33draftssyncenabled, false);
    }

    public final boolean v() {
        return n(PmsKey.f107safemodeenabled, false);
    }

    public final String w(Enum enumR, String str) {
        return g(enumR.name(), str);
    }
}
