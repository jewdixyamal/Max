package one.me.messages.list.ui.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lone/me/messages/list/ui/recycler/MessagesLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "y19", "z19", "message-list_release"}, k = 1, mv = {2, 0, 0})
public final class MessagesLayoutManager extends LinearLayoutManager {
    public final float E = 2.0f;
    public final String F = MessagesLayoutManager.class.getName();
    public boolean G;
    public boolean H;
    public RecyclerView I;
    public final Rect J = new Rect();
    public final ri9 K;

    public MessagesLayoutManager() {
        super(1, false);
        int i = vsc.a;
        this.K = new ri9();
        p1(true);
        this.h = false;
    }

    public final void I0(RecyclerView recyclerView, int i) {
        boolean z = true;
        this.H = true;
        int W0 = W0();
        int Y0 = Y0();
        int i2 = -1;
        if (W0 == -1 || Y0 == -1) {
            y0(i);
            return;
        }
        if (W0 > i || i > Y0) {
            if ((Y0 + W0) / 2 <= i) {
                i2 = 1;
            }
            if (i >= W0) {
                W0 = Y0;
            }
            if (Math.abs(W0 - i) > 10) {
                int G2 = tu0.G(((float) i2) * this.E * ((float) recyclerView.getHeight()));
                String str = this.F;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    us7 us7 = us7.X;
                    hdc adapter = recyclerView.getAdapter();
                    Integer valueOf = adapter != null ? Integer.valueOf(adapter.j()) : null;
                    StringBuilder j = wg0.j("LM fast scroll by pos:", i, " and offset:", G2, ", curSize:");
                    j.append(valueOf);
                    ir6.d(us7, str, j.toString(), (Throwable) null);
                }
                n1(i, G2);
            }
        }
        Context context = recyclerView.getContext();
        int W02 = W0();
        boolean z2 = W02 == Y0();
        boolean z3 = G() - 1 == i;
        boolean z4 = W02 == i;
        if ((!z2 || !z3 || !z4) && !this.G) {
            z = false;
        }
        y19 y19 = new y19(context, i, z, new zj7(8, this));
        String str2 = this.F;
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us72 = us7.X;
            hdc adapter2 = recyclerView.getAdapter();
            ir62.d(us72, str2, "LM smooth scroll by pos:" + i + ", curSize:" + (adapter2 != null ? Integer.valueOf(adapter2.j()) : null), (Throwable) null);
        }
        J0(y19);
    }

    public final void S(View view, int i, int i2, int i3, int i4) {
        dec T;
        RecyclerView recyclerView = this.I;
        if (recyclerView != null && (T = recyclerView.T(view)) != null) {
            boolean z = T instanceof u92;
            int i5 = T.Y;
            if (ry8.a(i5, 0) || z || ry8.a(i5, 131072)) {
                int i6 = i3 - i;
                int width = ((recyclerView.getWidth() - i6) / 2) + recyclerView.getLeft();
                super.S(view, width, i2, width + i6, i4);
                return;
            }
            super.S(view, i, i2, i3, i4);
        }
    }

    public final void W(RecyclerView recyclerView) {
        this.I = recyclerView;
    }

    public final void X(RecyclerView recyclerView) {
        this.I = null;
        this.J.setEmpty();
    }

    public final void d0(int i, int i2) {
        ri9 ri9 = this.K;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((z19) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void e0() {
        ri9 ri9 = this.K;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((z19) objArr[(i << 3) + i3]).a();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f0(int i, int i2) {
        ri9 ri9 = this.K;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((z19) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g0(int i, int i2) {
        ri9 ri9 = this.K;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((z19) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h0(int i) {
        ri9 ri9 = this.K;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            ((z19) objArr[(i2 << 3) + i4]).a();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void i0(RecyclerView recyclerView, int i, int i2) {
        h0(i);
        ri9 ri9 = this.K;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            ((z19) objArr[(i3 << 3) + i5]).a();
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 != length) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k0(zdc zdc) {
        super.k0(zdc);
        if (W0() != -1 && Y0() != -1) {
            ri9 ri9 = this.K;
            Object[] objArr = ri9.b;
            long[] jArr = ri9.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((z19) objArr[(i << 3) + i3]).b();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void t1(z19 z19) {
        ri9 ri9 = this.K;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (((z19) objArr[i4]).getTag().equals(z19.getTag())) {
                                ri9.g(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        ri9.a(z19);
    }

    public final void u1(String str) {
        ri9 ri9 = this.K;
        Object[] objArr = ri9.b;
        long[] jArr = ri9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (((z19) objArr[i4]).getTag().equals(str)) {
                                ri9.g(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void v1(View view, int i) {
        if (this.G) {
            Rect rect = this.J;
            RecyclerView.V(rect, view);
            RecyclerView recyclerView = this.I;
            int i2 = 0;
            int height = (recyclerView != null ? recyclerView.getHeight() : 0) - rect.height();
            if (height >= 0) {
                i2 = height;
            }
            n1(i, i2);
            return;
        }
        n1(i, tu0.G(((float) 30) * fk4.d().getDisplayMetrics().density));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r5 = r5.getAdapter();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y0(int r10) {
        /*
            r9 = this;
            r0 = 1
            r9.H = r0
            android.view.View r1 = r9.r(r10)
            r2 = 0
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = r9.F
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x0011
            goto L_0x0047
        L_0x0011:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0047
            us7 r4 = defpackage.us7.X
            androidx.recyclerview.widget.RecyclerView r5 = r9.I
            r6 = 0
            if (r5 == 0) goto L_0x002d
            hdc r5 = r5.getAdapter()
            if (r5 == 0) goto L_0x002d
            int r5 = r5.j()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x002e
        L_0x002d:
            r5 = r6
        L_0x002e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "LM scroll to inflated view by pos:"
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r8 = ", curSize:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r3.d(r4, r0, r5, r6)
        L_0x0047:
            r9.v1(r1, r10)
            r9.H = r2
            goto L_0x0072
        L_0x004d:
            super.y0(r10)
            androidx.recyclerview.widget.RecyclerView r1 = r9.I
            if (r1 == 0) goto L_0x0070
            ga5 r2 = new ga5
            r3 = 2
            r2.<init>(r10, r3, r9)
            t3a r9 = new t3a
            r9.<init>(r1, r0, r2)
            android.view.ViewTreeObserver r10 = r1.getViewTreeObserver()
            boolean r0 = r10.isAlive()
            if (r0 == 0) goto L_0x006c
            r10.addOnPreDrawListener(r9)
        L_0x006c:
            r1.addOnAttachStateChangeListener(r9)
            goto L_0x0072
        L_0x0070:
            r9.H = r2
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.ui.recycler.MessagesLayoutManager.y0(int):void");
    }
}
