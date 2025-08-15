package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: ade  reason: default package */
public final class ade extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SuggestionsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ade(SuggestionsWidget suggestionsWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = suggestionsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ade) n((kce) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ade ade = new ade(this.Y, continuation);
        ade.X = obj;
        return ade;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kce kce = (kce) this.X;
        SuggestionsWidget suggestionsWidget = this.Y;
        if (kce == null) {
            bc7[] bc7Arr = SuggestionsWidget.B0;
            suggestionsWidget.C0();
        } else {
            List list = kce.b;
            boolean isEmpty = list.isEmpty();
            boolean z = !isEmpty;
            bc7[] bc7Arr2 = SuggestionsWidget.B0;
            int i = 8;
            suggestionsWidget.z0().setVisibility(isEmpty ? 0 : 8);
            z15 A0 = suggestionsWidget.A0();
            if (z) {
                i = 0;
            }
            A0.setVisibility(i);
            suggestionsWidget.z0().setText(kce.a == jce.c ? mga.q : mga.r);
            ((pce) suggestionsWidget.u0.getValue()).E(list);
        }
        return e5f.a;
    }
}
