package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: va4  reason: default package */
public final class va4 implements ra5 {
    public static final int[] s0 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final ph4 t0 = new ph4(new ta4(0));
    public static final ph4 u0 = new ph4(new ta4(1));
    public boolean X = true;
    public mbe Y = new Object();
    public int Z;
    public boolean a;
    public int b;
    public int c;
    public ffc o;

    public final synchronized la5[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056 A[Catch:{ all -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.la5[] b(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            int[] r1 = s0     // Catch:{ all -> 0x0048 }
            r2 = 21
            r0.<init>(r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x0048 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0048 }
            r3 = 0
            if (r8 == 0) goto L_0x0023
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0023
        L_0x001c:
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0048 }
            goto L_0x0024
        L_0x0023:
            r8 = 0
        L_0x0024:
            int r8 = defpackage.ote.A(r8)     // Catch:{ all -> 0x0048 }
            r4 = -1
            if (r8 == r4) goto L_0x002e
            r6.c(r0, r8)     // Catch:{ all -> 0x0048 }
        L_0x002e:
            int r7 = defpackage.ote.B(r7)     // Catch:{ all -> 0x0048 }
            if (r7 == r4) goto L_0x0039
            if (r7 == r8) goto L_0x0039
            r6.c(r0, r7)     // Catch:{ all -> 0x0048 }
        L_0x0039:
            r4 = r3
        L_0x003a:
            if (r4 >= r2) goto L_0x004a
            r5 = r1[r4]     // Catch:{ all -> 0x0048 }
            if (r5 == r8) goto L_0x0045
            if (r5 == r7) goto L_0x0045
            r6.c(r0, r5)     // Catch:{ all -> 0x0048 }
        L_0x0045:
            int r4 = r4 + 1
            goto L_0x003a
        L_0x0048:
            r7 = move-exception
            goto L_0x0097
        L_0x004a:
            int r7 = r0.size()     // Catch:{ all -> 0x0048 }
            la5[] r7 = new defpackage.la5[r7]     // Catch:{ all -> 0x0048 }
        L_0x0050:
            int r8 = r0.size()     // Catch:{ all -> 0x0048 }
            if (r3 >= r8) goto L_0x0095
            java.lang.Object r8 = r0.get(r3)     // Catch:{ all -> 0x0048 }
            la5 r8 = (defpackage.la5) r8     // Catch:{ all -> 0x0048 }
            boolean r1 = r6.X     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0090
            la5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.f26     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            la5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.wd9     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            la5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.i3f     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            la5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.xd0     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            la5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.d28     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            pbe r1 = new pbe     // Catch:{ all -> 0x0048 }
            mbe r2 = r6.Y     // Catch:{ all -> 0x0048 }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x0048 }
            r8 = r1
        L_0x0090:
            r7[r3] = r8     // Catch:{ all -> 0x0048 }
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0095:
            monitor-exit(r6)
            return r7
        L_0x0097:
            monitor-exit(r6)     // Catch:{ all -> 0x0048 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va4.b(android.net.Uri, java.util.Map):la5[]");
    }

    public final void c(ArrayList arrayList, int i) {
        int i2 = 2;
        int i3 = 0;
        switch (i) {
            case 0:
                arrayList.add(new r3());
                return;
            case 1:
                arrayList.add(new v3());
                return;
            case 2:
                arrayList.add(new ec(this.a ? 1 : 0));
                return;
            case 3:
                arrayList.add(new zc(this.a ? 1 : 0));
                return;
            case 4:
                la5 o2 = t0.o(0);
                if (o2 != null) {
                    arrayList.add(o2);
                    return;
                } else {
                    arrayList.add(new mm5());
                    return;
                }
            case 5:
                arrayList.add(new qs5());
                return;
            case 6:
                mbe mbe = this.Y;
                int i4 = this.b;
                if (this.X) {
                    i2 = 0;
                }
                arrayList.add(new d28(i4 | i2, mbe));
                return;
            case 7:
                arrayList.add(new sd9(this.a ? 1 : 0));
                return;
            case 8:
                arrayList.add(new f26(this.X ? 0 : 32, this.Y));
                mbe mbe2 = this.Y;
                int i5 = this.c;
                if (!this.X) {
                    i3 = 16;
                }
                arrayList.add(new wd9(i5 | i3, mbe2));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new spb());
                return;
            case 11:
                if (this.o == null) {
                    ls5 ls5 = zw6.b;
                    this.o = ffc.X;
                }
                arrayList.add(new i3f(1, this.X ^ true ? 1 : 0, this.Y, new tue(0), new df4(this.o, 0, 1)));
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                arrayList.add(new asf());
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                arrayList.add(new mc4(this.Z));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                la5 o3 = u0.o(new Object[0]);
                if (o3 != null) {
                    arrayList.add(o3);
                    return;
                }
                return;
            case 16:
                arrayList.add(new xd0(this.X ^ true ? 1 : 0, this.Y));
                return;
            case LangUtils.HASH_SEED /*17*/:
                arrayList.add(new vp0(1));
                return;
            case 18:
                arrayList.add(new ae0(2));
                return;
            case 19:
                arrayList.add(new vp0(0));
                return;
            case 20:
                int i6 = this.c;
                if ((i6 & 2) == 0 && (i6 & 4) == 0) {
                    arrayList.add(new ae0(1));
                    return;
                }
                return;
            case 21:
                arrayList.add(new ae0(0));
                return;
            default:
                return;
        }
    }

    public final void d(b46 b46) {
        synchronized (this) {
            this.Y = b46;
        }
    }

    public final void h(boolean z) {
        synchronized (this) {
            this.X = z;
        }
    }
}
