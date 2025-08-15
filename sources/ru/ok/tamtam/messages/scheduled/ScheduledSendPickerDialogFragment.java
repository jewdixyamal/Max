package ru.ok.tamtam.messages.scheduled;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.TamBottomSheetDialogFragment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerDialogFragment;", "Lru/ok/TamBottomSheetDialogFragment;", "<init>", "()V", "mtc", "ktc", "ltc", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
public final class ScheduledSendPickerDialogFragment extends TamBottomSheetDialogFragment {
    public final je7 D1 = tu0.r(2, new ftc(this, 0));
    public final je7 E1 = tu0.r(2, new ftc(this, 1));
    public final je7 F1 = tu0.r(2, new ftc(this, 2));
    public final tnf G1;
    public final je7 H1;

    public ScheduledSendPickerDialogFragment() {
        super(pyb.scheduled_send_picker_fragment);
        je7 r = tu0.r(3, new ei6(1, new ie(5, (Object) this)));
        this.G1 = new tnf(nec.a(ScheduledSendPickerViewModel.class), new rtc(0, r), (k56) new v2b(this, 2, r), new rtc(1, r));
        this.H1 = tu0.r(2, new hbc(this));
    }

    public static final void p1(String str, n16 n16, eh7 eh7, sj3 sj3) {
        ga gaVar = new ga((Object) null, 27, sj3);
        String i = zr6.i("ScheduledSendPickerDialogFragment:", str, ":result");
        j16 j16 = (j16) n16.m.remove(i);
        if (j16 != null) {
            j16.a.f(j16.c);
        }
        n16.f0(i, eh7, new wp(7, (m56) gaVar));
    }

    public static final void q1(String str, n16 n16) {
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = new ScheduledSendPickerDialogFragment();
        scheduledSendPickerDialogFragment.X0(dy7.g(new kpa("ScheduledSendPickerDialogFragment:who", str), new kpa("ScheduledSendPickerDialogFragment:send_with_notification", Boolean.TRUE), new kpa("ScheduledSendPickerDialogFragment:arg_input", (Object) null), new kpa("ScheduledSendPickerViewModel:delayed_attrs", (Object) null)));
        scheduledSendPickerDialogFragment.k1(n16, "ScheduledSendPickerDialogFragment");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [a66, ffe] */
    public final void O0(View view, Bundle bundle) {
        mtc m1 = m1();
        eh7 l0 = l0();
        m1.a = view;
        x16 x16 = (x16) l0;
        x16.b();
        x16.X.a(new fdc(3, m1));
        od2.L(new zn5(od2.u(new t03(new zn5(sme.d0, new ffe(2, (Continuation) null)), 11), 100), new bke(this, (Continuation) null), 5), f46.J(l0()));
        od2.L(new zn5(new t03(n1().d, 11), new ntc(this, (Continuation) null), 5), f46.J(l0()));
        od2.L(new zn5(n1().l, new otc(view, this, (Continuation) null), 5), f46.J(l0()));
        od2.L(new zn5(new t03(new t03(n1().n, 11), 21), new ptc(this, (Continuation) null), 5), f46.J(l0()));
        m1().b().setListener$scheduled_send_picker_dialog_release(n1());
        tu0.K(m1().c(), 300, new htc(this, 0));
        mtc m12 = m1();
        m12.getClass();
        bc7[] bc7Arr = mtc.t0;
        int i = 0;
        MaterialToolbar materialToolbar = (MaterialToolbar) m12.c.T0(m12, bc7Arr[0]);
        materialToolbar.setBackground((Drawable) null);
        materialToolbar.setNavigationOnClickListener(new e44((View.OnClickListener) new htc(this, 1), 0));
        mtc m13 = m1();
        m13.getClass();
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) m13.Y.T0(m13, bc7Arr[3]);
        if (!((Boolean) this.D1.getValue()).booleanValue()) {
            i = 8;
        }
        appCompatCheckBox.setVisibility(i);
        appCompatCheckBox.setOnCheckedChangeListener(new wz2(3, this));
        od2.L(new zn5(new t03(n1().f, 11), new qtc(this, (Continuation) null), 5), f46.J(l0()));
    }

    public final Dialog h1() {
        ir0 ir0 = new ir0(U0(), r2c.UiUtils_LightBottomSheetDialog);
        ir0.u0 = true;
        ir0.h().K(3);
        ir0.h().I(true);
        ir0.h().J = true;
        BottomSheetBehavior h = ir0.h();
        h.K = false;
        h.H(true);
        ir0.setOnKeyListener(new gtc(this));
        return ir0;
    }

    public final mtc m1() {
        return (mtc) this.H1.getValue();
    }

    public final ScheduledSendPickerViewModel n1() {
        return (ScheduledSendPickerViewModel) this.G1.getValue();
    }

    public final void o1(ktc ktc) {
        je7 je7 = this.E1;
        f0().e0(zr6.i("ScheduledSendPickerDialogFragment:", (String) je7.getValue(), ":result"), dy7.g(new kpa(zr6.i("ScheduledSendPickerDialogFragment:", (String) je7.getValue(), ":result"), ktc)));
    }

    public final void v0(Bundle bundle) {
        super.v0(bundle);
        ju0.v(S0());
    }

    public final void z(sme sme) {
        m1().z(sme);
    }
}
