package defpackage;

import one.me.login.inputname.InputNameScreen;

/* renamed from: p17  reason: default package */
public final /* synthetic */ class p17 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ p17(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    public final Object invoke() {
        boolean z = false;
        InputNameScreen inputNameScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = InputNameScreen.B0;
                return new x37(inputNameScreen.getRouter());
            case 1:
                bc7[] bc7Arr2 = InputNameScreen.B0;
                bc7[] bc7Arr3 = InputNameScreen.B0;
                bc7 bc7 = bc7Arr3[0];
                bc7 bc72 = bc7Arr3[1];
                return new w17((String) inputNameScreen.b.a(inputNameScreen), (String) inputNameScreen.c.a(inputNameScreen), lt7.a.getAccessor().d(gh3.class));
            default:
                bc7[] bc7Arr4 = InputNameScreen.B0;
                w17 q0 = inputNameScreen.q0();
                bc7 bc73 = InputNameScreen.B0[5];
                String str = (String) inputNameScreen.z0.a(inputNameScreen);
                String p0 = inputNameScreen.p0();
                boolean r = q0.r(1, str);
                boolean r2 = q0.r(2, p0);
                if (r && r2) {
                    pnf.o(q0.Y, new o17(new afc(q0.c, q0.o, str, p0, (Long) null)));
                }
                if (inputNameScreen.n0().c() || inputNameScreen.o0().c()) {
                    z = true;
                }
                inputNameScreen.m0().setActiveButtonLoaderState(!z);
                return e5f.a;
        }
    }
}
