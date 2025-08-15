package defpackage;

import android.os.Parcelable;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: ptc  reason: default package */
public final class ptc extends ffe implements a66 {
    public final /* synthetic */ ScheduledSendPickerDialogFragment X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ptc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ptc) n((tm9) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ptc(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.X;
        m34 m34 = (m34) scheduledSendPickerDialogFragment.n1().f.a.getValue();
        e5f e5f = e5f.a;
        if (m34 == null) {
            return e5f;
        }
        utc utc = scheduledSendPickerDialogFragment.n1().o;
        bc7 bc7 = ScheduledSendPickerViewModel.p[0];
        scheduledSendPickerDialogFragment.o1(new jtc(m34, ((Boolean) utc.b).booleanValue(), (Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
        scheduledSendPickerDialogFragment.e1();
        return e5f;
    }
}
