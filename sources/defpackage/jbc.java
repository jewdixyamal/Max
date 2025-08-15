package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: jbc  reason: default package */
public final class jbc extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;
    public final /* synthetic */ RecordControlsWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbc(RecordControlsWidget recordControlsWidget, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                jbc jbc = new jbc(this.Z, continuation, 0);
                jbc.Y = frameLayout;
                e5f e5f = e5f.a;
                jbc.o(e5f);
                return e5f;
            default:
                jbc jbc2 = new jbc(this.Z, continuation, 1);
                jbc2.Y = frameLayout;
                e5f e5f2 = e5f.a;
                jbc2.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        e5f e5f = e5f.a;
        pq9 pq9 = qp4.u0;
        RecordControlsWidget recordControlsWidget = this.Z;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                FrameLayout frameLayout = this.Y;
                bc7[] bc7Arr = RecordControlsWidget.b1;
                ((GradientDrawable) recordControlsWidget.K0.getValue()).setColor(pq9.j(frameLayout).f().c);
                return e5f;
            default:
                od2.a0(obj);
                FrameLayout frameLayout2 = this.Y;
                bc7[] bc7Arr2 = RecordControlsWidget.b1;
                ((GradientDrawable) recordControlsWidget.J0.getValue()).setColor(f8.G(pq9.j(frameLayout2).f().c, 0.2f));
                return e5f;
        }
    }
}
