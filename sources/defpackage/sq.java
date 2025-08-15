package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appearancesettings.singletheme.AppearanceSettingsScreen;
import one.me.sdk.arch.Widget;

/* renamed from: sq  reason: default package */
public final class sq extends ffe implements c66 {
    public final /* synthetic */ int X = 0;
    public /* synthetic */ LinearLayout Y;
    public /* synthetic */ fka Z;
    public final /* synthetic */ TextView s0;
    public final /* synthetic */ TextView t0;
    public final /* synthetic */ TextView u0;
    public final /* synthetic */ ShapeDrawable v0;
    public final /* synthetic */ Widget w0;
    public final /* synthetic */ LinearLayout x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sq(TextView textView, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, TextView textView2, TextView textView3, ShapeDrawable shapeDrawable, sm2 sm2, Continuation continuation) {
        super(3, continuation);
        this.s0 = textView;
        this.w0 = appearanceSettingsMultiThemeScreen;
        this.t0 = textView2;
        this.u0 = textView3;
        this.v0 = shapeDrawable;
        this.x0 = sm2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinearLayout linearLayout = (LinearLayout) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                sq sqVar = new sq(this.s0, (AppearanceSettingsMultiThemeScreen) this.w0, this.t0, this.u0, this.v0, (sm2) this.x0, continuation);
                sqVar.Y = linearLayout;
                sqVar.Z = fka;
                e5f e5f = e5f.a;
                sqVar.o(e5f);
                return e5f;
            default:
                sq sqVar2 = new sq((AppearanceSettingsScreen) this.w0, this.s0, this.t0, this.u0, this.v0, (y52) this.x0, continuation);
                sqVar2.Y = linearLayout;
                sqVar2.Z = fka;
                e5f e5f2 = e5f.a;
                sqVar2.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        Object value;
        er erVar;
        e5f e5f = e5f.a;
        ShapeDrawable shapeDrawable = this.v0;
        LinearLayout linearLayout = this.x0;
        TextView textView = this.u0;
        TextView textView2 = this.t0;
        TextView textView3 = this.s0;
        Widget widget = this.w0;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                LinearLayout linearLayout2 = this.Y;
                fka fka = this.Z;
                linearLayout2.setBackgroundColor(fka.b().j);
                textView3.setTextColor(fka.getText().g);
                bc7[] bc7Arr = AppearanceSettingsMultiThemeScreen.s0;
                AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = (AppearanceSettingsMultiThemeScreen) widget;
                appearanceSettingsMultiThemeScreen.getClass();
                ((TextView) appearanceSettingsMultiThemeScreen.o.T0(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.s0[1])).setTextColor(fka.getText().e);
                textView2.setTextColor(fka.getText().g);
                textView.setTextColor(fka.getText().g);
                j47.T(appearanceSettingsMultiThemeScreen.getViewLifecycleScope(), (lx3) null, (vx3) null, new rq((sm2) linearLayout, appearanceSettingsMultiThemeScreen, (Continuation) null), 3);
                ngg.G(shapeDrawable, fka.b().g);
                kr m0 = appearanceSettingsMultiThemeScreen.m0();
                q0e q0e = m0.z0;
                do {
                    value = q0e.getValue();
                    er erVar2 = (er) value;
                    if (erVar2 != null) {
                        erVar = new er(m0.t(erVar2.a), erVar2.b, m0.s());
                    } else {
                        erVar = null;
                    }
                } while (!q0e.c(value, erVar));
                return e5f;
            default:
                od2.a0(obj);
                LinearLayout linearLayout3 = this.Y;
                fka fka2 = this.Z;
                bc7[] bc7Arr2 = AppearanceSettingsScreen.Z;
                AppearanceSettingsScreen appearanceSettingsScreen = (AppearanceSettingsScreen) widget;
                appearanceSettingsScreen.m0().x();
                linearLayout3.setBackgroundColor(fka2.b().j);
                textView3.setTextColor(fka2.getText().g);
                textView2.setTextColor(fka2.getText().g);
                textView.setTextColor(fka2.getText().g);
                j47.T(appearanceSettingsScreen.getViewLifecycleScope(), (lx3) null, (vx3) null, new nr((y52) linearLayout, appearanceSettingsScreen, (Continuation) null), 3);
                ngg.G(shapeDrawable, fka2.b().g);
                return e5f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sq(AppearanceSettingsScreen appearanceSettingsScreen, TextView textView, TextView textView2, TextView textView3, ShapeDrawable shapeDrawable, y52 y52, Continuation continuation) {
        super(3, continuation);
        this.w0 = appearanceSettingsScreen;
        this.s0 = textView;
        this.t0 = textView2;
        this.u0 = textView3;
        this.v0 = shapeDrawable;
        this.x0 = y52;
    }
}
