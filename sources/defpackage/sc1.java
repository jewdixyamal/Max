package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: sc1  reason: default package */
public final class sc1 extends ndc {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public sc1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                return;
            case 2:
                this.b = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                return;
            default:
                this.b = tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density);
                this.c = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                return;
        }
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                hdc adapter = recyclerView.getAdapter();
                Integer num = null;
                da1 da1 = adapter instanceof da1 ? (da1) adapter : null;
                if (da1 != null && R >= 0 && R < da1.j()) {
                    ol7 ol7 = (ol7) da1.C(R);
                    jc1 jc1 = ol7 instanceof jc1 ? (jc1) ol7 : null;
                    ol7 G = da1.G(R + 1);
                    jc1 jc12 = G instanceof jc1 ? (jc1) G : null;
                    int i = this.c;
                    rect.left = i;
                    rect.right = i;
                    int i2 = 0;
                    rect.top = 0;
                    Integer valueOf = jc1 != null ? Integer.valueOf(jc1.u()) : null;
                    if (jc12 != null) {
                        num = Integer.valueOf(jc12.u());
                    }
                    if (!tpa.f(valueOf, num)) {
                        i2 = this.b;
                    }
                    rect.bottom = i2;
                    return;
                }
                return;
            case 1:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                hdc adapter2 = recyclerView.getAdapter();
                mfd mfd = adapter2 instanceof mfd ? (mfd) adapter2 : null;
                if (mfd != null && R2 >= 0 && R2 < mfd.j()) {
                    kfd kfd = (kfd) ((ol7) mfd.C(R2));
                    kfd kfd2 = (kfd) mfd.G(R2 + 1);
                    int i3 = 0;
                    rect.top = R2 == 0 ? this.b : 0;
                    if (kfd2 == null || kfd.u() != kfd2.u()) {
                        i3 = this.c;
                    }
                    rect.bottom = i3;
                    return;
                }
                return;
            case 2:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                hdc adapter3 = recyclerView.getAdapter();
                mfd mfd2 = adapter3 instanceof mfd ? (mfd) adapter3 : null;
                if (mfd2 != null && R3 >= 0 && R3 < mfd2.j()) {
                    rect.top = R3 == 0 ? this.b : this.c;
                    return;
                }
                return;
            case 3:
                int i4 = this.b;
                rect.top = i4;
                rect.bottom = i4;
                if (zdc.b() == 1) {
                    rect.left = i4;
                    rect.right = i4;
                    return;
                }
                recyclerView.getClass();
                int R4 = RecyclerView.R(view);
                int b2 = zdc.b() - 1;
                int i5 = this.c;
                if (R4 == b2) {
                    rect.left = i5 / 2;
                    rect.right = i4;
                    return;
                } else if (RecyclerView.R(view) == 0) {
                    rect.left = i4;
                    rect.right = i5 / 2;
                    return;
                } else {
                    int i6 = i5 / 2;
                    rect.left = i6;
                    rect.right = i6;
                    return;
                }
            case 4:
                recyclerView.getClass();
                int R5 = RecyclerView.R(view);
                int i7 = this.b;
                int max = R5 % ((int) Math.max(1.0d, (double) i7));
                int max2 = (int) Math.max(1.0d, (double) i7);
                int i8 = this.c;
                rect.left = (max * i8) / max2;
                rect.right = i8 - (((max + 1) * i8) / max2);
                if (R5 >= max2) {
                    rect.top = i8;
                    return;
                }
                return;
            case 5:
                int i9 = this.c;
                rect.left = i9;
                rect.right = i9;
                rect.top = this.b;
                return;
            case 6:
                recyclerView.getClass();
                int R6 = RecyclerView.R(view);
                int i10 = this.b;
                if (R6 == 0) {
                    rect.right = i10 / 2;
                } else if (R6 == zdc.b() - 1) {
                    rect.left = i10 / 2;
                } else {
                    int i11 = i10 / 2;
                    rect.left = i11;
                    rect.right = i11;
                }
                int i12 = this.c;
                rect.top = i12;
                rect.bottom = i12;
                return;
            default:
                recyclerView.getClass();
                int R7 = RecyclerView.R(view);
                int b3 = zdc.b() - 1;
                int i13 = this.c;
                int i14 = this.b;
                if (R7 == b3) {
                    rect.top = i14;
                    rect.bottom = i13;
                    return;
                } else if (RecyclerView.R(view) == 0) {
                    rect.top = i13;
                    rect.bottom = i14;
                    return;
                } else {
                    rect.top = i14;
                    rect.bottom = i14;
                    return;
                }
        }
    }

    public /* synthetic */ sc1(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
