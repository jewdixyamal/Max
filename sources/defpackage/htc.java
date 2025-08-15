package defpackage;

import android.os.Parcelable;
import android.view.View;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: htc  reason: default package */
public final /* synthetic */ class htc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledSendPickerDialogFragment b;

    public /* synthetic */ htc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, int i) {
        this.a = i;
        this.b = scheduledSendPickerDialogFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ScheduledSendPickerViewModel n1 = this.b.n1();
                n1.getClass();
                hm9.m("ScheduledSendPickerViewModel", "onSendClick", new Object[0]);
                if (n1.h()) {
                    n1.m.m((Object) null, new tm9());
                    return;
                }
                return;
            default:
                hm9.m("ScheduledSendPickerDialogFragment", "handle nav click", new Object[0]);
                ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.b;
                scheduledSendPickerDialogFragment.o1(new itc((Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
                scheduledSendPickerDialogFragment.e1();
                return;
        }
    }
}
