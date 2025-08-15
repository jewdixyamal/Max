package defpackage;

import android.util.Size;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* renamed from: ojf  reason: default package */
public final class ojf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ VideoMessageWidget Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ g8b t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ojf(VideoMessageWidget videoMessageWidget, int i, int i2, g8b g8b, Continuation continuation) {
        super(2, continuation);
        this.Y = videoMessageWidget;
        this.Z = i;
        this.s0 = i2;
        this.t0 = g8b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ojf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ojf(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = VideoMessageWidget.y0;
            ygf o0 = this.Y.o0();
            Size size = new Size(this.Z, this.s0);
            this.X = 1;
            if (((ejf) o0).l(size, this.t0, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
