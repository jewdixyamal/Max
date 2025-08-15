package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: b68  reason: default package */
public final class b68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((b68) n((am8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b68 b68 = new b68(continuation, this.Y);
        b68.X = obj;
        return b68;
    }

    public final Object o(Object obj) {
        int i;
        od2.a0(obj);
        am8 am8 = (am8) this.X;
        boolean f = tpa.f(am8, wl8.a);
        MediaBarWidget mediaBarWidget = this.Y;
        if (f) {
            bc7[] bc7Arr = MediaBarWidget.d1;
            mediaBarWidget.x0().j(true);
            p58 B0 = mediaBarWidget.B0();
            pnf.o(B0.w0, y48.a);
        } else if (tpa.f(am8, xl8.a)) {
            bc7[] bc7Arr2 = MediaBarWidget.d1;
            p58 B02 = mediaBarWidget.B0();
            int ordinal = ((n00) B02.s0.getValue()).ordinal();
            if (ordinal == 0) {
                B02.s0.m((Object) null, n00.b);
                p4d r = B02.r();
                int i2 = m00.$EnumSwitchMapping$0[1];
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i = 3;
                }
                r.p(i);
            } else if (ordinal == 1) {
                B02.t0.n(f48.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (am8 instanceof yl8) {
            bc7[] bc7Arr3 = MediaBarWidget.d1;
            p58 B03 = mediaBarWidget.B0();
            Uri uri = ((yl8) am8).a;
            B03.getClass();
            pnf.o(B03.w0, new z48(uri));
        } else if (am8 instanceof zl8) {
            bc7[] bc7Arr4 = MediaBarWidget.d1;
            p58 B04 = mediaBarWidget.B0();
            zl8 zl8 = (zl8) am8;
            er7 er7 = zl8.a;
            B04.getClass();
            pnf.o(B04.w0, new a58(er7, zl8.b, zl8.c));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
