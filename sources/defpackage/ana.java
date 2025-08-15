package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import com.google.android.material.chip.ChipGroup;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: ana  reason: default package */
public final class ana implements t2b, f2a {
    public static final byte[] Y = {-1, -39};
    public Object X;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object o;

    public ana() {
        this.c = new HashMap();
        this.o = new HashSet();
    }

    public static BitmapFactory.Options k(g05 g05, Bitmap.Config config, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = g05.s0;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z2 = config == Bitmap.Config.HARDWARE;
        if (!z2) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z) {
            BitmapFactory.decodeStream(g05.n(), (Rect) null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z2) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    public o43 a(g05 g05, Bitmap.Config config) {
        BitmapFactory.Options k = k(g05, config, this.a);
        boolean z = k.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream n = g05.n();
            n.getClass();
            return h(n, k, (ColorSpace) null);
        } catch (RuntimeException e) {
            if (z) {
                return a(g05, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    public void b() {
        if (!this.b) {
            this.b = true;
            this.a = true;
            ((f2a) this.c).b();
        }
    }

    public void c(zl4 zl4) {
        uy1 uy1 = (uy1) this.X;
        uy1.getClass();
        dm4.c(uy1, zl4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.o43 d(defpackage.g05 r6, android.graphics.Bitmap.Config r7, int r8, android.graphics.ColorSpace r9) {
        /*
            r5 = this;
            ou6 r0 = r6.c
            ou6 r1 = defpackage.qb4.a
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x000e
            ou6 r1 = defpackage.qb4.l
            if (r0 == r1) goto L_0x000e
        L_0x000c:
            r0 = r2
            goto L_0x0037
        L_0x000e:
            ide r0 = r6.b
            if (r0 == 0) goto L_0x0013
            goto L_0x000c
        L_0x0013:
            o43 r0 = r6.a
            r0.getClass()
            java.lang.Object r0 = r0.e0()
            qq8 r0 = (defpackage.qq8) r0
            r1 = 2
            if (r8 >= r1) goto L_0x0023
        L_0x0021:
            r0 = r3
            goto L_0x0037
        L_0x0023:
            int r1 = r8 + -2
            byte r1 = r0.o(r1)
            r4 = -1
            if (r1 != r4) goto L_0x0021
            int r1 = r8 + -1
            byte r0 = r0.o(r1)
            r1 = -39
            if (r0 != r1) goto L_0x0021
            goto L_0x000c
        L_0x0037:
            boolean r1 = r5.a
            android.graphics.BitmapFactory$Options r7 = k(r6, r7, r1)
            java.io.InputStream r1 = r6.n()
            r1.getClass()
            int r4 = r6.o()
            if (r4 <= r8) goto L_0x0050
            lh7 r4 = new lh7
            r4.<init>(r1, r8)
            r1 = r4
        L_0x0050:
            if (r0 != 0) goto L_0x005a
            tje r0 = new tje
            byte[] r4 = Y
            r0.<init>(r1, r4)
            r1 = r0
        L_0x005a:
            android.graphics.Bitmap$Config r0 = r7.inPreferredConfig
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r4) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r2 = r3
        L_0x0062:
            v84 r5 = r5.h(r1, r7, r9)     // Catch:{ RuntimeException -> 0x0071 }
            r1.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x006e
        L_0x006a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x006e:
            return r5
        L_0x006f:
            r5 = move-exception
            goto L_0x0084
        L_0x0071:
            r7 = move-exception
            if (r2 == 0) goto L_0x0083
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x006f }
            o43 r5 = r5.d(r6, r7, r8, r9)     // Catch:{ all -> 0x006f }
            r1.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0082:
            return r5
        L_0x0083:
            throw r7     // Catch:{ all -> 0x006f }
        L_0x0084:
            r1.close()     // Catch:{ IOException -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r6 = move-exception
            r6.printStackTrace()
        L_0x008c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ana.d(g05, android.graphics.Bitmap$Config, int, android.graphics.ColorSpace):o43");
    }

    public void e(Object obj) {
        if (!this.b) {
            ((f2a) this.c).e(obj);
        }
    }

    public boolean f(n18 n18) {
        int id = n18.getId();
        HashSet hashSet = (HashSet) this.o;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        n18 n182 = (n18) ((HashMap) this.c).get(Integer.valueOf(l()));
        if (n182 != null) {
            n(n182, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!n18.isChecked()) {
            n18.setChecked(true);
        }
        return add;
    }

    public void g() {
        boolean z = !((HashSet) this.o).isEmpty();
        for (n18 n : ((HashMap) this.c).values()) {
            n(n, false);
        }
        if (z) {
            m();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.v84 h(java.io.InputStream r8, android.graphics.BitmapFactory.Options r9, android.graphics.ColorSpace r10) {
        /*
            r7 = this;
            buc r0 = defpackage.o43.Y
            int r1 = r9.outWidth
            int r2 = r9.outHeight
            r3 = 0
            java.lang.Object r4 = r7.o
            com.facebook.imagepipeline.platform.PreverificationHelper r4 = (com.facebook.imagepipeline.platform.PreverificationHelper) r4
            if (r4 == 0) goto L_0x0017
            android.graphics.Bitmap$Config r5 = r9.inPreferredConfig
            boolean r4 = r4.shouldUseHardwareBitmapConfig(r5)
            if (r4 == 0) goto L_0x0017
            r4 = 1
            goto L_0x0018
        L_0x0017:
            r4 = r3
        L_0x0018:
            r5 = 0
            java.lang.Object r6 = r7.c
            go0 r6 = (defpackage.go0) r6
            if (r4 == 0) goto L_0x0022
            r9.inMutable = r3
            goto L_0x003b
        L_0x0022:
            boolean r3 = r7.a
            if (r3 != 0) goto L_0x003b
            int r1 = r7.i(r1, r2, r9)
            java.lang.Object r1 = r6.get(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "BitmapPool.get returned null"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            r1 = r5
        L_0x003c:
            r9.inBitmap = r1
            if (r10 != 0) goto L_0x0046
            android.graphics.ColorSpace$Named r10 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r10 = android.graphics.ColorSpace.get(r10)
        L_0x0046:
            r9.inPreferredColorSpace = r10
            java.lang.Object r10 = r7.X
            t5b r10 = (defpackage.t5b) r10
            java.lang.Object r2 = r10.f()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            if (r2 != 0) goto L_0x005c
            yu0 r2 = defpackage.f54.a
            r2 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
        L_0x005c:
            byte[] r3 = r2.array()     // Catch:{ IllegalArgumentException -> 0x008f, RuntimeException -> 0x008d }
            r9.inTempStorage = r3     // Catch:{ IllegalArgumentException -> 0x008f, RuntimeException -> 0x008d }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8, r5, r9)     // Catch:{ IllegalArgumentException -> 0x008f, RuntimeException -> 0x008d }
            r10.e(r2)
            if (r1 == 0) goto L_0x007b
            if (r1 == r8) goto L_0x007b
            r6.e(r1)
            if (r8 == 0) goto L_0x0075
            r8.recycle()
        L_0x0075:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        L_0x007b:
            boolean r7 = r7.b
            if (r7 == 0) goto L_0x0086
            mq9 r7 = defpackage.mq9.o
            v84 r7 = defpackage.o43.p0(r8, r7, r0)
            return r7
        L_0x0086:
            v84 r7 = defpackage.o43.p0(r8, r6, r0)
            return r7
        L_0x008b:
            r7 = move-exception
            goto L_0x00b3
        L_0x008d:
            r7 = move-exception
            goto L_0x0091
        L_0x008f:
            r7 = move-exception
            goto L_0x0097
        L_0x0091:
            if (r1 == 0) goto L_0x0096
            r6.e(r1)     // Catch:{ all -> 0x008b }
        L_0x0096:
            throw r7     // Catch:{ all -> 0x008b }
        L_0x0097:
            if (r1 == 0) goto L_0x009c
            r6.e(r1)     // Catch:{ all -> 0x008b }
        L_0x009c:
            r8.reset()     // Catch:{ IOException -> 0x00b2 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ IOException -> 0x00b2 }
            if (r8 == 0) goto L_0x00b1
            pq9 r9 = defpackage.pq9.q()     // Catch:{ IOException -> 0x00b2 }
            v84 r7 = defpackage.o43.p0(r8, r9, r0)     // Catch:{ IOException -> 0x00b2 }
            r10.e(r2)
            return r7
        L_0x00b1:
            throw r7     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            throw r7     // Catch:{ all -> 0x008b }
        L_0x00b3:
            r10.e(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ana.h(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.ColorSpace):v84");
    }

    public int i(int i, int i2, BitmapFactory.Options options) {
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return qo0.c(i, i2, config);
    }

    public ArrayList j(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.o);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof n18) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int l() {
        if (this.a) {
            HashSet hashSet = (HashSet) this.o;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public void m() {
        y8 y8Var = (y8) this.X;
        if (y8Var != null) {
            new HashSet((HashSet) this.o);
            ChipGroup chipGroup = (ChipGroup) y8Var.a;
            q03 q03 = chipGroup.u0;
            if (q03 != null) {
                chipGroup.v0.j(chipGroup);
                ph4 ph4 = (ph4) q03;
                ChipGroup chipGroup2 = (ChipGroup) ph4.b;
                if (chipGroup2.v0.a) {
                    int checkedChipId = chipGroup2.getCheckedChipId();
                    il9 il9 = (il9) ((p03) ph4.a);
                    il9.getClass();
                    for (int i = 0; i < chipGroup.getChildCount(); i++) {
                        View childAt = chipGroup.getChildAt(i);
                        childAt.setClickable(childAt.getId() != checkedChipId);
                    }
                    il9.B();
                    il9.n(new cy1(5, il9));
                }
            }
        }
    }

    public boolean n(n18 n18, boolean z) {
        int id = n18.getId();
        HashSet hashSet = (HashSet) this.o;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (!z || hashSet.size() != 1 || !hashSet.contains(Integer.valueOf(id))) {
            boolean remove = hashSet.remove(Integer.valueOf(id));
            if (n18.isChecked()) {
                n18.setChecked(false);
            }
            return remove;
        }
        n18.setChecked(true);
        return false;
    }

    public void onError(Throwable th) {
        boolean z = this.a;
        f2a f2a = (f2a) this.c;
        if (!z) {
            this.a = true;
            try {
                r1a r1a = (r1a) ((b66) this.o).apply(th);
                if (r1a == null) {
                    NullPointerException nullPointerException = new NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    f2a.onError(nullPointerException);
                    return;
                }
                r1a.a(this);
            } catch (Throwable th2) {
                c37.B(th2);
                f2a.onError(new CompositeException(th, th2));
            }
        } else if (this.b) {
            j47.Z(th);
        } else {
            f2a.onError(th);
        }
    }

    public ana(f2a f2a, pc5 pc5) {
        this.c = f2a;
        this.o = pc5;
        this.X = new uy1(2);
    }

    public ana(go0 go0, t5b t5b, oq0 oq0) {
        this.o = new PreverificationHelper();
        this.c = go0;
        if (go0 instanceof ys4) {
            this.a = oq0.a;
            this.b = oq0.b;
        }
        this.X = t5b;
    }

    public ana(Context context, String str, l0f l0f, boolean z, boolean z2) {
        this.c = context;
        this.o = str;
        this.X = l0f;
        this.a = z;
        this.b = z2;
    }
}
