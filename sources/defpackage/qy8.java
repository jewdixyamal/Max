package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: qy8  reason: default package */
public abstract class qy8 extends hqd implements mr2 {
    public final int F0 = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
    public final int G0 = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
    public ry8 H0;

    public qy8(View view) {
        super(view);
        v3c.y(new xh0(this, view, (Continuation) null, 19), view);
    }

    public final void A(ol7 ol7) {
        E((MessageModel) ol7, nz4.a);
    }

    public abstract void E(MessageModel messageModel, List list);

    public final void F(MessageModel messageModel, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.topMargin;
        int i2 = marginLayoutParams.bottomMargin;
        boolean z = marginLayoutParams instanceof ys8;
        ys8 ys8 = z ? (ys8) marginLayoutParams : null;
        boolean z2 = ys8 != null ? ys8.a : true;
        int i3 = messageModel.I0;
        int i4 = 2080374784 & i3;
        boolean c = ns0.c(i4);
        int i5 = this.F0;
        if (c) {
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.bottomMargin = i5;
        } else {
            boolean a = ns0.a(i4);
            int i6 = this.G0;
            if (a) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i6;
            } else if ((536870912 & i3) != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i6;
            } else if ((1073741824 & i3) != 0) {
                marginLayoutParams.topMargin = i6;
                marginLayoutParams.bottomMargin = i5;
            } else if (ry8.a(i3, 0)) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i5;
            } else if (ry8.a(i3, 131072)) {
                marginLayoutParams.topMargin = i5;
                marginLayoutParams.bottomMargin = i5;
            }
        }
        if (!ry8.a(i3, 0) && !ry8.a(i3, 131072) && z) {
            ((ys8) marginLayoutParams).a = ns0.b(i4);
        }
        if (i != marginLayoutParams.topMargin || i2 != marginLayoutParams.bottomMargin || (z && z2 != ((ys8) marginLayoutParams).a)) {
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
