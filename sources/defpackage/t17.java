package defpackage;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputname.InputNameScreen;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: t17  reason: default package */
public final class t17 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputNameScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t17(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.Y = inputNameScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((t17) n((o17) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t17 t17 = new t17(continuation, this.Y);
        t17.X = obj;
        return t17;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        o17 o17 = (o17) this.X;
        if (o17 instanceof o17) {
            InputNameScreen inputNameScreen = this.Y;
            mr0.G(inputNameScreen);
            bc7[] bc7Arr = InputNameScreen.B0;
            x37 x37 = (x37) inputNameScreen.s0.getValue();
            afc afc = o17.b;
            Class<e8b> cls = e8b.class;
            Object v = ay7.v(inputNameScreen.getArgs(), "screen:input_name:avatars", cls);
            if (v != null) {
                x37.getClass();
                x37.a(i24.e(new NeuroAvatarsScreen(afc, (e8b) ((Parcelable) v)), (zu3) null, (zu3) null), "InputNameScreen");
                return e5f.a;
            }
            throw new IllegalArgumentException(zr6.i("No value passed for key screen:input_name:avatars of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new NoWhenBranchMatchedException();
    }
}
