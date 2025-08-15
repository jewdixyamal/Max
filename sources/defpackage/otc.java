package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: otc  reason: default package */
public final class otc extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public otc(View view, ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = view;
        this.Z = scheduledSendPickerDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((otc) n(bool, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        otc otc = new otc(this.Y, this.Z, continuation);
        otc.X = ((Boolean) obj).booleanValue();
        return otc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = this.X;
        View view = this.Y;
        boolean z2 = view instanceof ViewGroup;
        e5f e5f = e5f.a;
        if (!z2) {
            return e5f;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        c2f.b(viewGroup);
        wa5 wa5 = new wa5(z ? 2 : 1);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.Z;
        wa5.c = ((y8a) ((ed3) ((vl) ((ug) scheduledSendPickerDialogFragment.U0().getApplicationContext())).c.getValue())).c().a.h();
        c2f.a(viewGroup, wa5);
        mtc m1 = scheduledSendPickerDialogFragment.m1();
        m1.c().setAlpha(z ? 1.0f : 0.3f);
        m1.c().setEnabled(z);
        mtc m12 = scheduledSendPickerDialogFragment.m1();
        m12.getClass();
        ((AppCompatTextView) m12.s0.T0(m12, mtc.t0[5])).setVisibility(z ^ true ? 0 : 8);
        return e5f;
    }
}
