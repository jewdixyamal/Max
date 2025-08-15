package defpackage;

import android.content.DialogInterface;
import android.os.Parcelable;
import android.view.KeyEvent;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: gtc  reason: default package */
public final /* synthetic */ class gtc implements DialogInterface.OnKeyListener {
    public final /* synthetic */ ScheduledSendPickerDialogFragment a;

    public /* synthetic */ gtc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment) {
        this.a = scheduledSendPickerDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.a;
        scheduledSendPickerDialogFragment.o1(new itc((Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
        return false;
    }
}
