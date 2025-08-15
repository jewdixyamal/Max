package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: oic  reason: default package */
public final class oic {
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static oic g;
    public static final bo0 h = new bo0(6, 2);
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public q40 e;

    public static synchronized oic c() {
        oic oic;
        synchronized (oic.class) {
            try {
                if (g == null) {
                    g = new oic();
                }
                oic = g;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return oic;
    }

    public static synchronized PorterDuffColorFilter g(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (oic.class) {
            bo0 bo0 = h;
            bo0.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) bo0.c(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) bo0.d(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                wv7 wv7 = (wv7) this.b.get(context);
                if (wv7 == null) {
                    wv7 = new wv7((Object) null);
                    this.b.put(context, wv7);
                }
                wv7.f(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final Drawable b(Context context, int i) {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d2 = d(j, context);
        if (d2 != null) {
            return d2;
        }
        LayerDrawable layerDrawable = null;
        if (this.e != null) {
            if (i == bvb.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, bvb.abc_cab_background_internal_bg), f(context, bvb.abc_cab_background_top_mtrl_alpha)});
            } else if (i == bvb.abc_ratingbar_material) {
                layerDrawable = q40.f(this, context, xtb.abc_star_big);
            } else if (i == bvb.abc_ratingbar_indicator_material) {
                layerDrawable = q40.f(this, context, xtb.abc_star_medium);
            } else if (i == bvb.abc_ratingbar_small_material) {
                layerDrawable = q40.f(this, context, xtb.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable d(long r4, android.content.Context r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.b     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0028 }
            wv7 r0 = (defpackage.wv7) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.c(r4)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r6.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002f
        L_0x002a:
            r0.g(r4)     // Catch:{ all -> 0x0028 }
        L_0x002d:
            monitor-exit(r3)
            return r1
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oic.d(long, android.content.Context):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable e(int i, Context context, boolean z) {
        Drawable b2;
        if (!this.d) {
            this.d = true;
            Drawable f2 = f(context, iub.abc_vector_test);
            if (f2 == null || (!(f2 instanceof qbf) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName()))) {
                this.d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        b2 = b(context, i);
        if (b2 == null) {
            b2 = kt3.b(context, i);
        }
        if (b2 != null) {
            ColorStateList h2 = h(context, i);
            PorterDuff.Mode mode = null;
            if (h2 != null) {
                b2 = b2.mutate();
                aq4.h(b2, h2);
                if (this.e != null) {
                    if (i == bvb.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                }
                if (mode != null) {
                    aq4.i(b2, mode);
                }
            } else {
                if (this.e != null) {
                    if (i == bvb.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) b2;
                        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                        int c2 = gse.c(context, vsb.colorControlNormal);
                        PorterDuff.Mode mode2 = gn.b;
                        q40.n(findDrawableByLayerId, c2);
                        q40.n(layerDrawable.findDrawableByLayerId(16908303), gse.c(context, vsb.colorControlNormal));
                        q40.n(layerDrawable.findDrawableByLayerId(16908301), gse.c(context, vsb.colorControlActivated));
                    } else if (i == bvb.abc_ratingbar_material || i == bvb.abc_ratingbar_indicator_material || i == bvb.abc_ratingbar_small_material) {
                        LayerDrawable layerDrawable2 = (LayerDrawable) b2;
                        Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                        int b3 = gse.b(context, vsb.colorControlNormal);
                        PorterDuff.Mode mode3 = gn.b;
                        q40.n(findDrawableByLayerId2, b3);
                        q40.n(layerDrawable2.findDrawableByLayerId(16908303), gse.c(context, vsb.colorControlActivated));
                        q40.n(layerDrawable2.findDrawableByLayerId(16908301), gse.c(context, vsb.colorControlActivated));
                    }
                }
                if (!i(i, context, b2) && z) {
                    b2 = null;
                }
            }
        }
        if (b2 != null) {
            hq4.a(b2);
        }
        return b2;
    }

    public final synchronized Drawable f(Context context, int i) {
        return e(i, context, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = (defpackage.kvd) r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList h(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.a     // Catch:{ all -> 0x0047 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0047 }
            kvd r0 = (defpackage.kvd) r0     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.c(r5)     // Catch:{ all -> 0x0047 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0047 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x0049
            q40 r0 = r3.e     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            android.content.res.ColorStateList r1 = r0.i(r4, r5)     // Catch:{ all -> 0x0047 }
        L_0x0021:
            if (r1 == 0) goto L_0x0045
            java.util.WeakHashMap r0 = r3.a     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x002e
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0047 }
            r0.<init>()     // Catch:{ all -> 0x0047 }
            r3.a = r0     // Catch:{ all -> 0x0047 }
        L_0x002e:
            java.util.WeakHashMap r0 = r3.a     // Catch:{ all -> 0x0047 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0047 }
            kvd r0 = (defpackage.kvd) r0     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0042
            kvd r0 = new kvd     // Catch:{ all -> 0x0047 }
            r0.<init>()     // Catch:{ all -> 0x0047 }
            java.util.WeakHashMap r2 = r3.a     // Catch:{ all -> 0x0047 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0047 }
        L_0x0042:
            r0.a(r5, r1)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            r0 = r1
            goto L_0x0049
        L_0x0047:
            r4 = move-exception
            goto L_0x004b
        L_0x0049:
            monitor-exit(r3)
            return r0
        L_0x004b:
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oic.h(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(int r7, android.content.Context r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            q40 r6 = r6.e
            r0 = 0
            if (r6 == 0) goto L_0x0068
            android.graphics.PorterDuff$Mode r1 = defpackage.gn.b
            java.lang.Object r2 = r6.a
            int[] r2 = (int[]) r2
            boolean r2 = defpackage.q40.a(r7, r2)
            r3 = 1
            r4 = -1
            if (r2 == 0) goto L_0x0018
            int r6 = defpackage.vsb.colorControlNormal
        L_0x0015:
            r2 = r3
        L_0x0016:
            r7 = r4
            goto L_0x0051
        L_0x0018:
            java.lang.Object r2 = r6.c
            int[] r2 = (int[]) r2
            boolean r2 = defpackage.q40.a(r7, r2)
            if (r2 == 0) goto L_0x0025
            int r6 = defpackage.vsb.colorControlActivated
            goto L_0x0015
        L_0x0025:
            java.lang.Object r6 = r6.o
            int[] r6 = (int[]) r6
            boolean r6 = defpackage.q40.a(r7, r6)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r6 == 0) goto L_0x0036
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x0034:
            r6 = r2
            goto L_0x0015
        L_0x0036:
            int r6 = defpackage.bvb.abc_list_divider_mtrl_alpha
            if (r7 != r6) goto L_0x0049
            r6 = 1109603123(0x42233333, float:40.8)
            int r6 = java.lang.Math.round(r6)
            r7 = 16842800(0x1010030, float:2.3693693E-38)
            r2 = r3
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x0051
        L_0x0049:
            int r6 = defpackage.bvb.abc_dialog_material_background
            if (r7 != r6) goto L_0x004e
            goto L_0x0034
        L_0x004e:
            r6 = r0
            r2 = r6
            goto L_0x0016
        L_0x0051:
            if (r2 == 0) goto L_0x0068
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r6 = defpackage.gse.c(r8, r6)
            android.graphics.PorterDuffColorFilter r6 = defpackage.gn.c(r6, r1)
            r9.setColorFilter(r6)
            if (r7 == r4) goto L_0x0067
            r9.setAlpha(r7)
        L_0x0067:
            r0 = r3
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oic.i(int, android.content.Context, android.graphics.drawable.Drawable):boolean");
    }
}
