package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: f27  reason: default package */
public final class f27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f27(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((f27) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        f27 f27 = new f27(continuation, this.Y);
        f27.X = obj;
        return f27;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        my3 my3 = (my3) this.X;
        InputPhoneScreen inputPhoneScreen = this.Y;
        ((d80) inputPhoneScreen.B0.getValue()).a(new dle("phone_country_changed", 3, usc.b(new kpa("phoneCountry", my3.a.a))));
        eaa eaa = my3.a;
        CharSequence charSequence = "";
        if (charSequence.equals(eaa.a)) {
            lea p0 = inputPhoneScreen.p0();
            p0.w0.removeTextChangedListener(inputPhoneScreen.z0);
            inputPhoneScreen.z0 = null;
        } else {
            f47 f47 = inputPhoneScreen.z0;
            int i = eaa.b;
            String str = eaa.a;
            int i2 = my3.b;
            if (f47 == null) {
                f47 f472 = new f47((zua) inputPhoneScreen.y0.getValue(), str, i, i2);
                inputPhoneScreen.z0 = f472;
                inputPhoneScreen.p0().w0.addTextChangedListener(f472);
            } else {
                f47.b(i, str);
                f47 f473 = inputPhoneScreen.z0;
                if (f473 != null) {
                    f473.Y = i2;
                }
            }
        }
        CharSequence b = my3.c.b(inputPhoneScreen.getContext());
        if (b != null) {
            charSequence = b;
        }
        lea p02 = inputPhoneScreen.p0();
        p02.setHint(charSequence);
        p02.setCountry(eaa);
        return e5f.a;
    }
}
