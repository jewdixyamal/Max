package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;

/* renamed from: yx5  reason: default package */
public final class yx5 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ TextView Z;
    public final /* synthetic */ TextView s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx5(TextView textView, TextView textView2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = textView;
        this.s0 = textView2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                yx5 yx5 = new yx5(this.Z, this.s0, (Continuation) obj3, 0);
                yx5.Y = (fka) obj2;
                e5f e5f = e5f.a;
                yx5.o(e5f);
                return e5f;
            case 1:
                LinearLayout linearLayout = (LinearLayout) obj;
                yx5 yx52 = new yx5(this.Z, this.s0, (Continuation) obj3, 1);
                yx52.Y = (fka) obj2;
                e5f e5f2 = e5f.a;
                yx52.o(e5f2);
                return e5f2;
            default:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                yx5 yx53 = new yx5(this.Z, this.s0, (Continuation) obj3, 2);
                yx53.Y = (fka) obj2;
                e5f e5f3 = e5f.a;
                yx53.o(e5f3);
                return e5f3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                fka fka = this.Y;
                this.Z.setTextColor(fka.getText().e);
                this.s0.setTextColor(fka.getText().e);
                return e5f.a;
            case 1:
                od2.a0(obj);
                fka fka2 = this.Y;
                this.Z.setTextColor(fka2.getText().e);
                this.s0.setTextColor(fka2.getText().g);
                return e5f.a;
            default:
                od2.a0(obj);
                fka fka3 = this.Y;
                this.Z.setTextColor(fka3.getText().e);
                this.s0.setTextColor(fka3.getText().i);
                return e5f.a;
        }
    }
}
