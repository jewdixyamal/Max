package defpackage;

import android.view.View;
import one.me.login.inputname.InputNameScreen;

/* renamed from: q17  reason: default package */
public final /* synthetic */ class q17 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ q17(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        InputNameScreen inputNameScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = InputNameScreen.B0;
                inputNameScreen.r0();
                return e5f;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                bc7[] bc7Arr2 = InputNameScreen.B0;
                boolean z = charSequence.length() > 0;
                String obj2 = charSequence.toString();
                bc7 bc7 = InputNameScreen.B0[5];
                inputNameScreen.z0.b(inputNameScreen, obj2);
                nf m0 = inputNameScreen.m0();
                m0.c = true;
                m0.setEnabled(z);
                w17 q0 = inputNameScreen.q0();
                q0.getClass();
                pnf.o(q0.s0, new yj6(1));
                return e5f;
            case 2:
                CharSequence charSequence2 = (CharSequence) obj;
                bc7[] bc7Arr3 = InputNameScreen.B0;
                w17 q02 = inputNameScreen.q0();
                q02.getClass();
                pnf.o(q02.s0, new yj6(2));
                String obj3 = charSequence2.toString();
                bc7 bc72 = InputNameScreen.B0[6];
                inputNameScreen.A0.b(inputNameScreen, obj3);
                inputNameScreen.q0().q(charSequence2.toString(), inputNameScreen.o0().a.isFocused());
                return e5f;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bc7[] bc7Arr4 = InputNameScreen.B0;
                if (!inputNameScreen.o0().c()) {
                    inputNameScreen.q0().q(inputNameScreen.p0(), booleanValue);
                }
                return e5f;
        }
    }
}
