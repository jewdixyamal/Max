package defpackage;

import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* renamed from: ar  reason: default package */
public final class ar extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(t03 t03, Continuation continuation, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen) {
        super(2, continuation);
        this.Z = t03;
        this.s0 = appearanceSettingsMultiThemeScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ar) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ar arVar = new ar((t03) this.Z, continuation, this.s0);
        arVar.Y = obj;
        return arVar;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, (Object) this.s0, 0);
            this.X = 1;
            if (this.Z.d(zqVar, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
