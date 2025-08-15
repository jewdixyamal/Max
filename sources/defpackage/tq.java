package defpackage;

import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* renamed from: tq  reason: default package */
public final class tq extends ffe implements a66 {
    public sm2 X;
    public int Y;
    public final /* synthetic */ sm2 Z;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq(sm2 sm2, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, Continuation continuation) {
        super(2, continuation);
        this.Z = sm2;
        this.s0 = appearanceSettingsMultiThemeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tq) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tq(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        sm2 sm2;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = AppearanceSettingsMultiThemeScreen.s0;
            kr m0 = this.s0.m0();
            sm2 sm22 = this.Z;
            this.X = sm22;
            this.Y = 1;
            obj = m0.r(this);
            if (obj == tx3) {
                return tx3;
            }
            sm2 = sm22;
        } else if (i == 1) {
            sm2 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sm2.a((qm2) obj);
        return e5f.a;
    }
}
