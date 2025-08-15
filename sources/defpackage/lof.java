package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: lof  reason: default package */
public final class lof extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    public lof(ViewPager2 viewPager2) {
        this.E = viewPager2;
    }

    public final void L0(zdc zdc, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.L0(zdc, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    public final void a0(vdc vdc, zdc zdc, l4 l4Var) {
        super.a0(vdc, zdc, l4Var);
        this.E.H0.getClass();
    }

    public final void b0(vdc vdc, zdc zdc, View view, l4 l4Var) {
        int i;
        int i2;
        ViewPager2 viewPager2 = (ViewPager2) this.E.H0.X;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.u0.getClass();
            i = a.M(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.u0.getClass();
            i2 = a.M(view);
        } else {
            i2 = 0;
        }
        l4Var.i(k4.a(false, i, 1, i2, 1));
    }

    public final boolean o0(vdc vdc, zdc zdc, int i, Bundle bundle) {
        this.E.H0.getClass();
        return super.o0(vdc, zdc, i, bundle);
    }

    public final boolean v0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
