package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;

/* renamed from: ete  reason: default package */
public final /* synthetic */ class ete implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ThreadsStateViewerScreen b;

    public /* synthetic */ ete(ThreadsStateViewerScreen threadsStateViewerScreen, int i) {
        this.a = i;
        this.b = threadsStateViewerScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ThreadsStateViewerScreen threadsStateViewerScreen = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ThreadsStateViewerScreen.X;
                i3a onBackPressedDispatcher = threadsStateViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f;
            default:
                bc7[] bc7Arr2 = ThreadsStateViewerScreen.X;
                cte cte = (cte) threadsStateViewerScreen.c.getValue();
                cte.getClass();
                vxd n = pnf.n(cte, (lx3) null, vx3.b, new bte(cte, (Continuation) null), 1);
                cte.c.o1(cte, cte.X[0], n);
                return e5f;
        }
    }
}
