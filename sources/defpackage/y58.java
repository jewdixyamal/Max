package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: y58  reason: default package */
public final class y58 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y58(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((y58) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y58 y58 = new y58(continuation, this.Y);
        y58.X = obj;
        return y58;
    }

    public final Object o(Object obj) {
        String str;
        od2.a0(obj);
        i3d i3d = (i3d) this.X;
        boolean z = i3d instanceof h3d;
        MediaBarWidget mediaBarWidget = this.Y;
        if (z) {
            bc7[] bc7Arr = MediaBarWidget.d1;
            mediaBarWidget.z0().setVisibility(8);
        } else if (i3d instanceof f3d) {
            f3d f3d = (f3d) i3d;
            mediaBarWidget.G0 = f3d.a;
            MediaBarWidget.o0(mediaBarWidget);
            mediaBarWidget.A0().setDropdownRotationProgress(((float) f3d.a) / 512.0f);
        } else if (i3d instanceof g3d) {
            bc7[] bc7Arr2 = MediaBarWidget.d1;
            s86 u0 = mediaBarWidget.u0();
            g3d g3d = (g3d) i3d;
            b86 b86 = g3d.a;
            u0.getClass();
            pnf.o(u0.o, new i86(b86));
            n3 c = g3d.a.a.c();
            if (c instanceof q76) {
                str = mediaBarWidget.getContext().getString(((q76) c).a);
            } else if (c instanceof r76) {
                str = ((r76) c).a;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            mediaBarWidget.A0().setTitle((CharSequence) str);
        }
        return e5f.a;
    }
}
