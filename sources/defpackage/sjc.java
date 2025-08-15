package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: sjc  reason: default package */
public final /* synthetic */ class sjc implements ug7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sjc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void m(eh7 eh7, eg7 eg7) {
        switch (this.a) {
            case 0:
                int i = tjc.$EnumSwitchMapping$0[eg7.ordinal()];
                ujc ujc = (ujc) this.b;
                WeakReference weakReference = ujc.d;
                RecyclerView recyclerView = null;
                if (i == 1) {
                    ujc.f = true;
                    RecyclerView recyclerView2 = (RecyclerView) weakReference.get();
                    if (recyclerView2 != null) {
                        if (recyclerView2.getAdapter() != null) {
                            recyclerView = recyclerView2;
                        }
                        if (recyclerView != null) {
                            ujc.b(recyclerView);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 2) {
                    ujc.f = false;
                    RecyclerView recyclerView3 = (RecyclerView) weakReference.get();
                    if (recyclerView3 != null) {
                        if (recyclerView3.getAdapter() == null && recyclerView3.G0) {
                            recyclerView = recyclerView3;
                        }
                        if (recyclerView != null) {
                            ujc.a(recyclerView);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                eg7 eg72 = eg7.ON_START;
                mm mmVar = (mm) this.b;
                if (eg7 == eg72) {
                    mmVar.e = true;
                    return;
                } else if (eg7 == eg7.ON_STOP) {
                    mmVar.e = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
