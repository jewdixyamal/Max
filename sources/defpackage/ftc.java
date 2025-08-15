package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: ftc  reason: default package */
public final /* synthetic */ class ftc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledSendPickerDialogFragment b;

    public /* synthetic */ ftc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, int i) {
        this.a = i;
        this.b = scheduledSendPickerDialogFragment;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Bundle T0 = this.b.T0();
                Serializable serializable = T0.getSerializable("ScheduledSendPickerViewModel:delayed_attrs");
                ng4 ng4 = serializable instanceof ng4 ? (ng4) serializable : null;
                return Boolean.valueOf(ng4 != null ? ng4.b : T0.getBoolean("ScheduledSendPickerDialogFragment:send_with_notification"));
            case 1:
                return this.b.T0().getString("ScheduledSendPickerDialogFragment:who", (String) null);
            default:
                return this.b.T0().getParcelable("ScheduledSendPickerDialogFragment:arg_input");
        }
    }
}
