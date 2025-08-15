package defpackage;

import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: a68  reason: default package */
public final class a68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((a68) n((r86) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a68 a68 = new a68(continuation, this.Y);
        a68.X = obj;
        return a68;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        r86 r86 = (r86) this.X;
        if (!(r86 instanceof l86)) {
            boolean z = r86 instanceof m86;
            MediaBarWidget mediaBarWidget = this.Y;
            if (z) {
                bc7[] bc7Arr = MediaBarWidget.d1;
                p58 B0 = mediaBarWidget.B0();
                B0.x0.m((Object) null, ((m86) r86).a);
            } else if (r86 instanceof n86) {
                n86 n86 = (n86) r86;
                up7 H = ay7.H(n86.c);
                bc7[] bc7Arr2 = MediaBarWidget.d1;
                mediaBarWidget.C0(H, n86.a, n86.b);
            } else if (r86 instanceof p86) {
                bc7[] bc7Arr3 = MediaBarWidget.d1;
                ew1 s0 = mediaBarWidget.s0();
                int i = ((p86) r86).a;
                s0.s0 = i;
                s0.t0 = i;
                ViewGroup.LayoutParams layoutParams = s0.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i;
                    layoutParams.height = i;
                    s0.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else if (r86 instanceof q86) {
                mediaBarWidget.E0 = ((q86) r86).a;
                MediaBarWidget.o0(mediaBarWidget);
            } else if (r86 instanceof o86) {
                MediaBarWidget.n0(mediaBarWidget, ((o86) r86).a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
