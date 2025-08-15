package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\n\u000b\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lpv3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "fi1", "k61", "f9", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
public final class CallEventsWidget extends Widget implements pv3 {
    public static final /* synthetic */ int Y = 0;
    public final k61 X;
    public f9 a;
    public final y51 b;
    public final je7 c;
    public final ArrayList o;

    public CallEventsWidget(String str, z84 z84) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final List H(nv3 nv3, nv3 nv32) {
        View view = getView();
        return view != null ? Collections.singletonList(z7.C(view, nv32.d)) : nz4.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView = new RecyclerView(getContext(), (AttributeSet) null);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setId(rvb.call_events_recyclerview);
        recyclerView.setAdapter(this.b);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
        recyclerView.j(new kq(1));
        k61 k61 = this.X;
        k61.a = recyclerView;
        recyclerView.setItemAnimator(new j61(k61));
        recyclerView.addOnLayoutChangeListener(new i61(0, this));
        return recyclerView;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.o.clear();
        this.X.a = null;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((h61) this.c.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new l61((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: nx3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: y45} */
    /* JADX WARNING: type inference failed for: r4v6, types: [k61, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallEventsWidget(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
            y51 r4 = new y51
            zi1 r0 = defpackage.zi1.a
            v4 r0 = r0.getAccessor()
            java.lang.Class<kke> r1 = defpackage.kke.class
            java.lang.Object r0 = r0.c(r1)
            kke r0 = (defpackage.kke) r0
            w9a r0 = (defpackage.w9a) r0
            nx3 r0 = r0.a()
            boolean r1 = r0 instanceof defpackage.y45
            if (r1 == 0) goto L_0x0023
            r2 = r0
            y45 r2 = (defpackage.y45) r2
        L_0x0023:
            if (r2 == 0) goto L_0x002b
            java.util.concurrent.Executor r1 = r2.n()
            if (r1 != 0) goto L_0x0030
        L_0x002b:
            pl4 r1 = new pl4
            r1.<init>(r0)
        L_0x0030:
            r0 = 0
            r4.<init>(r1, r0)
            r3.b = r4
            k11 r4 = new k11
            r0 = 9
            r4.<init>(r0)
            s r0 = new s
            r1 = 10
            r0.<init>(r1, r4)
            java.lang.Class<h61> r4 = defpackage.h61.class
            je7 r4 = r3.createViewModelLazy(r4, r0)
            r3.c = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.o = r4
            k61 r4 = new k61
            r4.<init>()
            r3.X = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.call.panels.CallEventsWidget.<init>(android.os.Bundle):void");
    }
}
