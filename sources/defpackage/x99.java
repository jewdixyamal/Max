package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.io.DataOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* renamed from: x99  reason: default package */
public final class x99 implements z4d {
    public final Object X;
    public Object Y;
    public Object a;
    public Object b;
    public final Object c;
    public final Object o;

    public x99(long j, sx3 sx3, rp9 rp9, ds3 ds3, je7 je7) {
        this.a = rp9;
        this.b = je7;
        kld a2 = lld.a(1, 1, 2);
        this.c = a2;
        this.o = new v7c(a2);
        q0e a3 = r0e.a(i2b.a);
        this.X = a3;
        this.Y = new w7c(a3);
        od2.L(new zn5(ds3.c(j), new bmb(this, (Continuation) null), 5), sx3);
    }

    public static void f(a94 a94, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = a94.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public void a(h4d h4d) {
        ((kld) this.c).g(h4d);
    }

    public void b(j4d j4d) {
        boolean z = j4d instanceof h4d;
        k56 k56 = (k56) this.a;
        if (!z) {
            k56.invoke();
            return;
        }
        Object value = ((w7c) this.Y).a.getValue();
        j2b j2b = value instanceof j2b ? (j2b) value : null;
        if (j2b == null || ((h4d) j4d).c != j2b.b) {
            ((k4a) ((pk) ((je7) this.b).getValue())).H(1, ((h4d) j4d).c, (a20) null, (String) null, (String) null, (String) null, (String) null, (String) null);
            k56.invoke();
            return;
        }
        k56.invoke();
    }

    public w7c c() {
        return (w7c) this.Y;
    }

    public void d(qo9 qo9) {
        ((q0e) this.X).m((Object) null, new j2b(qo9.a, qo9.b, qo9.c));
    }

    public v7c e() {
        return (v7c) this.o;
    }

    public dre g() {
        return new dre(v0c.oneme_login_neuro_avatars_profile_title, v0c.oneme_login_neuro_avatars_profile_description, v0c.oneme_login_neuro_avatars_save_button);
    }

    public fad h() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.o;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        bad d = bad.d((w99) this.c, size);
        d.b.c = 1;
        fw6 fw6 = new fw6(surface);
        this.a = fw6;
        kq0.a(kq0.w(fw6.e), new y7g((Object) surface, 25, (Object) surfaceTexture), ju0.k());
        d.b((fw6) this.a, eu4.d, -1);
        cad cad = (cad) this.Y;
        if (cad != null) {
            cad.b();
        }
        cad cad2 = new cad(new kt6(2, this));
        this.Y = cad2;
        d.f = cad2;
        return d.c();
    }

    public lx0 i(String str) {
        return (lx0) ((HashMap) this.a).get(str);
    }

    public lx0 j(String str) {
        HashMap hashMap = (HashMap) this.a;
        lx0 lx0 = (lx0) hashMap.get(str);
        if (lx0 != null) {
            return lx0;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        lx0 lx02 = new lx0(keyAt, str, a94.c);
        hashMap.put(str, lx02);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.o).put(keyAt, true);
        ((nx0) this.X).q(lx02);
        return lx02;
    }

    public void k(long j) {
        nx0 nx0;
        nx0 nx02 = (nx0) this.X;
        nx02.i(j);
        nx0 nx03 = (nx0) this.Y;
        if (nx03 != null) {
            nx03.i(j);
        }
        boolean f = nx02.f();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        if (f || (nx0 = (nx0) this.Y) == null || !nx0.f()) {
            nx02.k(hashMap, sparseArray);
        } else {
            ((nx0) this.Y).k(hashMap, sparseArray);
            nx02.a(hashMap);
        }
        nx0 nx04 = (nx0) this.Y;
        if (nx04 != null) {
            nx04.l();
            this.Y = null;
        }
    }

    public void l(String str) {
        HashMap hashMap = (HashMap) this.a;
        lx0 lx0 = (lx0) hashMap.get(str);
        if (lx0 != null && lx0.c.isEmpty() && lx0.d.isEmpty()) {
            hashMap.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.o;
            int i = lx0.a;
            boolean z = sparseBooleanArray.get(i);
            ((nx0) this.X).p(lx0, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
                return;
            }
            sparseArray.put(i, (Object) null);
            ((SparseBooleanArray) this.c).put(i, true);
        }
    }

