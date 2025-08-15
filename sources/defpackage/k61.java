package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: k61  reason: default package */
public final class k61 {
    public RecyclerView a;

    public void a(w8 w8Var) {
        int i = w8Var.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.B0.d0(w8Var.b, w8Var.d);
        } else if (i == 2) {
            recyclerView.B0.g0(w8Var.b, w8Var.d);
        } else if (i == 4) {
            recyclerView.B0.i0(recyclerView, w8Var.b, w8Var.d);
        } else if (i == 8) {
            recyclerView.B0.f0(w8Var.b, w8Var.d);
        }
    }

    public dec b(int i) {
        RecyclerView recyclerView = this.a;
        int D = recyclerView.t0.D();
        int i2 = 0;
        dec dec = null;
        while (true) {
            if (i2 >= D) {
                break;
            }
            dec U = RecyclerView.U(recyclerView.t0.C(i2));
            if (U != null && !U.p() && U.c == i) {
                if (!recyclerView.t0.H(U.a)) {
                    dec = U;
                    break;
                }
                dec = U;
            }
            i2++;
        }
        if (dec == null) {
            return null;
        }
        if (!recyclerView.t0.H(dec.a)) {
            return dec;
        }
        boolean z = RecyclerView.L1;
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int D = recyclerView.t0.D();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < D; i6++) {
            View C = recyclerView.t0.C(i6);
            dec U = RecyclerView.U(C);
            if (U != null && !U.w() && (i4 = U.c) >= i && i4 < i5) {
                U.f(2);
                if (obj == null) {
                    U.f(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                } else if ((1024 & U.u0) == 0) {
                    if (U.v0 == null) {
                        ArrayList arrayList = new ArrayList();
                        U.v0 = arrayList;
                        U.w0 = Collections.unmodifiableList(arrayList);
                    }
                    U.v0.add(obj);
                }
                ((pdc) C.getLayoutParams()).c = true;
            }
        }
        vdc vdc = recyclerView.c;
        for (int size = vdc.c.size() - 1; size >= 0; size--) {
            dec dec = (dec) vdc.c.get(size);
            if (dec != null && (i3 = dec.c) >= i && i3 < i5) {
                dec.f(2);
                vdc.f(size);
            }
        }
        recyclerView.w1 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int D = recyclerView.t0.D();
        for (int i3 = 0; i3 < D; i3++) {
            dec U = RecyclerView.U(recyclerView.t0.C(i3));
            if (U != null && !U.w() && U.c >= i) {
                if (RecyclerView.M1) {
                    U.toString();
                }
                U.t(i2, false);
                recyclerView.s1.g = true;
            }
        }
        vdc vdc = recyclerView.c;
        int size = vdc.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            dec dec = (dec) vdc.c.get(i4);
            if (dec != null && dec.c >= i) {
                if (RecyclerView.M1) {
                    dec.toString();
                }
                dec.t(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.v1 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int D = recyclerView.t0.D();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < D; i11++) {
            dec U = RecyclerView.U(recyclerView.t0.C(i11));
            if (U != null && (i9 = U.c) >= i5 && i9 <= i4) {
                if (RecyclerView.M1) {
                    U.toString();
                }
                if (U.c == i) {
                    U.t(i2 - i, false);
                } else {
                    U.t(i3, false);
                }
                recyclerView.s1.g = true;
            }
        }
        vdc vdc = recyclerView.c;
        vdc.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = vdc.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            dec dec = (dec) vdc.c.get(i12);
            if (dec != null && (i8 = dec.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    dec.t(i2 - i, false);
                } else {
                    dec.t(i10, false);
                }
                if (RecyclerView.M1) {
                    dec.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.v1 = true;
    }
}
