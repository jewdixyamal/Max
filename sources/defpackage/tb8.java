package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: tb8  reason: default package */
public final class tb8 {
    public static final tb8 g;
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final String m = Integer.toString(5, 36);
    public final String a;
    public final ib8 b;
    public final hb8 c;
    public final gd8 d;
    public final db8 e;
    public final lb8 f;

    static {
        za8 za8 = new za8();
        s74 s74 = new s74();
        Collections.emptyList();
        ffc ffc = ffc.X;
        fb8 fb8 = new fb8();
        lb8 lb8 = lb8.d;
        fm9.k(((Uri) s74.e) == null || ((UUID) s74.d) != null);
        g = new tb8("", za8.c(), (ib8) null, fb8.a(), gd8.J, lb8);
    }

    public tb8(String str, db8 db8, ib8 ib8, hb8 hb8, gd8 gd8, lb8 lb8) {
        this.a = str;
        this.b = ib8;
        this.c = hb8;
        this.d = gd8;
        this.e = db8;
        this.f = lb8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: bb8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: db8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: bb8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: db8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.tb8 b(android.os.Bundle r27) {
        /*
            r0 = r27
            r1 = 0
            java.lang.String r2 = h
            java.lang.String r3 = ""
            java.lang.String r5 = r0.getString(r2, r3)
            r5.getClass()
            java.lang.String r2 = i
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x001a
            hb8 r2 = defpackage.hb8.f
        L_0x0018:
            r8 = r2
            goto L_0x001f
        L_0x001a:
            hb8 r2 = defpackage.hb8.b(r2)
            goto L_0x0018
        L_0x001f:
            java.lang.String r2 = j
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x002b
            gd8 r2 = defpackage.gd8.J
        L_0x0029:
            r9 = r2
            goto L_0x0030
        L_0x002b:
            gd8 r2 = defpackage.gd8.b(r2)
            goto L_0x0029
        L_0x0030:
            java.lang.String r2 = k
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x003c
            db8 r2 = defpackage.db8.p
        L_0x003a:
            r6 = r2
            goto L_0x009f
        L_0x003c:
            za8 r3 = new za8
            r3.<init>()
            bb8 r4 = defpackage.bb8.h
            long r6 = r4.a
            java.lang.String r10 = defpackage.bb8.i
            long r6 = r2.getLong(r10, r6)
            r3.e(r6)
            java.lang.String r6 = defpackage.bb8.j
            long r10 = r4.c
            long r6 = r2.getLong(r6, r10)
            long r6 = defpackage.oaf.S(r6)
            r3.d(r6)
            java.lang.String r6 = defpackage.bb8.k
            boolean r7 = r4.e
            boolean r6 = r2.getBoolean(r6, r7)
            r3.c = r6
            java.lang.String r6 = defpackage.bb8.l
            boolean r7 = r4.f
            boolean r6 = r2.getBoolean(r6, r7)
            r3.d = r6
            java.lang.String r6 = defpackage.bb8.m
            boolean r7 = r4.g
            boolean r6 = r2.getBoolean(r6, r7)
            r3.e = r6
            java.lang.String r6 = defpackage.bb8.n
            long r10 = r4.b
            long r6 = r2.getLong(r6, r10)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x008a
            r3.f(r6)
        L_0x008a:
            java.lang.String r6 = defpackage.bb8.o
            long r10 = r4.d
            long r6 = r2.getLong(r6, r10)
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0099
            r3.d(r6)
        L_0x0099:
            db8 r2 = new db8
            r2.<init>(r3)
            goto L_0x003a
        L_0x009f:
            java.lang.String r2 = l
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x00ab
            lb8 r2 = defpackage.lb8.d
        L_0x00a9:
            r10 = r2
            goto L_0x00d2
        L_0x00ab:
            nw4 r3 = new nw4
            r4 = 8
            r3.<init>((int) r4)
            java.lang.String r4 = defpackage.lb8.e
            android.os.Parcelable r4 = r2.getParcelable(r4)
            android.net.Uri r4 = (android.net.Uri) r4
            r3.b = r4
            java.lang.String r4 = defpackage.lb8.f
            java.lang.String r4 = r2.getString(r4)
            r3.c = r4
            java.lang.String r4 = defpackage.lb8.g
            android.os.Bundle r2 = r2.getBundle(r4)
            r3.o = r2
            lb8 r2 = new lb8
            r2.<init>(r3)
            goto L_0x00a9
        L_0x00d2:
            java.lang.String r2 = m
            android.os.Bundle r0 = r0.getBundle(r2)
            if (r0 != 0) goto L_0x00dd
            r7 = 0
            goto L_0x0243
        L_0x00dd:
            java.lang.String r3 = defpackage.ib8.l
            android.os.Bundle r3 = r0.getBundle(r3)
            if (r3 != 0) goto L_0x00e9
            r19 = 0
            goto L_0x0190
        L_0x00e9:
            java.lang.String r4 = defpackage.eb8.i
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            java.util.UUID r4 = java.util.UUID.fromString(r4)
            java.lang.String r7 = defpackage.eb8.j
            android.os.Parcelable r7 = r3.getParcelable(r7)
            android.net.Uri r7 = (android.net.Uri) r7
            android.os.Bundle r11 = android.os.Bundle.EMPTY
            java.lang.String r12 = defpackage.eb8.k
            android.os.Bundle r12 = r3.getBundle(r12)
            if (r12 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r12 = r11
        L_0x010a:
            if (r12 != r11) goto L_0x010f
            kfc r11 = defpackage.kfc.s0
            goto L_0x0139
        L_0x010f:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            if (r12 != r11) goto L_0x0117
            goto L_0x0135
        L_0x0117:
            java.util.Set r11 = r12.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x011f:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0135
            java.lang.Object r14 = r11.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r12.getString(r14)
            if (r15 == 0) goto L_0x011f
            r13.put(r14, r15)
            goto L_0x011f
        L_0x0135:
            cx6 r11 = defpackage.cx6.b(r13)
        L_0x0139:
            java.lang.String r12 = defpackage.eb8.l
            boolean r12 = r3.getBoolean(r12, r1)
            java.lang.String r13 = defpackage.eb8.m
            boolean r13 = r3.getBoolean(r13, r1)
            java.lang.String r14 = defpackage.eb8.n
            boolean r14 = r3.getBoolean(r14, r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r2 = defpackage.eb8.o
            java.util.ArrayList r2 = r3.getIntegerArrayList(r2)
            if (r2 == 0) goto L_0x0159
            r15 = r2
        L_0x0159:
            zw6 r2 = defpackage.zw6.j(r15)
            java.lang.String r15 = defpackage.eb8.p
            byte[] r3 = r3.getByteArray(r15)
            s74 r15 = new s74
            r15.<init>()
            r15.d = r4
            r15.e = r7
            cx6 r4 = defpackage.cx6.b(r11)
            r15.f = r4
            r15.a = r12
            r15.c = r14
            r15.b = r13
            zw6 r2 = defpackage.zw6.j(r2)
            r15.g = r2
            if (r3 == 0) goto L_0x0186
            int r2 = r3.length
            byte[] r2 = java.util.Arrays.copyOf(r3, r2)
            goto L_0x0187
        L_0x0186:
            r2 = 0
        L_0x0187:
            r15.h = r2
            eb8 r2 = new eb8
            r2.<init>(r15)
            r19 = r2
        L_0x0190:
            java.lang.String r2 = defpackage.ib8.m
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x019b
            r20 = 0
            goto L_0x01b6
        L_0x019b:
            java.lang.String r3 = defpackage.xa8.b
            android.os.Parcelable r2 = r2.getParcelable(r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r2.getClass()
            o9g r3 = new o9g
            r4 = 20
            r3.<init>((int) r4, (boolean) r1)
            r3.b = r2
            xa8 r2 = new xa8
            r2.<init>(r3)
            r20 = r2
        L_0x01b6:
            java.lang.String r2 = defpackage.ib8.n
            java.util.ArrayList r2 = r0.getParcelableArrayList(r2)
            if (r2 != 0) goto L_0x01c5
            ls5 r1 = defpackage.zw6.b
            ffc r1 = defpackage.ffc.X
        L_0x01c2:
            r21 = r1
            goto L_0x01fb
        L_0x01c5:
            ww6 r3 = defpackage.zw6.i()
            r4 = r1
        L_0x01ca:
            int r7 = r2.size()
            if (r4 >= r7) goto L_0x01f6
            java.lang.Object r7 = r2.get(r4)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r7.getClass()
            x8e r11 = new x8e
            java.lang.String r12 = defpackage.x8e.o
            int r12 = r7.getInt(r12, r1)
            java.lang.String r13 = defpackage.x8e.X
            int r13 = r7.getInt(r13, r1)
            java.lang.String r14 = defpackage.x8e.Y
            int r7 = r7.getInt(r14, r1)
            r11.<init>(r12, r13, r7)
            r3.a(r11)
            int r4 = r4 + 1
            goto L_0x01ca
        L_0x01f6:
            ffc r1 = r3.j()
            goto L_0x01c2
        L_0x01fb:
            java.lang.String r1 = defpackage.ib8.p
            java.util.ArrayList r1 = r0.getParcelableArrayList(r1)
            if (r1 != 0) goto L_0x020a
            ls5 r1 = defpackage.zw6.b
            ffc r1 = defpackage.ffc.X
        L_0x0207:
            r23 = r1
            goto L_0x0215
        L_0x020a:
            wa8 r2 = new wa8
            r3 = 5
            r2.<init>(r3)
            ffc r1 = defpackage.nu0.i(r2, r1)
            goto L_0x0207
        L_0x0215:
            java.lang.String r1 = defpackage.ib8.q
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r25 = r0.getLong(r1, r2)
            ib8 r1 = new ib8
            java.lang.String r2 = defpackage.ib8.j
            android.os.Parcelable r2 = r0.getParcelable(r2)
            r17 = r2
            android.net.Uri r17 = (android.net.Uri) r17
            r17.getClass()
            java.lang.String r2 = defpackage.ib8.k
            java.lang.String r18 = r0.getString(r2)
            java.lang.String r2 = defpackage.ib8.o
            java.lang.String r22 = r0.getString(r2)
            r24 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = r1
        L_0x0243:
            tb8 r0 = new tb8
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb8.b(android.os.Bundle):tb8");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: bb8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: db8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.tb8 c(android.net.Uri r21) {
        /*
            za8 r0 = new za8
            r0.<init>()
            s74 r1 = new s74
            r1.<init>()
            java.util.List r7 = java.util.Collections.emptyList()
            ffc r9 = defpackage.ffc.X
            fb8 r13 = new fb8
            r13.<init>()
            lb8 r20 = defpackage.lb8.d
            java.lang.Object r2 = r1.e
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.d
            java.util.UUID r2 = (java.util.UUID) r2
            if (r2 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = 0
            goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            defpackage.fm9.k(r2)
            r2 = 0
            if (r21 == 0) goto L_0x004d
            ib8 r14 = new ib8
            java.lang.Object r3 = r1.d
            java.util.UUID r3 = (java.util.UUID) r3
            if (r3 == 0) goto L_0x003a
            eb8 r2 = new eb8
            r2.<init>(r1)
        L_0x003a:
            r5 = r2
            r10 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r6 = 0
            r8 = 0
            r2 = r14
            r3 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r17 = r14
            goto L_0x004f
        L_0x004d:
            r17 = r2
        L_0x004f:
            tb8 r1 = new tb8
            db8 r2 = new db8
            r2.<init>(r0)
            hb8 r0 = new hb8
            r0.<init>(r13)
            gd8 r19 = defpackage.gd8.J
            java.lang.String r15 = ""
            r14 = r1
            r16 = r2
            r18 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb8.c(android.net.Uri):tb8");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ya8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [s74, java.lang.Object] */
    public final ya8 a() {
        s74 s74;
        ? obj = new Object();
        obj.d = new za8();
        obj.e = new s74();
        obj.f = Collections.emptyList();
        obj.h = ffc.X;
        obj.m = new fb8();
        obj.n = lb8.d;
        obj.k = -9223372036854775807L;
        obj.d = this.e.a();
        obj.a = this.a;
        obj.l = this.d;
        obj.m = this.c.a();
        obj.n = this.f;
        ib8 ib8 = this.b;
        if (ib8 != null) {
            obj.g = ib8.f;
            obj.c = ib8.b;
            obj.b = ib8.a;
            obj.f = ib8.e;
            obj.h = ib8.g;
            obj.j = ib8.h;
            eb8 eb8 = ib8.c;
            if (eb8 != null) {
                ? obj2 = new Object();
                obj2.d = eb8.a;
                obj2.e = eb8.b;
                obj2.f = eb8.c;
                obj2.a = eb8.d;
                obj2.b = eb8.e;
                obj2.c = eb8.f;
                obj2.g = eb8.g;
                obj2.h = eb8.h;
                s74 = obj2;
            } else {
                s74 = new s74();
            }
            obj.e = s74;
            obj.i = ib8.d;
            obj.k = ib8.i;
        }
        return obj;
    }

    public final Bundle d(boolean z) {
        ib8 ib8;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        hb8 hb8 = hb8.f;
        hb8 hb82 = this.c;
        if (!hb82.equals(hb8)) {
            bundle.putBundle(i, hb82.c());
        }
        gd8 gd8 = gd8.J;
        gd8 gd82 = this.d;
        if (!gd82.equals(gd8)) {
            bundle.putBundle(j, gd82.c());
        }
        bb8 bb8 = bb8.h;
        db8 db8 = this.e;
        if (!db8.equals(bb8)) {
            Bundle bundle2 = new Bundle();
            long j2 = bb8.a;
            long j3 = db8.a;
            if (j3 != j2) {
                bundle2.putLong(bb8.i, j3);
            }
            long j4 = bb8.c;
            long j5 = db8.c;
            if (j5 != j4) {
                bundle2.putLong(bb8.j, j5);
            }
            long j6 = bb8.b;
            long j7 = db8.b;
            if (j7 != j6) {
                bundle2.putLong(bb8.n, j7);
            }
            long j8 = bb8.d;
            long j9 = db8.d;
            if (j9 != j8) {
                bundle2.putLong(bb8.o, j9);
            }
            boolean z2 = bb8.e;
            boolean z3 = db8.e;
            if (z3 != z2) {
                bundle2.putBoolean(bb8.k, z3);
            }
            boolean z4 = bb8.f;
            boolean z5 = db8.f;
            if (z5 != z4) {
                bundle2.putBoolean(bb8.l, z5);
            }
            boolean z6 = bb8.g;
            boolean z7 = db8.g;
            if (z7 != z6) {
                bundle2.putBoolean(bb8.m, z7);
            }
            bundle.putBundle(k, bundle2);
        }
        lb8 lb8 = lb8.d;
        lb8 lb82 = this.f;
        if (!lb82.equals(lb8)) {
            Bundle bundle3 = new Bundle();
            Uri uri = lb82.a;
            if (uri != null) {
                bundle3.putParcelable(lb8.e, uri);
            }
            String str2 = lb82.b;
            if (str2 != null) {
                bundle3.putString(lb8.f, str2);
            }
            Bundle bundle4 = lb82.c;
            if (bundle4 != null) {
                bundle3.putBundle(lb8.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (ib8 = this.b) != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(ib8.j, ib8.a);
            String str3 = ib8.b;
            if (str3 != null) {
                bundle5.putString(ib8.k, str3);
            }
            eb8 eb8 = ib8.c;
            if (eb8 != null) {
                Bundle bundle6 = new Bundle();
                bundle6.putString(eb8.i, eb8.a.toString());
                Uri uri2 = eb8.b;
                if (uri2 != null) {
                    bundle6.putParcelable(eb8.j, uri2);
                }
                cx6 cx6 = eb8.c;
                if (!cx6.isEmpty()) {
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : cx6.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(eb8.k, bundle7);
                }
                boolean z8 = eb8.d;
                if (z8) {
                    bundle6.putBoolean(eb8.l, z8);
                }
                boolean z9 = eb8.e;
                if (z9) {
                    bundle6.putBoolean(eb8.m, z9);
                }
                boolean z10 = eb8.f;
                if (z10) {
                    bundle6.putBoolean(eb8.n, z10);
                }
                zw6 zw6 = eb8.g;
                if (!zw6.isEmpty()) {
                    bundle6.putIntegerArrayList(eb8.o, new ArrayList(zw6));
                }
                byte[] bArr = eb8.h;
                if (bArr != null) {
                    bundle6.putByteArray(eb8.p, bArr);
                }
                bundle5.putBundle(ib8.l, bundle6);
            }
            xa8 xa8 = ib8.d;
            if (xa8 != null) {
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(xa8.b, xa8.a);
                bundle5.putBundle(ib8.m, bundle8);
            }
            List list = ib8.e;
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(ib8.n, nu0.R(list, new wa8(3)));
            }
            String str4 = ib8.f;
            if (str4 != null) {
                bundle5.putString(ib8.o, str4);
            }
            zw6 zw62 = ib8.g;
            if (!zw62.isEmpty()) {
                bundle5.putParcelableArrayList(ib8.p, nu0.R(zw62, new wa8(4)));
            }
            long j10 = ib8.i;
            if (j10 != -9223372036854775807L) {
                bundle5.putLong(ib8.q, j10);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb8)) {
            return false;
        }
        tb8 tb8 = (tb8) obj;
        return oaf.a(this.a, tb8.a) && this.e.equals(tb8.e) && oaf.a(this.b, tb8.b) && oaf.a(this.c, tb8.c) && oaf.a(this.d, tb8.d) && oaf.a(this.f, tb8.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ib8 ib8 = this.b;
        int hashCode2 = ib8 != null ? ib8.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((this.d.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31);
    }
}