    public synchronized void m(f1f f1f) {
        try {
            fm9.k(((AtomicInteger) this.X).getAndDecrement() > 0);
            ty a2 = ((f1f) this.Y).a();
            if (!oaf.a(f1f.b, ((f1f) this.o).b)) {
                a2.b(f1f.b);
            }
            if (!oaf.a(f1f.c, ((f1f) this.o).c)) {
                a2.c(f1f.c);
            }
            int i = f1f.a;
            f1f f1f2 = (f1f) this.o;
            if (i != f1f2.a) {
                a2.a = i;
            }
            int i2 = f1f.d;
            if (i2 != f1f2.d) {
                a2.b = i2;
            }
            f1f a3 = a2.a();
            this.Y = a3;
            if (((AtomicInteger) this.X).get() == 0 && !((f1f) this.o).equals((f1f) this.Y)) {
                ((bie) ((di6) this.c)).d(new kl4((Object) this, 23, (Object) a3));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void n() {
        ((nx0) this.X).h((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.o).clear();
    }

    public x99(dd3 dd3, pm7 pm7, di6 di6, f1f f1f) {
        this.a = dd3;
        this.b = pm7;
        this.c = di6;
        this.o = f1f;
        this.Y = f1f;
        this.X = new AtomicInteger();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        r11 = (android.util.Size) r0.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x99(defpackage.xv1 r11, defpackage.ul4 r12, defpackage.tt1 r13) {
        /*
            r10 = this;
            r10.<init>()
            aee r0 = new aee
            r0.<init>()
            r1 = 0
            r10.Y = r1
            w99 r2 = new w99
            r2.<init>()
            r10.c = r2
            r10.X = r13
            c8d r11 = r11.b()
            r13 = 34
            android.util.Size[] r11 = r11.s(r13)
            r13 = 0
            if (r11 != 0) goto L_0x0028
            android.util.Size r11 = new android.util.Size
            r11.<init>(r13, r13)
            goto L_0x00ae
        L_0x0028:
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r0 = r0.a
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "Huawei"
            java.lang.String r2 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "mha-l29"
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0063
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r11.length
            r3 = r13
        L_0x0047:
            if (r3 >= r2) goto L_0x005b
            r4 = r11[r3]
            x93 r5 = defpackage.aee.c
            android.util.Size r6 = defpackage.aee.b
            int r5 = r5.compare(r4, r6)
            if (r5 < 0) goto L_0x0058
            r0.add(r4)
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x0047
        L_0x005b:
            android.util.Size[] r11 = new android.util.Size[r13]
            java.lang.Object[] r11 = r0.toArray(r11)
            android.util.Size[] r11 = (android.util.Size[]) r11
        L_0x0063:
            java.util.List r0 = java.util.Arrays.asList(r11)
            ye4 r2 = new ye4
            r3 = 9
            r2.<init>(r3)
            java.util.Collections.sort(r0, r2)
            android.util.Size r12 = r12.e()
            int r2 = r12.getWidth()
            long r2 = (long) r2
            int r12 = r12.getHeight()
            long r4 = (long) r12
            long r2 = r2 * r4
            r4 = 307200(0x4b000, double:1.51777E-318)
            long r2 = java.lang.Math.min(r2, r4)
            int r12 = r11.length
            r4 = r13
        L_0x0089:
            if (r4 >= r12) goto L_0x00a8
            r5 = r11[r4]
            int r6 = r5.getWidth()
            long r6 = (long) r6
            int r8 = r5.getHeight()
            long r8 = (long) r8
            long r6 = r6 * r8
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x009e
            r11 = r5
            goto L_0x00ae
        L_0x009e:
            if (r6 <= 0) goto L_0x00a4
            if (r1 == 0) goto L_0x00a8
            r11 = r1
            goto L_0x00ae
        L_0x00a4:
            int r4 = r4 + 1
            r1 = r5
            goto L_0x0089
        L_0x00a8:
            java.lang.Object r11 = r0.get(r13)
            android.util.Size r11 = (android.util.Size) r11
        L_0x00ae:
            r10.o = r11
            java.util.Objects.toString(r11)
            fad r11 = r10.h()
            r10.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x99.<init>(xv1, ul4, tt1):void");
    }

    public x99(File file) {
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.o = new SparseBooleanArray();
        nx0 nx0 = new nx0(new File(file, "cached_content_index.exi"), 0);
        int i = maf.a;
        this.X = nx0;
        this.Y = null;
    }
}
