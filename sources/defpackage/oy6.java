package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: oy6  reason: default package */
public final class oy6 extends ffe implements a66 {
    public ArrayList X;
    public ArrayList Y;
    public ArrayList Z;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ a86 u0;
    public final /* synthetic */ zme v0;
    public final /* synthetic */ fz6 w0;
    public final /* synthetic */ int x0;
    public final /* synthetic */ int y0;
    public final /* synthetic */ boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oy6(a86 a86, zme zme, fz6 fz6, int i, int i2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u0 = a86;
        this.v0 = zme;
        this.w0 = fz6;
        this.x0 = i;
        this.y0 = i2;
        this.z0 = z;
    }

    public static final void r(sx3 sx3, fz6 fz6, zme zme, boolean z) {
        vxd vxd;
        pag.j(sx3.getCoroutineContext());
        if (z && (vxd = fz6.C0) != null && vxd.isActive()) {
            throw new ic3("content change", 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r1.C0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean s(defpackage.sx3 r0, defpackage.fz6 r1, defpackage.zme r2, boolean r3) {
        /*
            r(r0, r1, r2, r3)
            if (r3 == 0) goto L_0x0019
            boolean r0 = defpackage.j1e.z(r0)
            if (r0 == 0) goto L_0x0017
            vxd r0 = r1.C0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            return r0
        L_0x0019:
            boolean r0 = defpackage.j1e.z(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy6.s(sx3, fz6, zme, boolean):boolean");
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oy6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oy6 oy6 = new oy6(this.u0, this.v0, this.w0, this.x0, this.y0, this.z0, continuation);
        oy6.t0 = obj;
        return oy6;
    }

    public final Object o(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z;
        sx3 sx3;
        Throwable th;
        tx3 tx3 = tx3.a;
        int i = this.s0;
        boolean z2 = this.z0;
        fz6 fz6 = this.w0;
        zme zme = this.v0;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.t0;
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            a86 a86 = this.u0;
            for (u76 u76 : a86.d()) {
                ContentResolver contentResolver = fz6.o;
                jy6 jy6 = r6;
                tx3 tx32 = tx3;
                ContentResolver contentResolver2 = contentResolver;
                u76 u762 = u76;
                boolean z3 = z2;
                a86 a862 = a86;
                ArrayList arrayList6 = arrayList5;
                ArrayList arrayList7 = arrayList4;
                jy6 jy62 = new jy6(u76, arrayList4, arrayList5, this.z0, sx32, fz6, this.v0);
                Uri i2 = u762.i();
                u76 u763 = u762;
                String e = a862.e(u763);
                String[] a = a862.a(u763);
                String g = au1.g(u763.d(), " DESC");
                Bundle bundle = new Bundle();
                int i3 = this.x0;
                if (i3 != -1) {
                    bundle.putInt("android:query-arg-limit", i3);
                }
                int i4 = this.y0;
                if (i4 != -1) {
                    bundle.putInt("android:query-arg-offset", i4);
                }
                if (g != null) {
                    bundle.putStringArray("android:query-arg-sort-columns", new String[]{g});
                }
                if (e != null) {
                    bundle.putString("android:query-arg-sql-selection", e);
                }
                if (a != null) {
                    bundle.putStringArray("android:query-arg-sql-selection-args", a);
                }
                Cursor query = contentResolver2.query(i2, u763.d, bundle, (CancellationSignal) null);
                if (query != null) {
                    try {
                        jy6.invoke(query);
                        v3c.i(query, (Throwable) null);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        v3c.i(query, th);
                        throw th3;
                    }
                }
                a86 = a862;
                tx3 = tx32;
                z2 = z3;
                arrayList5 = arrayList6;
                arrayList4 = arrayList7;
            }
            tx3 tx33 = tx3;
            boolean z4 = z2;
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList4;
            if (!arrayList8.isEmpty() || !arrayList9.isEmpty()) {
                z = z4;
                if (s(sx32, fz6, zme, z)) {
                    arrayList8.size();
                    arrayList9.size();
                    arrayList3 = new ArrayList(arrayList9.size() + arrayList8.size());
                    arrayList2 = arrayList8;
                    arrayList3.addAll(arrayList2);
                    arrayList = arrayList9;
                    arrayList3.addAll(arrayList);
                    vxd T = j47.T(sx32, ((w9a) fz6.c).b(), (vx3) null, new ly6(arrayList3, (Continuation) null), 2);
                    kke kke = fz6.c;
                    x77[] x77Arr = {T, j47.T(sx32, ((w9a) kke).b(), (vx3) null, new my6(arrayList2, (Continuation) null), 2), j47.T(sx32, ((w9a) kke).b(), (vx3) null, new ny6(arrayList, (Continuation) null), 2)};
                    this.t0 = sx32;
                    this.X = arrayList;
                    this.Y = arrayList2;
                    this.Z = arrayList3;
                    this.s0 = 1;
                    tx3 tx34 = tx33;
                    if (pag.t(x77Arr, this) == tx34) {
                        return tx34;
                    }
                    sx3 = sx32;
                }
            }
            zme.getClass();
            nz4 nz4 = nz4.a;
            return new gy6(nz4, nz4, nz4);
        } else if (i == 1) {
            ArrayList arrayList10 = this.Z;
            ArrayList arrayList11 = this.Y;
            ArrayList arrayList12 = this.X;
            sx3 = (sx3) this.t0;
            od2.a0(obj);
            ArrayList arrayList13 = arrayList11;
            arrayList3 = arrayList10;
            z = z2;
            arrayList = arrayList12;
            arrayList2 = arrayList13;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zme.getClass();
        r(sx3, fz6, zme, z);
        return new gy6(arrayList3, arrayList, arrayList2);
    }
}
