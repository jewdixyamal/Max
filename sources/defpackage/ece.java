package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ece  reason: default package */
public final class ece implements a76, ofc, ifg {
    public Object a;

    public /* synthetic */ ece(Object obj) {
        this.a = obj;
    }

    public static List b(List list, b7b b7b) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            iq0 iq0 = (iq0) list.get(i);
            try {
                if (b7b.test(iq0)) {
                    String str = iq0.c;
                    arrayList.add(new ybe((iq0.a * 31) + ((long) i), 3, str, iq0.d, str, (String) null, (r7b) null, (String) null));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static jce c(String str, int i, j92 j92) {
        int i2;
        boolean z = true;
        boolean z2 = !str.isEmpty() && str.charAt(0) == '/';
        j92 j922 = j92.a;
        jce jce = jce.c;
        jce jce2 = jce.o;
        if (j92 == j922) {
            if (bre.d.matcher(str).matches()) {
                return jce2;
            }
            if (z2) {
                return jce;
            }
        }
        if (bre.b.matcher(str).matches() || bre.e.matcher(str).matches() || z2) {
            return jce;
        }
        if (bre.f.matcher(str).matches()) {
            return jce2;
        }
        if (!str.isEmpty() && str.charAt(0) == '@') {
            if (oag.t(str)) {
                i2 = 0;
            } else {
                i2 = 0;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    if (str.charAt(i3) == '@') {
                        i2++;
                    }
                }
            }
            if (i2 == 1 && !str.contains(" ") && !str.endsWith("\n")) {
                return jce.a;
            }
        }
        String h = h(i, str);
        int e = e(i, str);
        boolean t = oag.t(h);
        jce jce3 = jce.X;
        if (t) {
            return jce3;
        }
        if (e != 0) {
            char charAt = str.charAt(e - 1);
            if (!(charAt == ' ' || charAt == 10)) {
                z = false;
            }
        }
        return (h.charAt(0) != '@' || !z || h.endsWith(" ") || h.endsWith("\n")) ? jce3 : jce.b;
    }

    public static int e(int i, CharSequence charSequence) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char charAt = charSequence.charAt(i2);
            if (charAt == ' ' || charAt == 10) {
                return -1;
            }
            if (charSequence.charAt(i2) == '@') {
                return i2;
            }
        }
        return 0;
    }

    public static String h(int i, String str) {
        if (oag.t(str)) {
            return str;
        }
        int e = e(i, str);
        while (true) {
            if (i >= str.length()) {
                i = str.length();
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == ' ' || charAt == 10) {
                break;
            }
            i++;
        }
        return (e == i || e < 0 || i < 0) ? "" : str.substring(e, i);
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        n05 n05 = (n05) obj;
    }

    /* JADX INFO: finally extract failed */
    public void accept(Object obj, Object obj2) {
        qne qne = (qne) obj2;
        oeg oeg = (oeg) ((seg) obj).o();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(oeg.e);
        int i = rdg.a;
        moe moe = (moe) this.a;
        if (moe == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            moe.writeToParcel(obtain, 0);
        }
        try {
            oeg.d.transact(1, obtain, (Parcel) null, 1);
            obtain.recycle();
            qne.b((Object) null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void d(Throwable th) {
        ((zm4) this.a).u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List f(java.lang.String r11, int r12, java.util.List r13, defpackage.dce r14) {
        /*
            r10 = this;
            java.lang.Object r10 = r10.a
            j92 r10 = (defpackage.j92) r10
            jce r0 = c(r11, r12, r10)
            int r0 = r0.ordinal()
            r1 = 64
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00c9
            if (r0 == r3) goto L_0x00af
            r12 = 2
            if (r0 == r12) goto L_0x0096
            r14 = 3
            if (r0 == r14) goto L_0x0020
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00e3
        L_0x0020:
            java.lang.String r14 = "\\s"
            java.lang.String[] r14 = r11.split(r14)
            j92 r0 = defpackage.j92.a
            if (r10 != r0) goto L_0x0032
            int r12 = r14.length
            if (r12 < r3) goto L_0x0030
            r12 = r14[r2]
            goto L_0x003f
        L_0x0030:
            r12 = r11
            goto L_0x003f
        L_0x0032:
            int r1 = r14.length
            if (r1 < r12) goto L_0x0030
            r12 = r14[r2]
            r14 = r14[r3]
            java.lang.String r1 = " "
            java.lang.String r12 = defpackage.rh4.j(r12, r1, r14)
        L_0x003f:
            m82 r14 = new m82
            r1 = 8
            r14.<init>(r12, r1)
            java.util.List r12 = b(r13, r14)
            if (r10 != r0) goto L_0x004f
            java.util.regex.Pattern r10 = defpackage.bre.d
            goto L_0x0051
        L_0x004f:
            java.util.regex.Pattern r10 = defpackage.bre.f
        L_0x0051:
            java.util.regex.Matcher r10 = r10.matcher(r11)
            boolean r10 = r10.matches()
            if (r10 == 0) goto L_0x0091
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r11 = r12.size()
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
        L_0x006a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00e3
            java.lang.Object r12 = r11.next()
            ybe r12 = (defpackage.ybe) r12     // Catch:{ all -> 0x008a }
            ybe r13 = new ybe     // Catch:{ all -> 0x008a }
            long r1 = r12.a     // Catch:{ all -> 0x008a }
            java.lang.String r6 = r12.d     // Catch:{ all -> 0x008a }
            r7 = 0
            r8 = 0
            r3 = 4
            r9 = 0
            r4 = 0
            r0 = r13
            r5 = r6
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x008a }
            r10.add(r13)     // Catch:{ all -> 0x008a }
            goto L_0x006a
        L_0x008a:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
        L_0x0091:
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00e3
        L_0x0096:
            m82 r10 = new m82
            r12 = 7
            r10.<init>(r11, r12)
            java.util.List r10 = b(r13, r10)
            r11 = r10
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x00aa
            goto L_0x00e3
        L_0x00aa:
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00e3
        L_0x00af:
            java.lang.String r10 = h(r12, r11)
            int r11 = r10.length()
            if (r11 != r3) goto L_0x00c4
            char r11 = r10.charAt(r2)
            if (r11 != r1) goto L_0x00c4
            java.util.List r10 = r14.c()
            goto L_0x00e3
        L_0x00c4:
            java.util.List r10 = r14.g(r10)
            goto L_0x00e3
        L_0x00c9:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r12 = r11.length()
            if (r12 != r3) goto L_0x00dc
            char r12 = r11.charAt(r2)
            if (r12 != r1) goto L_0x00dc
            java.util.List r11 = r14.c()
            goto L_0x00e0
        L_0x00dc:
            java.util.List r11 = r14.g(r11)
        L_0x00e0:
            r10.<init>(r11)
        L_0x00e3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ece.f(java.lang.String, int, java.util.List, dce):java.util.List");
    }

    public Long g() {
        Long l = (Long) this.a;
        Long valueOf = l == null ? null : Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
        this.a = Long.valueOf(SystemClock.elapsedRealtime());
        return valueOf;
    }

    public void i(long j, long j2) {
        h1f h1f = (h1f) this.a;
        t85 t85 = h1f.q;
        t85.getClass();
        boolean z = true;
        fm9.f(j >= 0 || j == -9223372036854775807L);
        t85.b = j;
        if (j2 <= 0 && j2 != -1) {
            z = false;
        }
        fm9.e("Invalid file size = " + j2, z);
        t85.c = j2;
        l1f l1f = h1f.r;
        l1f.getClass();
        l1f.g();
        l1f.j.b((Object) null, 4, 0, 0).b();
    }

    public Object r() {
        Context context = (Context) ((zig) ((ifg) this.a)).a.b;
        if (context != null) {
            return new kkg(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
