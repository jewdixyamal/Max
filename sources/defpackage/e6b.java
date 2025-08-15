package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: e6b  reason: default package */
public final class e6b extends nd7 {
    public int k;
    public final /* synthetic */ f6b l;

    public e6b(f6b f6b) {
        this.l = f6b;
    }

    public final void J(View view, int i, int i2) {
        float f;
        int i3;
        f6b f6b = this.l;
        f6b.getHalfExpandedViewHelper().a(i2);
        z5b callback = f6b.getCallback();
        if (callback != null) {
            if (f6b.t0.a == 2 && f6b.getScrollState() == d6b.a) {
                int e = callback.e();
                if (f6b.getStackFromBottom()) {
                    int i4 = this.k;
                    f = (float) (i2 - i4);
                    i3 = e - i4;
                } else {
                    int i5 = this.k;
                    f = (float) (i5 - i2);
                    i3 = i5 - e;
                }
                f6b.setBackgroundAlpha(((float) 1) - Math.abs(f / ((float) i3)));
                if (f6b.getStackFromBottom() && i2 >= e) {
                    callback.h();
                }
                if (!f6b.getStackFromBottom() && i2 <= e) {
                    callback.h();
                }
            }
            callback.m(i2);
        }
    }

    public final void K(View view, float f, float f2) {
        d6b d6b;
        this.k = view.getTop();
        f6b f6b = this.l;
        z5b callback = f6b.getCallback();
        if (callback != null) {
            double d = (double) f2;
            if (Math.abs(d) > 200.0d) {
                if (Math.abs(d) < 8000.0d) {
                    int b = callback.b();
                    if (b != 0) {
                        int i = a6b.$EnumSwitchMapping$0[au1.s(b)];
                        if (i == 1) {
                            d6b = f6b.getStackFromBottom() ? this.k < callback.c() ? f2 > 0.0f ? d6b.b : d6b.c : f2 > 0.0f ? d6b.a : d6b.b : this.k > callback.c() ? f2 < 0.0f ? d6b.b : d6b.c : f2 < 0.0f ? d6b.a : d6b.b;
                        } else if (i == 2) {
                            d6b = f6b.getScrollState();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        throw null;
                    }
                } else {
                    d6b = f6b.getStackFromBottom() ? f2 > 0.0f ? d6b.a : d6b.c : f2 < 0.0f ? d6b.a : d6b.c;
                }
            } else if (f6b.getStackFromBottom()) {
                if (this.k < callback.c() / 2) {
                    d6b = d6b.c;
                } else {
                    d6b = this.k > ((callback.e() - callback.c()) / 2) + callback.c() ? d6b.a : d6b.b;
                }
            } else if (this.k > callback.c() / 2) {
                d6b = d6b.c;
            } else {
                d6b = this.k < ((callback.e() - callback.c()) / 2) + callback.c() ? d6b.a : d6b.b;
            }
            f6b.setScrollState(callback.g(f6b.getScrollState(), d6b));
            if (this.k == f6b.getScrollStateOffset() && f6b.getScrollState() == d6b.a) {
                callback.h();
                f6b.setBackgroundAlpha(0.0f);
                return;
            }
            f6b.t0.n(view.getLeft(), f6b.getScrollStateOffset());
            callback.l(f6b.getScrollState());
            f6b.invalidate();
        }
    }

    public final boolean W(View view, int i) {
        f6b f6b = this.l;
        z5b callback = f6b.getCallback();
        return view == (callback != null ? callback.f() : null) && f6b.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(android.view.View r4, int r5) {
        /*
            r3 = this;
            f6b r3 = r3.l
            boolean r4 = r3.getStackFromBottom()
            r0 = 0
            if (r4 == 0) goto L_0x001a
            z5b r4 = r3.getCallback()
            if (r4 == 0) goto L_0x0018
            int r4 = r4.a()
        L_0x0013:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0025
        L_0x0018:
            r4 = r0
            goto L_0x0025
        L_0x001a:
            z5b r4 = r3.getCallback()
            if (r4 == 0) goto L_0x0018
            int r4 = r4.e()
            goto L_0x0013
        L_0x0025:
            r1 = 0
            if (r4 == 0) goto L_0x002d
            int r4 = r4.intValue()
            goto L_0x002e
        L_0x002d:
            r4 = r1
        L_0x002e:
            boolean r2 = r3.getStackFromBottom()
            z5b r3 = r3.getCallback()
            if (r2 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x004a
            int r3 = r3.e()
        L_0x003e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x004a
        L_0x0043:
            if (r3 == 0) goto L_0x004a
            int r3 = r3.a()
            goto L_0x003e
        L_0x004a:
            if (r0 == 0) goto L_0x0050
            int r1 = r0.intValue()
        L_0x0050:
            int r3 = defpackage.ote.e(r5, r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6b.g(android.view.View, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = r0.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v(int r4) {
        /*
            r3 = this;
            f6b r3 = r3.l
            r4 = 0
            z5b r0 = r3.getCallback()     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            android.view.View r0 = r0.f()     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            int r3 = r3.indexOfChild(r0)     // Catch:{ all -> 0x0018 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0018 }
            goto L_0x0022
        L_0x0018:
            r3 = move-exception
            goto L_0x001c
        L_0x001a:
            r3 = r4
            goto L_0x0022
        L_0x001c:
            njc r0 = new njc
            r0.<init>(r3)
            r3 = r0
        L_0x0022:
            java.lang.Throwable r0 = defpackage.pjc.a(r3)
            if (r0 == 0) goto L_0x002f
            java.lang.String r1 = "PopupLayout"
            java.lang.String r2 = "getOrderedChildIndex fail, issue ONEME-9645"
            defpackage.hm9.p(r1, r2, r0)
        L_0x002f:
            boolean r0 = r3 instanceof defpackage.njc
            if (r0 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r4 = r3
        L_0x0035:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x003e
            int r3 = r4.intValue()
            goto L_0x003f
        L_0x003e:
            r3 = -1
        L_0x003f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6b.v(int):int");
    }

    public final int y(View view) {
        return view.getHeight();
    }
}
