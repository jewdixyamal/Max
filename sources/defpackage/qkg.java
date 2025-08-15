package defpackage;

import android.content.Context;

/* renamed from: qkg  reason: default package */
public final class qkg extends idg {
    public final Context d;

    public qkg(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 6);
        this.d = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: tig} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: tig} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: a2e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: meg} */
    /* JADX WARNING: type inference failed for: r6v2, types: [de6, reg] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, rq9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J0(int r7, android.os.Parcel r8, android.os.Parcel r9) {
        /*
            r6 = this;
            r8 = 19
            r9 = 1
            r0 = 0
            android.content.Context r1 = r6.d
            if (r7 == r9) goto L_0x0018
            r8 = 2
            if (r7 == r8) goto L_0x000c
            return r0
        L_0x000c:
            r6.K0()
            bkg r6 = defpackage.bkg.y(r1)
            r6.n()
            goto L_0x00ec
        L_0x0018:
            r6.K0()
            l8e r6 = defpackage.l8e.a(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r7 = r6.b()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.v0
            if (r7 == 0) goto L_0x002b
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r6.c()
        L_0x002b:
            reg r6 = new reg
            defpackage.fp3.n(r2)
            rq9 r3 = new rq9
            r3.<init>()
            qz7 r4 = defpackage.w70.a
            r6.<init>((android.content.Context) r1, (defpackage.qz7) r4, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r2, (defpackage.rq9) r3)
            r1 = 3
            mdg r2 = r6.s0
            android.content.Context r3 = r6.a
            if (r7 == 0) goto L_0x00ac
            int r6 = r6.e()
            if (r6 != r1) goto L_0x0049
            r6 = r9
            goto L_0x004a
        L_0x0049:
            r6 = r0
        L_0x004a:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            jn r4 = defpackage.nig.a
            int r5 = r4.b
            if (r5 > r1) goto L_0x0057
            java.lang.String r1 = "Revoking access"
            r4.r(r1, r7)
        L_0x0057:
            l8e r7 = defpackage.l8e.a(r3)
            java.lang.String r1 = "refreshToken"
            java.lang.String r7 = r7.e(r1)
            defpackage.nig.a(r3)
            if (r6 == 0) goto L_0x0091
            if (r7 != 0) goto L_0x0081
            jn r6 = defpackage.dhg.c
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status
            r7 = 4
            r1 = 0
            r6.<init>(r7, r1, r1, r1)
            r7 = r0 ^ 1
            java.lang.String r0 = "Status code must not be SUCCESS"
            defpackage.fp3.g(r0, r7)
            meg r7 = new meg
            r7.<init>(r6)
            r7.S(r6)
            goto L_0x0099
        L_0x0081:
            dhg r6 = new dhg
            r6.<init>(r7)
            java.lang.Thread r7 = new java.lang.Thread
            r7.<init>(r6)
            r7.start()
            a2e r7 = r6.b
            goto L_0x0099
        L_0x0091:
            tig r7 = new tig
            r7.<init>(r2, r9)
            r2.a(r7)
        L_0x0099:
            qx7 r6 = new qx7
            r6.<init>(r8)
            qne r8 = new qne
            r8.<init>()
            ueg r0 = new ueg
            r0.<init>(r7, r8, r6)
            r7.O(r0)
            goto L_0x00ec
        L_0x00ac:
            int r6 = r6.e()
            if (r6 != r1) goto L_0x00b4
            r6 = r9
            goto L_0x00b5
        L_0x00b4:
            r6 = r0
        L_0x00b5:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            jn r4 = defpackage.nig.a
            int r5 = r4.b
            if (r5 > r1) goto L_0x00c2
            java.lang.String r1 = "Signing out"
            r4.r(r1, r7)
        L_0x00c2:
            defpackage.nig.a(r3)
            if (r6 == 0) goto L_0x00d2
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.Status.X
            a2e r7 = new a2e
            r7.<init>(r2)
            r7.S(r6)
            goto L_0x00da
        L_0x00d2:
            tig r7 = new tig
            r7.<init>(r2, r0)
            r2.a(r7)
        L_0x00da:
            qx7 r6 = new qx7
            r6.<init>(r8)
            qne r8 = new qne
            r8.<init>()
            ueg r0 = new ueg
            r0.<init>(r7, r8, r6)
            r7.O(r0)
        L_0x00ec:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkg.J0(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K0() {
        /*
            r5 = this;
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String r1 = "com.google.android.gms"
            android.content.Context r5 = r5.d
            bkg r2 = defpackage.a9g.a(r5)
            r2.getClass()
            java.lang.Object r2 = r2.b     // Catch:{ SecurityException -> 0x0091 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ SecurityException -> 0x0091 }
            java.lang.String r3 = "appops"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ SecurityException -> 0x0091 }
            android.app.AppOpsManager r2 = (android.app.AppOpsManager) r2     // Catch:{ SecurityException -> 0x0091 }
            if (r2 == 0) goto L_0x0089
            r2.checkPackage(r0, r1)     // Catch:{ SecurityException -> 0x0091 }
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r2 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{  }
            re6 r5 = defpackage.re6.n0(r5)
            r5.getClass()
            if (r0 == 0) goto L_0x0091
            r3 = 0
            boolean r4 = defpackage.re6.u0(r0, r3)
            if (r4 == 0) goto L_0x003b
            goto L_0x0088
        L_0x003b:
            r4 = 1
            boolean r0 = defpackage.re6.u0(r0, r4)
            if (r0 == 0) goto L_0x0091
            java.lang.Object r5 = r5.b
            android.content.Context r5 = (android.content.Context) r5
            boolean r0 = defpackage.pe6.c
            if (r0 != 0) goto L_0x007a
            bkg r0 = defpackage.a9g.a(r5)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            java.lang.Object r0 = r0.b     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            defpackage.re6.n0(r5)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            if (r0 == 0) goto L_0x0070
            boolean r5 = defpackage.re6.u0(r0, r3)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            if (r5 != 0) goto L_0x0070
            boolean r5 = defpackage.re6.u0(r0, r4)     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            if (r5 == 0) goto L_0x0070
            defpackage.pe6.b = r4     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r5 = move-exception
            goto L_0x0075
        L_0x0070:
            defpackage.pe6.b = r3     // Catch:{ NameNotFoundException -> 0x0078, all -> 0x006e }
        L_0x0072:
            defpackage.pe6.c = r4
            goto L_0x007a
        L_0x0075:
            defpackage.pe6.c = r4
            throw r5
        L_0x0078:
            defpackage.pe6.c = r4
        L_0x007a:
            boolean r5 = defpackage.pe6.b
            if (r5 != 0) goto L_0x0088
            java.lang.String r5 = "user"
            java.lang.String r0 = android.os.Build.TYPE
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0091
        L_0x0088:
            return
        L_0x0089:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch:{ SecurityException -> 0x0091 }
            java.lang.String r0 = "context.getSystemService(Context.APP_OPS_SERVICE) is null"
            r5.<init>(r0)     // Catch:{ SecurityException -> 0x0091 }
            throw r5     // Catch:{ SecurityException -> 0x0091 }
        L_0x0091:
            java.lang.SecurityException r5 = new java.lang.SecurityException
            int r0 = android.os.Binder.getCallingUid()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 52
            r1.<init>(r2)
            java.lang.String r2 = "Calling UID "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " is not Google Play services."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkg.K0():void");
    }
}
