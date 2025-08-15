package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* renamed from: l61  reason: default package */
public final class l61 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallEventsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l61(Continuation continuation, CallEventsWidget callEventsWidget) {
        super(2, continuation);
        this.Y = callEventsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((l61) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l61 l61 = new l61(continuation, this.Y);
        l61.X = obj;
        return l61;
    }

    public final Object o(Object obj) {
        hdc adapter;
        od2.a0(obj);
        List list = (List) this.X;
        CallEventsWidget callEventsWidget = this.Y;
        k61 k61 = callEventsWidget.X;
        int size = list.size();
        RecyclerView recyclerView = k61.a;
        if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null || adapter.j() <= size)) {
            int height = recyclerView.getHeight();
            RecyclerView recyclerView2 = k61.a;
            if (recyclerView2 != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = height;
                    recyclerView2.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        callEventsWidget.b.E(list);
        return e5f.a;
    }
}
