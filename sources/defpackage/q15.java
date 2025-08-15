package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

/* renamed from: q15  reason: default package */
public final /* synthetic */ class q15 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r15 c;
    public final /* synthetic */ z15 o;

    public /* synthetic */ q15(int i, int i2, r15 r15, z15 z15) {
        this.a = i;
        this.b = i2;
        this.c = r15;
        this.o = z15;
    }

    public final void run() {
        int i;
        r15 r15 = this.c;
        t15 t15 = (t15) r15.c;
        if (!(this.a == 0 && this.b == 0)) {
            t15.getClass();
        }
        z15 z15 = this.o;
        a layoutManager = z15.getLayoutManager();
        int i2 = 0;
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int i3 = staggeredGridLayoutManager.p;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < staggeredGridLayoutManager.p; i4++) {
                qxd qxd = staggeredGridLayoutManager.q[i4];
                boolean z = ((StaggeredGridLayoutManager) qxd.f).w;
                ArrayList arrayList = (ArrayList) qxd.e;
                iArr[i4] = z ? qxd.g(0, arrayList.size(), true, false) : qxd.g(arrayList.size() - 1, -1, true, false);
            }
            i = iArr[i3 - 1];
        } else {
            i = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).Y0() : 0;
        }
        hdc adapter = z15.getAdapter();
        if (adapter != null) {
            if (adapter.j() - i <= r15.b && ((z15.getIgnoreRefreshingFlagsForScrollEvent() || !z15.d2) && t15.m())) {
                if (z15.g2 != null) {
                    z15.getRefreshingNextDelegate();
                    z15.setRefreshingNext(true);
                }
                t15.l();
            }
            a layoutManager2 = z15.getLayoutManager();
            if (layoutManager2 instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) layoutManager2;
                int i5 = staggeredGridLayoutManager2.p;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < staggeredGridLayoutManager2.p; i6++) {
                    qxd qxd2 = staggeredGridLayoutManager2.q[i6];
                    boolean z2 = ((StaggeredGridLayoutManager) qxd2.f).w;
                    ArrayList arrayList2 = (ArrayList) qxd2.e;
                    iArr2[i6] = z2 ? qxd2.g(arrayList2.size() - 1, -1, true, false) : qxd2.g(0, arrayList2.size(), true, false);
                }
                i2 = iArr2[i5 - 1];
            } else if (layoutManager2 instanceof LinearLayoutManager) {
                i2 = ((LinearLayoutManager) layoutManager2).W0();
            }
            if (i2 >= 0 && i2 <= r15.b) {
                if ((z15.getIgnoreRefreshingFlagsForScrollEvent() || !z15.e2) && t15.h()) {
                    if (z15.g2 != null) {
                        z15.setRefreshingPrev(true);
                    }
                    t15.j();
                }
            }
        }
    }
}
