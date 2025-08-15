package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat;

/* renamed from: fl7  reason: default package */
public final class fl7 implements al {
    public static final fl7 q;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    /* JADX WARNING: type inference failed for: r0v0, types: [tk7, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = "https";
        obj.b = "max";
        obj.c = "api.oneme.ru";
        obj.d = "443";
        obj.e = "max.ru";
        obj.f = "api-test.oneme.ru";
        obj.g = "api-tg.oneme.ru";
        obj.h = "api";
        obj.i = "chat";
        obj.j = ConversationStartedStat.CALL_TYPE_JOIN;
        obj.k = ConversationStartedStat.CALL_TYPE_JOIN;
        obj.l = "joincall";
        obj.m = "u";
        obj.n = "stickerset";
        obj.o = "startapp";
        obj.p = ":folder";
        q = new fl7(obj);
    }

    public fl7(tk7 tk7) {
        this.a = tk7.a;
        this.b = tk7.b;
        this.c = tk7.c;
        this.d = tk7.d;
        this.e = tk7.e;
        this.f = tk7.f;
        this.g = tk7.g;
        this.h = tk7.h;
        this.i = tk7.i;
        this.j = tk7.j;
        this.k = tk7.k;
        this.l = tk7.l;
        this.m = tk7.m;
        this.n = tk7.n;
        this.o = tk7.o;
        this.p = tk7.p;
    }

    public final String a(String str) {
        return new Uri.Builder().scheme(this.a).authority(this.e).appendPath(str.replace("@", "")).build().toString();
    }

    public final List b(p82 p82, Uri uri) {
        el7 c2 = c(uri, new sk7(this, 0));
        p82.e();
        ArrayList arrayList = null;
        for (e52 e52 : p82.h.values()) {
            try {
                String str = e52.b.I;
                if (TextUtils.isEmpty(str) ? false : c2.equals(c(Uri.parse(str), new sk7(this, 0)))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(e52);
                }
            } catch (Exception e2) {
                hm9.q("p82", "exception in traverse predicate: %s", e2.getMessage());
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[LOOP:0: B:12:0x002d->B:17:0x0045, LOOP_START, PHI: r1 
      PHI: (r1v1 int) = (r1v0 int), (r1v5 int) binds: [B:11:0x002b, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.el7 c(android.net.Uri r6, defpackage.b7b r7) {
        /*
            r5 = this;
            android.net.Uri r6 = r5.e(r6)
            java.util.List r6 = r6.getPathSegments()
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0016
            java.lang.Object r0 = r6.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x002a
            boolean r7 = r7.test(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x002b
        L_0x0022:
            r7 = move-exception
            java.lang.String r2 = "fl7"
            java.lang.String r3 = "getLinkEntity: privacyPredicate fail"
            defpackage.hm9.p(r2, r3, r7)
        L_0x002a:
            r7 = r1
        L_0x002b:
            if (r7 == 0) goto L_0x0058
        L_0x002d:
            int r2 = r6.size()
            r3 = -1
            if (r1 >= r2) goto L_0x0048
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r5.j
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0045
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x002d
        L_0x0048:
            r1 = r3
        L_0x0049:
            if (r1 == r3) goto L_0x0058
            int r5 = r6.size()
            if (r1 >= r5) goto L_0x0058
            java.lang.Object r5 = r6.get(r1)
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
        L_0x0058:
            el7 r5 = new el7
            r5.<init>(r0, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl7.c(android.net.Uri, b7b):el7");
    }

    public final boolean d(Uri uri) {
        if (uri == null) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        boolean isEmpty = TextUtils.isEmpty(uri.getScheme());
        String str = this.g;
        String str2 = this.f;
        String str3 = this.e;
        if (!isEmpty) {
            String host = uri.getHost();
            if (uri.getScheme().equalsIgnoreCase(this.b)) {
                if (TextUtils.isEmpty(host) || pathSegments.size() <= 0) {
                    return false;
                }
                if (!host.equalsIgnoreCase(this.i) && !host.equalsIgnoreCase(this.h)) {
                    return false;
                }
            } else if (TextUtils.isEmpty(host) || pathSegments.size() <= 0) {
                return false;
            } else {
                if (!host.equalsIgnoreCase(str3) && !host.equalsIgnoreCase(str2) && !host.equalsIgnoreCase(str)) {
                    return false;
                }
            }
        } else if (pathSegments.isEmpty()) {
            return false;
        } else {
            String str4 = pathSegments.get(0);
            if (TextUtils.isEmpty(str4) || pathSegments.size() <= 1) {
                return false;
            }
            if (!str4.equalsIgnoreCase(str3) && !str4.equalsIgnoreCase(str2) && !str4.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public final Uri e(Uri uri) {
        String uri2 = uri.toString();
        boolean startsWith = uri2.startsWith(":");
        String str = this.b;
        if (!startsWith) {
            if (!uri2.startsWith(str + "://:")) {
                if (uri2.startsWith("@") || uri2.contains("://") || !TextUtils.isEmpty(uri.getScheme())) {
                    return uri;
                }
                return Uri.parse("https://" + uri);
            }
        }
        return c54.h(uri2.replace(str + "://:", ":"), str, (String) null);
    }
}
