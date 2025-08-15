package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: ttc  reason: default package */
public final class ttc extends ffe implements a66 {
    public final /* synthetic */ ScheduledSendPickerViewModel X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ttc(ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerViewModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ttc) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ttc(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.X;
        scheduledSendPickerViewModel.g(ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel));
        return e5f.a;
    }
}
