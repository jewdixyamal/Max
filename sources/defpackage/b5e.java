package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: b5e  reason: default package */
public final class b5e extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StickersScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b5e(Continuation continuation, StickersScreen stickersScreen, View view) {
        super(2, continuation);
        this.Y = stickersScreen;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((b5e) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b5e b5e = new b5e(continuation, this.Y, this.Z);
        b5e.X = obj;
        return b5e;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        StickersScreen stickersScreen = this.Y;
        a5e a5e = stickersScreen.a;
        a5e a5e2 = a5e.SET;
        View view = this.Z;
        Integer num = null;
        if (a5e == a5e2) {
            qm0 qm0 = stickersScreen.Z;
            if (!qm0.a()) {
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    ay7.b(viewGroup, (View) qm0.getValue(), -1);
                }
                View view2 = (View) qm0.getValue();
                pla.a(view2, new h76(view2, 24, stickersScreen));
            }
        }
        stickersScreen.u0.E(list);
        boolean isEmpty = list.isEmpty();
        qm0 qm02 = stickersScreen.Y;
        if (isEmpty) {
            ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup2 != null) {
                ay7.b(viewGroup2, (View) qm02.getValue(), -1);
            }
            if (qm02.a()) {
                o4e o4e = (o4e) qm02.getValue();
                a5e a5e3 = a5e.RECENT;
                a5e a5e4 = stickersScreen.a;
                o4e.setTitle(a5e4 == a5e3 ? hja.c : hja.a);
                if (a5e4 == a5e3) {
                    num = Integer.valueOf(hja.b);
                }
                o4e.setSubtitle(num);
                o4e.setIcon(fja.b);
            }
            ((View) qm02.getValue()).setVisibility(0);
            stickersScreen.m0().setVisibility(8);
            stickersScreen.n0().setRightActions(nka.a);
        } else {
            stickersScreen.m0().setVisibility(0);
            j47.P(qm02);
            stickersScreen.n0().setRightActions(new rka(new om8(1, this.Y, StickersScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 16)));
        }
        return e5f.a;
    }
}
