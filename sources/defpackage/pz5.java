package defpackage;

import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: pz5  reason: default package */
public final /* synthetic */ class pz5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ pz5(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    public final Object invoke() {
        e5f e5f = e5f.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ForwardPickerScreen.I0;
                return qp4.u0.o(forwardPickerScreen.getContext()).c;
            case 1:
                return forwardPickerScreen.F0;
            case 2:
                bc7[] bc7Arr2 = ForwardPickerScreen.I0;
                sv8 sv8 = new sv8(forwardPickerScreen.getContext());
                sv8.setId(m8a.a);
                sv8.setInputHint(o8a.a);
                sv8.setRightOuterIconActionState(lv8.a);
                sv8.setRightOuterIconTouchListener(s5c.a(sv8.getContext(), new yf3(forwardPickerScreen, 13, sv8)));
                sv8.setLeftInnerIconTouchListener(s5c.a(sv8.getContext(), new pz5(forwardPickerScreen, 4)));
                return sv8;
            case 3:
                forwardPickerScreen.F0.m();
                return e5f;
            case 4:
                bc7[] bc7Arr3 = ForwardPickerScreen.I0;
                ((iz5) forwardPickerScreen.v0().c).r.z(0);
                return e5f;
            default:
                bc7[] bc7Arr4 = ForwardPickerScreen.I0;
                ForwardPickerScreen.x0(forwardPickerScreen, forwardPickerScreen.z0(), new eqe(yoc.i0), true);
                forwardPickerScreen.y0 = new fh5(10);
                return e5f;
        }
    }
}
