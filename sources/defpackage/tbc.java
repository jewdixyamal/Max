package defpackage;

import android.animation.AnimatorSet;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: tbc  reason: default package */
public final class tbc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Z = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tbc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tbc tbc = new tbc(continuation, this.Z);
        tbc.Y = obj;
        return tbc;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 = (sx3) this.Y;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (j1e.z(sx3)) {
            bc7[] bc7Arr = RecordControlsWidget.b1;
            RecordControlsWidget recordControlsWidget = this.Z;
            int a = recordControlsWidget.I0().w().a();
            recordControlsWidget.r0().clearAnimation();
            float f = 1.45f;
            float f2 = ((((float) a) * 1.45f) / ((float) 32768)) + ((float) 1);
            if (f2 <= 1.45f) {
                f = f2;
            }
            kl7 F = ngg.F(recordControlsWidget.r0(), recordControlsWidget.S0, f, 100, 0);
            AnimatorSet animatorSet = new AnimatorSet();
            recordControlsWidget.V0 = animatorSet;
            animatorSet.setInterpolator((wb5) recordControlsWidget.M0.getValue());
            AnimatorSet animatorSet2 = recordControlsWidget.V0;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(F);
            }
            AnimatorSet animatorSet3 = recordControlsWidget.V0;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            recordControlsWidget.S0 = f;
            this.Y = sx3;
            this.X = 1;
            if (j47.x(100, this) == tx3) {
                return tx3;
            }
        }
        return e5f.a;
    }
}
