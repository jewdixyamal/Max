package defpackage;

import kotlin.coroutines.Continuation;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;

/* renamed from: nr  reason: default package */
public final class nr extends ffe implements a66 {
    public y52 X;
    public int Y;
    public final /* synthetic */ y52 Z;
    public final /* synthetic */ AppearanceSettingsScreen s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nr(y52 y52, AppearanceSettingsScreen appearanceSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.Z = y52;
        this.s0 = appearanceSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nr) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nr(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        y52 y52;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7Arr = AppearanceSettingsScreen.Z;
            zr m0 = this.s0.m0();
            y52 y522 = this.Z;
            this.X = y522;
            this.Y = 1;
            obj = m0.r(this);
            if (obj == tx3) {
                return tx3;
            }
            y52 = y522;
        } else if (i == 1) {
            y52 = this.X;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y52.a((pm2) obj);
        return e5f.a;
    }
}
