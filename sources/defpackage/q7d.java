package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.devmenu.server.ServerHostBottomSheet;

/* renamed from: q7d  reason: default package */
public final class q7d extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ServerHostBottomSheet Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q7d(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet, View view) {
        super(2, continuation);
        this.Y = serverHostBottomSheet;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((q7d) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        q7d q7d = new q7d(continuation, this.Y, this.Z);
        q7d.X = obj;
        return q7d;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        mo6 mo6 = (mo6) this.X;
        boolean z = mo6 instanceof jo6;
        ServerHostBottomSheet serverHostBottomSheet = this.Y;
        if (z) {
            mr0.G(serverHostBottomSheet);
            serverHostBottomSheet.s0(true);
        } else {
            boolean z2 = mo6 instanceof ko6;
            View view = this.Z;
            if (z2) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, serverHostBottomSheet.z0);
                bc7[] bc7Arr = ServerHostBottomSheet.G0;
                ((RecyclerView) serverHostBottomSheet.B0.T0(serverHostBottomSheet, bc7Arr[0])).setVisibility(8);
                ((LinearLayout) serverHostBottomSheet.D0.T0(serverHostBottomSheet, bc7Arr[2])).setVisibility(0);
                cka cka = (cka) serverHostBottomSheet.E0.T0(serverHostBottomSheet, bc7Arr[3]);
                String str = ((ko6) mo6).a;
                if (str == null) {
                    str = "";
                }
                cka.setText(str);
            } else if (mo6 instanceof lo6) {
                TransitionManager.beginDelayedTransition((ViewGroup) view, serverHostBottomSheet.z0);
                bc7[] bc7Arr2 = ServerHostBottomSheet.G0;
                ((RecyclerView) serverHostBottomSheet.B0.T0(serverHostBottomSheet, bc7Arr2[0])).setVisibility(8);
                ((LinearLayout) serverHostBottomSheet.D0.T0(serverHostBottomSheet, bc7Arr2[2])).setVisibility(8);
                ((nfa) serverHostBottomSheet.C0.T0(serverHostBottomSheet, bc7Arr2[1])).setVisibility(0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
