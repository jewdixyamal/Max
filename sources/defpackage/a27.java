package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: a27  reason: default package */
public final class a27 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ fka Y;
    public final /* synthetic */ InputPhoneScreen Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a27(InputPhoneScreen inputPhoneScreen, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                a27 a27 = new a27(this.Z, (Continuation) obj3, 0);
                a27.Y = (fka) obj2;
                e5f e5f = e5f.a;
                a27.o(e5f);
                return e5f;
            default:
                View view = (View) obj;
                a27 a272 = new a27(this.Z, (Continuation) obj3, 1);
                a272.Y = (fka) obj2;
                e5f e5f2 = e5f.a;
                a272.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        e5f e5f = e5f.a;
        InputPhoneScreen inputPhoneScreen = this.Z;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                fka fka = this.Y;
                bc7[] bc7Arr = InputPhoneScreen.E0;
                inputPhoneScreen.p0().onThemeChanged(fka);
                return e5f;
            default:
                od2.a0(obj);
                fka fka2 = this.Y;
                bc7[] bc7Arr2 = InputPhoneScreen.E0;
                inputPhoneScreen.getClass();
                Drawable background = ((View) inputPhoneScreen.t0.T0(inputPhoneScreen, InputPhoneScreen.E0[2])).getBackground();
                ib9 ib9 = background instanceof ib9 ? (ib9) background : null;
                if (ib9 != null) {
                    ib9.onThemeChanged(fka2);
                }
                return e5f;
        }
    }
}
