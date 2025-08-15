package defpackage;

import android.database.DatabaseErrorHandler;

/* renamed from: l36  reason: default package */
public final /* synthetic */ class l36 implements DatabaseErrorHandler {
    public final /* synthetic */ l0f a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ l36(l0f l0f, y8 y8Var) {
        this.a = l0f;
        this.b = y8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r4.hasNext() != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r3.getClass();
        defpackage.l0f.q((java.lang.String) ((android.util.Pair) r4.next()).second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r4 = r4.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r4 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        r3.getClass();
        defpackage.l0f.q(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:11:0x0036, B:13:0x003a, B:14:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:11:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            int r0 = defpackage.n36.s0
            y8 r0 = r3.b
            java.lang.Object r1 = r0.a
            k36 r1 = (defpackage.k36) r1
            if (r1 == 0) goto L_0x0014
            java.lang.Object r2 = r1.b
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2
            boolean r2 = defpackage.tpa.f(r2, r4)
            if (r2 != 0) goto L_0x001c
        L_0x0014:
            k36 r1 = new k36
            r2 = 0
            r1.<init>(r2, r4)
            r0.a = r1
        L_0x001c:
            java.lang.Object r4 = r1.b
            android.database.sqlite.SQLiteDatabase r4 = (android.database.sqlite.SQLiteDatabase) r4
            boolean r0 = r4.isOpen()
            l0f r3 = r3.a
            if (r0 != 0) goto L_0x0035
            java.lang.String r4 = r4.getPath()
            if (r4 == 0) goto L_0x0092
            r3.getClass()
            defpackage.l0f.q(r4)
            goto L_0x0092
        L_0x0035:
            r0 = 0
            java.util.List r0 = r4.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003a, all -> 0x003e }
        L_0x003a:
            r1.close()     // Catch:{ IOException -> 0x0069, all -> 0x003e }
            goto L_0x0069
        L_0x003e:
            r1 = move-exception
            if (r0 == 0) goto L_0x005c
            java.util.Iterator r4 = r0.iterator()
        L_0x0045:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r3.getClass()
            defpackage.l0f.q(r0)
            goto L_0x0045
        L_0x005c:
            java.lang.String r4 = r4.getPath()
            if (r4 == 0) goto L_0x0068
            r3.getClass()
            defpackage.l0f.q(r4)
        L_0x0068:
            throw r1
        L_0x0069:
            if (r0 == 0) goto L_0x0086
            java.util.Iterator r4 = r0.iterator()
        L_0x006f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r3.getClass()
            defpackage.l0f.q(r0)
            goto L_0x006f
        L_0x0086:
            java.lang.String r4 = r4.getPath()
            if (r4 == 0) goto L_0x0092
            r3.getClass()
            defpackage.l0f.q(r4)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l36.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
