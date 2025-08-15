package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: xyc  reason: default package */
public final class xyc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ SearchMessageBottomWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xyc(View view, SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = view;
        this.Z = searchMessageBottomWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xyc) n((tzc) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xyc xyc = new xyc(this.Y, this.Z, continuation);
        xyc.X = obj;
        return xyc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        tzc tzc = (tzc) this.X;
        boolean z = tzc instanceof pzc;
        this.Y.setVisibility(z ? 0 : 8);
        if (!(tzc instanceof qzc) && !(tzc instanceof rzc)) {
            if (z) {
                pzc pzc = (pzc) tzc;
                bc7[] bc7Arr = SearchMessageBottomWidget.s0;
                SearchMessageBottomWidget searchMessageBottomWidget = this.Z;
                AppCompatTextView n0 = searchMessageBottomWidget.n0();
                Context context = searchMessageBottomWidget.getContext();
                int i = pzc.a;
                n0.setText(i == 0 ? context.getString(u8a.g) : context.getString(u8a.h, new Object[]{Integer.valueOf(pzc.b), Integer.valueOf(i)}));
                boolean z2 = pzc.c;
                searchMessageBottomWidget.Y = z2;
                searchMessageBottomWidget.r0(searchMessageBottomWidget.p0(), z2);
                boolean z3 = pzc.d;
                searchMessageBottomWidget.Z = z3;
                searchMessageBottomWidget.r0(searchMessageBottomWidget.m0(), z3);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
