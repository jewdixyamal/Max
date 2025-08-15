package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* renamed from: qtc  reason: default package */
public final class qtc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qtc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = scheduledSendPickerDialogFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qtc) n((m34) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qtc qtc = new qtc(this.Y, continuation);
        qtc.X = obj;
        return qtc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        m34 m34 = (m34) this.X;
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.Y;
        LongRoundedTitleSubtitleButton c = scheduledSendPickerDialogFragment.m1().c();
        Context U0 = scheduledSendPickerDialogFragment.U0();
        m34.getClass();
        int i = dpc.r;
        String str = m34.a.X;
        c.setSubtitle(U0.getString(i, new Object[]{str, m34.b + ":" + m34.c}));
        return e5f.a;
    }
}
